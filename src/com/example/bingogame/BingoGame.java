package com.example.bingogame;

import java.util.*;

// 3 x 3のビンゴゲーム
public class BingoGame {
    public static void main(String[] args) {
        int[] numbers = makeNumbers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ビンゴゲームを始めます！(Enterで進みます）");
        scanner.nextLine();
        //ゲームスタート
        for (int n = 0; n < numbers.length; n++) {
            System.out.println((n + 1) + "回目！");
            System.out.println("テスト"); //numbers[n]の数字を表示し、変数に格納

            //変数と参加者のシートの数字を比較し、同値のものがあればHiT!

            //１ライン全てHitしたらゲームを抜ける

            scanner.nextLine();
        }
    }
    // 数字を格納 ひとまず30に設定
    public static int[] makeNumbers() {
        int[] numbers = new int[30];
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
