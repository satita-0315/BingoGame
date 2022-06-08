package com.example.bingogame;

import java.util.*;

//コミット、プッシュのために変更箇所作成文

// 3 x 3のビンゴゲーム
public class BingoGame {
    public static void main(String[] args) {
        int[] hitNumbers = makeHitNumbers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ビンゴゲームを始めます！(Enterで進みます）");
        System.out.println(Arrays.deepToString(makeBingoCard(3)));
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

    //メソッドへの引数にint maxNumbersみたいに数字を渡せば、ゲーム初期の設定で参加者がHitNumberの上限値を変更できるようにしたい
    public static int[] makeHitNumbers() {
        int[] numbers = shuffleNumbers(makeNumbers());
        return numbers;
    }

    public static int[][] makeBingoCard(int width) {
        int[] numbers = shuffleNumbers(makeNumbers());
        int [][] card = new int[width][width];
        ArrayList<Integer> arrayList = new ArrayList<>(numbers.length);
        //2次元配列をList型に変換
        for (int n : numbers) {
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
