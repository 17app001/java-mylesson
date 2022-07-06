package lesson10.card;

public class SoundCard extends Card implements PCI {

    public SoundCard() {
        System.out.println(PCI.VERSION);
    }

    @Override
    public void pull() {
        System.out.println("音效卡拔出.");
    }

    @Override
    public void push() {
        System.out.println("音效卡安裝完成.");
    }
}
