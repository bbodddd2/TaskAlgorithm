package org.example;



import java.util.*;

public class LastHomeWork2{
    public static void main(String[] args) {
        List<List<Integer>> moves = Arrays.asList(
                List.of(),
                List.of(1),
                List.of(1),
                List.of(1,2),
                List.of(1,3),
                List.of(1,3)
        );

        System.out.println(getWinner(5, moves));
    }

    public static String getWinner(int n, List<List<Integer>> moves) {
        boolean[] dp = new boolean[n+1];

        for (int i = 1; i <= n; i++) {
            for (int move : moves.get(i)) {
                if (i >= move && !dp[i - move]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        if (dp[n]) {
            return "Bogdan228propeinkillerrobloxcolt1x1brawlstars";
        }
        return "Bogdanlovwcocacolazero";
    }
}