package lee.zac.SumOrProduct.lee.zac.SumOrProduct;

import lee.zac.SumOrProduct.lee.zac.SumOrProduct.Arithmetic;

import java.util.Scanner;

/**
 * Created by zaclee on 9/9/16.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        Scanner in1 = new Scanner(System.in);
        int num = in1.nextInt();

        System.out.println("Would you like the Sum or the Product of numbers up to " + num + "?");
        Scanner in2 = new Scanner(System.in);
        String answer = in2.nextLine();

        if(answer.equals("Sum")) {

            Arithmetic arithmetic = new Arithmetic();
            int sumTotal = arithmetic.sum(num);
            System.out.println("The total of the sum is: " + sumTotal);
        }

        else if(answer.equals("Product")) {

            Arithmetic arithmetic = new Arithmetic();
            int productTotal = arithmetic.product(num);
            System.out.println("The total of the product is: " + productTotal);
        }

    }
}
