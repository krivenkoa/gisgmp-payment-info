//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.18 at 06:29:50 PM MSK 
//


package com.skat.smev.gisgmp.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;restriction base="{http://roskazna.ru/gisgmp/xsd/SearchConditions/2.0.1}Conditions">
 *       &lt;choice>
 *         &lt;element name="ChargesConditions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://roskazna.ru/gisgmp/xsd/SearchConditions/2.0.1}ChargesConditionsType">
 *                 &lt;sequence>
 *                   &lt;element name="SupplierBillID" type="{http://roskazna.ru/gisgmp/xsd/Common/2.0.1}SupplierBillIDType" maxOccurs="100"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PayersConditions" type="{http://roskazna.ru/gisgmp/xsd/SearchConditions/2.0.1}PayersConditionsType"/>
 *         &lt;element name="TimeConditions" type="{http://roskazna.ru/gisgmp/xsd/SearchConditions/2.0.1}TimeConditionsType"/>
 *       &lt;/choice>
 *       &lt;attribute name="kind" use="required" type="{http://roskazna.ru/gisgmp/xsd/SearchConditions/2.0.1}ExportChargesKindType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ChargesExportConditions", namespace = "http://roskazna.ru/gisgmp/xsd/SearchConditions/2.0.1")
public class ChargesExportConditions
    extends Conditions
{


}
