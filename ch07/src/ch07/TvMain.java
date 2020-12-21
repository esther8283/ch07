package ch07;

public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televison tv = new Televison();
		tv.powerOn();
		tv.changeChannel(10);
		tv.volumeUp();
		tv.volumeUp();
		tv.changeVolume(10);
		tv.volumeUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
		
		System.out.println("\n");
		SmartTv stv = new SmartTv();
		stv.powerOn();
		stv.volumeUp();
		stv.volumeUp();
		stv.changeChannel(1);
		stv.changeChannel(11);
		stv.changeChannel(26);
		stv.turnOffInternet();
		stv.changeUrl("www.daum.net");
		stv.turnOffInternet();
		stv.turnOnYoutube();
		stv.turnOffYoutube();
		stv.powerOff();
		
		System.out.println("\n문제1\n");
		IPTV ip = new IPTV();
		ip.powerOn();
		ip.trunOnMoive();
		ip.trunOffMoive();
		ip.trunOnDrama();
		ip.changeChannel(5);
		ip.saveChannel(5);
		ip.trunOffDrama();
		ip.powerOff();
		
	}
}
//문제 1) television 클래스를 상속받아 IPTV라는 클래스를 생성하고, 
//IPTV고유의 기능으로 VOD채널을 볼수 있는 프로그램을 작성하세요.
//조건 1. VOD 채널을 저장하는 멤버 변수 필요
//조건 2. VOD 채널을 변경하는 메서드 필요

//문제 2 ) television 클래스는 현재 volume이 최대 볼륨가 최소 볼륨이 존재하지 않는 상태이며,
//channel도 최소 channel과 최대 channel이 존재 하지 않는 상태이다.
//이를 수정하여 볼륨은 0 ~ 25까지의 볼륨을 사용할 수 있도록 수정하고, 해당 범위를 넘어서지 못하도록 수정하고
//채널은 1~15번까지 범위를 가지고 그 범위를 넘어서면 각각 반대의 최대 혹은 최소값을 가지도록 수정하세요

