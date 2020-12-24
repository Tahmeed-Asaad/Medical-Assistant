/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medical_Assistant;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author FAHIM
 */
public class Sample66Controller implements Initializable {

    @FXML
    private Label Usersymptom;
    @FXML
    private Label GeneralSymptom;
    @FXML
    private Label UserSymptomList;
    @FXML
    private Label generalSymptomList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        GeneralSymptom.setText("General Symptoms of "+NewClass.TotalInformation[0]+" : ");
         generalSymptomList.setText(NewClass.TotalInformation[1]);
         String s11="";
         int j=1;
         for(int h=0;h<=NewClass.i;h++){
             s11=s11+NewClass.StoreSymptom[h]+"\n";
             j++;
         }
         Usersymptom.setText("Your Selected Symptoms :");
         UserSymptomList.setText(s11);
        
        
        
    }    

    @FXML
    private void gotoMainMenu(MouseEvent event) throws IOException {
        
         
        Parent root = FXMLLoader.load(getClass().getResource("Sample2.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
        
         final Node source = (Node) event.getSource();
         final Stage stage1 = (Stage) source.getScene().getWindow();
         stage1.close();
        
        
    }

    @FXML
    private void goprevious(MouseEvent event) throws IOException {
         
        Parent root = FXMLLoader.load(getClass().getResource("sample4.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
        
         final Node source = (Node) event.getSource();
         final Stage stage1 = (Stage) source.getScene().getWindow();
         stage1.close();
        
        
    }
    
}
