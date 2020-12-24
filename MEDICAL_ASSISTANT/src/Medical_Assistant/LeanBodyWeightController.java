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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.ButtonGroup;

/**
 * FXML Controller class
 *
 * @author FAHIM
 */
public class LeanBodyWeightController implements Initializable {

    @FXML
    private TextField input;
    @FXML
    private Label result;
    @FXML
    private RadioButton rb1;
    @FXML
    private RadioButton rb2;
    @FXML
    public ButtonGroup g=new ButtonGroup();
    
    public double a, Result=0;
    public String Height,b;
    @FXML
   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
        b=input.getText();
        
    }    

    @FXML
    private void action(ActionEvent event) {
        /*
        if(rb1.isSelected()==true){
           rb2.setSelected(false);
                   }
         if(rb2.isSelected()==true){
           rb1.setSelected(false);        }*/
    }

    @FXML
    private void Calculate(ActionEvent event) {
        Height=input.getText();
        char ch[]=new char[100];
        ch=Height.toCharArray();
        
         for(int i=0;i<ch.length;i++){
            if(ch[i]>=65 & ch[i]<=130){
                     System.out.println("Invalid Input");
                     return;
            
        }
            
        }
        
        
        
        
               if(input.getText() == null || input.getText().trim().isEmpty()==true){
            System.out.println("Invalid Input");
            return;
        }
               if(rb1.isSelected()==false & rb2.isSelected()==false){
                   System.out.println("Please select your gender");
                   return;
                   
               }
       
                       
               else{
       
            a=Double.parseDouble(input.getText());
            if(a<0 | a<82){
                System.out.println("Invalid Input");
                return;
            }
            
            else{
                if(rb1.isSelected()==true)
                    Result=(0.73*a)-59.42; 
                if(rb2.isSelected()==true)
                    Result=(0.65*a)-50.74;
            }  
            
            String g=String.format("%f", Result);
            result.setText(g);
        
           }
        
        
        
    }
    
    
    
    
    
}
