/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.net.URL;
import javafx.util.Duration;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author bradsheppard
 */
public class DemoController implements Initializable {

    @FXML
    private VBox keypad;
    @FXML
    private PasswordField display;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void keyTyped(ActionEvent event) {
        String current = display.getText();
        String newValue = ((Button) event.getSource()).getText();
        display.setText(current + newValue);
    }

    @FXML
    private void delete(ActionEvent event) {
        display.setText("");

    }

    @FXML
    private void done(ActionEvent event) {
        boolean b = JavaFXApplication1.validate(display.getText());
        if(b){
            FadeTransition t = new FadeTransition(new Duration(1000), keypad);
            t.setFromValue(1);
            t.setToValue(0);
            t.play();
        }
        

    }

}
