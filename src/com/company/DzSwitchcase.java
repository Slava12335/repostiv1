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

        gf = JOptionPane.showInputDialog(null, "������� ������ ������������� �����");
        a = Integer.parseInt(gf);
        if (gf != null && !gf.equals("")) {
        } else {
            JOptionPane.showMessageDialog(null, "������ � ������ �����!");
        }


        hf = JOptionPane.showInputDialog(null, "������� ������ ������������� �����");
        v = Integer.parseInt(hf);
        if (hf != null && !hf.equals("")) {
        } else {
            JOptionPane.showMessageDialog(null, "������ � ������ �����!");
        }

        hh = JOptionPane.showInputDialog(null, "������� ���-�� �� ��������: 1=�+�, 2=�-�, 3=�*�, 4=�/�");
        if (hh.matches("\\d+") && (t = Integer.parseInt(hh)) != 0) {
        if (t == 1) {
            sss = a + v;
             JOptionPane.showMessageDialog(null, "����� =" + sss);
           }
           if (t == 2) {
              sss = a - v;
              JOptionPane.showMessageDialog(null, "�������� =" + sss);
           }
           if (t == 3) {
               sss = a * v;
               JOptionPane.showMessageDialog(null, "������������ =" + sss);
           }
          if (t == 4) {
              sss = a / v;
              JOptionPane.showMessageDialog(null, "������� =" + sss);
           }


          } else {
        JOptionPane.showMessageDialog(null, "������ � ������ ��������!");
    }



    }
}