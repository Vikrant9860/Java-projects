import java.util.Scanner;

public class StonePaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        gameloop :  // label
        for(;;) {
            System.out.println("\n***** WELCOME TO THE STONE PAPER SCISSOR *****\n");
            System.out.println("\n1.STONE\n2.PAPER\n3.SCISSOR\n");
            System.out.println("Enter your response : ");
            int userResp = sc.nextInt();

            String USER = "";
            if (userResp == 1) {
                USER = "STONE";
            } else if (userResp == 2) {
                USER = "PAPER";
            } else {
                USER = "SCISSOR";
            }
            if (userResp < 1 || userResp > 3) {
                System.out.println("INVALID RESPONSE");
                continue gameloop;
            }

            // Second player vikrant (bot) here starts

            int vikrantResp = 0;
            for (int i = 0; i < 100; i++) {
                vikrantResp = (int) (Math.random() * 10);
                if (vikrantResp >= 1 && vikrantResp <= 3) {
                    break;
                }
            }

            String VIKRANT = "";
            if (vikrantResp == 1) {
                VIKRANT = "STONE";
            } else if (vikrantResp == 2) {
                VIKRANT = "PAPER";
            } else {
                VIKRANT = "SCISSOR";
            }

            System.out.println();
            System.out.println(" USER -> " + USER + "    " + "VIKRANT -> " + VIKRANT);


// winner calculation

            if (VIKRANT.equals("STONE") && USER.equals("PAPER") ||
                    VIKRANT.equals("PAPER") && USER.equals("SCISSOR") ||
                    VIKRANT.equals("SCISSOR") && USER.equals("STONE")) {
                System.out.println("\n     *** USER WON *** \n");
            } else if (VIKRANT.equals("STONE") && USER.equals("SCISSOR") ||
                    VIKRANT.equals("PAPER") && USER.equals("STONE") ||
                    VIKRANT.equals("SCISSOR") && USER.equals("PAPER")) {
                System.out.println("\n     *** VIKRANT WON *** \n");
            } else {
                System.out.println("\n     *** ITS A DRAW *** \n");
            }


        }
        }
}