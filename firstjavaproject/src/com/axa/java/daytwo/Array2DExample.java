package com.axa.java.daytwo;

public class Array2DExample {
    public static void main(String[] args) {
        int [][] arr2D= new int[3][4];
        arr2D[0][0] = 1;
        arr2D[0][1] = 2;
        arr2D[0][2] = 3;
        arr2D[0][3] = 4;
        arr2D[1][0] = 5;
        arr2D[1][1] = 6;
        arr2D[1][2] = 7;
        arr2D[1][3] = 8;
        arr2D[2][0] = 9;
        arr2D[2][1] = 10;
        arr2D[2][2] = 11;
        arr2D[2][3] = 12;
        //Declaration
        int [][] arr2D1= new int[3][];
        // Initialize each row
        arr2D1[0] = new int[2];
        arr2D1[1] = new int[4];
        arr2D1[2] = new int[2];
        //Adding elements
        arr2D1[0][0] = 1;
        arr2D1[0][1] = 2;
        arr2D1[1][0] = 3;
        arr2D1[1][1] = 4;
        arr2D1[1][2] = 5;
        arr2D1[1][3] = 6;
        arr2D1[2][0] = 7;
        arr2D1[2][1] = 8;
        System.out.println(arr2D1.length);
        System.out.println(arr2D.length);
        System.out.println("*************************************");
        for(int row = 0; row < arr2D1.length; row++){
            for(int col = 0; col < arr2D1[row].length; col++){
                System.out.println(arr2D1[row][col]);
            }

        }

        char words[] = new char[10];
        words[0] = 'G';
        words[1] = 'o';
        words[2] = 'o';
        words[3] = 'd';
        words[4] = ' ';
        words[5] = 'M';
        words[6] = 'o';
        words[7] = 'r';
        words[8] = 'n';
        words[9] = 'i';
        System.out.println(words);
        float arrf[] = new float[4];
        arrf[0] = 1.15f;
        arrf[1] = 2.24f;
        arrf[2] = 3.11f;
        arrf[3] = 4.12f;
        int a[] = new int[]{1,2,3,4};
        //int b[] = new int[5]{1,2,3,4};
       /* while(false){
            System.out.println("While Loop");
        }*/
        for(;;){
            System.out.println("For Loop");
        }
    }
}
