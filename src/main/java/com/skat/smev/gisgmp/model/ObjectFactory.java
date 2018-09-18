//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.18 at 06:29:50 PM MSK 
//


package com.skat.smev.gisgmp.model;

import com.skat.smev.gisgmp.domain.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.skat.smev.gisgmp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MultiplierSize_QNAME = new QName("http://roskazna.ru/gisgmp/xsd/Common/2.0.1", "MultiplierSize");
    private final static QName _DiscountFixed_QNAME = new QName("http://roskazna.ru/gisgmp/xsd/Common/2.0.1", "DiscountFixed");
    private final static QName _DiscountSize_QNAME = new QName("http://roskazna.ru/gisgmp/xsd/Common/2.0.1", "DiscountSize");
    private final static QName _AdditionalData_QNAME = new QName("http://roskazna.ru/gisgmp/xsd/Common/2.0.1", "AdditionalData");
    private final static QName _Discount_QNAME = new QName("http://roskazna.ru/gisgmp/xsd/Common/2.0.1", "Discount");
    private final static QName _TimeInterval_QNAME = new QName("http://roskazna.ru/gisgmp/xsd/Common/2.0.1", "TimeInterval");
    private final static QName _RefundPayer_QNAME = new QName("http://roskazna.ru/gisgmp/xsd/Organization/2.0.1", "RefundPayer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.skat.smev.gisgmp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExportChargesResponse }
     * 
     */
    public ExportChargesResponse createExportChargesResponse() {
        return new ExportChargesResponse();
    }

    /**
     * Create an instance of {@link ChargeTemplateType }
     * 
     */
    public ChargeTemplateType createChargeTemplateType() {
        return new ChargeTemplateType();
    }

    /**
     * Create an instance of {@link ChargeType }
     * 
     */
    public ChargeType createChargeType() {
        return new ChargeType();
    }

    /**
     * Create an instance of {@link TimeConditionsType }
     * 
     */
    public TimeConditionsType createTimeConditionsType() {
        return new TimeConditionsType();
    }

    /**
     * Create an instance of {@link EsiaUserInfoType }
     * 
     */
    public EsiaUserInfoType createEsiaUserInfoType() {
        return new EsiaUserInfoType();
    }

    /**
     * Create an instance of {@link EsiaUserInfoType.Person }
     * 
     */
    public EsiaUserInfoType.Person createEsiaUserInfoTypePerson() {
        return new EsiaUserInfoType.Person();
    }

    /**
     * Create an instance of {@link ExportChargesRequest }
     * 
     */
    public ExportChargesRequest createExportChargesRequest() {
        return new ExportChargesRequest();
    }

    /**
     * Create an instance of {@link ExportRequestType }
     * 
     */
    public ExportRequestType createExportRequestType() {
        return new ExportRequestType();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link PagingType }
     * 
     */
    public PagingType createPagingType() {
        return new PagingType();
    }

    /**
     * Create an instance of {@link ChargesExportConditions }
     * 
     */
    public ChargesExportConditions createChargesExportConditions() {
        return new ChargesExportConditions();
    }

    /**
     * Create an instance of {@link ChargesConditionsType }
     * 
     */
    public ChargesConditionsType createChargesConditionsType() {
        return new ChargesConditionsType();
    }

    /**
     * Create an instance of {@link PayersConditionsType }
     * 
     */
    public PayersConditionsType createPayersConditionsType() {
        return new PayersConditionsType();
    }

    /**
     * Create an instance of {@link PaymentsConditionsType }
     * 
     */
    public PaymentsConditionsType createPaymentsConditionsType() {
        return new PaymentsConditionsType();
    }

    /**
     * Create an instance of {@link RefundsConditionsType }
     * 
     */
    public RefundsConditionsType createRefundsConditionsType() {
        return new RefundsConditionsType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link ExportChargesResponse.ChargeInfo }
     * 
     */
    public ExportChargesResponse.ChargeInfo createExportChargesResponseChargeInfo() {
        return new ExportChargesResponse.ChargeInfo();
    }

    /**
     * Create an instance of {@link UBPOrganizationType }
     * 
     */
    public UBPOrganizationType createUBPOrganizationType() {
        return new UBPOrganizationType();
    }

    /**
     * Create an instance of {@link Payee }
     * 
     */
    public Payee createPayee() {
        return new Payee();
    }

    /**
     * Create an instance of {@link OrganizationType }
     * 
     */
    public OrganizationType createOrganizationType() {
        return new OrganizationType();
    }

    /**
     * Create an instance of {@link OrgAccount }
     * 
     */
    public OrgAccount createOrgAccount() {
        return new OrgAccount();
    }

    /**
     * Create an instance of {@link AccountType }
     * 
     */
    public AccountType createAccountType() {
        return new AccountType();
    }

    /**
     * Create an instance of {@link BankType }
     * 
     */
    public BankType createBankType() {
        return new BankType();
    }

    /**
     * Create an instance of {@link LsvTOFKType }
     * 
     */
    public LsvTOFKType createLsvTOFKType() {
        return new LsvTOFKType();
    }

    /**
     * Create an instance of {@link PaymentOrgType }
     * 
     */
    public PaymentOrgType createPaymentOrgType() {
        return new PaymentOrgType();
    }

    /**
     * Create an instance of {@link LsvFOType }
     * 
     */
    public LsvFOType createLsvFOType() {
        return new LsvFOType();
    }

    /**
     * Create an instance of {@link AdditionalDataType }
     * 
     */
    public AdditionalDataType createAdditionalDataType() {
        return new AdditionalDataType();
    }

    /**
     * Create an instance of {@link ChangeStatus }
     * 
     */
    public ChangeStatus createChangeStatus() {
        return new ChangeStatus();
    }

    /**
     * Create an instance of {@link TimeIntervalType }
     * 
     */
    public TimeIntervalType createTimeIntervalType() {
        return new TimeIntervalType();
    }

    /**
     * Create an instance of {@link KBKlist }
     * 
     */
    public KBKlist createKBKlist() {
        return new KBKlist();
    }

    /**
     * Create an instance of {@link MultiplierSize }
     * 
     */
    public MultiplierSize createMultiplierSize() {
        return new MultiplierSize();
    }

    /**
     * Create an instance of {@link DiscountFixed }
     * 
     */
    public DiscountFixed createDiscountFixed() {
        return new DiscountFixed();
    }

    /**
     * Create an instance of {@link DiscountSize }
     * 
     */
    public DiscountSize createDiscountSize() {
        return new DiscountSize();
    }

    /**
     * Create an instance of {@link PayerType }
     * 
     */
    public PayerType createPayerType() {
        return new PayerType();
    }

    /**
     * Create an instance of {@link CertificateInfoType }
     * 
     */
    public CertificateInfoType createCertificateInfoType() {
        return new CertificateInfoType();
    }

    /**
     * Create an instance of {@link ImportPackageResponseType }
     * 
     */
    public ImportPackageResponseType createImportPackageResponseType() {
        return new ImportPackageResponseType();
    }

    /**
     * Create an instance of {@link ImportCertificateEntryType }
     * 
     */
    public ImportCertificateEntryType createImportCertificateEntryType() {
        return new ImportCertificateEntryType();
    }

    /**
     * Create an instance of {@link AccDocType }
     * 
     */
    public AccDocType createAccDocType() {
        return new AccDocType();
    }

    /**
     * Create an instance of {@link ImportProtocolType }
     * 
     */
    public ImportProtocolType createImportProtocolType() {
        return new ImportProtocolType();
    }

    /**
     * Create an instance of {@link BudgetIndexType }
     * 
     */
    public BudgetIndexType createBudgetIndexType() {
        return new BudgetIndexType();
    }

    /**
     * Create an instance of {@link PaymentsExportConditions }
     * 
     */
    public PaymentsExportConditions createPaymentsExportConditions() {
        return new PaymentsExportConditions();
    }

    /**
     * Create an instance of {@link RefundsExportConditions }
     * 
     */
    public RefundsExportConditions createRefundsExportConditions() {
        return new RefundsExportConditions();
    }

    /**
     * Create an instance of {@link QuittancesExportConditions }
     * 
     */
    public QuittancesExportConditions createQuittancesExportConditions() {
        return new QuittancesExportConditions();
    }

    /**
     * Create an instance of {@link ChargeTemplateType.Payee }
     * 
     */
    public ChargeTemplateType.Payee createChargeTemplateTypePayee() {
        return new ChargeTemplateType.Payee();
    }

    /**
     * Create an instance of {@link ChargeTemplateType.Payer }
     * 
     */
    public ChargeTemplateType.Payer createChargeTemplateTypePayer() {
        return new ChargeTemplateType.Payer();
    }

    /**
     * Create an instance of {@link ChargeType.LinkedChargesIdentifiers }
     * 
     */
    public ChargeType.LinkedChargesIdentifiers createChargeTypeLinkedChargesIdentifiers() {
        return new ChargeType.LinkedChargesIdentifiers();
    }

    /**
     * Create an instance of {@link ChargeType.Payee }
     * 
     */
    public ChargeType.Payee createChargeTypePayee() {
        return new ChargeType.Payee();
    }

    /**
     * Create an instance of {@link ChargeType.Payer }
     * 
     */
    public ChargeType.Payer createChargeTypePayer() {
        return new ChargeType.Payer();
    }

    /**
     * Create an instance of {@link TimeConditionsType.Beneficiary }
     * 
     */
    public TimeConditionsType.Beneficiary createTimeConditionsTypeBeneficiary() {
        return new TimeConditionsType.Beneficiary();
    }

    /**
     * Create an instance of {@link EsiaUserInfoType.IndividualBusiness }
     * 
     */
    public EsiaUserInfoType.IndividualBusiness createEsiaUserInfoTypeIndividualBusiness() {
        return new EsiaUserInfoType.IndividualBusiness();
    }

    /**
     * Create an instance of {@link EsiaUserInfoType.Person.DocumentIdentity }
     * 
     */
    public EsiaUserInfoType.Person.DocumentIdentity createEsiaUserInfoTypePersonDocumentIdentity() {
        return new EsiaUserInfoType.Person.DocumentIdentity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplierSize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roskazna.ru/gisgmp/xsd/Common/2.0.1", name = "MultiplierSize", substitutionHeadNamespace = "http://roskazna.ru/gisgmp/xsd/Common/2.0.1", substitutionHeadName = "Discount")
    public JAXBElement<MultiplierSize> createMultiplierSize(MultiplierSize value) {
        return new JAXBElement<MultiplierSize>(_MultiplierSize_QNAME, MultiplierSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscountFixed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roskazna.ru/gisgmp/xsd/Common/2.0.1", name = "DiscountFixed", substitutionHeadNamespace = "http://roskazna.ru/gisgmp/xsd/Common/2.0.1", substitutionHeadName = "Discount")
    public JAXBElement<DiscountFixed> createDiscountFixed(DiscountFixed value) {
        return new JAXBElement<DiscountFixed>(_DiscountFixed_QNAME, DiscountFixed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscountSize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roskazna.ru/gisgmp/xsd/Common/2.0.1", name = "DiscountSize", substitutionHeadNamespace = "http://roskazna.ru/gisgmp/xsd/Common/2.0.1", substitutionHeadName = "Discount")
    public JAXBElement<DiscountSize> createDiscountSize(DiscountSize value) {
        return new JAXBElement<DiscountSize>(_DiscountSize_QNAME, DiscountSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roskazna.ru/gisgmp/xsd/Common/2.0.1", name = "AdditionalData")
    public JAXBElement<AdditionalDataType> createAdditionalData(AdditionalDataType value) {
        return new JAXBElement<AdditionalDataType>(_AdditionalData_QNAME, AdditionalDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roskazna.ru/gisgmp/xsd/Common/2.0.1", name = "Discount")
    public JAXBElement<DiscountType> createDiscount(DiscountType value) {
        return new JAXBElement<DiscountType>(_Discount_QNAME, DiscountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeIntervalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roskazna.ru/gisgmp/xsd/Common/2.0.1", name = "TimeInterval")
    public JAXBElement<TimeIntervalType> createTimeInterval(TimeIntervalType value) {
        return new JAXBElement<TimeIntervalType>(_TimeInterval_QNAME, TimeIntervalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UBPOrganizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roskazna.ru/gisgmp/xsd/Organization/2.0.1", name = "RefundPayer")
    public JAXBElement<UBPOrganizationType> createRefundPayer(UBPOrganizationType value) {
        return new JAXBElement<UBPOrganizationType>(_RefundPayer_QNAME, UBPOrganizationType.class, null, value);
    }

}
