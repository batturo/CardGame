

import java.util.*;

public class Teen_Patti {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        menu();
    }

    public static void menu() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Teenpatti game");
        int n = 0;
        do {
            System.out.println("Enter 1 to play teenpatti\nEnter 2 to read the game rules\nEnter 3 to exit the game");
            n = input.nextInt();
            switch(n) {
                case 1:{
                    start();
                    break;
                }
                case 2:{
                    System.out.println("Rules: Three cards are dealt to each player the winner is decided based on the sum of the cards, "
                            + "The player with the highest sum wins the game.\nCards are numbered from 0-10");
                    break;
                }
                case 3:{
                    System.out.println("Exiting the game....goodbye");
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Invalid input\nUsage: Enter 1, 2 or 3");
                    break;
                }
            }
            System.out.println();
        }while(n != 1);

    }
    public static void start() {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int count= 1, one = 0, two = 0, draw=0;
        do {
            System.out.println("\nRound "+ count +"\n");
            int[] playerOne = {random.nextInt(10)+0,random.nextInt(10)+0,random.nextInt(10)+0};
            int[] playerTwo = {random.nextInt(10)+0,random.nextInt(10)+0,random.nextInt(10)+0};

            System.out.println(":Cards are dealt:");
            int sum1= playerOne[0]+playerOne[1]+playerOne[2];
            int sum2= playerTwo[0]+playerTwo[1]+playerTwo[2];
            if(sum1 > sum2) {
                System.out.println("Player one won!");
                one++;
            }
            else if(sum1< sum2) {
                System.out.println("Player Two won!");
                two++;
            }
            else {
                System.out.println("Draw!");
                draw++;
            }
            System.out.println("Player One's hand was: "+ playerOne[0]+" "+playerOne[1]+" "+playerOne[2]);
            System.out.println("Player Two's hand was: "+ playerTwo[0]+" "+playerTwo[1]+" "+playerTwo[2]);
            count ++;
            System.out.println();
        }while(count !=4);

        if(one>two) {
            System.out.println("Player one won the game");
        }
        else if(two>one) {
            System.out.println("Player two won the game");
        }
        else
            System.out.println("The game was a draw!");
        System.out.println();

        System.out.println("Press 1 to replay the game.\nPress 2 to go to main menu\nPress 3 to exit the game\n");
        int n = input.nextInt();
        switch(n) {
            case 1:{
                start();
                break;
            }
            case 2:{
                menu();
                break;
            }
            case 3:{
                System.out.println("Exiting the game....goodbye");
                System.exit(0);
                break;
            }
            default:{
                System.out.println("Invalid input\nUsage: Enter 1, 2 or 3");
                break;
            }

        }
    }
}

