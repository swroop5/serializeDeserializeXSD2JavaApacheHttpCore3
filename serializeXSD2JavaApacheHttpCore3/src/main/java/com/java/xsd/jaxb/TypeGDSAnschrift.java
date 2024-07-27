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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Type.GDS.Anschrift complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.Anschrift">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anschriftstyp" type="{http://www.xjustiz.de}Code.GDS.Anschriftstyp" minOccurs="0"/>
 *         &lt;element name="anschriftenzusatz" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="strasse" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeB" minOccurs="0"/>
 *         &lt;element name="hausnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeB" minOccurs="0"/>
 *         &lt;element name="postfachnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="postleitzahl" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="ort" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeB" minOccurs="0"/>
 *         &lt;element name="ortsteil" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeB" minOccurs="0"/>
 *         &lt;element name="auswahl_bundesland" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="bundesland.BRD" type="{http://www.xjustiz.de}Code.GDS.Bundesland.Typ3"/>
 *                   &lt;element name="bundesland.freitext" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeB"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="wohnungsgeber" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/>
 *         &lt;element name="ehemaligeAnschrift" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="derzeitigerAufenthalt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="staat" type="{http://www.xjustiz.de}Code.GDS.Staaten.Typ3" minOccurs="0"/>
 *         &lt;element name="erfassungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ort.unbekannt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="postleitzahl.unbekannt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GDS.Anschrift", propOrder = {
    "anschriftstyp",
    "anschriftenzusatz",
    "strasse",
    "hausnummer",
    "postfachnummer",
    "postleitzahl",
    "ort",
    "ortsteil",
    "auswahlBundesland",
    "wohnungsgeber",
    "ehemaligeAnschrift",
    "derzeitigerAufenthalt",
    "staat",
    "erfassungsdatum",
    "ortUnbekannt",
    "postleitzahlUnbekannt"
})
@XmlSeeAlso({
    com.java.xsd.jaxb.TypeSTRAFOWITat.Tatort.Anschrift.class,
    com.java.xsd.jaxb.TypeSTRAFTat.Tatort.Anschrift.class
})
public class TypeGDSAnschrift {

    protected CodeGDSAnschriftstyp anschriftstyp;
    protected List<String> anschriftenzusatz;
    protected String strasse;
    protected String hausnummer;
    protected String postfachnummer;
    protected String postleitzahl;
    protected String ort;
    protected String ortsteil;
    @XmlElement(name = "auswahl_bundesland")
    protected TypeGDSAnschrift.AuswahlBundesland auswahlBundesland;
    protected String wohnungsgeber;
    @XmlElement(defaultValue = "false")
    protected Boolean ehemaligeAnschrift;
    @XmlElement(defaultValue = "false")
    protected Boolean derzeitigerAufenthalt;
    protected CodeGDSStaatenTyp3 staat;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar erfassungsdatum;
    @XmlElement(name = "ort.unbekannt", defaultValue = "true")
    protected Boolean ortUnbekannt;
    @XmlElement(name = "postleitzahl.unbekannt", defaultValue = "true")
    protected Boolean postleitzahlUnbekannt;

    /**
     * Gets the value of the anschriftstyp property.
     * 
     * @return
     *     possible object is
     *     {@link CodeGDSAnschriftstyp }
     *     
     */
    public CodeGDSAnschriftstyp getAnschriftstyp() {
        return anschriftstyp;
    }

    /**
     * Sets the value of the anschriftstyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGDSAnschriftstyp }
     *     
     */
    public void setAnschriftstyp(CodeGDSAnschriftstyp value) {
        this.anschriftstyp = value;
    }

    /**
     * Gets the value of the anschriftenzusatz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anschriftenzusatz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnschriftenzusatz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAnschriftenzusatz() {
        if (anschriftenzusatz == null) {
            anschriftenzusatz = new ArrayList<String>();
        }
        return this.anschriftenzusatz;
    }

    /**
     * Gets the value of the strasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * Sets the value of the strasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrasse(String value) {
        this.strasse = value;
    }

    /**
     * Gets the value of the hausnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHausnummer() {
        return hausnummer;
    }

    /**
     * Sets the value of the hausnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHausnummer(String value) {
        this.hausnummer = value;
    }

    /**
     * Gets the value of the postfachnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostfachnummer() {
        return postfachnummer;
    }

    /**
     * Sets the value of the postfachnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostfachnummer(String value) {
        this.postfachnummer = value;
    }

    /**
     * Gets the value of the postleitzahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostleitzahl() {
        return postleitzahl;
    }

    /**
     * Sets the value of the postleitzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostleitzahl(String value) {
        this.postleitzahl = value;
    }

    /**
     * Gets the value of the ort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Sets the value of the ort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrt(String value) {
        this.ort = value;
    }

    /**
     * Gets the value of the ortsteil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrtsteil() {
        return ortsteil;
    }

    /**
     * Sets the value of the ortsteil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrtsteil(String value) {
        this.ortsteil = value;
    }

    /**
     * Gets the value of the auswahlBundesland property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSAnschrift.AuswahlBundesland }
     *     
     */
    public TypeGDSAnschrift.AuswahlBundesland getAuswahlBundesland() {
        return auswahlBundesland;
    }

    /**
     * Sets the value of the auswahlBundesland property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSAnschrift.AuswahlBundesland }
     *     
     */
    public void setAuswahlBundesland(TypeGDSAnschrift.AuswahlBundesland value) {
        this.auswahlBundesland = value;
    }

    /**
     * Gets the value of the wohnungsgeber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWohnungsgeber() {
        return wohnungsgeber;
    }

    /**
     * Sets the value of the wohnungsgeber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohnungsgeber(String value) {
        this.wohnungsgeber = value;
    }

    /**
     * Gets the value of the ehemaligeAnschrift property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEhemaligeAnschrift() {
        return ehemaligeAnschrift;
    }

    /**
     * Sets the value of the ehemaligeAnschrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEhemaligeAnschrift(Boolean value) {
        this.ehemaligeAnschrift = value;
    }

    /**
     * Gets the value of the derzeitigerAufenthalt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDerzeitigerAufenthalt() {
        return derzeitigerAufenthalt;
    }

    /**
     * Sets the value of the derzeitigerAufenthalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDerzeitigerAufenthalt(Boolean value) {
        this.derzeitigerAufenthalt = value;
    }

    /**
     * Gets the value of the staat property.
     * 
     * @return
     *     possible object is
     *     {@link CodeGDSStaatenTyp3 }
     *     
     */
    public CodeGDSStaatenTyp3 getStaat() {
        return staat;
    }

    /**
     * Sets the value of the staat property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGDSStaatenTyp3 }
     *     
     */
    public void setStaat(CodeGDSStaatenTyp3 value) {
        this.staat = value;
    }

    /**
     * Gets the value of the erfassungsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErfassungsdatum() {
        return erfassungsdatum;
    }

    /**
     * Sets the value of the erfassungsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErfassungsdatum(XMLGregorianCalendar value) {
        this.erfassungsdatum = value;
    }

    /**
     * Gets the value of the ortUnbekannt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrtUnbekannt() {
        return ortUnbekannt;
    }

    /**
     * Sets the value of the ortUnbekannt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrtUnbekannt(Boolean value) {
        this.ortUnbekannt = value;
    }

    /**
     * Gets the value of the postleitzahlUnbekannt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostleitzahlUnbekannt() {
        return postleitzahlUnbekannt;
    }

    /**
     * Sets the value of the postleitzahlUnbekannt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostleitzahlUnbekannt(Boolean value) {
        this.postleitzahlUnbekannt = value;
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
     *         &lt;element name="bundesland.BRD" type="{http://www.xjustiz.de}Code.GDS.Bundesland.Typ3"/>
     *         &lt;element name="bundesland.freitext" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeB"/>
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
        "bundeslandBRD",
        "bundeslandFreitext"
    })
    public static class AuswahlBundesland {

        @XmlElement(name = "bundesland.BRD")
        protected CodeGDSBundeslandTyp3 bundeslandBRD;
        @XmlElement(name = "bundesland.freitext")
        protected String bundeslandFreitext;

        /**
         * Gets the value of the bundeslandBRD property.
         * 
         * @return
         *     possible object is
         *     {@link CodeGDSBundeslandTyp3 }
         *     
         */
        public CodeGDSBundeslandTyp3 getBundeslandBRD() {
            return bundeslandBRD;
        }

        /**
         * Sets the value of the bundeslandBRD property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeGDSBundeslandTyp3 }
         *     
         */
        public void setBundeslandBRD(CodeGDSBundeslandTyp3 value) {
            this.bundeslandBRD = value;
        }

        /**
         * Gets the value of the bundeslandFreitext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBundeslandFreitext() {
            return bundeslandFreitext;
        }

        /**
         * Sets the value of the bundeslandFreitext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBundeslandFreitext(String value) {
            this.bundeslandFreitext = value;
        }

    }

}
