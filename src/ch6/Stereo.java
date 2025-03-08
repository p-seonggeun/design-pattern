package ch6;

public class Stereo {

    public void on() {
        System.out.println("스테레오 켜기");
    }

    public void off() {
        System.out.println("스테레오 끄기");
    }

    public void setCd() {
        System.out.println("cd 설정");
    }

    public void setDvd() {
        System.out.println("dvd 설정");
    }

    public void setRadio() {
        System.out.println("radio 설정");
    }

    public void setVolume(int volume) {
        System.out.println("볼륨 조정: " + volume);
    }
}
