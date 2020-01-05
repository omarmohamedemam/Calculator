package eg.edu.alexu.csd.oop.calculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class calc implements Calculator {
	String history[]= new String[100];
	int current=0;
	
	public void input(String s) {
		history[current]=s;
		current++;
		
	}
		
		
				
		
	public String getResult() {
		String m = Double.toString(GUI.getResult());
		return m;
		
	}
	public String current () {
		String s = new String();
		if(current==0) {
			 s = history[current];
		}
		else if (current>0) {
			 s = history[current];
			current--;
		}
		 return s;
		
	}
	public String prev() {
		String s = new String();
		if (current>0) {
			current--;
			 s = history[current];
		}
		else {
			 s = history[current];
		}
		 return s;
		
		
	}
	public String next() {
		String s = new String();
		if (current<history.length) {
			current++;
			 s = history[current];
		}
		else {
			 s = history[current];
		}
		return s;
	}
	public void save() {
		PrintWriter out;
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter("history.txt")));
			for( int x = 0; x <history.length; x++)
			{
			out.println(history[x]);
			}

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
	}
	public void load() {
		Scanner scan;
		try {
			scan = new Scanner(new File("history.txt"));
			int c=0;
			while(scan.hasNext())
			{
				if(scan.nextLine().equalsIgnoreCase("null")) {
					break;
				}
				else {
					history[c]=scan.nextLine();
					c++;
				}
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
			}
	
}
