package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private static final Integer E = 5;

    public static void main(String[] args) {


        Integer numbers[] = {15, 1, 6, 12, -3, 4, 8, 21, 2, 30, -1, 9};

        List<Integer> list = new LinkedList<>(Arrays.asList(numbers));
        System.out.println(list);

        List<Integer> firstList = Partition1(list, E);
        System.out.println(firstList);

        List<Integer> secondList = Partition2(list, E);
        System.out.println(secondList);

    }

    public static List<Integer> Partition2(List<Integer> list, int e) {
        List<Integer> list2 = new LinkedList<>();
        for (Integer i : list)
            if (i.compareTo(E) >0)
                list2.add(i);
        return list2;
    }

    public static List<Integer> Partition1(List<Integer> list, int e) {
        List<Integer> list1 = new LinkedList<>();
        for (Integer i : list)
            if (i.compareTo(E) < 0)
                list1.add(i);
        return list1;
    }
}
