package com.tnsif.intro.practice;

public class ThisKeyword {
  private int StudentId;
  private String StudentName;
  public void setId(int id) {
	  if(id>3300) {
	  this.StudentId=id;
  }else {
	  System.out.println("invalid id");
  }
  }
  public int getId() {
	  return StudentId;
  }
  public static void main(String [] args) {
	  ThisKeyword th=new ThisKeyword();
	  th.setId(101);
	  System.out.println("StudentId:"+ th.getId());
  }
}
