package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String newString = "";

        if(!(stringToBePadded.equals("")))
            amountOfPadding -= stringToBePadded.length();

        for(int i = 0; i < amountOfPadding; i++)
            newString += " ";

        newString += stringToBePadded;

        return newString;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String newString = stringToBePadded;

        if(!(stringToBePadded.equals("")))
            amountOfPadding -= stringToBePadded.length();

        for(int i = 0; i < amountOfPadding; i++)
            newString += " ";

        return newString;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String newString = "";

        for(int i = 0; i < numberOfTimeToRepeat; i++)
            newString += stringToBeRepeated;

        return newString;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {
        boolean allLetters = false;
        char[] letters = string.toCharArray();

        for(int i = 0; i < letters.length; i++){
            if(Character.isLetter(letters[i]) || Character.isLetter(' '))
                allLetters = true;
            else 
                allLetters = false;
        }

        return allLetters;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        boolean isNumeric = false;

        char[] characters = string.toCharArray();

        for(int i = 0; i < characters.length; i++){
            if(Character.isDigit(characters[i]) || Character.isLetter(' '))
                isNumeric = true;
            else 
                return false;
        }

        return isNumeric;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        boolean specialCharacters = false;

        char[] characters = string.toCharArray();

        for(int i = 0; i < characters.length; i++){
            if(Character.isDigit(characters[i]) || Character.isLetter(characters[i]))
                return false;
            else 
                specialCharacters = true;
        }

        return specialCharacters;
    }
}
