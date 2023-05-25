package Labs;
import java.util.Random;
import java.util.Scanner;

public class LR_2 {
    private static final int MAX_SIZE = 20;
    private static final int RANDOM_MIN = 1;
    private static final int RANDOM_MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width, height;

        System.out.print("Введіть ширину матриці (до 20): ");
        width = scanner.nextInt();
        System.out.print("Введіть висоту матриці (до 20): ");
        height = scanner.nextInt();

        int[][] matrix;

        if (width <= 0 || height <= 0 || width > MAX_SIZE || height > MAX_SIZE) {
            System.out.println("Некоректний розмір матриці.");
            return;
        }

        System.out.println("Виберіть спосіб створення матриці:\n1. Введення з клавіатури.\n2. Генерація випадковим чином.");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                matrix = readMatrixFromInput(width, height, scanner);
                break;
            case 2:
                matrix = generateRandomMatrix(width, height);
                break;
            default:
                System.out.println("Некоректний вибір.");
                return;
        }

        System.out.println("Матриця:");
        printMatrix(matrix);

        int minValue = findMinimumValue(matrix);
        int maxValue = findMaximumValue(matrix);
        double average = calculateAverage(matrix);

        System.out.println("Мінімальне значення: " + minValue);
        System.out.println("Максимальне значення: " + maxValue);
        System.out.println("Середнє арифметичне: " + average);
    }

    private static int[][] readMatrixFromInput(int width, int height, Scanner scanner) {
        int[][] matrix = new int[height][width];

        System.out.println("Введіть елементи матриці:");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    private static int[][] generateRandomMatrix(int width, int height) {
        int[][] matrix = new int[height][width];
        Random random = new Random();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = random.nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN;
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static int findMinimumValue(int[][] matrix) {
        int minValue = matrix[0][0];

        for (int[] row : matrix) {
            for (int num : row) {
                if (num < minValue) {
                    minValue = num;
                }
            }
        }

        return minValue;
    }

    private static int findMaximumValue(int[][] matrix) {
        int maxValue = matrix[0][0];

        for (int[] row : matrix) {
            for (int num : row) {
                if (num > maxValue) {
                    maxValue = num;
                }
            }
        }

        return maxValue;
    }

    private static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;

        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
                count++;
            }
        }

        return (double) sum / count;
    }
}
