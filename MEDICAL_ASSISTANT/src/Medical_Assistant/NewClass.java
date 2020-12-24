package Medical_Assistant;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.ArrayUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FAHIM
 */
public class NewClass {
          
   public static String StoreSymptom[]=new String[175];
   public static int Serial[]=new int[50];
   public static  String s;
   public static int i=-1;
  
   public static String TotalInformation[]=new String[4];
    
   
   
    
  public static boolean CheckForIterationWhileInserting(String S){
      
      boolean a=true;
      for(int m=0;m<StoreSymptom.length;m++){
          if(S== StoreSymptom[m]){
              a=false;
              break;  
          }
      }
      return a;
  } 
  
  public static  void MakeIndexNullIfUserUnChecksButton(String S){
              StoreSymptom = ArrayUtils.removeElement(StoreSymptom, S);
  }
   
   
  
   
    
    public static  void Compare() throws ClassNotFoundException, SQLException{
        String TotalInformation1[]=new String[4];
        if(i==-1){
            JOptionPane.showMessageDialog(null, "Please Select a Symptom");
            return;
        }
        
      
        int k=1;
        int j;
        boolean flag=false;
        String s4;
        String username="root";
        String url="jdbc:mysql://127.0.0.1/medical_assistant";
        String password="";
        //String query="SELECT * FROM info2 WHERE Serial_No=4";
        Class.forName("com.mysql.jdbc.Driver");
        
        
        Connection connection=(Connection) DriverManager.getConnection(url,username,password);
        Statement statement=(Statement) connection.createStatement();
        ResultSet result,result1;
        String query1;

         for(k=1;k<=49;k++){   
        
        String query="SELECT * FROM info2 WHERE Serial_No="+k;
        result=statement.executeQuery(query);
        result.next();
        String Symptom=result.getString("Symptoms");
        System.out.println("Disease no :"+k+"\n"+Symptom);
             System.out.println();
             System.out.println();
                  for(j=0;j<=i;j++){
                        if(StoreSymptom[j]!=null){
                           flag=Symptom.contains(StoreSymptom[j]);
                           
                            if(flag==true){
                            //System.out.println(StoreSymptom[j]);
                            Serial[k]=Serial[k]+15;
                            }
                            
                        }
                    }
         }
         
         
          // int max = Arrays.stream(Serial).max().getAsInt();
        
           
        /*
          query1="SELECT * FROM info2 WHERE Serial_No="+k;
          result=statement.executeQuery(query1);
          result.next();
          String Disease=result.getString("Name_Of_Diseases"); 
         */
           //Trying to get the maximum element's index of Serial[]
           
          int max=0;
          int maxIndex=-1;
        for(int I=0;I<Serial.length;I++){
            if(Serial[I]>max){
                max=Serial[I];
                maxIndex=I;
                
            }
        }
        
        
      maxIndex=ArrayUtils.indexOf(Serial,max);
        
        //maximum element's index searching ends
          query1="SELECT * FROM info2 WHERE Serial_No="+maxIndex;
          System.out.println(max);
          result=statement.executeQuery(query1);
          result.next();
          String Disease=result.getString("Name_Of_Diseases");
          String Symptom1=result.getString("Symptoms");
          String Treatment=result.getString("Medicines");
          String Preventions=result.getString("Preventions");
          
          
          TotalInformation1[0]=Disease;
          TotalInformation1[1]=Symptom1;
          TotalInformation1[2]=Treatment;
          TotalInformation1[3]=Preventions;
          
          
          /*for(int f=0;f<6;f++){
              if(Serial[f]!=0){
                  System.out.println(f);
              }
          }*/
          
          TotalInformation=TotalInformation1;
          
         // return TotalInformation1;
        
    }
    
}
