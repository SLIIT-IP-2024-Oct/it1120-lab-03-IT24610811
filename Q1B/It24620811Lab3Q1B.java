
import java.util.Scanner;

public class It24620811Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();

       
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();

      
        double totalAmount = pricePerKg * kilograms;

       
        double discount = totalAmount * 0.10;

      
        double finalAmount = totalAmount - discount;

      
        System.out.println("The total amount to pay after 10% discount is: " + finalAmount);

        scanner.close();
    }
}
