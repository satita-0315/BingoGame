package com.example.bingogame;

import java.util.ArrayList;

public class BingoCard {
    int cardNumbers;

    //コンストラクタでインスタンス化した際に、属性の値を初期化するようにする
    public static int[][] makeBingoCard(int width) {
        int[] numbers = BingoNumbers.makeNumbers();
        int[] randomNumbers = BingoNumbers.shuffleNumbers(numbers);
        int [][] card = new int[width][width];
        ArrayList<Integer> arrayList = new ArrayList<>(numbers.length);
        //2次元配列をList型に変換
        for (int n : randomNumbers) {
            arrayList.add(n);
        }
        //ランダムな数字を先頭からcardに格納
        //continueを用いれば真ん中穴開けられそう
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                card[i][j] = arrayList.get(0);
                arrayList.remove(0);
            }
        }
        return card;
    }

}
