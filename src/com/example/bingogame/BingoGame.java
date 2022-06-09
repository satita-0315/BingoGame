package com.example.bingogame;

import java.util.*;

// 5 x 5のビンゴゲーム
public class BingoGame {
    public static void main(String[] args) {
        int[] hitNumbers = BingoMachine.makeHitNumbers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ビンゴゲームを始めます！(Enterで進みます）");
        System.out.println(Arrays.deepToString(BingoCard.makeBingoCard(5)));
        scanner.nextLine();
        //ゲームスタート
        for (int n = 0; n < hitNumbers.length; n++) {
            System.out.println((n + 1) + "回目！");
            System.out.println(hitNumbers[n]); //hitNumbers[n]の数字を表示し、変数に格納

            //hitNumbersと参加者のシートの数字を比較し、同値のものがあればHiT!

            //１ライン全てHitしたらゲームを抜ける

            scanner.nextLine();
        }
    }
}
