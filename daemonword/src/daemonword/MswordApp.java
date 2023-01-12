package daemonword;

public class MswordApp {
public static void main(String[] args) {
	Msword ms1 = new Msword();
	Msword ms2 = new Msword();
	Msword ms3 =  new Msword();
	ms1.setName("TYPE");
	ms2.setName("SPELL");
	ms3.setName("SAVE");
	ms2.setDaemon(true);
	ms3.setDaemon(true);
	ms2.setPriority(9);
	ms3.setPriority(9);
	ms1.start();
	ms2.start();
	ms3.start();
}
}
