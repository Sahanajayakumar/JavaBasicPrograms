import java.lang.*;
import java.util.*;
class STACK
{
int st[]=new int[10];
int top;
int size;
STACK()
{
top=-1;
size=5;
}
void push(int item)
{
if(top==size-1)
System.out.println("Stack overflow...");
else
{
st[++top]=item;
}
}
void pop()
{
if(top==-1)
System.out.println("Stack underflow...");
else
{
System.out.println("Item popped=" +st[top--]);
}
}
void display()
{
if(top==-1)
{
System.out.println("Stack Underflow");
}
else
{
for(int i=0;i<=top;i++)
{
System.out.println(+st[i]);
}
}
}
}
public class PROGRAM1B
{
public static void main(String args[])
{
STACK Ob=new STACK();//creating the object Ob for class STACK
Scanner read=new Scanner(System.in);//read-object of class Scanner
for(;;)
{
System.out.println("Enter 1:Push 2:Pop 3:Display 4:Exit");
int ch=read.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter item");
int item=read.nextInt();
Ob.push(item);
break;

case 2:
Ob.pop();
break;

case 3:
System.out.println("Stack contains...");
Ob.display();
break;

default:return;

}
}
} 
}
