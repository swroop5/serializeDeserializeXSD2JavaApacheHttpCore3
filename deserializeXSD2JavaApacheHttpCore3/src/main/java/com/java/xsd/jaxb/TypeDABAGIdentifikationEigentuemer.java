//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.Identifikation.Eigentuemer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Identifikation.Eigentuemer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bezirksnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *         &lt;element name="blattnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *         &lt;element name="lfdnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Identifikation.Eigentuemer", propOrder = {
    "bezirksnummer",
    "blattnummer",
    "lfdnummer"
})
public class TypeDABAGIdentifikationEigentuemer {

    @XmlElement(required = true)
    protected String bezirksnummer;
    @XmlElement(required = true)
    protected String blattnummer;
    @XmlElement(required = true)
    protected String lfdnummer;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the bezirksnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezirksnummer() {
        return bezirksnummer;
    }

    /**
     * Sets the value of the bezirksnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezirksnummer(String value) {
        this.bezirksnummer = value;
    }

    /**
     * Gets the value of the blattnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlattnummer() {
        return blattnummer;
    }

    /**
     * Sets the value of the blattnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlattnummer(String value) {
        this.blattnummer = value;
    }

    /**
     * Gets the value of the lfdnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLfdnummer() {
        return lfdnummer;
    }

    /**
     * Sets the value of the lfdnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLfdnummer(String value) {
        this.lfdnummer = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
