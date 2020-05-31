
package week2_part1_e1_excer2_reversword;

import java.util.Stack;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        System.err.println("please insert next word or insert 'end' to end:");
        Scanner sc=new Scanner(System.in);
        Stack<String> stack=new Stack<String>();
        String inpoutString="";
        int temp = 0;
        while(true)
        {
            inpoutString=sc.next();
            if(inpoutString.equals("end"))
            {
             break;
            }
            else
            {
                stack.push(inpoutString);
            }
        }
        while(!stack.isEmpty())
            System.out.print(" "+stack.pop());
           }
   
}
