import hsa.*;
public class Divide {

    public static void main(String[] args) {
        Console c=new Console();
        boolean bread=true;
        int x,y;
    do{    
        c.print("Enter the first integer to divide: ");
        x=c.readInt();
        c.println("Enter the second integer to divide: ");
        y=c.readInt();
        int z,w;
        if(y>x){
            z=y/x;
            w=y%x;
        }
        else{
            z=x/y;
            w=x%y;
        }
        c.println("Quotient: "+z);
        c.println("Remainder: "+w);
    
    
    }
    while(bread==true);

    
    }
}
