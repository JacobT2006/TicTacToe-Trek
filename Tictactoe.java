import java.util.*;
public class Tictactoe 
{
    public static void main(String[] agrs)
    {
        // initalize array
        String[] anArray = new String[]{"1","2","3","4","5","6","7","8","9"};

        int     playerOneCnt    = 0,
                playerTwoCnt    = 0;

        String  playerOne         = "",
                playerTwo         = "";

        boolean gameOver        = false;

        Scanner scan = new Scanner(System.in);
        
        while(!gameOver)
        {
            System.out.println("\n " + anArray[0] + " | " + anArray[1] + " | " + anArray[2] + "\n" + "-----------\n " +
                                        anArray[3] + " | " + anArray[4] + " | " + anArray[5] + "\n" + "-----------\n " +
                                        anArray[6] + " | " + anArray[7] + " | " + anArray[8]);
            System.out.println("\nThis is a game of tictactoe player one chooses their position of 1-9 first");

            // ------------------ Outcomes Player One --------------------
            if (anArray[8].equals("X") && anArray[4].equals("X") && anArray[0].equals("X") || anArray[6].equals("X") && anArray[4].equals("X") && anArray[2].equals("X") || anArray[8].equals("X") && anArray[7].equals("X") && anArray[6].equals("X") || anArray[5].equals("X") && anArray[4].equals("X") && anArray[3].equals("X") || anArray[2].equals("X") && anArray[1].equals("X") && anArray[0].equals("X") || anArray[0].equals("X") && anArray[3].equals("X") && anArray[6].equals("X") || anArray[1].equals("X") && anArray[4].equals("X") && anArray[7].equals("X") || anArray[8].equals("X") && anArray[5].equals("X") && anArray[2].equals("X"))
            {
                gameOver = true;
                method();
            }
            
            // ------------------ Outcomes Player Two --------------------
            if (anArray[8].equals("O") && anArray[4].equals("O") && anArray[0].equals("O") || anArray[6].equals("O") && anArray[4].equals("O") && anArray[2].equals("O") || anArray[8].equals("O") && anArray[7].equals("O") && anArray[6].equals("O") || anArray[5].equals("O") && anArray[4].equals("O") && anArray[3].equals("O") || anArray[2].equals("O") && anArray[1].equals("O") && anArray[0].equals("O") || anArray[0].equals("O") && anArray[3].equals("O") && anArray[6].equals("O") || anArray[1].equals("O") && anArray[4].equals("O") && anArray[7].equals("O") || anArray[8].equals("O") && anArray[5].equals("O") && anArray[2].equals("O"))
            {
                gameOver = true;
                method1();
            }
            
            if (playerOneCnt == playerTwoCnt && !gameOver)
            {
                //player one input
                System.out.print("Player one: ");
                playerOne = scan.next();
                //check loop
                while(!(playerOne.equals(anArray[0]) || playerOne.equals(anArray[1]) || playerOne.equals(anArray[2]) || playerOne.equals(anArray[3]) || playerOne.equals(anArray[4]) || playerOne.equals(anArray[5]) || playerOne.equals(anArray[6]) || playerOne.equals(anArray[7]) || playerOne.equals(anArray[8])))
                {
                    System.out.print("input correct position for player one: ");
                    playerOne = scan.next(); 
                }
                // ------------ X ----------------
                
                if (playerOne.equals(anArray[0]))
                {
                    anArray[0] = "X";
                }
                else if (playerOne.equals(anArray[1]))
                {
                    anArray[1] = "X";
                }
                else if (playerOne.equals(anArray[2]))
                {
                    anArray[2] = "X";
                }
                else if (playerOne.equals(anArray[3]))
                {
                    anArray[3] = "X";
                }
                else if (playerOne.equals(anArray[4]))
                {
                    anArray[4] = "X";
                }
                else if (playerOne.equals(anArray[5]))
                {
                    anArray[5] = "X";
                }
                else if (playerOne.equals(anArray[6]))
                {
                    anArray[6] = "X";
                }
                else if (playerOne.equals(anArray[7]))
                {
                    anArray[7] = "X";
                }
                else if (playerOne.equals(anArray[8]))
                {
                    anArray[8] = "X";
                }
                    
                //playeronecnt increase and clear
                playerOneCnt += 1;
                System.out.print("\033[H\033[2J");
            }
            else if (playerOneCnt >= playerTwoCnt && !gameOver)
            {
                //player two input
                System.out.print("Player two: ");
                playerTwo = scan.next();
                // check loop
                while(!(playerTwo.equals(anArray[0]) || playerTwo.equals(anArray[1]) || playerTwo.equals(anArray[2]) || playerTwo.equals(anArray[3]) || playerTwo.equals(anArray[4]) || playerTwo.equals(anArray[5]) || playerTwo.equals(anArray[6]) || playerTwo.equals(anArray[7]) || playerTwo.equals(anArray[8])))
                {
                    System.out.print("input correct position for player two: ");
                    playerTwo = scan.next();
                }
                // ---------- O ------------
                if (playerTwo.equals(anArray[0]))
                {
                    anArray[0] = "O";
                }
                else if (playerTwo.equals(anArray[1]))
                {
                    anArray[1] = "O";
                }
                else if (playerTwo.equals(anArray[2]))
                {
                    anArray[2] = "O";
                }
                else if (playerTwo.equals(anArray[3]))
                {
                    anArray[3] = "O";
                }
                else if (playerTwo.equals(anArray[4]))
                {
                    anArray[4] = "O";
                }
                else if (playerTwo.equals(anArray[5]))
                {
                    anArray[5] = "O";
                }
                else if (playerTwo.equals(anArray[6]))
                {
                    anArray[6] = "O";
                }
                else if (playerTwo.equals(anArray[7]))
                {
                    anArray[7] = "O";
                }
                else if (playerTwo.equals(anArray[8]))
                {
                    anArray[8] = "O";
                }

                //playertwocnt increase and clear
                playerTwoCnt += 1;
                System.out.print("\033[H\033[2J");
            }
        }
    }
    public static void method()
    {
        System.out.println("\n\tGame Over Player One Win");
        System.out.println("\t        Congrats\n");

    }
    public static void method1()
    {
        System.out.println("\n\tGame Over Player two Win");
        System.out.println("\t        Congrats\n");

    }
}
=