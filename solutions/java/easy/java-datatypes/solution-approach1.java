// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true
// Problem     Java Datatypes
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-07, 12:15 a.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String n = sc.next();

            try {
                long num = Long.parseLong(n);

                System.out.println(n + " can be fitted in:");

                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }

                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }

                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }

                System.out.println("* long");

            } catch (Exception e) {
                System.out.println(n + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }
}
