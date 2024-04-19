package org.example;

public class Main {
    public static void main(String[] args) {
        double[] doubleArray = new double[4];
        doubleArray[0]= 3.43;
        doubleArray[1]= 12.1212;
        doubleArray[2]= 12.22;
        doubleArray[3]= 2.29;
        System.out.println(doubleArray[0]+"; "+doubleArray[1]+"; "+doubleArray[2]+"; " +doubleArray[3] +";");

        String string1 = "Mom loves the frame";
        String[] stringArray = string1.split(" ");

        for (String word : stringArray) {
            System.out.println(word);
        }

        String string2 = "Я хочу перенесення рядків.";
        String result = string2.replaceAll("\\s", "\n");
        System.out.println(result);

        int[] intArray = new int[]{5, 2, 1, 234, 476, 25, 11, 298, 80, 96};
        System.out.println(intArray[0]+" "+intArray[1]+" "+intArray[2]+" "+intArray[3]+" "+intArray[4]+" "+intArray[5]+" "+intArray[6]+" "+intArray[7]+" "+intArray[8]+" "+intArray[9]);
        //intArray[0] = 25;
        //intArray[1] = 3;
        //intArray[2] = 10;
        //intArray[3] = 43;
        //intArray[4] = 674;
        //intArray[5] = 52;
        //intArray[6] = 22;
        //intArray[7] = 892;
        //intArray[8] = 8;
        //intArray[9] = 69;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] += 55;
        }
        System.out.println("Modified array:");
        for (int value : intArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        double[] doubleArray1 = new double[5];
        //double[] doubleArray1 = new double[]{2.3, 3.4, 5.5, 6.3, 1.1};
        System.out.println(doubleArray1[0]+" " +doubleArray1[1]+" " +doubleArray1[2]+" " +doubleArray1[3]+" " +doubleArray1[4]);

        byte byte1 = 20;
        int int1 = 200;
        long long1 = 2000L;
        int[] intArray1 = new int[3];
        intArray1[0] = byte1;
        intArray1[1] = int1;
        intArray1[2] = (int) long1;
        System.out.println(intArray1[0]+" " +intArray1[1]+" " +intArray1[2]);

        int[][] intArray2 = new int[][]{{2, 6, 8, 10},{3, 7, 9, 11}};
        System.out.println("2D Array:");
        for (int i = 0; i < intArray2.length; i++) {
            for (int j = 0; j < intArray2[i].length; j++) {
                System.out.print(intArray2[i][j] + " ");
            }
            System.out.println();
        }

        String string3 = "Hello world!";
        System.out.println("First character: " + string3.charAt(0));
        System.out.println("Last character: " + string3.charAt(string3.length() - 1));
        char[] charArray = new char[]{'w','o','r','l','d'};
        String string4 = new String(charArray);
        System.out.println(string4);
        System.out.println("Penultimate element of the array: " + charArray[charArray.length - 2]);

        int[] intArray3 = {10, 20, 30, 40, 50};
        intArray3[0]++;
        intArray3[3]--;
        System.out.println(intArray3[0]+" " +intArray3[1]+" " +intArray3[2]+" " +intArray3[3]+" " +intArray3[4]);

        int a = 5;

        System.out.println("Original value of 'a': " + a);

        int b = ++a;
        System.out.println("After pre-increment, value of 'a': " + a);
        System.out.println("Value of 'b' after pre-increment: " + b);

        b = a++;
        System.out.println("After post-increment, value of 'a': " + a);
        System.out.println("Value of 'b' after post-increment: " + b);
    }
}