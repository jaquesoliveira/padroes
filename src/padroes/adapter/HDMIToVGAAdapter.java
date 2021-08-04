package padroes.adapter;

import padroes.adapter.interfaces.HDMI;
import padroes.adapter.interfaces.VGA;

public class HDMIToVGAAdapter implements HDMI{
	
	private VGA vga;

	public HDMIToVGAAdapter(VGA vga) {
		System.out.println("Connecting the HDMI/VGA adapter...");
		this.vga = vga;
	}

	public HDMIToVGAAdapter() {
		super();
	}

	@Override
	public void setImage(String image) {
		System.out.println("Converting the image from HDMI to VGA");
		vga.setImage(image);
	}   

	@Override
	public void setSound(String sound) {
		System.out.println("Sorry, we don't work with sound!");
	}
}