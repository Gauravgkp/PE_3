package com.boeing;

public class chessBoard {
    public static void main(String[] args){
        System.out.println("My Chess Board");
        for(int row=0; row<8; row++){
            for(int column=0; column<8; column++){
                if ((row % 2)==(column % 2)) {
                    System.out.print("WW|");
                }
                else{
                    System.out.print("BB|");
            }
            }
            System.out.println();
        }
    }
}
