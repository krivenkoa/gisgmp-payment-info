//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.18 at 06:29:50 PM MSK 
//


package com.skat.smev.gisgmp.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
@XmlRootElement(name = "Payee", namespace = "http://roskazna.ru/gisgmp/xsd/Organization/2.0.1")
public class Payee
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
