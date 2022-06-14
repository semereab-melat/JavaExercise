//add import statements
import java.text.DecimalFormat;

/***************************************************************
 Filename: ConvertTemperature
 Created by: Melat Zerai
 Created on: 9/29/2021
 Comment: converitng temperature from degrees centigrade to degrees fahrenheit
 ***************************************************************/
class Main 
{
  public static void main(String[] args) 
  {
        DecimalFormat df=new DecimalFormat("00.00");
        double centigrade=100;
        double fahrenheit;
        fahrenheit = ((centigrade*9/5) + 32);
        System.out.println(df.format(centigrade) + " degrees centigrade = " +df.format(fahrenheit) + " degrees fahrenheit");
  }//main
}//class