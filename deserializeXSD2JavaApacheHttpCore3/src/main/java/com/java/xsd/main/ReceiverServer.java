package com.java.xsd.main;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.bootstrap.HttpServer;
import org.apache.http.impl.bootstrap.ServerBootstrap;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestHandler;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.xsd.jaxb.NachrichtStrafStrafverfahren0500013;

public class ReceiverServer {

	static int i=0;
	
    public static void main(String[] args) throws Exception {
        // Create an ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        // Create an HTTP server using Apache HttpCore with port 7777
        HttpServer server = ServerBootstrap.bootstrap()
                .setListenerPort(7777) // Change the port to 7777
                .registerHandler("/data", new RequestHandler(objectMapper))
                .create();

        server.start();
        System.out.println("Receiver server started on port 7777.");

     // Block until the server is shut down gracefully
        server.awaitTermination(3000, TimeUnit.MILLISECONDS);
    }

    static class RequestHandler implements HttpRequestHandler {
        private final ObjectMapper objectMapper;

        RequestHandler(ObjectMapper objectMapper) {
            this.objectMapper = objectMapper;
        }

        @Override
        public void handle(HttpRequest request, HttpResponse response, HttpContext context) throws HttpException, IOException {
            if (request instanceof HttpEntityEnclosingRequest) {
                HttpEntity entity = ((HttpEntityEnclosingRequest) request).getEntity();
                String receivedJson = EntityUtils.toString(entity);

                //System.out.println("Data received from sender machine: " + receivedJson);

                NachrichtStrafStrafverfahren0500013 nachricht = objectMapper.readValue(receivedJson, NachrichtStrafStrafverfahren0500013.class);
                if(nachricht != null)
                	System.out.println("Deserialized Nachricht " + i + ": " + nachricht.getNachrichtenkopf().getEigeneNachrichtenID());
                i++;
            }

            response.setStatusCode(HttpStatus.SC_OK);
            response.setEntity(new StringEntity("Data received and processed", ContentType.TEXT_PLAIN));
        }
    }
}
