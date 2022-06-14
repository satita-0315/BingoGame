package com.example.bingogame;

import java.util.*;

public class BingoCard {
    int[][] card;
    int[][] hitPlace; //ビンゴカードのHitした場所を保持、この値を判定機がチェックしビンゴかどうか判断する

    public BingoCard() {
        this.card = makeBingoCard();
    }
    public static int[][] makeBingoCard() {
        int width = 5;

        //この辺の処理綺麗にしたい
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

        //ビンゴカードの数字を並び替え
        int[][] bingoCard = new int[width][width];
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[i].length; j++) {
//                真ん中に0を格納
                if (i == 2 && j == 2) {
                    bingoCard[j][i] = 0;
                    continue;
                }
                bingoCard[j][i] = card[i][j];
            }
        }

        printCard(bingoCard);
        return bingoCard;
    }

    //カードに穴（◯）をあける
    public static String makeHole() {
        String h = "◯";
        return h;
    }

    //カードの表示
    public static void printCard(int[][] array) {
        for (int i = 0; i <  array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j != 0) {
                    System.out.print(" ");
                }
                String s = array[i][j] == 0? makeHole(): String.valueOf(array[i][j]);
                System.out.printf("%3s", s);
            }
            System.out.println();
        }
    }

    //ビンゴマシーンの数字がカードにあるか判定する、あればその数字を0に変更
    public static int[][] checkNumbers(int[][] card, int num) {
        int i, j;
        int target = num;
        boolean found = false;
        for ( i = 0; i < card.length; i++) {
            for ( j = 0; j < card[i].length; j++) {
                if (card[i][j] == target) {
                    found = true;
                    card[i][j]  = 0;
                    break;
                }
            }
            if (found) break;
        }
        return card;
    }


}
