//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Listeneintrag mit Gültigkeitszeitraum
 * 
 * <p>Java class for Type.SCHIR.StringList.Value complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.SCHIR.StringList.Value">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wert" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE"/>
 *         &lt;element name="zeitraum" type="{http://www.xjustiz.de}Type.GDS.Xdomea.ZeitraumType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.SCHIR.StringList.Value", propOrder = {
    "wert",
    "zeitraum"
})
public class TypeSCHIRStringListValue {

    @XmlElement(required = true)
    protected String wert;
    protected TypeGDSXdomeaZeitraumType zeitraum;

    /**
     * Gets the value of the wert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWert() {
        return wert;
    }

    /**
     * Sets the value of the wert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWert(String value) {
        this.wert = value;
    }

    /**
     * Gets the value of the zeitraum property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSXdomeaZeitraumType }
     *     
     */
    public TypeGDSXdomeaZeitraumType getZeitraum() {
        return zeitraum;
    }

    /**
     * Sets the value of the zeitraum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSXdomeaZeitraumType }
     *     
     */
    public void setZeitraum(TypeGDSXdomeaZeitraumType value) {
        this.zeitraum = value;
    }

}
