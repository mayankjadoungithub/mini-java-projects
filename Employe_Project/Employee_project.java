import java.util.*;
public class Employee_project
{
int empno; //Instance Variable
String empname;
String dept;
int basic;
double DA,HRA,grosssal;

static String companyname="Taj Mahal Services"; //static variable to store name of the company
void Input(int emno,String emnm,String dep,int bas,double da ,double hra,double gross,int n) // funtion to take input of the data of each employee
{
empno=emno;
empname=emnm;
dept=dep;
basic=bas;
DA=da;
HRA=hra;
grosssal=gross;
}
void search(Employee_project ob,int no,int n) // function to search the employee by employee number
{
int i;
for(i=0;i<n;i++)
{
if(ob.empno==no)
{
System.out.println("EMPLOYEE NUMBER"+ " "+ "EMPLOYEE NAME"+" "+"DEPARTMENT"+" "+"GROSS SALARY"+" "+"BASIC SALARY"+" "+"DEARNRSS ALLOWENCE"+" "+"HOUSE RENT ALLOWENCE"+" "+"COMPANY NAME");
System.out.print(" "+ob.empno+" "+ob.empname+" "+ob.dept+" "+ob.grosssal+" "+ob.basic+" "+ob.DA+" "+ob.HRA+" "+companyname);
System.out.println(" ");
break;
}
}
if(i>n)
System.out.println("The employee no which you have searched is not present.");
System.out.println(" ");



}
void deptsort(Employee_project ob[],int n) //fuction to sort the data by their repective department
{
Employee_project temp=new Employee_project();
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(ob[i].dept.compareTo(ob[j].dept)>0)
{
temp=ob[j];
ob[j]=ob[i];
ob[i]=temp;
}
}
}
}
void empnosort(Employee_project ob[],int n) //function to sort the data of each employee by employee number.
{

Employee_project temp=new Employee_project();
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(ob[i].empno<(ob[j].empno))
{
temp=ob[j];
ob[j]=ob[i];
ob[i]=temp;
}
}
}
}
public static void main(String args[])
{
Scanner I=new Scanner(System.in);
System.out.print("Enter the number of Employee data you want to store(1-100):");
int n=I.nextInt();
Employee_project e1[]=new Employee_project[n]; // array object
for(int i=0;i<n;i++)
{
e1[i]=new Employee_project();
}
for(int i=0;i<n;i++)
{
System.out.print("\nEnter the employee number:");
int emno=I.nextInt();
System.out.print("\nEnter the employee name:");
String emnm=I.next();
System.out.print("\nEnter the employee department:");
String dep=I.next();
System.out.print("\nEnter the employee salary between( 1000- 15000):");
int bas=I.nextInt();
System.out.println(" ");
double da=(120*bas)/100;
double hra=(20*bas)/100;
double gross=(bas+da+hra);
e1[i].Input(emno,emnm,dep,bas,da,hra,gross,n);
}
while(true)
{



int ch;
System.out.println(" ");
System.out.println("----Welcome to the Taj Mahal Services ----");
System.out.println(" ");
System.out.println("Press 1 to search employee by employee number and display his/her data");
System.out.println("Press 2 display employee data sorted by dept (table form)");
System.out.println("Press 3 display employee data sorted by empno in descending order (table form)");
System.out.println("Press 4 to Exit");
System.out.print("Please enter your choice:");
ch=I.nextInt();
System.out.println(" ");
System.out.println(" ");
switch(ch)
{
case 1:
System.out.print("Enter the employee number you want to search:");
int no=I.nextInt();
for(int i=0;i<n;i++)
{
e1[i].search(e1[i],no,n);
}
break;

case 2:
for(int i=0;i<n;i++)
{
e1[i].deptsort(e1,n);
}
System.out.println("EMPLOYEE NUMBER"+ " "+ "EMPLOYEE NAME"+" "+"DEPARTMENT"+" "+"GROSS SALARY"+" "+"BASIC SALARY"+" "+"DEARNRSS ALLOWENCE"+" "+"HOUSE RENT ALLOWENCE"+" "+"COMPANY NAME");
for(int i=0;i<n;i++)
{
System.out.println(" "+e1[i].empno+" "+e1[i].empname+" "+e1[i].dept+" "+e1[i].grosssal+" "+e1[i].basic+" "+e1[i].DA+" "+e1[i].HRA+" "+companyname);
System.out.println(" ");
}
System.out.println(" ");



break;

case 3:
for(int i=0;i<n;i++)
{
e1[i].empnosort(e1,n);
}
System.out.println("EMPLOYEE NUMBER"+ "\t"+ "EMPLOYEE NAME"+"\t"+"DEPARTMENT"+"\t"+" GROSS SALARY "+"\t"+"BASIC SALARY"+"\t"+"DEARNRSS ALLOWENCE"+"\t"+"HOUSE RENT ALLOWENCE"+"\t"+" COMPANY NAME ");
for(int i=0;i<n;i++)
{
System.out.println(" "+e1[i].empno+" "+e1[i].empname+" "+e1[i].dept+" "+e1[i].grosssal+" "+e1[i].basic+" "+e1[i].DA+" "+e1[i].HRA+" "+companyname);
System.out.println(" ");
}
System.out.println(" ");
break;

case 4:
System.exit(0);
break;

default:
System.out.println("Wrong Input");
System.out.println("Please enter the correct choice");
continue;

} }
}
}