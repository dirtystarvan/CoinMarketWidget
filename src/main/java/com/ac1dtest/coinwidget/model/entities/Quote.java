package com.ac1dtest.coinwidget.model.entities;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
	private USD usd;

	public Quote() {
	}

	public Quote(USD usd) {
		this.usd = usd;
	}

	@JsonGetter("USD")
	public USD getUsd() {
		return usd;
	}

	@JsonSetter("USD")
	public void setUsd(USD usd) {
		this.usd = usd;
	}
}
