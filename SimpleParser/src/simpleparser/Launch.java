/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleparser;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author rizki
 */
public class Launch extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        //ambil windows ke menu utama
        MainMenu m = new MainMenu();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        MainMenu m = new MainMenu();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    
    }
    
}
