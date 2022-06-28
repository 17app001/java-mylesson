package lesson8;

public class TVDemo2 {
    public static void main(String[] args) {
        TV tv = new TV(10, 8);
        tv.setBrand("SHARP");
        System.out.println(tv.getInfo());

        tv.turnOff();
        tv.channelUp();
        System.out.println(tv.getInfo());

        tv.turnOn();
        tv.setChannel(1000);
        tv.setVolume(7);

        System.out.printf("%s 開關:%b 音量:%d 頻道:%d",
                tv.getBrand(), tv.getOn(), tv.getVolumeLevel(), tv.getChannel());

    }
}
