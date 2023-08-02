import java.util.*; 
public class API_score {

double UG_scored (double x)
{

if(x>=80){

return 15;

}

else if((x<=79)&&(x>=60)) {

return 13;

}
 else if((x<=56)&&(x>=46)){

return 10;

}
else

{
return 5;
}
}

double PG_score (double y)

{
if(y>=80){

return 25;

}
else if((y<=79)&&(y>=60))

{

return 23;

}
else

{

return 20;
}
}
int Phd_score(boolean a)

{

if(a==true)

{

return 30 ; 
}

else

{

return 0;

}
}
int Net_score(boolean a) {

if(a==true){

return 7;

}
else

{

return 0;
}

}

public static void main(String[] args)

{

Scanner sc = new Scanner (System.in);
API_score obj = new API_score();
boolean Phd=false, NET=false; 
double UG_per=0, PG_per=0, total;  
int choice, phd, net;
System.out.println("\t\t NAME = Mayank Pratap Jadoun \n\t\t SAP ID -1000014272\n");
do
{


System.out.println("*********************MAIN MENU**********************************************************");

System.out.println("_________________________________________________________________________________________");
System.out.println("1. Input Percentage Of Each Level wise Score");
System.out.println("2. Diplay Level Wise Score");
System.out.println("3. Display Total Score ");
System.out.println("4. Check Eligiblity for Job ");
System.out.println("5. Exit");
System.out.println("________________________________________________________________________________________");
System.out.println("Enter above choice");



choice= sc.nextInt (); 
switch(choice)

{

case 1:

System.out.println("Enter your UG Precentage :"); 
UG_per= sc.nextDouble();
System.out.println("Enter your PG Percentage :");
PG_per = sc.nextDouble();
 System.out.println("Phd \n 1-Yes\n 0-No");

phd = sc.nextInt ();

if (phd==1)

{

Phd=true;

}

else

{

Phd=false;

}

System.out.println("NET \n 1-Yes\n 0-No");

net = sc.nextInt (); 
if(net==1)

{
NET=true;
}



else

{

NET=false;
}

break;

case 2:

System.out.println("UG Score is = "+obj.UG_scored (UG_per)); 
System.out.println("PG Score is = "+obj.PG_score (PG_per));

if((Phd==true)&&(NET==true)){


System.out.println("phd Score="+obj.Phd_score(Phd)+"\n Net Score="+obj.Net_score (NET));


}

else if (Phd==true){

System.out.println("Phd Score = "+obj.Phd_score (Phd));
}

else if((NET==true))

{

System.out.println("Net Score ="+obj.Net_score (NET));
}
else{

System.out.println("No Data for Phd And Net");

}
break;

case 3:

System.out.println("Total Score :"+(obj.UG_scored (UG_per) +obj.PG_score (PG_per) +obj.Phd_score (Phd) +obj.Net_score(NET))); 
break;

case 4:
total=obj.UG_scored (UG_per) +obj. PG_score (PG_per) +obj.Phd_score (Phd) +obj.Net_score(NET);
 if (total >65){
System.out.println("You Are Eligiable For The Job");
}

else
{
System.out.println("You Are Not Eligiable For The Job");

}

break;

case 5:

System.out.println(" Thank you Programme Ended");

break;

default:

System.out.println("Please Enter valid percentage!");
}


System.out.println("________________________________________________________________________________________");
 }while(choice!=5);

}

}