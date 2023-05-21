import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationGenerator {
    public static void generateCombinations(int n, int k, List<Integer> currentCombination, int start) {
        if (currentCombination.size() == k) {
            System.out.println(currentCombination);
            return;
        }

        for (int i = start; i <= n; i++) {
            currentCombination.add(i);
            generateCombinations(n, k, currentCombination, i + 1);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    public static void printCombinations(int n, int k) {
        generateCombinations(n, k, new ArrayList<>(), 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți n: ");
        int n = scanner.nextInt();

        System.out.print("Introduceți k: ");
        int k = scanner.nextInt();

        System.out.println("Submulțimile cu " + k + " elemente ale mulțimii {1, 2, ..., " + n + "} sunt:");
        printCombinations(n, k);

        scanner.close();
    }
}