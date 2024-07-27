package com.java.xsd.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.xsd.jaxb.NachrichtStrafStrafverfahren0500013;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class SenderClient {

    public static void main(String[] args) {
    	int i = 1;
        try {
            // Create an ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            // Create an HTTP client using Apache HttpClient
            HttpClient httpClient = HttpClients.createDefault();

            // Define the URL of the receiver server
            String receiverUrl = "http://127.0.0.1:7777/data"; // Replace with the receiver's IP and port

            // Serialize a Java object to JSON
            while (i<1001) {
   	         // Serialize a Java object to JSON
   	            String filename = "nachrichten/nachricht_" + i + ".xml";
   	        	  
   	            String json = objectMapper.writeValueAsString(jaxbXmlFileToObject(filename));
   	
   	            // Create an HTTP POST request
	            HttpPost httpPost = new HttpPost(receiverUrl);
	
	            // Set the JSON data as the request entity
	            HttpEntity entity = new StringEntity(json);
	            httpPost.setEntity(entity);
	
	            // Send the POST request to the receiver server
	            HttpResponse httpResponse = httpClient.execute(httpPost);
	
	            // Read the response, if needed
	            String responseContent = EntityUtils.toString(httpResponse.getEntity());
	            //System.out.println("Server Response: " + responseContent);
	            i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Finished processing all XML files!");
        
    }

    private static NachrichtStrafStrafverfahren0500013 jaxbXmlFileToObject(String fileName) {
        
        File xmlFile = new File(fileName);
         
        JAXBContext jaxbContext;
        try
        {
          jaxbContext = JAXBContext.newInstance(NachrichtStrafStrafverfahren0500013.class);
          Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
           
          NachrichtStrafStrafverfahren0500013 nachricht = (NachrichtStrafStrafverfahren0500013) jaxbUnmarshaller.unmarshal(xmlFile);
           
          //System.out.println(nachricht.getNachrichtenkopf().getEigeneNachrichtenID());
          return nachricht;
        }
        catch (JAXBException e) 
        {
          e.printStackTrace();
        }
    	return null;
      }
}
