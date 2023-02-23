package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 

		StdDraw.setPenColor(Color.BLUE);
		double [] z = {0.8, 0.8, 0.5, 0.5};
		double [] a = {0.5, 0.7, 0.7, 0.5};
		StdDraw.polygon (z,a);
		StdDraw.filledPolygon(z,a);
		
		
		StdDraw.setPenColor(Color.RED);
		double [] x = {0.5, 0.65, 0.8};
		double [] y = {0.6, 0.5, 0.6};
		StdDraw.polygon (x,y);
		StdDraw.filledPolygon(x,y);
		
		StdDraw.setPenColor(Color.RED);
		double [] b = {0.5, 0.65, 0.8};
		double [] k = {0.6, 0.7, 0.6};
		StdDraw.polygon (b,k);
		StdDraw.filledPolygon(b,k);
		
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledCircle(0.65, 0.6, 0.085);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledSquare(0.61, 0.61, .02);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledSquare(0.65, 0.57, .02);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledSquare(0.69, 0.61, .02);
		
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.text(0.65, 0.525, "Guns, grass, sand.");
		
		
		

	}
	


}