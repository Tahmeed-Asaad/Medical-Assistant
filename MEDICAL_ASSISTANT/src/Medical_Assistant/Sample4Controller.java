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
import javafx.event.ActionEvent;
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
public class Sample4Controller implements Initializable {

    @FXML
    private Label symptoms;
    private Label symptompsList;
    @FXML
    private Label medicineList;
    @FXML
    private Label perevention;
    @FXML
    private Label preventionList;
 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         medicineList.setText(NewClass.TotalInformation[2]);
         preventionList.setText(NewClass.TotalInformation[3]);
    }    
   
    
    private void goToNextMenu(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
        
        Parent root = FXMLLoader.load(getClass().getResource("sample3.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
        
    }

    @FXML
    private void verify(MouseEvent event) throws IOException {
        
        
           Parent root = FXMLLoader.load(getClass().getResource("END SCENE.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
        
         final Node source = (Node) event.getSource();
         final Stage stage1 = (Stage) source.getScene().getWindow();
         stage1.close();
        
        
    }
    
    
}
