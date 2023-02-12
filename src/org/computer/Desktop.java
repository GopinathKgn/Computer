package org.computer;

public class Desktop extends Computer{
	private void dekSize() {
		System.out.println("Desktop Size : 1920*1080");
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.computerModel();
		d.dekSize();
	}
	}
