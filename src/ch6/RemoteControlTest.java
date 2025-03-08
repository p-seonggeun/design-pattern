package ch6;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl(); // 인보커
        Light light = new Light(); // 리시버
        LightOnCommand lightOn = new LightOnCommand(light); // 커맨드

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
