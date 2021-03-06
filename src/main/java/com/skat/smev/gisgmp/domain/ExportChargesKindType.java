//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.18 at 06:29:50 PM MSK 
//


package com.skat.smev.gisgmp.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportChargesKindType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExportChargesKindType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHARGE"/>
 *     &lt;enumeration value="CHARGENOTFULLMATCHED"/>
 *     &lt;enumeration value="CHARGESTATUS"/>
 *     &lt;enumeration value="CHARGE-PRIOR"/>
 *     &lt;enumeration value="CHARGE-PRIOR-NOTFULLMATCHED"/>
 *     &lt;enumeration value="CHARGE-PRIOR-STATUS"/>
 *     &lt;enumeration value="TEMP-CHARGING"/>
 *     &lt;enumeration value="TEMP-CHARGING-NOTFULLMATCHED"/>
 *     &lt;enumeration value="TEMP-CHARGING-STATUS"/>
 *     &lt;enumeration value="MAINCHARGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExportChargesKindType", namespace = "http://roskazna.ru/gisgmp/xsd/SearchConditions/2.0.1")
@XmlEnum
public enum ExportChargesKindType {

    CHARGE("CHARGE"),
    CHARGENOTFULLMATCHED("CHARGENOTFULLMATCHED"),
    CHARGESTATUS("CHARGESTATUS"),
    @XmlEnumValue("CHARGE-PRIOR")
    CHARGE_PRIOR("CHARGE-PRIOR"),
    @XmlEnumValue("CHARGE-PRIOR-NOTFULLMATCHED")
    CHARGE_PRIOR_NOTFULLMATCHED("CHARGE-PRIOR-NOTFULLMATCHED"),
    @XmlEnumValue("CHARGE-PRIOR-STATUS")
    CHARGE_PRIOR_STATUS("CHARGE-PRIOR-STATUS"),
    @XmlEnumValue("TEMP-CHARGING")
    TEMP_CHARGING("TEMP-CHARGING"),
    @XmlEnumValue("TEMP-CHARGING-NOTFULLMATCHED")
    TEMP_CHARGING_NOTFULLMATCHED("TEMP-CHARGING-NOTFULLMATCHED"),
    @XmlEnumValue("TEMP-CHARGING-STATUS")
    TEMP_CHARGING_STATUS("TEMP-CHARGING-STATUS"),
    MAINCHARGE("MAINCHARGE");
    private final String value;

    ExportChargesKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExportChargesKindType fromValue(String v) {
        for (ExportChargesKindType c: ExportChargesKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
