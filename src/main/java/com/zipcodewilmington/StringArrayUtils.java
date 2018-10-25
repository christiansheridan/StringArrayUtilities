package com.zipcodewilmington;
import com.sun.tools.javac.util.ArrayUtils;

import javax.swing.text.Element;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        if(Arrays.asList(array).contains(value)){
        return true;}
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int i = 0;
        String temp = "";
        for (i= 0; i<array.length/2; i++){
            temp = array[i];
            array[i] = array[array.length - (i+1)];
            array[array.length - (i+1)] = temp;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        if (reverse(array).equals(array)){
            return true;
        } return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    //use CharAt()?
    public static boolean isPangramic(String[] array) {
        String arrayToString = Arrays.toString(array).toLowerCase();
        int test = 0;
        boolean testBoolean = false;
        for (char a = 'a'; a <= 'z'; a++) {
            test = arrayToString.indexOf(a);
            if (test >= 0) {
                testBoolean = true;
            } else {
                testBoolean = false;
            }
        }
            return testBoolean;
    }
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int number1=0;
        for(int i = 0; i < array.length; i++){
            if (array[i].equals(value)){
                number1++;
            }
        }
        return number1;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> newArray = new ArrayList<String>();
        for(String str: array){
        if (!str.equals(valueToRemove)){
        newArray.add(str);}
        }
        String[] finalArr = new String[newArray.size()];
        finalArr = newArray.toArray(finalArr);
        return finalArr;
    }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.add(array[0]);
        for(int i = 1; i < array.length; i++){
            if (!array[i-1].equals(array[i])){
                newArray.add(array[i]);}
        }
        String[] finalArr = new String[newArray.size()];
        finalArr = newArray.toArray(finalArr);
        return finalArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArray = new ArrayList<String>();
        for(int i = 0; i < array.length-2; i++){
            if (array[i].equals(array[i++])){
                newArray.add(array[i]+array[i+1]);}
                else{newArray.add(array[i]);}
        } newArray.add(array[array.length-1]);
        String[] finalArr = new String[newArray.size()];
        finalArr = newArray.toArray(finalArr);
        return finalArr;
    }


}
