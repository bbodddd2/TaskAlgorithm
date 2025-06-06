package org.example;

public class Turtle {
    public static void main(String[] args) {
        int[][] exampleGrid = {
                {5, 3, 4},
                {1, 5, 3},
                {2, 3, 4}
        };

        System.out.println("Минимальная стоимость: " + findCheapestPath(exampleGrid));
    }

    public static int findCheapestPath(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;
        int[][] costs = new int[rows][cols];

        costs[0][0] = grid[0][0];


        for (int j = 1; j < cols; j++) {
            costs[0][j] = costs[0][j-1] + grid[0][j];
        }


        for (int i = 1; i < rows; i++) {
            costs[i][0] = costs[i-1][0] + grid[i][0];
        }


        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                costs[i][j] = Math.min(costs[i-1][j], costs[i][j-1]) + grid[i][j];
            }
        }

        return costs[rows-1][cols-1];
    }


}