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
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class LBWController implements Initializable {

    @FXML
    private RadioButton Male;
    @FXML
    private RadioButton Female;
    @FXML
    private TextField ResultTF;
    @FXML
    private TextField WeightTF;
    @FXML
    private TextField HeightTF;
    @FXML
    private Button Calculate;
    @FXML
    private Button GoMenu;
    
    private int flag;
    String s1,s2,s3;
      private double height;
     private double weight;
     private double lbw;
         private String FinalResult;
    @FXML
    private ToggleGroup a;

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
    private void CalculateAL(ActionEvent event) {
        
        
          String temp = HeightTF.getText();
        
            char ch[]=new char[100];
            
            
            
            
        ch= temp.toCharArray();
        
         for(int i=0;i<ch.length;i++){
            if(ch[i]<48 | ch[i]>57){
                     System.out.println("Invalid Input");
                      JOptionPane.showMessageDialog(null, "invalid input");
                     return;
            
        }
            
        }
         
       
         
               if(HeightTF.getText() == null | HeightTF.getText().trim().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "invalid input");
            return;
        }
         
               
               if(WeightTF.getText() == null | WeightTF.getText().trim().isEmpty()==true){
             JOptionPane.showMessageDialog(null, "invalid input");
            return;
        }
         
               
               if(Male.isSelected()==false & Female.isSelected()==false){
                   JOptionPane.showMessageDialog(null, "Plese select your gender");
                   return;
                   
               }
         
         
         String temp2 = WeightTF.getText();
        
            char ch2[]=new char[100];
            
            
            
            
        ch2= temp2.toCharArray();
        
         for(int i=0;i<ch2.length;i++){
            if(ch2[i]<48 | ch2[i]>57){
                     System.out.println("Invalid Input");
                      JOptionPane.showMessageDialog(null, "invalid input");
                     return;
            
        }
            
        }
         
         
        
        if(flag == 1){  //Male
            
           
            
               
         s2 = HeightTF.getText();
        height = Double.parseDouble(s2);
         s3 = WeightTF.getText();
        weight = Double.parseDouble(s3);
        
       
         if(height <= 0){
             ResultTF.setText(" ");
             JOptionPane.showMessageDialog(null, "invalid input");
              return;
               
        }
           else if(weight <= 0){
                ResultTF.setText(" ");
             JOptionPane.showMessageDialog(null, "invalid input");
              return;
              
        }
        
            
           lbw =(0.32810 * weight) + (0.33929 * height) - 29.5336;
         
            FinalResult = String.valueOf(lbw);
            
            ResultTF.setText(FinalResult);
            
        }
        else if(flag == 2){      // Female
            
             
          s2 = HeightTF.getText();
        height = Double.parseDouble(s2);
         s3 = WeightTF.getText();
        weight = Double.parseDouble(s3);
        
        
         if(height <= 0){
             ResultTF.setText(" ");
             JOptionPane.showMessageDialog(null, "invalid input");
              return;
        }
           else if(weight <= 0){
                ResultTF.setText(" ");
             JOptionPane.showMessageDialog(null, "invalid input");
              return;
        }
            
            lbw = (0.29569 * weight) + (0.41813 *height ) - 43.2933;
           
              FinalResult = String.valueOf(lbw);
            
            ResultTF.setText(FinalResult);
        }
        
        
        
        
        
    }

    @FXML
    private void GoMenuAL(ActionEvent event) throws IOException {
        
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
