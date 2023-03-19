package java05;

interface PhoneInterface {
	final int TIMEOUT = 10000;
	void sendCall();
	void receiceCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
	void receiveCall();
}
