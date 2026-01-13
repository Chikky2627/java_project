package com.tnsif.intro.Collections.List;
import java.util.List;
import java.util.ArrayList;

public class StudentMarks {
      public static void main(String[]args) {
    	  List<StudentMarksStorage> marks=new ArrayList<>();
    	  marks.add(new StudentMarksStorage("Chikky",99));
    	  marks.add(new StudentMarksStorage("Chintu",59));
    	  marks.add(new StudentMarksStorage("Chinu",99));
    	  marks.add(new StudentMarksStorage("Chikky",80));
    	  for(StudentMarksStorage s:marks) {
    	  System.out.println("Name:"+s.name+"-->"+"Marks:"+s.marks);
      }
}
}
