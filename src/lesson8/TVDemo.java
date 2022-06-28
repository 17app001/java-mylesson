package lesson8;

public class TVDemo {
    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new TV();
        TV tv3 = null;

        System.out.println(tv1);
        System.out.println(tv1.getOn());
        System.out.println(tv1.getChannel());

        tv1.turnOn();
        tv1.channelUp();
        tv1.setVolume(10);
        System.out.printf("第%d台 音量:%d%n", tv1.getChannel(), tv1.getVolumeLevel());
        tv1.turnOff();
        tv1.channelUp();
        System.out.printf("第%d台 音量:%d%n", tv1.getChannel(), tv1.getVolumeLevel());
        System.out.println("----------------------------------");
        tv2.turnOn();
        tv2.setChannel(100);
        tv2.setVolume(3);
        tv2.volumeUp();

        System.out.printf("第%d台 音量:%d%n", tv2.getChannel(), tv2.getVolumeLevel());

        System.out.println(tv3);
    }
}
