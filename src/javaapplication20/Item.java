package javaapplication20;

/**
 *
 * @author kbc19a06
 */
public class Item {

    private int no;         //商品番号
    private String name;    //商品名
    private int price;      //価格

    public Item(int no, String name, int price) {
        this.no = no;
        this.name = name;
        this.price = price;

    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
