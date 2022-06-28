package lesson8;

public class TV {
    // 常數區
    final int MAX_CHANNEL = 120;
    final int MAX_VOLUME = 7;

    // 屬性區
    int channel;
    int volumeLevel;
    boolean on;

    public TV() {
        channel = 1;
        volumeLevel = 1;
    }

    public void turnOn() {
        on = true;
        System.out.println("電視已開機.");
    }

    public void turnOff() {
        on = false;
        System.out.println("電視關機.");

    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= MAX_CHANNEL) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= MAX_VOLUME) {
            volumeLevel = newVolumeLevel;
        }
    }

    public void channelUp() {
        if (!on) {
            System.out.println("電視未開機!");
            return;
        }

        channel++;
        if (channel > MAX_CHANNEL) {
            channel = MAX_CHANNEL;
        }
    }

    public void channelDown() {
        if (!on) {
            System.out.println("電視未開機!");
            return;
        }

        channel--;
        if (channel < 1) {
            channel = 1;
        }
    }

    public void volumeUp() {
        if (!on) {
            System.out.println("電視未開機!");
            return;
        }

        volumeLevel++;
        if (volumeLevel > MAX_VOLUME) {
            channel = MAX_VOLUME;
        }
    }

    public void volumeDown() {
        if (!on) {
            System.out.println("電視未開機!");
            return;
        }

        volumeLevel--;
        if (volumeLevel < 1) {
            volumeLevel = 1;
        }
    }

}
