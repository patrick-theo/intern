package day13_test;

import java.util.HashMap;
import java.util.Map;

public class Pro5 {
	public static void main(String[] args) { 
		Map<ToDos, String> m = new HashMap<ToDos, String>(); 
		ToDos t1 = new ToDos("Monday"); 
		ToDos t2 = new ToDos("Monday"); 
		ToDos t3 = new ToDos("Tuesday"); 
		m.put(t1, "doLaundry"); 
		m.put(t2, "payBills"); 
		m.put(t3, "cleanAttic"); 
		System.out.println(m.size()); 
		} } 
		class ToDos{ 
		String day; 
		ToDos(String d) { day = d; } 
		public boolean equals(Object o) { 
		return ((ToDos)o).day == this.day; 
		} 
		// public int hashCode() { return 9; } 
		}
//As the code stands the output will be 3 i,If uncommented code output is 2
