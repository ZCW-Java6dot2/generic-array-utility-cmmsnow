package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        return null;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        return -1;
    }

    public T[] removeValue(T valueToRemove) {
        return null;
    }
}
