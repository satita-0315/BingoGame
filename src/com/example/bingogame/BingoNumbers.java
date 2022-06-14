package com.example.bingogame;

import java.util.Random;

public class BingoNumbers {
    public static int[] makeNumbers() {
        int[] numbers = new int[75];
        for ( int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }
    // 格納されている数字をシャッフル
    public static int[] shuffleNumbers(int[] numbers) {
        Random rd = new Random();
        for (int i = numbers.length - 1; i > 0; i--) {
            int j = rd.nextInt(i + 1);
            int tmp = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = tmp;
        }
        return numbers;
    }

}
