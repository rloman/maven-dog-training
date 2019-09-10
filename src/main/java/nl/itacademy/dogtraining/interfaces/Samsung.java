package nl.itacademy.dogtraining.interfaces;

public class Samsung implements Televisie {

    private boolean on;
    private int currentChannel;

    @Override
    public void on() {
        this.on = true;
        System.out.println("Samsung TV is now on");

        ditIsTochEenMethode(); // default method
    }

    @Override
    public void off() {
        this.on = false;
        System.out.println("Samsung TV is now off");
    }

    @Override
    public int switchChannel(int newChannel) {
        this.currentChannel = newChannel;

        System.out.println("Samsung TV is now on channel: "+this.currentChannel);

        return this.currentChannel;
    }

    @Override
    public void changeVolume(boolean increase) {

    }
}
