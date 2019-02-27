package com.zipcodewilmington.assessment2.part1;

import java.util.Arrays;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        if (array.length % 2 == 0)
            return true;
            else
                return false;
        }

    public Integer[] range(int start, int stop) {
        return null;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer firstNum = array[0];
        Integer secondNum = array[1];

        return firstNum + secondNum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
       Integer firstNum = array[0];
       Integer secondNum = array[1];

       return firstNum * secondNum;
    }
}
