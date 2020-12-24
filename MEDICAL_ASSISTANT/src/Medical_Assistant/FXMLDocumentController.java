/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medical_Assistant;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author FAHIM
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private Label label;
    @FXML
    private Label L1;

    /**
     * Initializes the controller class.
     */
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        button.setVisible(false);
   L1.setText("You are most probably Affected by : "+NewClass.TotalInformation[0]+ "\n" +"The general symptoms of "+NewClass.TotalInformation[0]+" are "+"\n" + NewClass.TotalInformation[1]+"\n"+"Treatment : "+"\n" +NewClass.TotalInformation[2]+"\n"+"Preventions : "+"\n" +NewClass.TotalInformation[3] );
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
   L1.setText(NewClass.TotalInformation[0]+"     " +  "MAA"+ NewClass.TotalInformation[1] +NewClass.TotalInformation[2] +NewClass.TotalInformation[3] );
        
        
    }
    
}
