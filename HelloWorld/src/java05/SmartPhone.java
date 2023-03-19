package java05;

class SmartPhone extends Calc implements PhoneInterface{
	@Override
	public void sendCall() {
		System.out.println("따르릉따르릉~~");
	}
	
	@Override
	public void receiveCall() {
		System.out.println("전화왔어요.");
	}
	
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}

	@Override
	public void receiceCall() {
		// TODO Auto-generated method stub
		
	}
}
