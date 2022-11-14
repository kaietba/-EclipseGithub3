package ariketa_String;
import java.util.Scanner;
public class Ariketa_1 {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner teklatua= new Scanner(System.in);
	String izena;
	int aukera,kopurua;
	String aukera1,hitza1,hitza2,hitza3,hitza4;
	System.out.println("Sartu zure izena");
	izena=teklatua.next();
	System.out.println("Ongi etorri "+izena+" zen egin nahi duzu?");
	System.out.println("1- batu ");
	System.out.println("2- kendu");
	System.out.println("3- biderkatu");
	System.out.println("4- zatitu");
	System.out.println("5- ondarra ");
	System.out.println("6- irten");
	System.out.println("sartu zure aukera");
	aukera=teklatua.nextInt();
	switch (aukera){
	case 1:
		System.out.println("sartu hitz bat:");
		aukera1=teklatua.next();
		StringBuilder aukera1b = new StringBuilder(aukera1);
		aukera1 = aukera1b.reverse().toString();
		System.out.println(aukera1);
		break;
	case 2:
		System.out.println("Sartu hitza");
		hitza1=teklatua.next();
		hitza1=hitza1.toLowerCase();
		System.out.println("Sartu bigarren hitza");
		hitza2=teklatua.next();
		hitza2=hitza2.toLowerCase();
		if (hitza1.equals(hitza2)) {
			System.out.println("Berdinak dira");
		}else {
			System.out.println("Ez dira berdinak");
		}
		break;
	case 3:
		System.out.println("Sartu hitz bat");
		hitza3=teklatua.next();
		System.out.println("Sartu nahi duzun hitza "+hitza3+" da");
		System.out.println("letra kopurua "+hitza3.length()+" da");
		
		if(hitza3.length()<7) {
			System.out.println("Hitzaren tamaina txikia da.");
		}
		else {
			System.out.println("Hitzaren tamaina handia da.");
			
		}
		break;
	case 4:
		System.out.println("Sartu hitza: ");
		hitza4=teklatua.next();
		System.out.println("sartu kopurua:");
		kopurua=teklatua.nextInt();
		
		
	}
}
}
