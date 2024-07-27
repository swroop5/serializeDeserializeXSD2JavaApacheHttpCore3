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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Type.DABAG.Nebenleistung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Nebenleistung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auswahl_typ">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="hoechstnebenleistung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                   &lt;element name="nebenleistung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bezeichnung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="auswahl_hoehe">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="prozentsatz" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="betrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bezugsbetrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/>
 *         &lt;element name="intervall" type="{http://www.xjustiz.de}Code.GDS.Intervall" minOccurs="0"/>
 *         &lt;element name="beginn" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="bedingt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="befristet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="zusatz" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Nebenleistung", propOrder = {
    "auswahlTyp",
    "bezeichnung",
    "auswahlHoehe",
    "bezugsbetrag",
    "intervall",
    "beginn",
    "bedingt",
    "befristet",
    "zusatz"
})
public class TypeDABAGNebenleistung {

    @XmlElement(name = "auswahl_typ", required = true)
    protected TypeDABAGNebenleistung.AuswahlTyp auswahlTyp;
    protected String bezeichnung;
    @XmlElement(name = "auswahl_hoehe", required = true)
    protected TypeDABAGNebenleistung.AuswahlHoehe auswahlHoehe;
    protected TypeGDSGeldbetrag bezugsbetrag;
    protected CodeGDSIntervall intervall;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginn;
    protected Boolean bedingt;
    protected Boolean befristet;
    protected String zusatz;

    /**
     * Gets the value of the auswahlTyp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGNebenleistung.AuswahlTyp }
     *     
     */
    public TypeDABAGNebenleistung.AuswahlTyp getAuswahlTyp() {
        return auswahlTyp;
    }

    /**
     * Sets the value of the auswahlTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGNebenleistung.AuswahlTyp }
     *     
     */
    public void setAuswahlTyp(TypeDABAGNebenleistung.AuswahlTyp value) {
        this.auswahlTyp = value;
    }

    /**
     * Gets the value of the bezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the value of the bezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Gets the value of the auswahlHoehe property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGNebenleistung.AuswahlHoehe }
     *     
     */
    public TypeDABAGNebenleistung.AuswahlHoehe getAuswahlHoehe() {
        return auswahlHoehe;
    }

    /**
     * Sets the value of the auswahlHoehe property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGNebenleistung.AuswahlHoehe }
     *     
     */
    public void setAuswahlHoehe(TypeDABAGNebenleistung.AuswahlHoehe value) {
        this.auswahlHoehe = value;
    }

    /**
     * Gets the value of the bezugsbetrag property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public TypeGDSGeldbetrag getBezugsbetrag() {
        return bezugsbetrag;
    }

    /**
     * Sets the value of the bezugsbetrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public void setBezugsbetrag(TypeGDSGeldbetrag value) {
        this.bezugsbetrag = value;
    }

    /**
     * Gets the value of the intervall property.
     * 
     * @return
     *     possible object is
     *     {@link CodeGDSIntervall }
     *     
     */
    public CodeGDSIntervall getIntervall() {
        return intervall;
    }

    /**
     * Sets the value of the intervall property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGDSIntervall }
     *     
     */
    public void setIntervall(CodeGDSIntervall value) {
        this.intervall = value;
    }

    /**
     * Gets the value of the beginn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginn() {
        return beginn;
    }

    /**
     * Sets the value of the beginn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginn(XMLGregorianCalendar value) {
        this.beginn = value;
    }

    /**
     * Gets the value of the bedingt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBedingt() {
        return bedingt;
    }

    /**
     * Sets the value of the bedingt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBedingt(Boolean value) {
        this.bedingt = value;
    }

    /**
     * Gets the value of the befristet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBefristet() {
        return befristet;
    }

    /**
     * Sets the value of the befristet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBefristet(Boolean value) {
        this.befristet = value;
    }

    /**
     * Gets the value of the zusatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZusatz() {
        return zusatz;
    }

    /**
     * Sets the value of the zusatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZusatz(String value) {
        this.zusatz = value;
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
     *         &lt;element name="prozentsatz" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="betrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/>
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
        "prozentsatz",
        "betrag"
    })
    public static class AuswahlHoehe {

        protected Double prozentsatz;
        protected TypeGDSGeldbetrag betrag;

        /**
         * Gets the value of the prozentsatz property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getProzentsatz() {
            return prozentsatz;
        }

        /**
         * Sets the value of the prozentsatz property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setProzentsatz(Double value) {
            this.prozentsatz = value;
        }

        /**
         * Gets the value of the betrag property.
         * 
         * @return
         *     possible object is
         *     {@link TypeGDSGeldbetrag }
         *     
         */
        public TypeGDSGeldbetrag getBetrag() {
            return betrag;
        }

        /**
         * Sets the value of the betrag property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeGDSGeldbetrag }
         *     
         */
        public void setBetrag(TypeGDSGeldbetrag value) {
            this.betrag = value;
        }

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
     *         &lt;element name="hoechstnebenleistung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
     *         &lt;element name="nebenleistung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
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
        "hoechstnebenleistung",
        "nebenleistung"
    })
    public static class AuswahlTyp {

        protected String hoechstnebenleistung;
        protected String nebenleistung;

        /**
         * Gets the value of the hoechstnebenleistung property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHoechstnebenleistung() {
            return hoechstnebenleistung;
        }

        /**
         * Sets the value of the hoechstnebenleistung property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHoechstnebenleistung(String value) {
            this.hoechstnebenleistung = value;
        }

        /**
         * Gets the value of the nebenleistung property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNebenleistung() {
            return nebenleistung;
        }

        /**
         * Sets the value of the nebenleistung property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNebenleistung(String value) {
            this.nebenleistung = value;
        }

    }

}
