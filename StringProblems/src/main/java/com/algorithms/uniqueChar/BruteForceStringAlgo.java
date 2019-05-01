package com.algorithms.uniqueChar;

/**
 *  Brute Force Technique: Run two for loops with variables i and j.
 *  Compare str[i] and str[j].
 *  If they become equal then return false.
 *
 *  Time Complexity O(n^2)
 */
public class BruteForceStringAlgo {

    public static void main(String in[]) {

        BruteForceStringAlgo bruteForceStringAlgo = new BruteForceStringAlgo();
        String str = "StringTestingString";
        boolean result = bruteForceStringAlgo.uniqueCharacters(str);

        if(result)
            System.out.println("The String " + str +" has all unique characters.");
        else
            System.out.println("The String " + str +" has duplicate characters.");
    }

    private boolean uniqueCharacters(String str) {
        try {
            for(int i=0; i<str.length();i++)
                for(int j=i+1; j<str.length();j++)
                    if(str.charAt(i) == str.charAt(j))
                        return false;

            // If no duplicate character encountered
            // Return true.
            return true;
        } catch (Exception e) {
            return  false;
        }
    }
}
