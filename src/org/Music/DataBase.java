package org.Music;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBase {
	
	
	public static void insert(Obj obj) throws ClassNotFoundException, SQLException{
		
		
		Class.forName("org.gjt.mm.mysql.Driver");
		
		Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Test");
		
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO big (id,data,path) VALUES (?,?,?)");
		preparedStatement.setInt(1, obj.getId());
		preparedStatement.setBytes(2, obj.getData());
		preparedStatement.setString(3, obj.getPath());;
		preparedStatement.execute();
		
		connection.close();
		
		
	}
}
