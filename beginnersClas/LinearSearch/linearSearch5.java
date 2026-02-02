package LinearSearch;


import java.util.*;
public class linearSearch5
{
public static void main(String[] args) {
String word="GrandMOther";
char characters []=word.toCharArray();
System.out.println(Arrays.toString(characters));
char target='r';
int count=0;
for(char ch: characters)
{
if(ch==target)
{
count++;
}
}
System.out.println(count);
}
}
