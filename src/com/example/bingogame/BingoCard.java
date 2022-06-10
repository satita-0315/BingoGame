package com.example.bingogame;

import java.util.*;

public class BingoCard {

    //コンストラクタでインスタンス化した際に、属性の値を初期化するようにする
    public static int[] makeBingoCard() {
        int width = 5;
        String mark = "◯";
//        Integer intMark = Integer.valueOf(mark);
        int[][] card = new int[width][width];
        int[] columnB = BingoNumbers.shuffleNumbers(Arrays.copyOfRange(BingoNumbers.makeNumbers(), 0, 15));
        int[] columnI = BingoNumbers.shuffleNumbers(Arrays.copyOfRange(BingoNumbers.makeNumbers(), 15, 30));
        int[] columnN = BingoNumbers.shuffleNumbers(Arrays.copyOfRange(BingoNumbers.makeNumbers(), 30, 45));
        int[] columnG = BingoNumbers.shuffleNumbers(Arrays.copyOfRange(BingoNumbers.makeNumbers(), 45, 60));
        int[] columnO = BingoNumbers.shuffleNumbers(Arrays.copyOfRange(BingoNumbers.makeNumbers(), 60, 75));

        for (int i = 0; i < width; i++) {
            card[0][i] = columnB[i];
            card[1][i] = columnI[i];
            card[2][i] = columnN[i];
            card[3][i] = columnG[i];
            card[4][i] = columnO[i];
        }
        int[][] bingoCard = new int[width][width];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < card[i].length; j++) {
                //真ん中に◯をあける処理 うまくいかない
//                if (i == 2 && j == 2) {
//                    bingoCard[j][i] = intMark.intValue();
//                    continue;
//                }
                bingoCard[j][i] = card[i][j];
            }
        }
        printCard(bingoCard);
//        System.out.println(Arrays.deepToString(bingoCard));

        return columnB;
    }
    public static void printCard(int[][] array) {
        for (int i = 0; i <  array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j != 0){
                    System.out.print(" ");
                }
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }

    }


}
