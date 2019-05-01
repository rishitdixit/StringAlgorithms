package com.algorithms.permutation;

import java.util.Arrays;

/**
 * Checking two strings are permuated or not by sorting two strings character array.
 */
public class PermutationWithSorting {

    public static void main(String in[]) {

        PermutationWithSorting permutationWithSorting = new PermutationWithSorting();
        String str1 = "test";
        String str2 = "estt";

        boolean result = permutationWithSorting.isStringPermuted(str1,str2);

        if(result)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private boolean isStringPermuted(String str1, String str2) {

        try {

            // Checking if two strings length are equal or not
            int str1Length = str1.length();
            int str2Length = str2.length();

            if(str1Length != str2Length) return false;

            // Creating two array.
            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();

            // Sorting both string
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            // Comparing two character array
            for(int i=0;i<str1Length;i++)
                if(ch1[i] != ch2[i])
                    return false;

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
