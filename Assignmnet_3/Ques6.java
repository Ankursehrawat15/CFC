package Assignmnet_3;

import java.util.ArrayList;
import java.util.List;

public class Ques6 {

   private static int[] sumOfArray(int[] arr1, int[] arr2) {
      List<Integer> list = new ArrayList<>();
      int carry = 0;
      int i = arr1.length - 1;
      int j = arr2.length - 2;
      int sum = 0;
      while (i >= 0 || j >= 0) {

         if (carry == 0) {
            sum = arr1[i] + arr2[j];
            list.add(sum % 10);
            carry = sum / 10;
         } else {

         }

      }

   }

   public static void main(String[] args) {

   }

}
