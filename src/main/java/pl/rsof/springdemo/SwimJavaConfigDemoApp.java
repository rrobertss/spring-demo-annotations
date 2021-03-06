/*
 *	Company: RS
 *  Project: spring-demo-annotations
 *  Created: 30 mar 2021  20:50:55
 *  Author:  RS 		
 */
package pl.rsof.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p></p><p>30 mar 2021</p>
 * @author RS
 *
 */
public class SwimJavaConfigDemoApp {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		// new methods - properties
		System.out.println("Email: " + coach.getEmail());
		System.out.println("Team: " + coach.getTeam());
		
		context.close(); 
	}
	
}
