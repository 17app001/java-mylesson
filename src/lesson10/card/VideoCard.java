package lesson10.card;

public class VideoCard extends Card implements PCI, Adapter {

    public VideoCard() {
        System.out.printf("PIC:%.1f WATTS:%.1f",
                PCI.VERSION, Adapter.WATTS);
    }

    @Override
    public void on() {
        System.out.println(Adapter.WATTS + "供電中...");
    }

    @Override
    public void off() {
        System.out.println("顯卡電源關閉");
    }

    @Override
    public void push() {
        System.out.println("顯示卡插入.");
    }

    @Override
    public void pull() {
        System.out.println("顯示卡拔出.");
    }

}
