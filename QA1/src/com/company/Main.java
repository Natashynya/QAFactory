package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String t = "Hell Class";
        String ts = "and Student";
        System.out.println(t + ", " + ts);

        String[] u = {
                "Under key 0",
                "Under key 1",
                "Under key 2",
                "Under key 3",
                "Under key 4",
                "Under key 5",
                "Under key 6",
                "Under key 7"
        };
        System.out.println(u[5]);
        System.out.println(u[3 - 1]);

        for (int x = 9; x < 11; x++) {
            System.out.println(x);
        }
        String[] s = {"How", "are", "you"};
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i]);
        }
        int[] m = {10, 20, 25, 30};
        int i = 0;
        int b = 25;
        while (i < 4) {
            if (m[i] == b) {
                break;
            }
            System.out.println(m[i]);
            i++;
        }
        System.out.println("------");

        int[] n = {10, 20, 25, 30};
        int j = 0;
        int d = 10;
        while (j < 4) {
            if (n[j] == d) {
                j++;
                continue;
            }
            System.out.println(n[j]);
            j++;
        }
        System.out.println("------");

        for (int y = 1; y < 1001; y++) {
            if (y % 4 != 0)
                System.out.println(y + " ");
        }
        System.out.println("------");
        int w = 1;
        do {
            w++;
            System.out.println(w + " ");
        } while (w < 5);
        System.out.println("------");

        for (int i1 = 1; i1 <= 100; i1++) {
            System.out.print(i1 + " ");
        }
        System.out.println("------");
        for (int s1 = 10; s1 > -11; s1--) {
            System.out.println(s1 + " ");
        }
        System.out.println("------");
        for (int q1 = 1; q1 <= 33; q1 = q1 + 2) {
            System.out.println(q1 + " ");
        }
        System.out.println("------");
        int sum = 0;
        for (int j1 = 2; j1 <= 100; j1 = j1 + 2) {
            sum = sum + j1;
        }
        System.out.println(sum);
        System.out.println("------");

        double h = 2;
        int g = 10;
        double res = 1;
        for (int i2 = 1; i2 <= g; i2++) {
            res = res + h;
        }
        System.out.println(res);
        System.out.println("------");

        for (int f = 1; f < 11; f++) {
            System.out.println(2 * f + 2 + " ");
        }
        System.out.println("------");
        int z = 3;
        for (int z1 = 1; z1 <= 10; z1++) {
            //    System.out.println(z+ " ");
            z = 2 * z + 3;
            System.out.println(z + " ");
        }
        boolean oper = false;
        int a1 = 3;
        int b2 = 2;
        if (oper = true) {
            System.out.println(a1 + b2);
        } else
            System.out.println(a1 - b2);

        System.out.println("------");

        String[] strings = {"Hello", "World", "Class", "Guys", "Girls", "Everyone", "Goodbye"};
        int w1 = 1;
        int w2 = 7;
        //   for (int i3=0; i3<6; i3++){
        System.out.println(strings[w1 - 1] + " " + strings[w2 - 1]);


        int a5 = 20;
        int b1 = a5 + 5;
        String s1 = "Test String";

        if (false) {
            System.out.println("hi there");
        }


        int a6 = 20;
        int b3 = a6 + 5;
        String s2 = "Test String";

        while (a6 > 0) {
            System.out.println("Recycle " + b3);
            a6 = a6 - 10;
        }

        int aq = -200;
        int bq = 0;
        int r = aq + bq;
        System.out.println(r);
// -200
        System.out.println("------");

        int[] notstrings = {1, 7, 3, 7, 1, 7, 1, 6, 6, 1, 1};
        int target = 3;
        int l=0;
        for (int k = 0; k < 11; k++) {
            if (notstrings[k] == target) {
               l=l+1;
            }
            //сейчас вывело индексы элементов массива которые = 1 а должно вывести количество
        }  System.out.println(l);
        //5
        System.out.println("------");

        boolean oper1 = false;
        int ap = 3;
        int bp = 2;
        if (oper1 == true) {
            System.out.println(ap + bp);
        } else {
            System.out.println(ap - bp);
        }
        System.out.println("------");

        int [] input={1,2,3,4,1,3,1,6,6,1,1};
        int isAllLessThan=3;
         for (int k1 = 0; k1 < 11; k1++) {
          if (input[k1] == isAllLessThan) {
              System.out.println(true);}
          else {
              System.out.println(false);}
          }
        //lesson4




      }


    }







