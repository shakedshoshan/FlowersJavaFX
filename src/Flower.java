

import java.io.PrintWriter;
import java.util.Scanner;

import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;

public class Flower {
	private int kind;
	private String color;
//	private double price;
	private int cx,cy;
	
	public Flower(int k, String str,int x,int y) {
		kind = k;
		color = str;
//		price = pr;
		cx = x;
		cy = y;
	}
	// this is the constructor that gets Scanner
	public Flower(Scanner s) {
		kind = s.nextInt();
		cx = s.nextInt();
		cy = s.nextInt();
	}
	
	public String toString() {
		return "kind : "+kind+", color: "+color;
	}

	public int getKind() {
		return kind;
	}

	public String getColor() {
		return color;
	}

	public void show(Group root) {
		Polygon p = new  Polygon();
		switch(kind) {
		case 0: // triangleUP
			p.getPoints().addAll(new Double[] {cx-50.0,cy+50.0,(double)cx,cy-50.0,cx+50.0,cy+50.0});
			p.setFill(Color.RED);
			break;
		case 1: // triangle Down
			p.getPoints().addAll(new Double[] {cx-50.0,cy-50.0,(double)cx,cy+50.0,cx+50.0,cy-50.0});
			p.setFill(Color.VIOLET);
			break;
		case 2: // diamond
			p.getPoints().addAll(new Double[] {cx-50.0,(double)cy,(double)cx,cy+50.0,cx+50.0,(double)cy,(double)cx,cy-50.0});
			p.setFill(Color.BLUE);
			break;
		}

		root.getChildren().add(p);
	}
	
	public void writeToFile(PrintWriter pw) {
		pw.printf("%d %d %d\n", kind,cx,cy);
	}
	
	
}
