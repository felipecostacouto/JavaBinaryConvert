import java.util.Scanner;

public class main {
    static Scanner ans = new Scanner(System.in);
        public static void options(int OP){
                if (OP==1){               
                    System.out.println();
                        System.out.print("Input the decimal value that you want convert to Binary: ");
                         int k = ans.nextInt();
                         BinaryNumbers.convertdecimal(k);
                     
                    
                }
                
                else if(OP==2){
                        System.out.println();
                        System.out.print("Input the Binary value that you want convert to Decimal: ");
                        int a = ans.nextInt();
                        DecimalNumbers.convertBinary(a);
                        
                   
                    
                }

                else{
                        System.out.print("Please, Input a valid Option (1 OR 2): ");
                        int validop = ans.nextInt();
                        options(validop);
                        
                    }
                }

        public static void main(String[] Args){
            int OP;
                while(true){
                    System.out.println("Convert Decimal to Binary SELECT (1)");
                    System.out.println("Convert Binary to Decimal SELECT (2)");
                    System.out.println("Input '000' to EXIT");
                    System.out.println();
                    System.out.println("What's your input? ");
                        OP = ans.nextInt();

                        if(OP == 000){
                            System.out.println("Exiting Program,GoodBye");
                            break;
                        }
                        else{
                            options(OP);
                            System.out.println();
                        }
                       
                   
                }
            
        }
}
    
