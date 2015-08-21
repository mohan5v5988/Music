package org.Music;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;

public class Test {
public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		
		String music = "/Users/mohan5v5988/Music/iTunes/iTunes Media/Music";
		String check = "/Users/mohan5v5988/Desktop/che/grtwetw.mp3";//+"xvxczzvc.mp3";
		
		ArrayList<Obj> m = new ArrayList<Obj>();
		ArrayList<Obj> c = new ArrayList<Obj>();
//		
//		Path path = Paths.get(check);
//		byte[] data = Files.readAllBytes(path);
//		
//		DataBase.insert(new Obj(check,data));
		
		
		
		
//		
//		
//		Path path1 = Paths.get("/Users/mohan5v5988/Documents/Jaago.m4r");
//		byte[] data1 = Files.readAllBytes(path1);
//		
//		
//		System.out.println(Arrays.equals(data, data1));
		
		
//		File[] files = new File(music).listFiles();
	    showFiles(new File(music).listFiles(),m);
//	    showFiles(new File(check).listFiles(),c);
//	    System.out.println("============================================================================================");
//	    for (Obj obj : m) {
//			System.out.println(obj);
//		}
//	    System.out.println("============================================================================================");
//	    for (Obj obj : c) {
//			System.out.println(obj);
//		}
		
		
//	    int count = 0,num = 0;
//	    boolean isf = false;
//	    
//	    
//	    for (Obj obj : m) {
//	    	for (int n = 0; n < c.size(); n++) {
////	    		System.out.println("hi");
//				if(obj.equals(c.get(n))) {
////					System.out.println("hi");
//					count++;
//					isf = true;
//					num = n;
//					break;
//				}
//			}
//	    	if(isf) {
//	    		c.remove(num);
//	    		isf = false;
//	    	}
//		}
//		System.out.println(count);
	}
	
	
	public static void showFiles(File[] files, ArrayList<Obj> data) throws IOException {
	    for (File file : files) {
	        if (file.isDirectory()) {
	            System.out.println("Directory: " + file.getName());
	            showFiles(file.listFiles(),data); // Calls same method again.
	        } else {
	        	if ( !(file.getName().equals(".DS_Store")) ) {
//	        		System.out.println("File: " + file.getName());
//		            System.out.println("File: " + file.getAbsolutePath());
		            

		    		Path path = Paths.get(file.getAbsolutePath());
		    		byte[] data1 = Files.readAllBytes(path);
		    		data.add(new Obj(file.getAbsolutePath(),data1));
	        	}
	        }
	    }
	}
}
