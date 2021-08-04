package padroes.adapter;


import padroes.adapter.devices.Computer;
import padroes.adapter.devices.OldMonitor;
import padroes.adapter.devices.TV;
import padroes.adapter.interfaces.VGA;

public class Main {

	public static void main(String[] args) {

		System.out.println("--------------- TV -------------------");
		Computer pc1 = new Computer();
		TV tv = new TV();
		pc1.connectPort(tv);
		pc1.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		
		System.out.println("--------------- Monitor -------------------");
		Computer pc2 = new Computer();
		OldMonitor monitor = new OldMonitor();
		HDMIToVGAAdapter monitorAdaptado = new HDMIToVGAAdapter(monitor);
		pc2.connectPort(monitorAdaptado);
		pc2.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		
//		System.out.println("--------------- Monitor com adaptador -------------------");
//		Computer pc3 = new Computer();
//		HDMIToVGAAdapter monitorAdaptado2 = new HDMIToVGAAdapter();
//		pc3.connectPort(monitorAdaptado2);
//		pc3.sendImageAndSound("Cat and rainbow", "Nyan cat song");
	}
}
