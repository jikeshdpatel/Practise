package net.array;

public class Test2 extends Test1{

	public void print(){
		System.out.println("Test2");
	}
	public static void main(String args[]) 
	{ 
		//Test2 b = new Test1(); //Down cast can't be possible.
		Test1 a = new Test2();  //Up cast works fine as test2 at least has what test1 has
		a.print();
		String b = "Dear Hiring Manager, Considering most of my recent experience towards implementation of Microservices for native apps & web applications from scratch using latest stacks including Spring Boot and Java 8 gave me pleasure to find and review such opportunity and makes me great fit for this position." +

"Working closely with Microservices DevOps team to set up environment, migration to AWS and optimization (achived 8000 TPS in past project) made me confident in achieving goals. " + 

"Due to high competencies with version control (GIT), development tools and great communication skills made me a powerful addition to any team and also helped me to successfully lead a small technical team. "+

"Lastly, my strength in core Java skills makes me even stronger to develop core functionalities with best time/space complexities, code review & re-factoring code." +

"I greatly appreciate you taking the time to review my experience." +
"Thanks,"+
"Jikesh Patel"+
"619-354-5374";
		System.out.println(b.length());
	} 
}
