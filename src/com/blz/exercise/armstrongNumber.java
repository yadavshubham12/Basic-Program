package com.blz.exercise;

public class armstrongNumber {
    public static void main(String[] args) {
      int num = 153;
      int origNum = num;
      int sum = 0;
      int power = String.valueOf(num).length();

      while (num != 0){
          int digit = num % 10;
          sum += Math.pow(digit, power);
          num /= 10;
      }
      if (sum == origNum) {
          System.out.println( origNum + " is an armstrong number");
      }
      else {
          System.out.println( origNum + "is not an armstrong number");
      }
    }
}
