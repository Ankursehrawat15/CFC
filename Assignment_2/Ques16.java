package Assignment_2;

import java.util.ArrayList;

public class Ques16 {

    private static ArrayList<String> printSubSets(int[] arr, int index) {

        if (index == arr.length) {
            ArrayList<String> list = new ArrayList<>();
            list.add(" ");
            return list;
        }

        ArrayList<String> small = printSubSets(arr, index + 1);

        ArrayList<String> myAns = new ArrayList<>();
        for (String elem : small) {
            myAns.add(elem);
        }

        for (int i = 0; i < small.size(); i++) {
            myAns.add(arr[index] + " " + small.get(i));
        }

        return myAns;

    }

    public static void printSubSets(int[] arr) {
        ArrayList<String> ans = printSubSets(arr, 0);
        for (String elem : ans) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        printSubSets(arr);
    }

}