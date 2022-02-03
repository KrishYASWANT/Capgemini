package Day5.demo;
import java.util.*;
/*
 * 
 * Ava sitting in the first row wants to send a secret message to her friend Mia who is sitting in the last row.
 She wrote a secret message in a piece of paper and passed it through her classmates.
 Ava has used a substitution cipher technique where every letter is replaced with the 
 7th alphabet before the letter in the alphabet series. Since Mia already knows the technique she easily got the exact message.

The encrypted text (input) may have numbers or special characters along with letters. If so, ignore those and convert only the letters.
 If space occurs between the words of input, it must occur in output also. If no letters, then there is `“No hidden message”`.

Develop a java application that accepts the secret message to decrypt and print the actual message to the screen. 
Input consists of the encrypted text.

> Sample Input 1
    Enter the encrypted text:
    Pukph

> Sample Output 1
    Decrypted text:
    India

> Sample Input 2
    Enter the encrypted text:
    Z23hcl @d$3#haly

> Sample Output 2
    Decrypted text:
    Save water

> Sample Input 3
    Enter the encrypted text:
    @67$89##^^

> Sample Output 3
    No hidden message
 */

/*class RemoveSpecial
{
	String Remove(String a)
	{
		char arr[],arr1[];
		arr=a.toCharArray();
		for ( int i=0;i<arr.length;i++)
		{
			int val=(int )arr[i];
			if((val<65||(val>90 && val<97))) {
				
			}
		}
		return a;
	}
}*/
public class SecreatMessageEncrypted {

	/*public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the encrypted text  ");
		String m=sc.next();
		//char arr[],arr1[];
		//arr=m.toCharArray();
		
	}
*/    public static void main (String[] args) {
    Scanner s=new Scanner(System.in);
    String s1;
    char arr[],arr_2[];
    System.out.println("Enter the encrypted text:");
    s1=s.nextLine();
    int i,j=0,counter=0;
    arr=s1.toCharArray();
    arr_2=new char[arr.length];
    for(i=0;i<arr.length;i++)
    {
        int value=(int)arr[i];
        if(value<65 || (value>90 && value<97)){
          if(value==32)
            arr_2[j++]=' ';
          else
           continue;
        }
        else{
            value=value-7;
            if(value<97 && value>89)
               value=value+26;
            if(value<65)
               value=value+26;
               
            arr_2[j++]=(char)value;
            counter=1;
        }
    }
    if(counter!=1){
        System.out.println("No hidden message");
        System.exit(0);
    }
    System.out.println("Decrypted text:");
    for(i=0;i<arr_2.length;i++){
        System.out.print(arr_2[i]);
    }
}
}

