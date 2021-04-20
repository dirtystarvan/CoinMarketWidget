package com.ac1dtest.coinwidget.view;

import javafx.scene.image.Image;

import java.util.HashMap;

public class Logo {
    private final static HashMap<Integer, String> paths;
    private static final double imgWidth = 64;
    private static final double imgHeight = 64;

    static {
        paths = new HashMap<>();
        paths.put(1, "btc.png");
        paths.put(1027, "eth.png");
        paths.put(74, "doge.png");
        paths.put(1839, "bnb.png");
        paths.put(825, "usdt.png");
        paths.put(52, "xrp.png");
        paths.put(-1, "default.png");
    }

    private Logo() {}

    public static Image getImg() {
        return new Image("default.png", imgWidth, imgHeight, false, true);
    }

        public static Image getImg(int coinID) {
        return paths.containsKey(coinID)
                ? new Image(paths.get(coinID), imgWidth, imgHeight, false, true)
                : new Image("default.png", imgWidth, imgHeight, false, true);
    }

}
