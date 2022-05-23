//Question 1:
//Why String is immutable in java and what is the difference between String and String Builder? And Write some
//of the methods of String class at least 5 with example.


/*String is immutable because when we create a string then we can't modified the value of original String
 *  but in String Builder we can modified the original String 
 *  
 *  The basic difference between string and string buffer is string is immutable in nature but string buffer
 *  is mutable in nature 
 * */
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Vijay";
		s1.concat("Prakash");
		System.out.println(s1); //O/p Vijay
		
		StringBuilder s2 = new StringBuilder("Vijay");
		String s3 = "Prakash";
		s2.append(s3);
		System.out.println(s2);//O/P VijayPrakash
		
		//Method of String Class
		String str = "Vijay-Prakash-Singh";
		System.out.println(str.length());//O/P 19
		
		System.out.println(str.charAt(3));//O/P a
		
		String str1 = str.concat(" NIraj");
		System.out.println(str1);//O/P Vijay-Prakash-Singh NIraj
		
		System.out.println(str.indexOf('i'));//O/P 1
		
		
		System.out.println(str.equalsIgnoreCase(str1));//O/P false
		

	}

}
