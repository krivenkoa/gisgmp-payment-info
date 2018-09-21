package com.skat.smev.gisgmp.domain;

import java.util.List;

/**
 * 
 * Модель json-запроса
 *
 */
public class RequestModel {

	/**/// esiaUserInfo
	private EsiaUserInfoModel esiaUserInfo;
	/**/

	/**///chargesExportConditions
	private ChargesConditionsModel chargesConditions;
	private PayersConditionsModel payersConditions;
	private PaymentsConditionsModel paymentsConditions;
	private TimeConditionsModel timeConditions;
	private RefundsConditionsModel refundsConditions;
	private String kind;

	private String pageNumber;
	private String pageLength;
	private String originatorId;
	/**/
	private List<AttachmentModel> attachments;

	public List<AttachmentModel> getAttachments() {
		return attachments;
	}

	public EsiaUserInfoModel getEsiaUserInfo(){
		return esiaUserInfo;
	}

	public String getKind() {
		return kind;
	}

	public String getPageNumber() {
		return pageNumber;
	}

	public String getPageLength(){
		return pageLength;
	}

	public String getOriginatorId() {
		return originatorId;
	}

	public ChargesConditionsModel getChargesConditions() {
		return chargesConditions;
	}

	public PayersConditionsModel getPayersConditions() {
		return payersConditions;
	}

	public PaymentsConditionsModel getPaymentsConditions() {
		return paymentsConditions;
	}

	public TimeConditionsModel getTimeConditions() {
		return timeConditions;
	}

	public RefundsConditionsModel getRefundsConditions() {
		return refundsConditions;
	}
}