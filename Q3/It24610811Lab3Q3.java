import java.util.Scanner;

public class It24610811Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();

      
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] counts = new int[denominations.length];

        
        for (int i = 0; i < denominations.length; i++) {
            counts[i] = amount / denominations[i];
            amount %= denominations[i];
        }

      
        System.out.println("Currency distribution:");
        for (int i = 0; i < denominations.length; i++) {
            System.out.println(denominations[i] + " Notes – " + counts[i]);
        }

        scanner.close();
    }
}

