package com.ac1dtest.coinwidget.model.entities;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Status {
	private String timestamp;
	private int errorCode;
	private String errorMessage;
	private int elapsed;
	private int creditCount;
	private int totalCount;

	public Status() {
	}

	public Status(String timestamp, int errorCode, String errorMessage, int elapsed, int creditCount, int totalCount) {
		this.timestamp = timestamp;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.elapsed = elapsed;
		this.creditCount = creditCount;
		this.totalCount = totalCount;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@JsonGetter("error_code")
	public int getErrorCode() {
		return errorCode;
	}

	@JsonSetter("error_code")
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	@JsonGetter("error_message")
	public String getErrorMessage() {
		return errorMessage;
	}

	@JsonSetter("error_message")
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getElapsed() {
		return elapsed;
	}

	public void setElapsed(int elapsed) {
		this.elapsed = elapsed;
	}

	@JsonGetter("credit_count")
	public int getCreditCount() {
		return creditCount;
	}

	@JsonSetter("credit_count")
	public void setCreditCount(int creditCount) {
		this.creditCount = creditCount;
	}

	@JsonGetter("total_count")
	public int getTotalCount() {
		return totalCount;
	}

	@JsonSetter("total_count")
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	@Override
	public String toString() {
		return "Status{" +
				"timestamp='" + timestamp + '\'' +
				", errorCode=" + errorCode +
				", errorMessage='" + errorMessage + '\'' +
				", elapsed=" + elapsed +
				", creditCount=" + creditCount +
				", totalCount=" + totalCount +
				'}';
	}
}