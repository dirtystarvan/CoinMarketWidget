package com.ac1dtest.coinwidget.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Coin {
	private int id;
	private String name;
	private String symbol;
	private Quote quote;

	public Coin() {
	}

	public Coin(int id, String name, String symbol, Quote quote) {
		this.id = id;
		this.name = name;
		this.symbol = symbol;
		this.quote = quote;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Quote getQuote() {
		return quote;
	}

	public void setQuote(Quote quote) {
		this.quote = quote;
	}
}