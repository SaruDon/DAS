package proj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import proj.Container;
import proj.Tire;
    
public class Main {
    public boolean placeTire(Tire tire) {
        // Find the first available position to place the tire
        for (int i = 0; i < Container.rows; ++i) {
            for (int j = 0; j < Container.cols; ++j) {
                if (canPlaceTire(tire, i, j)) {
                    placeTireAtPosition(tire, i, j);
                    return true; // Tire placed successfully
                }
            }
        }
        return false; // Tire cannot be placed in the container
    }

    public boolean canPlaceTire(Tire tire, int row, int col) {
        for (int i = 0; i < tire.length; ++i) {
            for (int j = 0; j < tire.length; ++j) {
                int r = row + i;
                int c = col + j;
                if (r >= Container.rows || c >= Container.cols || getContainer()[r][c] != '-') {
                    return false; // Cannot place the tire at this position
                }
            }
        }
        return true; // Tire can be placed at this position
    }

    public void placeTireAtPosition(Tire tire, int row, int col) {
        for (int i = 0; i < tire.length; ++i) {
            for (int j = 0; j < tire.length; ++j) {
                getContainer()[row + i][col + j] = tire.symbol; // Place the tire symbol
            }
        }
        int filledSpace = tire.length * tire.length; // Update the filled space
    }

    public boolean isOccupied(int row, int col) {
        return container[row][col] != '-';
    }

    public char[][] getContainer() {
        return container;
    }

    public double getPercentageFilled() {
        return (double) filledSpace / (rows * cols) * 100.0;
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the container: ");
        int containerRows = scanner.nextInt();
        int containerCols = scanner.nextInt();

        System.out.print("Enter the number of tires: ");
        int numTires = scanner.nextInt();

        List<Tire> tires = new ArrayList<>();
        System.out.println("Enter the lengths and symbols of each tire (e.g., 4 A):");
        for (int i = 0; i < numTires; ++i) {
            int length = scanner.nextInt();
            char symbol = scanner.next().charAt(0);
            tires.add(new Tire(length, symbol));
        }

        Collections.sort(tires, (a, b) -> Integer.compare(b.length, a.length));

        Container container = new Container(containerRows, containerCols);

        for (Tire tire : tires) {
            if (!container.placeTire(tire)) {
                System.out.println("Cannot fit all tires into the container.");
                return;
            }
        }

        System.out.println("Arrangement of tires in the container:");
        char[][] containerContents = container.getContainer();
        for (int i = 0; i < containerRows; ++i) {
            for (int j = 0; j < containerCols; ++j) {
                System.out.print(container.isOccupied(i, j) ? containerContents[i][j] : '-');
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("Percentage of the container filled: " + container.getPercentageFilled() + "%");
    }
}
