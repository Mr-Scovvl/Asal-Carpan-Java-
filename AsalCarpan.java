package com.company;

import java.util.Scanner;

public class AsalCarpan {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");
        double sayi = scanner.nextInt();
        int bolen = 0;

        for (int a = 2; a <= sayi; a++) {

            if (sayi % a == 0) {

                for (int b = 2; b < a; b++) {

                    if (a % b == 0) {

                        bolen += 1;
                    }
                }
                    if (bolen == 0) {

                        System.out.println(a);
                    }
                    bolen = 0;
                }

            }

        }
    }
