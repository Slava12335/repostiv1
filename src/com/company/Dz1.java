package com.company;

import javax.swing.*;

public class Dz1 {

   // public static void main(String[] args) {
    //    String str = JOptionPane.showInputDialog(null, "Введите целое положительное число");
    //    int n;
     //   if (str.matches("\\d+") && (n = Integer.parseInt(str)) != 0) {
      //      int n_2 = 0;
      //      for (int i = 1; i <= n; i++) {
      //          n_2 += i;
      //      }
      //      JOptionPane.showMessageDialog(null, n_2);
    //    } else
    //        JOptionPane.showMessageDialog(null, "Ошибка!");
   // }


    public static void main(String[] args) {
        final String in = JOptionPane.showInputDialog(null, "Введите положительное число", JOptionPane.QUESTION_MESSAGE);
        if (in != null && !in.equals("")) {
            final int n = Integer.parseInt(in);
            if (n < 0) {
                System.out.println("Вы ввели отрицательное число");
            } else {
                int summa = 1;
                for (int i = 1; i <= n; i++) {
                    summa *= i;
                }
                System.out.println("Факториал: " + summa);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ошибка! Вы ничего не ввели!");
        }
    }

}
