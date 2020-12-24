/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medical_Assistant;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class TBWcalculatorController implements Initializable {

    @FXML
    private RadioButton Male;
    @FXML
    private RadioButton Female;
    @FXML
    private TextField Age;
    @FXML
    private TextField Height;
    @FXML
    private TextField Weight;
    @FXML
    private TextField Result;
    @FXML
    private Button Calculate;
    
     private int flag = 0;
     
     private int age;
     private double height;
     private double weight;
     private double tbw;
     String s1,s2,s3;
     String FinalResult;
     
     

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
    }    

    @FXML
    private void MaleFemale(ActionEvent event) {
        
       if(Male.isSelected()){
           
           flag = 1;
           
           
       }
       else if(Female.isSelected()){
           
           
           flag = 2;
           
           
       }
        
    }

    @FXML
    private void AgeTF(ActionEvent event) {
        
    }

    @FXML
    private void HeightTF(ActionEvent event) {
        
       
        
    }

    @FXML
    private void WeightTF(ActionEvent event) {
       
        
    }

    @FXML
    private void ResultTF(ActionEvent event) {
    }

    @FXML
    private void CalculateButton(ActionEvent event) {
        
        String temp = Height.getText();
        
            char ch[]=new char[100];
            
            
            
            
        ch= temp.toCharArray();
        
         for(int i=0;i<ch.length;i++){
            if(ch[i]<48 | ch[i]>57){
                     System.out.println("Invalid Input");
                      JOptionPane.showMessageDialog(null, "invalid input");
                     return;
            
        }
            
        }
         
         
         String temp1 = Age.getText();
        
            char ch1[]=new char[100];
            
            
            
            
        ch1= temp1.toCharArray();
        
         for(int i=0;i<ch1.length;i++){
            if(ch1[i]<48 | ch1[i]>57){
                     System.out.println("Invalid Input");
                      JOptionPane.showMessageDialog(null, "invalid input");
                     return;
            
        }
            
        }
         
         
         
         String temp2 = Weight.getText();
        
            char ch2[]=new char[100];
            
            
            
            
        ch2= temp2.toCharArray();
        
         for(int i=0;i<ch2.length;i++){
            if(ch2[i]<48 | ch2[i]>57){
                     System.out.println("Invalid Input");
                      JOptionPane.showMessageDialog(null, "invalid input");
                     return;
            
        }
            
        }
         
         
         
         
           
               if(Height.getText() == null | Height.getText().trim().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "invalid input");
            return;
        }
               
               
               if(Weight.getText() == null | Weight.getText().trim().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "invalid input");
            return;
        }
         
               
               if(Age.getText() == null | Age.getText().trim().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "invalid input");
            return;
        }
         
         
          
               if(Male.isSelected()==false & Female.isSelected()==false){
                   JOptionPane.showMessageDialog(null, "Plese select your gender");
                   return;
                   
               }
         
         
         
         
         
        
        if(flag == 1){  //Male
            
           
            
               s1 = Age.getText();
        age = Integer.parseInt(s1);
         s2 = Height.getText();
        height = Double.parseDouble(s2);
         s3 = Weight.getText();
        weight = Double.parseDouble(s3);
        
        if(age <= 0){
             Result.setText(" ");
             JOptionPane.showMessageDialog(null, "invalid input");
             return;
        }
        else if(height <= 0){
             Result.setText(" ");
             JOptionPane.showMessageDialog(null, "invalid input");
               return;
        }
           else if(weight <= 0){
                Result.setText(" ");
             JOptionPane.showMessageDialog(null, "invalid input");
               return;
        }
        
            
           tbw = 2.447 - (0.09156 * age) + (0.1074 * height) + (0.3362 * weight);
         
            FinalResult = String.valueOf(tbw);
            
            Result.setText(FinalResult);
            
        }
        else if(flag == 2){      // Female
            
              s1 = Age.getText();
        age = Integer.parseInt(s1);
          s2 = Height.getText();
        height = Double.parseDouble(s2);
         s3 = Weight.getText();
        weight = Double.parseDouble(s3);
        
        if(age <= 0){
             Result.setText(" ");
             JOptionPane.showMessageDialog(null, "invalid input");
              return;
        }
        else if(height <= 0){
             Result.setText(" ");
             JOptionPane.showMessageDialog(null, "invalid input");
              return;
        }
           else if(weight <= 0){
                Result.setText(" ");
             JOptionPane.showMessageDialog(null, "invalid input");
              return;
        }
            
           tbw = -2.097 + (0.1069 * height) + (0.2466 * weight);
           
              FinalResult = String.valueOf(tbw);
            
            Result.setText(FinalResult);
        }
        
        
    }

    @FXML
    private void BackMenuFromTBW(ActionEvent event) throws IOException {
        
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
