package com.skat.smev.gisgmp.domain;

import java.util.List;
import java.util.ArrayList;

public class ResponseMessageModel extends BaseMessageModel {

	//
	private List<ChargeInfoModel> chargeInfo;
	private String hasMore;
	private String needReRequest;
	private String id;
	private String rqId;
	private String recipientIdentifier;
	private String timestamp;

	private List<String> attachments;

	public String getHasMore() {
		return hasMore;
	}

	public void setHasMore(String hasMore) {
		this.hasMore = hasMore;
	}

	public String getNeedReRequest() {
		return needReRequest;
	}

	public void setNeedReRequest(String needReRequest) {
		this.needReRequest = needReRequest;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRqId() {
		return rqId;
	}

	public void setRqId(String rqId) {
		this.rqId = rqId;
	}

	public String getRecipientIdentifier() {
		return recipientIdentifier;
	}

	public void setRecipientIdentifier(String recipientIdentifier) {
		this.recipientIdentifier = recipientIdentifier;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public List<ChargeInfoModel> getChargeInfo(){
		if (chargeInfo == null) {
			chargeInfo = new ArrayList<ChargeInfoModel>();
		}

		return chargeInfo;
	}

	public List<String> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<String> attachments) {
		this.attachments = attachments;
	}

	@Override
	public String toString() {
		return "ResponseMessageModel{" +
				"messageId='" + messageId + '\'' +
				'}';
	}
}