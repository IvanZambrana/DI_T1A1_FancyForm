/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package fancyform;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ivan
 */
public class FancyForm extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        //GridPane Layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        //Adding Text
        Text scenetitle = new Text("Welcome");
        //ID for Text Node
        scenetitle.setId("welcome-text");
        //scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        //Adding Labels
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);
        
        //Adding TextField
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        //Adding PasswordField
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        
        //Adding Button
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        
        //Adding the last Text
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        //ID for Text Node
        actiontarget.setId("actiontarget");
        
        //Button Event
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                //actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
            }
        });
        
        //Creating scene
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        
        //Initializing the styleshhets Variable
        scene.getStylesheets().add
            (FancyForm.class.getResource("Login.css").toExternalForm());
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
