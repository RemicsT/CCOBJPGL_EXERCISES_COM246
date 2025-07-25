package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;

public class LoginController {
 
    @FXML
    TextField usernamefield;

    @FXML
    PasswordField passwordfield;

    @FXML
    Button loginbutton;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public static User user;

    @SuppressWarnings("exports")
    @FXML
    public void loginbuttonHandler(ActionEvent event) throws IOException{
        
        // Retrieve username in text field
        String username = usernamefield.getText();

        // Retrieve password in password field
        String password = passwordfield.getText();

        // Create user object
        user = new User(username, password, "", "");

        // Create a file object
        File accountsfile = new File("accounts.txt");

        // Check if file exists
        if (accountsfile.exists()) {
            
            Scanner filescanner;

            try {
                filescanner = new Scanner(accountsfile);

                while (filescanner.hasNextLine()) {
                    String data = filescanner.nextLine();

                    String username_from_file = data.split(",")[0];
                    String password_from_file = data.split(",")[1];

                    System.out.println(username_from_file + "," + password_from_file);

                    if (username_from_file.equals(user.getUsername()) && password_from_file.equals(user.getPassword())) {
                        
                        Alert alert = new Alert(AlertType.INFORMATION);
                        alert.setContentText("Login Successful!");  
                        alert.showAndWait();   
                        
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("HOME.fxml"));
                        root = loader.load();

                        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                        break;          
                    }
                }
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else{
            System.out.println("file doesnt exist");
        }
    }
}