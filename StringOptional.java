package java8;

import java.util.Date;
import java.util.Optional;

public class StringOptional {

	public static void main(String[] args) {
		String[] words = new String[5];
		//System.out.println(words[2].length());
		Optional<String> check = Optional.ofNullable(words[2]);
//		if(check.isPresent()==true) {
//			System.out.println(words[2].length());
//		}
//		else {
//			System.out.println("The Word is NULL");
//		}
		//System.out.println(check.orElse("Null"));
		Date d = new Date();
		System.out.println(d.getDate()+"/"+d.getMonth()+"/"+d.getYear()+"    "+d.getHours()+":"+d.getMinutes());
	

	}

}
