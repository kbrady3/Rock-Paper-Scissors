//Kabrina Brady

import java.util.Scanner;

public class RockPaperScissorsBrady {
    public static void main(String[] args) {
        String selection;
        String selection2;
        String result;
        Scanner input = new Scanner(System.in);

        System.out.println("Player 1: Type 'rock', 'paper', 'scissors', 'spock', or 'lizard'.");
        selection = input.next();

        System.out.println("Player 2: Type 'rock', 'paper', 'scissors', 'spock', or 'lizard'.");
        selection2 = input.next();

        selection = selection.toLowerCase();
        selection2 = selection2.toLowerCase();

        result = Winner(selection, selection2);

        System.out.println(result);
    }

    public static String Winner(String selection, String selection2){
        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";
        String spock = "spock";
        String lizard = "lizard";
        String playerOneWon = "Player 1 won!";
        String playerTwoWon = "Player 2 won!";
        String tie = "It's a tie!";
        String error = "Error";
        
        if (selection.equals(rock)){
            if (selection2.equals(rock)){
                return tie;
            }
            else if (selection2.equals(paper)){
                return playerTwoWon;
            }
            else if (selection2.equals(scissors)){
                return playerOneWon;
            }
            else if (selection2.equals(spock)){
                return playerTwoWon;
            }
            else if (selection2.equals(lizard)){
                return playerOneWon;
            }
            else{
                return error;
            }
        }
        else if (selection.equals(scissors)){
            if (selection2.equals(scissors)){
                return tie;
            }
            else if (selection2.equals(rock)){
                return playerTwoWon;
            }
            else if (selection2.equals(paper)){
                return playerOneWon;
            }
            else if (selection2.equals(spock)){
                return playerTwoWon;
            }
            else if (selection2.equals(lizard)){
                return playerOneWon;
            }
            else{
                return error;
            }
        }
        else if(selection.equals(paper)) {
            if (selection2.equals(paper)){
                return tie;
            }
            else if (selection2.equals(rock)){
                return playerOneWon;
            }
            else if (selection2.equals(scissors)){
                return playerTwoWon;
            }
            else if (selection2.equals(spock)){
                return playerOneWon;
            }
            else if (selection2.equals(lizard)){
                return playerTwoWon;
            }
            else{
                return error;
            }
        }
        else if (selection.equals(spock)){
            if (selection2.equals(paper)){
                return playerTwoWon;
            }
            else if (selection2.equals(rock)){
                return playerOneWon;
            }
            else if (selection2.equals(scissors)){
                return playerOneWon;
            }
            else if (selection2.equals(spock)){
                return tie;
            }
            else if (selection2.equals(lizard)){
                return playerTwoWon;
            }
            else{
                return error;
            }
        }
        else if (selection.equals(lizard)){
            if (selection2.equals(paper)){
                return playerOneWon;
            }
            else if (selection2.equals(rock)){
                return playerTwoWon;
            }
            else if (selection2.equals(scissors)){
                return playerTwoWon;
            }
            else if (selection2.equals(spock)){
                return playerOneWon;
            }
            else if (selection2.equals(lizard)){
                return tie;
            }
            else{
                return error;
            }
        }
        else{
            return error;
        }
    }
}
