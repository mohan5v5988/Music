package org.Music;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Obj implements Serializable{
	
	static int c = 0;
	String path;
	byte[] data;
	@Id
	@GeneratedValue
	int id;
	
	public Obj(String path,byte[] data) {
		this.path = path;
		this.data = data;
		this.id = c++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
//		System.out.println(this.data.equals(((Obj)obj).data));
		return Arrays.equals( this.data , ((Obj)obj).data );
	}

	@Override
	public String toString() {
		return "Path = " + this.path;
	}
	
}
