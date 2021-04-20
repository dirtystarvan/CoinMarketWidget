package com.ac1dtest.coinwidget.controller;

import com.ac1dtest.coinwidget.model.RestClient;
import com.ac1dtest.coinwidget.model.entities.Coin;
import com.ac1dtest.coinwidget.model.entities.USD;
import com.ac1dtest.coinwidget.view.View;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class Controller {
	private final double refreshRate = 60000;

	private final View view;
	private final RestClient model;

	public Controller(View view, RestClient model) {
		this.view = view;
		this.model = model;
	}

	public void start() {
		refresh();

		Timeline timeline = new Timeline(new KeyFrame(Duration.millis(refreshRate), e -> refresh()));
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
	}

	private void refresh() {
		Coin[] coins = model.apiCall().getData();

		int i = 0;

		for (Coin coin: coins) {
			USD quotes = coin.getQuote().getUsd();
			view.setInfo(i++, coin.getId(), coin.getName(), quotes.getPrice(),
					quotes.getPercent_change_1h(), quotes.getPercent_change_24h());
		}
	}
}
