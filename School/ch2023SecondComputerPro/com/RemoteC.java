package School.ch2023SecondComputerPro.com;

public class RemoteC {
    int channel;
    int volume;
    boolean onOff;

    void print() {
        System.out.println("TV의 체널은" + channel + "이고 볼륨은" + volume + "입니다");
    }

    void pp() {
        System.out.println("TV의 체널은");
    }

    int getchannel() {
        return channel;
    }
}