package br.com.devantenor.java8;

import java.util.Arrays;

public class ArrayParallelSorting {
    public static void tests() {
        int[] myUnsortedNumbers = {10, 3, 8 ,14 -1, 0, -5, 7, 2};

        System.out.println("Print on original sequence");
        for (int number : myUnsortedNumbers) {
            System.out.println(number);
        }

        System.out.println("\nPrint sorting all numbers with parallelSort");
        int[] sortedNumbers = myUnsortedNumbers.clone();
        Arrays.parallelSort(sortedNumbers);
        for (int number : sortedNumbers) {
            System.out.println(number);
        }

        System.out.println("\nPrint sorting the firt three numbers with parallelSort");
        int[] firstThreeSortNumbers = myUnsortedNumbers.clone();
        Arrays.parallelSort(firstThreeSortNumbers, 0, 3);
        for (int number : firstThreeSortNumbers) {
            System.out.println(number);
        }
    }
}
