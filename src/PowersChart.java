
import hsa.*;

public class PowersChart {

    public static void main(String[] args) {
        Console c = new Console();
        int exp, fin;
            c.print("Enter an exponent value (0 to 10): ");
            exp = c.readInt();
            if(exp<0||exp>10){
                c.print("Invalid input; Try again.\n");
            }
            else{
                 fin=(int) Math.pow(2,exp);   
                 c.println(fin);   
                
                
            
                }
            
            
    }


    }
