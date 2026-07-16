
import java.util.Scanner;
public class CharCount
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the String: ");
	    String s=sc.nextLine();
	    int freq[]=new int[256];
	    
	    //we have 256 of ascii values
	    for(int i=0;i<s.length();i++){
		char ch=s.charAt(i);
		if(ch>='A' && ch<='Z'){
			ch=(char)(ch+32);
		}
	        freq[ch]++;
	    }
	    
	    for(int i=0;i<256;i++){
	        if(freq[i]>0){
	            System.out.println((char)i+" : "+ freq[i]);
	        }
	    }

	}
}