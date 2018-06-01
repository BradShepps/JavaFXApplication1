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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author bradsheppard
 */
public class DemoController implements Initializable {

    private VBox keypad;
    private PasswordField display;
    @FXML
    private AnchorPane mainPane;
    @FXML
    private AnchorPane navigationPane;
    @FXML
    private Button profileButton;
    @FXML
    private AnchorPane homePane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML
    private void profileButton_exited(MouseEvent event) {
        
    }

    @FXML
    private void profileButton_move(MouseEvent event) {
        profileButton.getStyleClass().clear();
        profileButton.getStyleClass().add("profileButtonhover");
    }

}
