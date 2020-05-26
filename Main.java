//ROCK PAPER SCISSORS GAME 

import java.util.Scanner;
import java.util.Random;

public class Main{
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";

//creating a method to print and return computer moves
    public static String computerMove(){
      String cMove;
      Random random = new Random();
      int myVar = random.nextInt(3)+1;
      if(myVar == 1){
         cMove = Main.ROCK;
      }else if(myVar == 2){
         cMove = Main.PAPER;
     }else{
        cMove = Main.SCISSORS;
     }
     System.out.println("Computer move: " +cMove);
     return cMove;
     }

//creating a method to print and return player moves
  public static String playerMove(){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter your move: ");
  String a = input.nextLine();
  String pMove = a.toUpperCase();
  System.out.println("Player Move is: " +pMove);
  return pMove;
  }

  public static void main(String [] args){
  System.out.println("ROCK \t PAPER \t SCISSORS \n");
//calling methods
  String movePlayer = playerMove();
  String moveComputer = computerMove();

  if(movePlayer.equals(moveComputer)){
    System.out.println("It\'s a tie!!!");
  }else if(movePlayer.equals(Main.ROCK)){
    System.out.println(moveComputer.equals(Main.PAPER)?"Computer wins!!!":"Player wins!!!");
  }else if(movePlayer.equals(Main.PAPER)){
    System.out.println(moveComputer.equals(Main.SCISSORS)?"Computer wins!!!":"Player wins!!!");
  }else{
    System.out.println(moveComputer.equals(Main.ROCK)?"Computer wins!!!":"Player wins!!!");
  }
 }
}
