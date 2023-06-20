package oops;

interface TVRemote {
    public void powerOn();
    public void powerOff();
    public void changeChannel();
}

interface SmartTVRemote extends TVRemote {
    public void openApp();
    public void browseInternet();
}

class TV implements SmartTVRemote {
    @Override
    public void powerOn() {
        System.out.println("TV powered on");
    }

    @Override
    public void powerOff() {
        System.out.println("TV powered off");
    }

    @Override
    public void changeChannel() {
        System.out.println("Change channel");
    }

    @Override
    public void openApp() {
        System.out.println("Open the App");
    }

    @Override
    public void browseInternet() {
        System.out.println("Browse Internet");
    }
}

public class Interfacepgm2 {
    public static void main(String[] args) {
        TV obj = new TV();
        obj.powerOn();
        obj.changeChannel();
        obj.openApp();
        obj.browseInternet();
        obj.powerOff();
    }
}
