package proj;

public class Container {
    static char[][] container;
    static int rows;
    static int cols;
    static int filledSpace;

    public Container(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.filledSpace = 0;
        container = new char[rows][cols];
        // Initialize the container with '-' characters
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                container[i][j] = '-';
            }
        }
}
}
