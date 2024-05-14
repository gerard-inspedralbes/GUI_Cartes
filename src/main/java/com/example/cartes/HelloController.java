package com.example.cartes;

import com.example.cartes.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private ImageView card_img;

    CardsDeck cardsDeck = new CardsDeck();

    @FXML
    protected void onHelloButtonClick() {
        Card card =cardsDeck.getCardFromDeck();
        card_img.setImage(new Image(new File("src/main/resources/images/"+card.getCardCode()+".png").toURI().toString()));
        welcomeText.setText(card.toString());
    }
}