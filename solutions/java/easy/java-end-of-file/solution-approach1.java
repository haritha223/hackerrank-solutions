// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
// Problem     Java End-of-file
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-10, 10:20 p.m.
// ──────────────────────────────────────────────────


import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = 1;

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(line + " " + s);
            line++;
        }

        sc.close();
    }
}
