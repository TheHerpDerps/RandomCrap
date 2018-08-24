import java.util.Scanner;

public class howdy {
//this method is just a method... nothing else
    public static void main(String[] args) {
        //declares scanner for keyboard
        Scanner keyboard = new Scanner(System.in);
        
        int myint = keyboard.nextInt();
        
        //this is where the shenanigans begin 
        if(myint >= 3){
            
        for(int i = 0; i <= myint *2; i++){
            System.out.println(i);
            
        }
        
        }

    }

}