package lesson10.card;

/**
 * 屬性(只能是常數)
 */
public interface PCI {
    // 常數
    public static final double VERSION = 3.0;

    // 拔抽方法(抽象方法)
    public abstract void push();

    public abstract void pull();
}
