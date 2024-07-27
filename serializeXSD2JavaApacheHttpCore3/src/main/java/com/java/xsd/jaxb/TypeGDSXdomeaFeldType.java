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
 * Ein Feld ist ein anwendungsspezifisches Metadatum, das bei dem Austausch eines Schriftgutobjektes �bergeben wird. Die Konfiguration eines Feldes in den austauschenden Systemen muss zwischen den Kommunikationspartnern abgesprochen und in den Systemen umgesetzt sein.
 * 
 * <p>Java class for Type.GDS.Xdomea.FeldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.Xdomea.FeldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datentyp" type="{http://www.xjustiz.de}Code.GDS.Datentyp.Typ3" minOccurs="0"/>
 *         &lt;element name="wert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GDS.Xdomea.FeldType", propOrder = {
    "name",
    "beschreibung",
    "datentyp",
    "wert"
})
public class TypeGDSXdomeaFeldType {

    @XmlElement(required = true)
    protected String name;
    protected String beschreibung;
    protected CodeGDSDatentypTyp3 datentyp;
    protected String wert;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the beschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Sets the value of the beschreibung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeschreibung(String value) {
        this.beschreibung = value;
    }

    /**
     * Gets the value of the datentyp property.
     * 
     * @return
     *     possible object is
     *     {@link CodeGDSDatentypTyp3 }
     *     
     */
    public CodeGDSDatentypTyp3 getDatentyp() {
        return datentyp;
    }

    /**
     * Sets the value of the datentyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGDSDatentypTyp3 }
     *     
     */
    public void setDatentyp(CodeGDSDatentypTyp3 value) {
        this.datentyp = value;
    }

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

}
