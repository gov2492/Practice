package com.String.test;

import java.sql.SQLOutput;

public class StringClassExample {
    public static void main(String[] args) {
        String s1 = "   +0 123";
        System.out.println(myAtoi(s1));
    }

    public static int myAtoi(String str) {
        String s1 = str.trim();
        String s2 = "";
        if (s1.length() == 0 || Character.isAlphabetic(s1.charAt(0))) {
            return 0;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isAlphabetic(s1.charAt(i)) || s1.charAt(i) == ' ' || (s1.charAt(i) == '-' || s1.charAt(i) == '+') && i > 0) {
                break;
            }
            s2 = s2 + s1.charAt(i);
        }
        try {
            return (Double.parseDouble(s2) > Integer.MAX_VALUE) ? Integer.MAX_VALUE : (Double.parseDouble(s2) < Integer.MIN_VALUE) ? Integer.MIN_VALUE : (int) Double.parseDouble(s2);
        } catch (Exception e) {
            return 0;
        }
    }
}
