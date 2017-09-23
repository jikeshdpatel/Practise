package net.array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.script.ScriptEngine;



public class Practice {

	public static void main(String[] args) {
		/*SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
		try {
			System.out.println(format.parse("02-03-2015"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try{
			int a = 10/0;
			System.out.println();
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException
				e){
			System.out.println(e);
		}*/
		// TODO Auto-generated method stub
		//System.out.println(no);
		//Optional<T>
	 /*Object obj = new Object();
	 
System.out.println(ZonedDateTime.now());
System.out.println(LocalDateTime.now());
System.out.println(OffsetDateTime.now());
System.out.println(Calendar.getInstance().getTime());

int a = Integer.MAX_VALUE;
int b = Integer.MAX_VALUE;
int c = Math.addExact(a, b);*/
//int d = Math.sum(a,b);


		System.out.println(LocalDateTime.now().toLocalTime());
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		System.out.println(cal.getTime());
		}
	
	/*default static void testdefaul(){
		
	}*/

}
