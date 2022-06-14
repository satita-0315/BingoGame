package com.example.bingogame;

import java.util.*;

// 5 x 5のビンゴゲーム
public class BingoGame {
    public static void main(String[] args) {
        BingoMachine bingoMachine = new BingoMachine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ビンゴゲームを始めます！(Enterで進みます）");
        BingoCard bingoCard = new BingoCard(); //ビンゴカード生成
        scanner.nextLine();
        //ゲームスタート
        for (int n = 0; n < bingoMachine.lotteryBox.length; n++) {
            System.out.println((n + 1) + "回目！");
            System.out.println(bingoMachine.lotteryBox[n]); //bingoMachine.lotteryBox[n]の数字を表示
            BingoCard.checkNumbers(bingoCard.card, bingoMachine.lotteryBox[n]);
            BingoCard.printCard(bingoCard.card);


            //hitNumbersと参加者のシートの数字を比較し、同値のものがあればHiT!と表示する

            //１ライン全てHitしたらゲームを抜ける

            scanner.nextLine();
        }
    }
}
