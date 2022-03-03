package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.User;
import model.UsersList;

public class Main {

	static UsersList ul;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ul = new UsersList();
		ul.loadUsers();
		
		//serialize();
		deserialize();
	}
	
	public static void serialize() throws IOException {
		
		File file = new File(".\\files\\ser1.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(ul.getUsers());
		
		oos.close();
		fos.close();		
		
		System.out.println("Serializado");
		
	}
	
	public static void deserialize() throws IOException, ClassNotFoundException {
		File file = new File(".\\files\\ser1.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<User> obj = (ArrayList<User>)ois.readObject();
		System.out.println(obj);
		
		ois.close();
		fis.close();
		
	}
	
	public static void readFileBuffer2() throws IOException {		
		File file = new File(".\\files\\file1.txt");
		
		FileReader fr = new FileReader(file);
		
		BufferedReader input = new BufferedReader(fr);
				
		while (input.ready()) {
			System.out.println(input.readLine());
		}
		fr.close();
		input.close();
	}

	public static void readFileBuffer1() throws IOException {
		File file = new File(".\\files\\file1.txt");
		
		FileReader fr = new FileReader(file);
		
		BufferedReader input = new BufferedReader(fr);
		
		String line = input.readLine();
		
		while (line != null) {
			System.out.println(line);
			line = input.readLine();
		}
		
		input.close();
		fr.close();
	}
	
	
	public static void readFileFileInput() throws IOException {
		File file = new File(".\\files\\file1.txt");

		FileInputStream fis = new FileInputStream(file);
		
		int val = fis.read();
		while(val != -1) {
			System.out.print((char)val + "");
			val = fis.read();
		}
		fis.close();
	}
	
	public static void writeFile() throws IOException {
		File file = new File(".\\files\\file1.txt");
		
		FileWriter fw = new FileWriter(file);
		
		BufferedWriter output = new BufferedWriter(fw);
		
		output.write("Helllo World\n");
		output.newLine();
		output.write("hdahsk");
		
		output.close();
		fw.close();
	}
}
