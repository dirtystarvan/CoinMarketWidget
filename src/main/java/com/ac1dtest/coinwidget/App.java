package com.ac1dtest.coinwidget;

import com.ac1dtest.coinwidget.controller.Controller;
import com.ac1dtest.coinwidget.model.RestClient;
import com.ac1dtest.coinwidget.model.SpringConfig;
import com.ac1dtest.coinwidget.view.View;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * JavaFX App
 */
public final class App extends Application {
    public static final int NUMBER_OF_COINS = 5;
    private static AnnotationConfigApplicationContext context;

    @Override
    public void init() throws Exception {
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
    }

    @Override
    public void stop() throws Exception {
        context.close();
    }

    @Override
    public void start(Stage stage) {
        View mainView = new View();
        RestClient coinMarketCapClient = context.getBean("restClient", RestClient.class);
        Controller updateProcess = new Controller(mainView, coinMarketCapClient);

        stage.setScene(mainView.getScene());
        stage.show();
        updateProcess.start();
    }

    public static void main(String[] args) {
        launch();
    }
}