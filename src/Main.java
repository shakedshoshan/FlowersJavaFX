
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.event.EventHandler;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.*;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		File f = new File("flowers.txt");
//		PrintWriter pw  = new PrintWriter(f);
		
		// Reading from file
		Scanner s  = new Scanner(f);
		
		ArrayList<Flower> flowers = new ArrayList<Flower>();
		while(s.hasNext()) {
			flowers.add(new Flower(s));
		}
		
//		flowers.add(new Flower(0,"red",100,200));// kind, color, x, y
//		flowers.add(new Flower(1,"violet",300,200));// kind, color, x, y
//		flowers.add(new Flower(2,"blue",500,200));// kind, color, x, y
		
		// save flowers to file
//		for(int i = 0; i<flowers.size();i++)
//			flowers.get(i).writeToFile(pw);
		
//		pw.close();
		
		int width=600,height=600;
		Random rnd = new Random();
		// 1. define Group as group that might contain Nodes which are the graphics objects
		Group root = new Group();
		
		// show flowers!!!
		for(int i = 0; i<flowers.size();i++)
			flowers.get(i).show(root);
		

		// 2. Define Scene basing on root (primary node)
		Scene scene = new Scene(root,width,height); // 600x600 is window size in pixels
		scene.setFill(Color.GRAY);

		
		// 3. add scene to stage
		stage.setScene(scene);
		stage.setTitle("Original array");
		// 4. show stage
		stage.show();
	}
}