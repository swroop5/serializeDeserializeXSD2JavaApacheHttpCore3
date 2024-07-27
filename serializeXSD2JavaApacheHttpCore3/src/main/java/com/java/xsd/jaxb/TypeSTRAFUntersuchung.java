//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Type.STRAF.Untersuchung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.STRAF.Untersuchung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *         &lt;element name="auswahl_art">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="blutuntersuchung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                   &lt;element name="urinuntersuchung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="uhrzeit" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="untersuchungsergebnis" type="{http://www.xjustiz.de}Type.STRAF.Messung" maxOccurs="unbounded"/>
 *         &lt;element name="untersuchter" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.STRAF.Untersuchung", propOrder = {
    "nummer",
    "auswahlArt",
    "datum",
    "uhrzeit",
    "untersuchungsergebnis",
    "untersuchter"
})
public class TypeSTRAFUntersuchung {

    @XmlElement(required = true)
    protected String nummer;
    @XmlElement(name = "auswahl_art", required = true)
    protected TypeSTRAFUntersuchung.AuswahlArt auswahlArt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar uhrzeit;
    @XmlElement(required = true)
    protected List<TypeSTRAFMessung> untersuchungsergebnis;
    protected TypeGDSRefRollennummer untersuchter;

    /**
     * Gets the value of the nummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummer() {
        return nummer;
    }

    /**
     * Sets the value of the nummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummer(String value) {
        this.nummer = value;
    }

    /**
     * Gets the value of the auswahlArt property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFUntersuchung.AuswahlArt }
     *     
     */
    public TypeSTRAFUntersuchung.AuswahlArt getAuswahlArt() {
        return auswahlArt;
    }

    /**
     * Sets the value of the auswahlArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFUntersuchung.AuswahlArt }
     *     
     */
    public void setAuswahlArt(TypeSTRAFUntersuchung.AuswahlArt value) {
        this.auswahlArt = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Gets the value of the uhrzeit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUhrzeit() {
        return uhrzeit;
    }

    /**
     * Sets the value of the uhrzeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUhrzeit(XMLGregorianCalendar value) {
        this.uhrzeit = value;
    }

    /**
     * Gets the value of the untersuchungsergebnis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the untersuchungsergebnis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUntersuchungsergebnis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSTRAFMessung }
     * 
     * 
     */
    public List<TypeSTRAFMessung> getUntersuchungsergebnis() {
        if (untersuchungsergebnis == null) {
            untersuchungsergebnis = new ArrayList<TypeSTRAFMessung>();
        }
        return this.untersuchungsergebnis;
    }

    /**
     * Gets the value of the untersuchter property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public TypeGDSRefRollennummer getUntersuchter() {
        return untersuchter;
    }

    /**
     * Sets the value of the untersuchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public void setUntersuchter(TypeGDSRefRollennummer value) {
        this.untersuchter = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="blutuntersuchung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
     *         &lt;element name="urinuntersuchung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "blutuntersuchung",
        "urinuntersuchung"
    })
    public static class AuswahlArt {

        protected String blutuntersuchung;
        protected String urinuntersuchung;

        /**
         * Gets the value of the blutuntersuchung property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBlutuntersuchung() {
            return blutuntersuchung;
        }

        /**
         * Sets the value of the blutuntersuchung property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBlutuntersuchung(String value) {
            this.blutuntersuchung = value;
        }

        /**
         * Gets the value of the urinuntersuchung property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrinuntersuchung() {
            return urinuntersuchung;
        }

        /**
         * Sets the value of the urinuntersuchung property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrinuntersuchung(String value) {
            this.urinuntersuchung = value;
        }

    }

}
