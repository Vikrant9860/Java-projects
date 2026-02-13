import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        for(; ;) {

            System.out.println( "********** Welcome to Vikrant's Calculator **********" );

            System.out.println("Enter your first Operand");
            double operand1 = sc.nextDouble();


            System.out.println("Enter an Operator");
            char operator  = sc.next().charAt(0);

            System.out.println("Enter your Second Operand");
            double operand2 = sc.nextDouble();

            double output = 0;

            output = (operator == '+')?
                    (operand1 + operand2):
                    ((operator  == '-')?
                            (operand1 - operand2):
                            ((operator == '*')?
                                    (operand1 * operand2):
                                    ((operator == '/')?
                                            (operand1 / operand2):
                                            ((operator == '%')?
                                                    (operand1 % operand2):
                                                    (output = Double.MAX_VALUE)))));
            System.out.println();

            if(output == Double.MAX_VALUE){



                System.out.println("\n Invalid Operatoer \n ");
            }else{

                System.out.println(operand1+" "+operator+" "+operand2+"="+String.format("%.3f",output));
            }
        }

    }
}
