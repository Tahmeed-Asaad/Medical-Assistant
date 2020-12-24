/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medical_Assistant;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author FAHIM
 */
public class Sample2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        InitiaLizeEveryVariable();
    }    
    

    @FXML
    private void goToNextMenu(MouseEvent event) throws IOException {
        
        
        
        Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
        
        
         final Node source = (Node) event.getSource();
         final Stage stage1 = (Stage) source.getScene().getWindow();
         stage1.close();
    }

    @FXML
    private void goToNextMenu1(MouseEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("sample55.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
        
        
        
         final Node source = (Node) event.getSource();
         final Stage stage1 = (Stage) source.getScene().getWindow();
         stage1.close();
        
    }
        public void InitiaLizeEveryVariable(){
            for(int k=0;k<NewClass.StoreSymptom.length;k++)
            NewClass.StoreSymptom[k]=null;
            for(int j=0;j<NewClass.Serial.length;j++)
                NewClass.Serial[j]=0;
             for(int l=0;l<NewClass.TotalInformation.length;l++)
            NewClass.TotalInformation[l]=null;
            NewClass.i=-1;
            NewClass.s=null;
        }

    @FXML
    private void exit(MouseEvent event) {
       
        Platform.exit();
        
    }
    
}
