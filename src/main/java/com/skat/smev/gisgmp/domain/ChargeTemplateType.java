//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.18 at 06:29:50 PM MSK 
//


package com.skat.smev.gisgmp.domain;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Данные шаблона начисления
 * 
 * <p>Java class for ChargeTemplateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeTemplateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Payee">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://roskazna.ru/gisgmp/xsd/Organization/2.0.1}OrganizationType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://roskazna.ru/gisgmp/xsd/Common/2.0.1}OrgAccount"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Payer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://roskazna.ru/gisgmp/xsd/Common/2.0.1}PayerType">
 *                 &lt;attribute name="additionalPayerIdentifier">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://roskazna.ru/gisgmp/xsd/Common/2.0.1}PayerIdentifierType">
 *                       &lt;pattern value="(1((0[1-9])|(1[0-5])|(2[1245689])|(3[0]))[0-9a-zA-Zа-яА-Я]{19})|(200\d{14}[A-Z0-9]{2}\d{3})|(300\d{14}[A-Z0-9]{2}\d{3}|3[0]{7}\d{9}[A-Z0-9]{2}\d{3})|(4[0]{9}\d{12})"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BudgetIndex" type="{http://roskazna.ru/gisgmp/xsd/BudgetIndex/2.0.1}BudgetIndexType"/>
 *         &lt;element ref="{http://roskazna.ru/gisgmp/xsd/Common/2.0.1}ChangeStatus"/>
 *         &lt;element ref="{http://roskazna.ru/gisgmp/xsd/Common/2.0.1}Discount" minOccurs="0"/>
 *         &lt;element ref="{http://roskazna.ru/gisgmp/xsd/Common/2.0.1}AdditionalData" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="supplierBillID">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://roskazna.ru/gisgmp/xsd/Common/2.0.1}SupplierBillIDType">
 *             &lt;pattern value="(\w{20})|(\d{25})"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="billDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="validUntil" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="totalAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="purpose" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="\S+[\S\s]*\S+"/>
 *             &lt;maxLength value="210"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="kbk" use="required" type="{http://roskazna.ru/gisgmp/xsd/Common/2.0.1}KBKType" />
 *       &lt;attribute name="oktmo" use="required" type="{http://roskazna.ru/gisgmp/xsd/Common/2.0.1}OKTMOType" />
 *       &lt;attribute name="deliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="paymentTerm" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="origin">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="PRIOR"/>
 *             &lt;pattern value="TEMP"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeTemplateType", namespace = "http://roskazna.ru/gisgmp/xsd/Charge/2.0.1", propOrder = {
    "payee",
    "payer",
    "budgetIndex",
    "changeStatus",
    "discount",
    "additionalData"
})
public class ChargeTemplateType {

    @XmlElement(name = "Payee", required = true)
    protected ChargeTemplateType.Payee payee;
    @XmlElement(name = "Payer", required = true)
    protected ChargeTemplateType.Payer payer;
    @XmlElement(name = "BudgetIndex", required = true)
    protected BudgetIndexType budgetIndex;
    @XmlElement(name = "ChangeStatus", namespace = "http://roskazna.ru/gisgmp/xsd/Common/2.0.1", required = true)
    protected ChangeStatus changeStatus;
    @XmlElementRef(name = "Discount", namespace = "http://roskazna.ru/gisgmp/xsd/Common/2.0.1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends DiscountType> discount;
    @XmlElement(name = "AdditionalData", namespace = "http://roskazna.ru/gisgmp/xsd/Common/2.0.1")
    protected List<AdditionalDataType> additionalData;
    @XmlAttribute(name = "supplierBillID")
    protected String supplierBillID;
    @XmlAttribute(name = "billDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billDate;
    @XmlAttribute(name = "validUntil")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validUntil;
    @XmlAttribute(name = "totalAmount", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalAmount;
    @XmlAttribute(name = "purpose", required = true)
    protected String purpose;
    @XmlAttribute(name = "kbk", required = true)
    protected String kbk;
    @XmlAttribute(name = "oktmo", required = true)
    protected String oktmo;
    @XmlAttribute(name = "deliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryDate;
    @XmlAttribute(name = "paymentTerm")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentTerm;
    @XmlAttribute(name = "origin")
    protected String origin;

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeTemplateType.Payee }
     *     
     */
    public ChargeTemplateType.Payee getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeTemplateType.Payee }
     *     
     */
    public void setPayee(ChargeTemplateType.Payee value) {
        this.payee = value;
    }

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeTemplateType.Payer }
     *     
     */
    public ChargeTemplateType.Payer getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeTemplateType.Payer }
     *     
     */
    public void setPayer(ChargeTemplateType.Payer value) {
        this.payer = value;
    }

    /**
     * Gets the value of the budgetIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetIndexType }
     *     
     */
    public BudgetIndexType getBudgetIndex() {
        return budgetIndex;
    }

    /**
     * Sets the value of the budgetIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetIndexType }
     *     
     */
    public void setBudgetIndex(BudgetIndexType value) {
        this.budgetIndex = value;
    }

    /**
     * Gets the value of the changeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeStatus }
     *     
     */
    public ChangeStatus getChangeStatus() {
        return changeStatus;
    }

    /**
     * Sets the value of the changeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeStatus }
     *     
     */
    public void setChangeStatus(ChangeStatus value) {
        this.changeStatus = value;
    }

    /**
     * Дополнительные условия оплаты
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DiscountSize }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscountType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiplierSize }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscountFixed }{@code >}
     *     
     */
    public JAXBElement<? extends DiscountType> getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DiscountSize }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscountType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiplierSize }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscountFixed }{@code >}
     *     
     */
    public void setDiscount(JAXBElement<? extends DiscountType> value) {
        this.discount = value;
    }

    /**
     * Дополнительные поля начисления Gets the value of the additionalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalDataType }
     * 
     * 
     */
    public List<AdditionalDataType> getAdditionalData() {
        if (additionalData == null) {
            additionalData = new ArrayList<AdditionalDataType>();
        }
        return this.additionalData;
    }

    /**
     * Gets the value of the supplierBillID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierBillID() {
        return supplierBillID;
    }

    /**
     * Sets the value of the supplierBillID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierBillID(String value) {
        this.supplierBillID = value;
    }

    /**
     * Gets the value of the billDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillDate() {
        return billDate;
    }

    /**
     * Sets the value of the billDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillDate(XMLGregorianCalendar value) {
        this.billDate = value;
    }

    /**
     * Gets the value of the validUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidUntil() {
        return validUntil;
    }

    /**
     * Sets the value of the validUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidUntil(XMLGregorianCalendar value) {
        this.validUntil = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalAmount(BigInteger value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the kbk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKbk() {
        return kbk;
    }

    /**
     * Sets the value of the kbk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKbk(String value) {
        this.kbk = value;
    }

    /**
     * Gets the value of the oktmo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOktmo() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOktmo(String value) {
        this.oktmo = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the paymentTerm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Sets the value of the paymentTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentTerm(XMLGregorianCalendar value) {
        this.paymentTerm = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://roskazna.ru/gisgmp/xsd/Organization/2.0.1}OrganizationType">
     *       &lt;sequence>
     *         &lt;element ref="{http://roskazna.ru/gisgmp/xsd/Common/2.0.1}OrgAccount"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orgAccount"
    })
    public static class Payee
        extends OrganizationType
    {

        @XmlElement(name = "OrgAccount", required = true)
        protected OrgAccount orgAccount;

        /**
         * Реквизиты счета организации
         * 
         * @return
         *     possible object is
         *     {@link OrgAccount }
         *     
         */
        public OrgAccount getOrgAccount() {
            return orgAccount;
        }

        /**
         * Sets the value of the orgAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrgAccount }
         *     
         */
        public void setOrgAccount(OrgAccount value) {
            this.orgAccount = value;
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
     *     &lt;extension base="{http://roskazna.ru/gisgmp/xsd/Common/2.0.1}PayerType">
     *       &lt;attribute name="additionalPayerIdentifier">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://roskazna.ru/gisgmp/xsd/Common/2.0.1}PayerIdentifierType">
     *             &lt;pattern value="(1((0[1-9])|(1[0-5])|(2[1245689])|(3[0]))[0-9a-zA-Zа-яА-Я]{19})|(200\d{14}[A-Z0-9]{2}\d{3})|(300\d{14}[A-Z0-9]{2}\d{3}|3[0]{7}\d{9}[A-Z0-9]{2}\d{3})|(4[0]{9}\d{12})"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Payer
        extends PayerType
    {

        @XmlAttribute(name = "additionalPayerIdentifier")
        protected String additionalPayerIdentifier;

        /**
         * Gets the value of the additionalPayerIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalPayerIdentifier() {
            return additionalPayerIdentifier;
        }

        /**
         * Sets the value of the additionalPayerIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalPayerIdentifier(String value) {
            this.additionalPayerIdentifier = value;
        }

    }

}
