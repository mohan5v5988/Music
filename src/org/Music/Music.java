package org.Music;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;

import org.hibernate.Session;


public class Music {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

		String music = "/Users/mohan5v5988/Music/iTunes/iTunes Media/Music/surya/Brothers (2012)";

		ArrayList<Obj> m = new ArrayList<Obj>();
		showFiles(new File(music).listFiles(), m);
		Obj obj = m.get(0);
		DataBase.insert(obj);
//		Session session = SessionDB.openSession();
//		session.save(obj);
//		SessionDB.closeSession(session);
		
	}

	public static void deleteFile(String string) {
		try {
			File f1 = new File(string);
			boolean success = f1.delete();
			if (!success) {
				System.out.println("Done");
			}
		} catch (SecurityException ex) {

		}
	}

	public static void showFiles(File[] files, ArrayList<Obj> data) throws IOException {
		for (File file : files) {
			if (file.isDirectory()) {
				System.out.println("Directory: " + file.getName());
				showFiles(file.listFiles(), data); // Calls same method again.
			} else {
				if (!(file.getName().equals(".DS_Store"))) {
					// System.out.println("File: " + file.getName());
					// System.out.println("File: " + file.getAbsolutePath());

					Path path = Paths.get(file.getAbsolutePath());
					byte[] data1 = Files.readAllBytes(path);
					data.add(new Obj(file.getAbsolutePath(), data1));
				}
			}
		}
	}

}
