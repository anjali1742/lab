//wrp to demo number sequences
//Anjali Ajith CG BATCH 2576

class NumberSequences

{

public static void main(String[]args)

{

int a = 1;

int b = 4;

int c = 7;

int n = 10;

for(int i = 1; i <= n; i++)

{

int d = a + b + c;

System.out.println(a + " " + b + " " + c + " " + d );

System.out.println(" ");

a = d;

b = b + 1;
 }
 
 }
 
 }