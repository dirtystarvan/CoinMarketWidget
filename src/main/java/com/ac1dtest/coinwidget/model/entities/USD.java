package com.ac1dtest.coinwidget.model.entities;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class USD {
	private double price;
	private double percent_change_24h;
	private double percent_change_1h;

	public USD() {
	}

	public USD(double price, double percent_change_24h, double percent_change_1h) {
		this.price = price;
		this.percent_change_24h = percent_change_24h;
		this.percent_change_1h = percent_change_1h;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@JsonGetter("percent_change_24h")
	public double getPercent_change_24h() {
		return percent_change_24h;
	}

	@JsonSetter("percent_change_24h")
	public void setPercent_change_24h(double percent_change_24h) {
		this.percent_change_24h = percent_change_24h;
	}

	@JsonGetter("percent_change_1h")
	public double getPercent_change_1h() {
		return percent_change_1h;
	}

	@JsonSetter("percent_change_1h")
	public void setPercent_change_1h(double percent_change_1h) {
		this.percent_change_1h = percent_change_1h;
	}
}