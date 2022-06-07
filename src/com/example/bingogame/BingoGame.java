package com.example.bingogame;

import java.util.*;
// 3 x 3のビンゴゲーム
public class BingoGame {
    public static void main(String[] args) {
        System.out.println("ビンゴゲームを始めます！");
        int[] numbers = makeNumbers();
        System.out.println(Arrays.toString(numbers));
    }
    // 数字を格納 ひとまず30に設定
    public static int[] makeNumbers() {
        int[] numbers = new int[30];
        for ( int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }
    // 格納されている数字をシャッフル
    public static int[] shuffleNumbers(int[] numbers) {
        Random rd = new Random();
        for (int i = 0; i < numbers.length - 1; i++) {
            int j = rd.nextInt(i +1);

        }

//        List<Integer> list = (List<Integer>)Arrays.asList(numbers);
//        Collections.shuffle(list);
//        list.toArray(numbers);

        return numbers;
    }
}
