package com.ac1dtest.coinwidget.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	private Status status;
	private Coin[] data;

	public Data() {
	}

	public Data(Status status, Coin[] data) {
		this.status = status;
		this.data = data;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Coin[] getData() {
		return data;
	}

	public void setData(Coin[] data) {
		this.data = data;
	}
}