/*Multiples of 4
Problem Description

Given an integer input N, print all multiples of 4 less than or equal to N.</div>

Problem Constraints

<div id=problem_constraints_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “>1 <= N <= 10000</div>

Input Format

<div id=input_format_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “>Single line containing an integer N.</div>

Output Format

<div id=output_format_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “>Space separated integers representing multiples of 4 less than or equal to N.</div>

Example Input

<div id=example_input_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “>22</div>

Example Output

<div id=example_output_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “>4 8 12 16 20</div>

Example Explanation

<div id=example_explanation_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “>1 * 4 = 4

2 * 4 = 8

3 * 4 = 12

4 * 4 = 16

5 * 4 = 20



All are multiples of 4 less than 22</div>


User Code */
 import java.lang.*;
import java.util.*;

public class Attempt_3_Contest_Q3 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int res=0;
        res=N%4;
        N=N-res;
        for(int i=4;i<=N;i=i+4)
            System.out.print(i+" ");
        
    }
} 