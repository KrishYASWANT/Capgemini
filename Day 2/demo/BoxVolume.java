package com.demo;

public class BoxVolume {
	double volume(double wi,double hei,double dep){
		
		double vol=wi*hei*dep;
		return vol;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxVolume a= new BoxVolume();
		double vol= a.volume(5, 5, 5);
		System.out.println("volume of the box is " + vol);

	}

}
