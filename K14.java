import java.util.Scanner;
public class K14{
    public static void main(String[] args){
	int lightspeed;
	long days;
	long seconds;
	long distance;

	lightspeed=186000;
	days=1000;
	seconds=days*24*60*60;
	distance=lightspeed*seconds;
	System.out.println(distance);
	}
}
//javac -d bin K14.java
//java -cp bin K14
//Calculate distance traveled by light in 1000 days
//Speed of light is 1,86,000 miles per second

