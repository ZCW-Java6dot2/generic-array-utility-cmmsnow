package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    private T[] inputArray;

    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        List<T> aList = new ArrayList<>();
        aList.addAll(Arrays.asList(inputArray));
        aList.addAll(Arrays.asList(arrayToMerge));
        return Collections.frequency(aList, valueToEvaluate);
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        List<T> aList = new ArrayList<>();
        Map <T, Integer> numOfOccurrences = new HashMap<>();
        aList.addAll(Arrays.asList(inputArray));
        aList.addAll(Arrays.asList(arrayToMerge));
        for (int i=0; i<aList.size(); i++){
            Integer numberOfTimes = Collections.frequency(aList, aList.get(i));
            numOfOccurrences.put(aList.get(i), numberOfTimes);
        }
        Map.Entry<T, Integer> mostCommon = null;
        for (Map.Entry<T, Integer> e: numOfOccurrences.entrySet()){
            if (mostCommon == null || mostCommon.getValue() < e.getValue()){
                mostCommon = e;
            }
        }
        return mostCommon.getKey();
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        List<T> aList = new ArrayList<>();
        aList.addAll(Arrays.asList(inputArray));
        return Collections.frequency(aList, valueToEvaluate);
    }

    public T[] removeValue(T valueToRemove) {
            int numberOfOccurrences = getNumberOfOccurrences(valueToRemove);
            T[] result = Arrays.copyOf(inputArray, inputArray.length - numberOfOccurrences);
            for (int i = 0, j = 0; i < inputArray.length; i++) {
                if (inputArray[i] != valueToRemove) {
                    result[j] = inputArray[i];
                    j++;
                }
            }
            return result;
    }
}
