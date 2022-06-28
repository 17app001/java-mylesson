package lesson8;

public class TVDemo {
    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new TV();
        TV tv3 = null;

        System.out.println(tv1);
        System.out.println(tv1.on);
        System.out.println(tv1.channel);

        tv1.turnOn();
        tv1.channelUp();
        tv1.setVolume(10);
        System.out.printf("第%d台 音量:%d%n", tv1.channel, tv1.volumeLevel);
        tv1.turnOff();
        tv1.channelUp();
        System.out.printf("第%d台 音量:%d%n", tv1.channel, tv1.volumeLevel);
        System.out.println("----------------------------------");
        tv2.turnOn();
        tv2.setChannel(100);
        tv2.setVolume(3);
        tv2.volumeUp();

        System.out.printf("第%d台 音量:%d%n", tv2.channel, tv2.volumeLevel);

        System.out.println(tv3);
    }
}
