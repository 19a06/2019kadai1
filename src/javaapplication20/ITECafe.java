package javaapplication20;

/**
 *
 * @author kbc19a06
 */
import java.util.Scanner;

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

        Scanner scan = new Scanner(System.in);

        int inputNum;       //入力された商品番号
        while (true) {
            //商品名を表示する
            System.out.println("ITEカフェシステム");
            System.out.println(hotcoffee.getNo() + ":" + hotcoffee.getName());
            System.out.println(icecoffee.getNo() + ":" + icecoffee.getName());
            System.out.println(tea.getNo() + ":" + tea.getName());
            System.out.println(mixjuice.getNo() + ":" + mixjuice.getName());
            System.out.println(cola.getNo() + ":" + cola.getName());
            System.out.println(cake.getNo() + ":" + cake.getName());
            System.out.println(Chocolatecake.getNo() + ":" + Chocolatecake.getName());
            System.out.println(hotcake.getNo() + ":" + hotcake.getName());
            System.out.println(parfait.getNo() + ":" + parfait.getName());
            System.out.println(Chocolateparfait.getNo() + ":" + Chocolateparfait.getName());
            System.out.println(yokosukacurry.getNo() + ":" + yokosukacurry.getName());
            System.out.println(harekazecurry.getNo() + ":" + harekazecurry.getName());

            //商品番号を入力する
            System.out.println("商品番号を入力してくれ...");

            try {
                String inputStr;
                inputStr = scan.next();
                inputNum = Integer.parseInt(inputStr);

                System.out.println(items[inputNum - 1].getNo() + "番の" + items[inputNum - 1].getName() + "承りました、" + items[inputNum - 1].getPrice() + "円払え。");
                System.out.println("何？金がない？こっちも商売してんだよ！金がないなら帰りな！どうしても欲しい？くそっ今回だけだぞ！");
                System.out.println("どうだ、おいしか？そうかそうか！泣くほどおいしいか！こっちの横須賀カレーと晴風カレーも食べなさい。なに構わんさ、フフフ…。");
                System.out.println("すまないね金を払えないやつに用はないんだ。そのカレー、サルミアッキをたっぷり入れさせてもらった。気分悪くて動けないだろ？");
                System.out.println("さぁもっと食べなさい！");
                //正しく処理されたらループを抜ける
                break;
            
                } catch (NumberFormatException e) {
                System.out.println("【入力エラー：数値を入力してください】");

            }
        }
    }
}
