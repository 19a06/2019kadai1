package javaapplication20;

/**
 *
 * @author kbc19a06
 */
import java.util.Calendar;
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
        
         // 買い物かご
        cart kago = new cart();

        Scanner scan = new Scanner(System.in);
        
       //その他変数準備

        int goukeiKin = 0;  // 合計金額

        Calendar cal = Calendar.getInstance();  // 売上日時記録用

        int kaikeiNo = 1;   // 会計NO



        // レジ全体のループ

        while (true) {

            // １会計のループ

            while (true) {

                // １商品のループ

                while (true) {

                    // タイトルヘッダーの表示

                    System.out.println("■■■■■■■■■■■■■■■　ITEカフェシステム　レジ画面（商品一覧） ■■■■■■■■■■■■■■■■■■■■■");



                    // 商品一覧を表示する

                    for (int i = 0; i < items.length; i++) {

                        if ((i + 1) % 4 != 0) {

                            System.out.printf("%-20s", items[i].getNo() + ":" + items[i].getName());

                        } else {

                            System.out.printf("%-20s%n", items[i].getNo() + ":" + items[i].getName());

                        }

                    }

                    // タイトルフッターの表示

                    System.out.println();

                    System.out.println("■■■■■■■■■■■■■■■■■■■■■■■");
                    
System.out.print("商品番号を入力してください：");

                    int inputItemNum = Integer.parseInt(scan.next());



                    System.out.print("数量(+/-)を入力してください：");

                    int inputItemCount = Integer.parseInt(scan.next());



                    // カゴに入れる

                    kago.inputKago(items[inputItemNum - 1], inputItemCount);



                    //合計金額を加算する

                    goukeiKin += items[inputItemNum - 1].getPrice() * inputItemCount;



                    // カゴの一覧を表示

                    System.out.println("---------- 注文一覧 ----------");

                    kago.dispKago();

                    System.out.println("------------------------------");



                    System.out.print("お会計=(k)aikei / 継続入力(n)ext：");



                    String inputChar = scan.next();

                    if (inputChar.charAt(0) == 'k') {

                        break;



                    } else if (inputChar.charAt(0) == 'n') {
                                             continue;

                    }



                }



                // お会計処理

                // 合計金額の表示

                System.out.println("-------------------------------");

                System.out.println("小計     " + goukeiKin + "円");

                System.out.println("消費税    " + (int) (Math.floor(goukeiKin * 0.08)) + "円");

                goukeiKin = (int) (Math.floor(goukeiKin * 1.08));

                System.out.println("合計金額  " + goukeiKin + "円");

                System.out.println("-------------------------------");



                System.out.print("以上で宜しいですか？=(y)es / 取り消し=(c)ancel : ");

                String inputChar = scan.next();

                if (inputChar.charAt(0) == 'y') {



                    break;



                } else if (inputChar.charAt(0) == 'c') {

                    // 合計金額を0にする

                    goukeiKin = 0;

                    // カゴを空にする

                    kago.clearKago();



                    continue;

                }



            }



            // 代金預かり

            System.out.println("-------------------------------");

            System.out.print("預り金を入力してください：");

            String azukariKin = scan.next();

            int turiKin = Integer.parseInt(azukariKin) - goukeiKin;

            System.out.println("釣銭：" + turiKin + "円");

                        // 会計番号計算

            System.out.println(cal.get(Calendar.YEAR) + "年"

                    + cal.get(Calendar.MONTH) + "月"

                    + cal.get(Calendar.DATE) + "日"

                    + cal.get(Calendar.HOUR_OF_DAY) + "時"

                    + cal.get(Calendar.MINUTE) + "分");



            System.out.printf("お会計番号：%06d\n", kaikeiNo);

            kaikeiNo++;



            System.out.println("-------------------------------");



            System.out.println("サルミアッキはいかが？ありがとうございました！");



            // 合計金額を0にする

            goukeiKin = 0;

            // カゴを空にする

            kago.clearKago();


            break;
        }

    }


    
}
                    