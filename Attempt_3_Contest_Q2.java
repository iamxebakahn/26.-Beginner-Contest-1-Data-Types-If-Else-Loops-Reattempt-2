/*Check If One Condition is True
Problem Description

Take three numbers from user, i.e. n1, n2 and n3.
You have to print numbers taken by user as :
In First Line : "Number 1 is " then n1.
In Second Line : "Number 2 is " then n2.
In Third Line : "Number 3 is " then n3.
then In Fourth Line print "true", if atleast single condition is true from the following:
Condition 1 : n1 < 50
Condition 2 : n2 > n3
Condition 3 : n1 == n3
Otherwise print false.

Note : This Question is based on learning of logical operators, try to solve this problem without "if-else".


Problem Constraints
-1000000 <= n1, n2, n3 <= 1000000


Input Format
First line is n1
Second line is n2
Third line is n3


Output Format
In First Line : "Number 1 is " then n1.
In Second Line : "Number 2 is " then n2.
In Third Line : "Number 3 is " then n3.
In Fourth Line print "true", if atleast single condition is true Otherwise print false.


Example Input
Input 1 :
57
82
80

Input 2 :
55
78
98


Example Output
Output 1 :
Number 1 is 57
Number 2 is 82
Number 3 is 80
true

Output 2 :
Number 1 is 55
Number 2 is 78
Number 3 is 98
false


Example Explanation
Explanation 1 :
n1(55) is not smaller than 50 but n2(82) is greater than n3(80) so if second condition is true, output is true. If any single condition is true then no need to check next conditions.

Explanation 2 :
n1(55) is not less than 50, n2(78) is not greater than n3(98) and n1(55) is not equal to n3(98) so not a single condition is true here, that's why we print false
 */
import java.lang.*;
import java.util.*;

public class Attempt_3_Contest_Q2 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println("Number 1 is "+n1);
        int n2=sc.nextInt();
        System.out.println("Number 2 is "+n2);
        int n3=sc.nextInt();
        System.out.println("Number 3 is "+n3);
        if(n1<50)
            System.out.println(true);
        else if(n2>n3)
            System.out.println(true);
        else if(n1==n3)
            System.out.println(true);
        else
            System.out.println(false);
        
    }
} 