package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Auto check = new Auto();
        Nissan name = new Nissan();
        Porshe name1 = new Porshe();
        Toyota neme2 = new Toyota();



        Scanner s = new Scanner("введите название автомобиля" + System.in);
        char c = s.findInLine(".").charAt(0);
        int n = s.nextInt();


        System.out.println(s);

      }

    }


