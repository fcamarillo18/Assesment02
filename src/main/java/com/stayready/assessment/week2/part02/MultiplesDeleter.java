package com.stayready.assessment.week2.part02;

import java.util.ArrayList;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        ArrayList<Integer> oddList = new ArrayList<Integer>();

        for(int value : ints){
            if(!(value % 2 == 0))
                oddList.add(value);
        }

        Integer[] oddArray = new Integer[oddList.size()];

        int i = 0;
        for(int num : oddList){
            oddArray[i] = num;
            i++;
        }

        return oddArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> evenList = new ArrayList<Integer>();

        for(int value : ints){
            if(value % 2 == 0)
                evenList.add(value);
        }

        Integer[] evenArray = new Integer[evenList.size()];

        int i = 0;
        for(int num : evenList){
            evenArray[i] = num;
            i++;
        }

        return evenArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for(int value : ints){
            if(!(value % 3 == 0))
                newList.add(value);
        }

        Integer[] newArray = new Integer[newList.size()];

        int i = 0;
        for(int num : newList){
            newArray[i] = num;
            i++;
        }

        return newArray;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for(int value : ints){
            if(!(value % multiple == 0))
                newList.add(value);
        }

        Integer[] newArray = new Integer[newList.size()];

        int i = 0;
        for(int num : newList){
            newArray[i] = num;
            i++;
        }

        return newArray;
    }
}
