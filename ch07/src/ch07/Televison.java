package ch07;

public class Televison {
	int channel;
	int volume;
	
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	void changeChannel(int channel) {
		if (this.channel == 0 && this.channel <= 25) {
			this.channel = channel;
			System.out.println(this.channel + "번 채널을 변경합니다");
		}
		else {
			System.out.println("연결되지 않는 채널입니다.");
		}
	}
	
	void channelUp() {
		channel++;
		System.out.println(this.channel + "번 채널로 변경합니다");
	}
	
	void channelDown() {
		channel--;
		System.out.println(this.channel + "번 채널로 변경합니다");
	}
	
	void changeVolume(int volume) {
		if (this.volume == 0 && this.volume <= 25) {
			this.volume = volume;
			System.out.println(this.volume + "볼륨을 올립니다.");
		}
		else {
			System.out.println("최대볼륨입니다.");
		}
	}
	
	void volumeUp() {
		volume++;
		System.out.println("볼륨을 1 올립니다\n현재볼륨" + volume);
	}
	
	void volumeDown() {
		volume--;
		System.out.println("볼륨을 1 내립니다\n현재볼륨" + volume);
	}
}
