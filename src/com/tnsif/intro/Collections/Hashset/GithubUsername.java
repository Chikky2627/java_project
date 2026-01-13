package com.tnsif.intro.Collections.Hashset;
import java.util.HashSet;
import java.util.Set;
public class GithubUsername {
     public static void main(String[] args) {
		Set<String> username=new HashSet<>();
		username.add("Javainterview.track");
		username.add("Chikky2627");
		username.add("Javainterview.track");
		username.add("Javatrack");//it will reject the duplicate values
		System.out.println(username);//[Javainterview.track, Chikky2627, Javatrack]
	}

}
