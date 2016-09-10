package lee.zac.SumOrProduct;

import java.util.Scanner;

public class Game {

    int userValue;
    String userChoice;

    public void getInput() {

        System.out.println("Please enter a number: ");
        Scanner in1 = new Scanner(System.in);
        userValue = in1.nextInt();

        System.out.println("Would you like the Sum or the Product of numbers up to " + userValue + "?");
        Scanner in2 = new Scanner(System.in);
        userChoice = in2.nextLine();
    }

    public String engine(int userValue, String userChoice) {
        Game game = new Game();
        if(userChoice.equals("Sum")) {
           return "The sum is : " + game.sum(userValue);
        }
        else if(userChoice.equals("Product")) {
            return "The product is: " + game.product(userValue);
        }
        else {
            return ("Please try again.");
        }
    }

    public int product(int userValue) {
        int answer = 1;
        for(int i=1; i<=userValue; i++) {
            answer *= i;
        }
        return answer;
    }

    public int sum(int userValue) {
        int answer = 0;
        for(int i=1; i<=userValue; i++) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Game game = new Game();
        while(true) {
            game.getInput();
            System.out.println(game.engine(game.userValue, game.userChoice));
        }
    }
}
