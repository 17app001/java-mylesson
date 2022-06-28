package lesson8;

public class TV {
    // 常數區
    final int MAX_CHANNEL = 120;
    final int MAX_VOLUME = 7;

    // 屬性區
    private int channel;
    private int volumeLevel;
    private boolean on;
    String brand;

    public TV() {
        channel = 1;
        volumeLevel = 1;
        brand = "Sony";
    }

    public TV(int channel, int volumeLevel) {
        this();
        turnOn();
        setChannel(channel);
        setVolume(volumeLevel);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        on = true;
        System.out.println("電視已開機.");
    }

    public void turnOff() {
        on = false;
        System.out.println("電視已關機.");
    }

    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public boolean getOn() {
        return on;
    }

    public void setChannel(int channel) {
        if (on && channel >= 1 && channel <= MAX_CHANNEL) {
            this.channel = channel;
        }
    }

    public void setVolume(int volumeLevel) {
        if (on && volumeLevel >= 1 && volumeLevel <= MAX_VOLUME) {
            this.volumeLevel = volumeLevel;
        }
    }

    public boolean isOff() {
        if (!on) {
            System.out.println("電視未開機!");
            return true;
        }

        return false;
    }

    public void channelUp() {
        if (!isOff() && ++channel > MAX_CHANNEL) {
            channel = MAX_CHANNEL;
        }
    }

    public void channelDown() {
        if (!isOff() && --channel < 1) {
            channel = 1;
        }
    }

    public void volumeUp() {
        if (!isOff() && ++volumeLevel > MAX_VOLUME) {
            channel = MAX_VOLUME;
        }
    }

    public void volumeDown() {
        if (!isOff() && --volumeLevel < 1) {
            volumeLevel = 1;
        }
    }

    public String getInfo() {
        return String.format("%s 開關:%b 音量:%d 頻道:%d",
                brand, on, volumeLevel, channel);
    }
}
