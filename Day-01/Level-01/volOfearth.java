import java.lang.Math;

class volOfEarth{
	public static void main(String[] args){
	int radius = 6378;
	double pi = 3.14;
	double volumeOfearth = (4/3)* pi * Math.pow(radius,3);
	double volInmiles = volumeOfearth * 1.6;
	System.out.println("the volume of the earth in cubic kilometer is " + volumeOfearth + "and cubic miles is " + volInmiles);
	
	}
}