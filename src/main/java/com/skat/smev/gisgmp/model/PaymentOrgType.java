//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.18 at 06:29:50 PM MSK 
//


package com.skat.smev.gisgmp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Организация принявшая платеж
 * 
 * <p>Java class for PaymentOrgType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentOrgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Bank" type="{http://roskazna.ru/gisgmp/xsd/Common/2.0.1}BankType"/>
 *         &lt;element name="UFK">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="36"/>
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="\d{4}"/>
 *               &lt;pattern value="[a-zA-Z0-9]{6}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Other">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="CASH"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentOrgType", namespace = "http://roskazna.ru/gisgmp/xsd/Organization/2.0.1", propOrder = {
    "bank",
    "ufk",
    "other"
})
public class PaymentOrgType {

    @XmlElement(name = "Bank", namespace = "http://roskazna.ru/gisgmp/xsd/Common/2.0.1")
    protected BankType bank;
    @XmlElement(name = "UFK", namespace = "http://www.w3.org/2001/XMLSchema")
    protected String ufk;
    @XmlElement(name = "Other", namespace = "http://www.w3.org/2001/XMLSchema")
    protected String other;

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link BankType }
     *     
     */
    public BankType getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankType }
     *     
     */
    public void setBank(BankType value) {
        this.bank = value;
    }

    /**
     * Gets the value of the ufk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUFK() {
        return ufk;
    }

    /**
     * Sets the value of the ufk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUFK(String value) {
        this.ufk = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

}
