/*Write a method that finds the number of occurrences of a specified character in a string using 
the following header:
public static int count(String str, char a)
For example, count ("Welcome", 'e') returns 2. 
Write a java program that prompts the user to enter a string followed by a character and 
displays the number of occurrences of the character in the string*/
public class Q6 {
	public static int count(String str, char a) {
		int number=0;
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i)==a) {
				number++;//System.out.println("index of given char is = "+str.indexOf(a));
			}
		}
		return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str ="danish yousuf";
  char a='i';
  System.out.println("Number of times the given char is repeated = "+count(str,a));
	}

}
