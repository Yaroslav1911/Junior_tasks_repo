package org.example.reflection;

public class IAmTheBlock {
    private final String text;
    private final int num;
    private static UseForGoods useForGoods;

    public IAmTheBlock(String text, int num) {
        this.text = text;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String getText() {
        return text;
    }

    public static UseForGoods getUseForGoods() {
        return useForGoods;
    }

    private static void imBlocked(){
        System.out.println("imBlocked");
    }

    private int howCanYou(){
        return 666;
    }

    public String imFree() {
        return "I'm free";
    }
}
