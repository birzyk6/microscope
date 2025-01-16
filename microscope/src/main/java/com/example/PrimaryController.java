package com.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import java.io.IOException;
import javafx.scene.control.Label;

public class PrimaryController {
    Button button1 = new Button(1, "Button 1");
    Knob knob1 = new Knob(1, "Knob 1");
    @FXML
    private Label sliderValueLabel;
    @FXML
    private Slider knobSlider;

    @FXML
    public void initialize() {
        // Bind the slider value to the label and format it
        knobSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            sliderValueLabel.setText(String.format("%.1f", newValue));
            knob1.setValue(newValue.doubleValue());
            knob1.action();
        });
    }

    @FXML
    private void switchToSecondary() {
        try {
            App.setRoot("secondary");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void ButtonAction() {
        button1.action();
    }
}
