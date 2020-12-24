/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medical_Assistant;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
import org.apache.commons.lang3.ArrayUtils;

/**
 * FXML Controller class
 *
 * @author Sonnet
 */
public class  Scene1Controller implements Initializable{

    public CheckBox rb1;
    public CheckBox rb2;
    
    @FXML
    public CheckBox rb3,rb4,rb5;

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    

    public void printFluidLoss(ActionEvent event) {
        
        System.out.println(rb1.getText());
        //System.out.println(NewClass.TotalInformation[0]);
        
          if(rb1.isSelected()==true){
              
              if(NewClass.CheckForIterationWhileInserting(rb1.getText())==true){
                      NewClass.i++;
            NewClass.StoreSymptom[NewClass.i]=rb1.getText();
              }
          }
          
          if(rb1.isSelected()==false){
              NewClass.MakeIndexNullIfUserUnChecksButton(rb1.getText());
         NewClass.i--;
          }
    }
        public void printFluidLoss1(ActionEvent event) {
        System.out.println(rb2.getText());
         
        
          if(rb2.isSelected()==true){
              
              if(NewClass.CheckForIterationWhileInserting(rb2.getText())==true){ 
              NewClass.i++;
              NewClass.StoreSymptom[NewClass.i]=rb2.getText();
              }
          }
          
          if(rb2.isSelected()==false){
              NewClass.MakeIndexNullIfUserUnChecksButton(rb2.getText());
          NewClass.i--;
          }
    }
            public void printFluidLoss2(ActionEvent event) {
        System.out.println(rb3.getText());
         
        
          if(rb3.isSelected()==true){
              
              if(NewClass.CheckForIterationWhileInserting(rb3.getText())==true){ 
              NewClass.i++;
              NewClass.StoreSymptom[NewClass.i]=rb3.getText();
              }
          }
          
          if(rb3.isSelected()==false){
              NewClass.MakeIndexNullIfUserUnChecksButton(rb3.getText());
          NewClass.i--;
          }
    }
        public void printFluidLoss3(ActionEvent event) {
        System.out.println(rb4.getText());
         
        
          if(rb4.isSelected()==true){
              
              if(NewClass.CheckForIterationWhileInserting(rb4.getText())==true){ 
              NewClass.i++;
              NewClass.StoreSymptom[NewClass.i]=rb4.getText();
              }
          }
          
          if(rb4.isSelected()==false){
             NewClass.MakeIndexNullIfUserUnChecksButton(rb4.getText());
          NewClass.i--;
          }
    }
        public void printFluidLoss4(ActionEvent event) {
        System.out.println(rb5.getText());
         
         
          if(rb5.isSelected()==true){
              
              if(NewClass.CheckForIterationWhileInserting(rb5.getText())==true){ 
              NewClass.i++;
             NewClass.StoreSymptom[NewClass.i]=rb5.getText();
              }
          }
          
          if(rb5.isSelected()==false){
              NewClass.MakeIndexNullIfUserUnChecksButton(rb1.getText());
          NewClass.i--;
          }
    }
      
    @FXML
        public void Action(ActionEvent Event){
        CheckBox c=(CheckBox)Event.getSource();
            
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
        
        

    public void goToNextMenu(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
         
        //NewClass.Compare();
       //FXMLDocumentController.L1.setText(NewClass.TotalInformation[0]+"     " +  "MAA"+ NewClass.TotalInformation[1] +NewClass.TotalInformation[2] +NewClass.TotalInformation[3] );
        
        
        //FXMLDocumentController.L1.setText(NewClass.TotalInformation[1]);
        
        Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
       
    }

    @FXML
    private void goToNextMenu(MouseEvent event) throws IOException {
          
        Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
       
        
         final Node source = (Node) event.getSource();
         final Stage stage1 = (Stage) source.getScene().getWindow();
         stage1.close();
        
        
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
        
        
        Parent root = FXMLLoader.load(getClass().getResource("Sample2.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
       
        
         final Node source = (Node) event.getSource();
         final Stage stage1 = (Stage) source.getScene().getWindow();
         stage1.close();
    }
      
  
}
