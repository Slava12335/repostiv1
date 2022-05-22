package com.company;

import javax.swing.*;

public class DzSwitchcase {

    public static void main(String[] args) {
        String gf;
        String hf;
        String hh;
        int sss = 0;
        int a;
        int v;
        int t;

        gf = JOptionPane.showInputDialog(null, "Введите первое положительное число");
        a = Integer.parseInt(gf);
        if (gf != null && !gf.equals("")) {
        } else {
            JOptionPane.showMessageDialog(null, "Ошибка в первом числе!");
        }


        hf = JOptionPane.showInputDialog(null, "Введите второе положительное число");
        v = Integer.parseInt(hf);
        if (hf != null && !hf.equals("")) {
        } else {
            JOptionPane.showMessageDialog(null, "Ошибка в втором числе!");
        }

        hh = JOptionPane.showInputDialog(null, "Введите что-то из операций: 1=«+», 2=«-», 3=«*», 4=«/»");
        if (hh.matches("\\d+") && (t = Integer.parseInt(hh)) != 0) {
        if (t == 1) {
            sss = a + v;
             JOptionPane.showMessageDialog(null, "Сумма =" + sss);
           }
           if (t == 2) {
              sss = a - v;
              JOptionPane.showMessageDialog(null, "Разность =" + sss);
           }
           if (t == 3) {
               sss = a * v;
               JOptionPane.showMessageDialog(null, "Произведение =" + sss);
           }
          if (t == 4) {
              sss = a / v;
              JOptionPane.showMessageDialog(null, "Частное =" + sss);
           }


          } else {
        JOptionPane.showMessageDialog(null, "Ошибка в выборе операций!");
    }



    }
}