import java.util.*;
class StringEqual
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
System.out.print("Enter string:");
str=sc.next();
int u=0,l=0,d=0,s=0;
char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(Character.isUpperCase(ch[i]))
u++;
else if(Character.isLowerCase(ch[i]))
l++;
else if(Character.isDigit(ch[i]))
d++;
else
s++;
}
if(u==l&&d==s)
System.out.println("Yes");
else
System.out.println("No");
}}
