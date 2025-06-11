/*Voucher Offer
Problem Description

There is a voucher offer at a shopping mart in your city which you can use on booking movie tickets.

The voucher amount depends on your shopping amount. Voucher amount is according to below rules.

If the shopping amount falls between 100 to 500 then the voucher is worth 20.

If the shopping amount falls between 501 to 1000 then the voucher is worth 90.

If the shopping amount falls between 1001 to 2000 then the voucher is worth 199.

If the shopping amount falls between 2001 to 5000 then the voucher is worth 500.

If the shopping amount is more than 5000 then the voucher is worth 999.

If the shopping amount does not lie in any of the above price ranges, there is no voucher.

Problem Constraints

0 <= shopping_amount <= 100000</div>

 </div>

Input Format

In first line take amount as integer input.</div>

 </div>

Output Format

Output is going to be single line answer based on the shopping amount.

If shopping amount falls in any valid ranges then print “You got a voucher of worth voucher_amount”.

Print “No voucher for your shopping” if not in any valid range.

Example Input

Input 1 :

99

 

Input 2 :

145

Example Output

Output 1 :

No voucher for your shopping


Output 2 :

You got a voucher of worth 20

Example Explanation

Explanation 1 :

Since shopping amount is 99, So there is no voucher.


Explanation 2 :

Since price is between 100 to 500, So there is voucher of worth 20

User Code */
import java.lang.*;
import java.util.*;

public class Attempt_3_Contest_Q5 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int shopping_amount=sc.nextInt();
        int voucher=0;
        if(shopping_amount>=100 && shopping_amount<=500)
            voucher=20;
        else if(shopping_amount>=501 && shopping_amount<=1000)
            voucher=90;
        else if(shopping_amount>=1001 && shopping_amount<=2000)
            voucher=199;
        else if(shopping_amount>=2001 && shopping_amount<=5000)
            voucher=500;
        else if(shopping_amount>=5001)
            voucher=999;
        else
            voucher =-1;
            
        if(voucher==-1)
            System.out.print("No voucher for your shopping");
        else    
            System.out.print("You got a voucher of worth "+voucher);
    }
} 