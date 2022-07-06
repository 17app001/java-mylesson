package lesson10;

import lesson10.card.*;

public class Ch10_2 {
    public static void main(String[] args) {
        SoundCard soundCard = new SoundCard();
        soundCard.push();
        soundCard.pull();

        VideoCard videoCard = new VideoCard();
        videoCard.push();
        videoCard.on();
        videoCard.off();
        videoCard.pull();

        System.out.println("-----------------------------");
        // 使用介面進行多型處理
        PCI[] cards = { soundCard, videoCard };
        for (PCI pci : cards) {
            pci.push();
            pci.pull();
            // 比對是否有繼承(implements Adapter)
            if (pci instanceof Adapter) {
                Adapter card = (Adapter) pci;
                card.on();
                card.off();
            }
        }
    }
}
