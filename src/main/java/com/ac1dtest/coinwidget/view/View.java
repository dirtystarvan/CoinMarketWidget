package com.ac1dtest.coinwidget.view;

import com.ac1dtest.coinwidget.App;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class View {
	private Scene scene;
	private ArrayList<Item> infoBlocks;

	public static final double windowWidth = 280;
	public static double windowHeight = 590;

	public View() {
		init();
	}

	private void init() {
		infoBlocks = new ArrayList<>();

		for (int i = 0; i < App.NUMBER_OF_COINS; i++)
			infoBlocks.add(new Item());

		VBox container = new VBox();
		container.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE,
				new CornerRadii(1), new Insets(0.0))));
		container.getChildren().addAll(infoBlocks);

		container.setSpacing(20);

		scene = new Scene(container, windowWidth, windowHeight);
	}

	public void setInfo(int blockPosition, int coinID, String name,
						double price, double hourChange, double dayChange) {
		Item infoBlock = infoBlocks.get(blockPosition);

		infoBlock.setLogo(coinID);
		infoBlock.setInfo(name, price, hourChange, dayChange);
	}

	public Scene getScene() {
		return scene;
	}
}