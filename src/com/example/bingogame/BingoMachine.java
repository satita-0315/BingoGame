package com.example.bingogame;

public class BingoMachine {
    int[] lotteryBox;

    //コンストラクタでインスタンス化した際に、属性の値を初期化するようにする
    //メソッドへの引数にint maxNumbersみたいに数字を渡せば、ゲーム初期の設定で参加者がHitNumberの上限値を変更できるようにしたい
    public static int[] makeHitNumbers() {
        int[] numbers = BingoNumbers.shuffleNumbers(BingoNumbers.makeNumbers());
        return numbers;
    }

}
