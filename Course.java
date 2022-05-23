//Question 2:
import java.util.*;
public class Course {
	int courseId;
	String courseName;
	int courseFee;
	void displayCourseDetails()
	{
		System.out.println(courseId);
		System.out.println(courseName);
		System.out.println(courseFee);
	}
	
	static void authenticate(String username,String password)
	{
		if(username=="Admin" && password=="1234")
		{
			Course c1 = new Course();
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter courseName");
			c1.courseName = s1.nextLine();
			System.out.println("Enter courseId");
			c1.courseId = s1.nextInt();
			System.out.println("Enter courseFee");
			c1.courseFee = s1.nextInt();
			c1.displayCourseDetails();
			
			
		}
		else
		{
			System.out.println("Invalid Username or password");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1 = new Course();
		//c1.displayCourseDetails();
		authenticate("Admin","1234");
		authenticate("Admin1","1234");
	
	}

}
