package com.algorithms.uniqueChar;

import java.util.Arrays;

/**
 * Using sorting based on ASCII values of characters
 * Time Complexity: O(nlogn)
 */

public class UniqueCharacterUsingSorting {

    public static void main(String in[]) {

        UniqueCharacterUsingSorting uniqueCharacterUsingSorting = new UniqueCharacterUsingSorting();
        String str = "String";
        boolean result = uniqueCharacterUsingSorting.uniqueCharacters(str);

        if(result)
            System.out.println("The String has unique characters");
        else
            System.out.println("The has duplicate characters");
    }

    private boolean uniqueCharacters(String str) {

        try {

            // Converting string to array
            char[] charArray = str.toCharArray();

            // Using Sorting
            // Arrays.sort() uses binarySort in the background.
            // for non-primitives which is of o(nlogn) time complexity.
            Arrays.sort(charArray);

            for(int i=0; i< charArray.length-1; i++) {
                // if adjacent elements are not equal move to next element
                if(charArray[i] != charArray[i+1])
                    continue;

                // if at any time, 2 adjacent elements become equals then return false
                else
                    return false;
            }
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}
