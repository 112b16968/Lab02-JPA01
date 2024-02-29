import java.util.Scanner;

public class JPA01 {
    public static void main(String[] args) {
        System.out.println("Please enter score:");
        Scanner input = new Scanner(System.in);
        for(int i =0;i<2;i++) {        
            
            int score = input.nextInt();
            int passscore = 60;
            if (passscore <= score){
                System.out.println("You pass");
                
                
   
            }
            System.out.println("End");
        }  
        input.close();  
    }
        
}
