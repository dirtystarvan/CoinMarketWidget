package com.ac1dtest.coinwidget.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Item extends HBox {
	private static final String FILLER = "-----";
	private final ImageView logo;
	private final Label name;
	private final Label price;
	private final Label hourChange;
	private final Label dayChange;

	public Item() {
		logo = new ImageView(Logo.getImg());
		this.name = new Label(FILLER);
		this.price = new Label(FILLER);
		this.hourChange = new Label(FILLER);
		this.dayChange = new Label(FILLER);

		VBox infoColumn = new VBox();
		infoColumn.getChildren().addAll(name, price, hourChange, dayChange);

		this.getChildren().addAll(logo, infoColumn);

		adjustLayout(logo, infoColumn);
	}

	public Item(int logoID, String name, double price, String hourChange, String dayChange) {
		logo = new ImageView(Logo.getImg(logoID));
		this.name = new Label(name);
		this.price = new Label("$" + price);
		this.hourChange = new Label(hourChange);
		this.dayChange = new Label(dayChange);

		VBox infoColumn = new VBox();
		infoColumn.getChildren().addAll(this.name, this.price, this.hourChange, this.dayChange);

		this.getChildren().addAll(logo, infoColumn);

		adjustLayout(logo, infoColumn);
	}

	private void adjustLayout(ImageView logo, VBox infoColumn) {
		Font font = new Font(14);
		name.setFont(font);
		price.setFont(font);
		hourChange.setFont(font);
		dayChange.setFont(font);

		HBox.setMargin(logo, new Insets(0, 40, 0, 20));

		infoColumn.setSpacing(7);
		infoColumn.setAlignment(Pos.TOP_LEFT);

		HBox.setHgrow(logo, Priority.ALWAYS);
		HBox.setHgrow(infoColumn, Priority.ALWAYS);

		this.prefHeight(View.windowHeight / 5);
		this.setAlignment(Pos.CENTER);

		VBox.setVgrow(this, Priority.ALWAYS);
	}

	public void setLogo(int coinID) {
		logo.setImage(Logo.getImg(coinID));
	}

	public void setInfo(String name, double price, double hourChange, double dayChange) {
		this.name.setText(name);
		this.price.setText(String.format("$%.3f", price));
		this.hourChange.setText(String.format("%+.3f%% in hour", hourChange));
		this.dayChange.setText(String.format("%+.3f%% in a day", dayChange));
	}

	public void setName(String value) {
		name.setText(value);
	}

	public void setPrice(String value) {
		price.setText("$" + value);
	}
}
