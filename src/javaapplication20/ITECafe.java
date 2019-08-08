package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author kbc19a06
 */
public class ITECafe {

    public static void main(String[] args) {

        //飲み物
        Item hotcoffee = new Item(1, "ホットコーヒー", 280);
        Item icecoffee = new Item(2, "アイスコーヒー", 280);
        Item tea = new Item(3, "紅茶", 220);
        Item mixjuice = new Item(4, "みっくすじゅーす", 250);
        Item cola = new Item(5, "コーラ", 220);
        //デザート
        Item cake = new Item(6, "ケーキ", 480);
        Item Chocolatecake = new Item(7, "チョコレートケーキ", 500);
        Item hotcake = new Item(8, "ホットケーキ", 500);
        Item parfait = new Item(9, "パフェ", 500);
        Item Chocolateparfait = new Item(10, "チョコレートパフェ", 580);
        //フード
        Item yokosukacurry = new Item(11, "横須賀カレー", 1300);
        Item harekazecurry = new Item(12, "晴風カレー", 1500);

        Item[] items = new Item[12];
        items[0] = hotcoffee;
        items[1] = icecoffee;
        items[2] = tea;
        items[3] = mixjuice;
        items[4] = cola;
        items[5] = cake;
        items[6] = Chocolatecake;
        items[7] = hotcake;
        items[8] = parfait;
        items[9] = Chocolateparfait;
        items[10] = yokosukacurry;
        items[11] = harekazecurry;

        while (true) {

            System.out.println("ITEカフェシステム");

            int goukei = 0;
            Scanner sc = new Scanner(System.in);

            while (true) {

                System.out.println("商品番号を入力してください：");

                String input = sc.next();
                int no = Integer.parseInt(input);

                int nedan = items[no - 1].getPrice();

                System.out.println("数量を入力してください：");
                input = sc.next();
                int suu = Integer.parseInt(input);

                goukei += nedan * suu;

                System.out.println("合計金額は" + goukei + "円です");

                System.out.println("以上ですか？ 1で終了");
                input = sc.next();
                suu = Integer.parseInt(input);

                if (suu == 1) {
                    break;
                }

            }

            System.out.println("代金を入力してください");
            String input = sc.next();
            int suu = Integer.parseInt(input);

            System.out.println("お釣りは" + (suu - goukei) + "円です");

            System.out.println("システムを終了しますか?　１で終了");
            input = sc.next();
            suu = Integer.parseInt(input);
            System.out.println("ありがとうございました");
            if (suu == 1) {
                break;

            }

        }

    }
}
