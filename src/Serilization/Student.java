package Serilization;

import java.io.Serializable;

public class Student implements Serializable
{
	private static int id;
	private static String name;
	
	public Student(int id , String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" : "+name;
	}
	
	

}
