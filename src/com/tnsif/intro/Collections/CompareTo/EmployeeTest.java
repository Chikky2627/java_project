package com.tnsif.intro.Collections.CompareTo;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.sort;
public class EmployeeTest {
   public static void main(String[] args) {
		List<Empolyee> li=new ArrayList<>();
		li.add(new Empolyee("chikky",782));
		li.add(new Empolyee("chinu",781));
		li.add(new Empolyee("chintu",799));
		 Collections.sort(li);
		 for(Empolyee e:li) {
			 System.out.println(e.id);
		 }
		 Collections.sort(li,
		            (e1, e2) -> Integer.compare(e2.id, e1.id)
		        );

		        System.out.println("Descending:");
		        for (Empolyee e : li) {
		            System.out.println(e.id);
		        }
	}

}
