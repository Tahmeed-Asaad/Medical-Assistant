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
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author FAHIM
 */
public class Scene11Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    
    
    @FXML
    private void Action(ActionEvent event) {
        CheckBox c=(CheckBox)event.getSource();
            System.out.println(c.getText());
          if(c.isSelected()==true){
              
              if(NewClass.CheckForIterationWhileInserting(c.getText())==true){ 
              NewClass.i++;
             NewClass.StoreSymptom[NewClass.i]=c.getText();
              }
          }
          
          if(c.isSelected()==false){
              NewClass.MakeIndexNullIfUserUnChecksButton(c.getText());
          NewClass.i--;
          }
            
        
    }
    
    
    
    
    
    
    private void goToNextMenu(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
        NewClass.Compare();
        
        Parent root = FXMLLoader.load(getClass().getResource("sample3.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
        
        
        
    }
    
    
    @FXML
     private void goToLastPage(MouseEvent event) throws IOException, ClassNotFoundException, SQLException {
        
        if(NewClass.i==-1){
            InitiaLizeEveryVariable();
             JOptionPane.showMessageDialog(null, "Please Select a Symptom");
            return;
        }
            
        
          NewClass.Compare();
          
        Parent root = FXMLLoader.load(getClass().getResource("sample3.fxml"));
        
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
    private void goBack(MouseEvent event) throws IOException {
        
        
        Parent root = FXMLLoader.load(getClass().getResource("Scene10.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
       
        
         final Node source = (Node) event.getSource();
         final Stage stage1 = (Stage) source.getScene().getWindow();
         stage1.close();
    }
     
     
}
