import java.util.*;
class stock
{
    static String company_name = "Taj Mahal Enterprise";
    int itemno, qty=5;
    static int n;
    String itemname;
    static Scanner sc = new Scanner(System.in);
    void input(stock a)
    {
        System.out.println("Enter the item number");
        a.itemno = sc.nextInt();
        System.out.println("Enter the item name");
        sc.nextLine();
        a.itemname = sc.nextLine();
        while(true)
        {
            System.out.println("Enter the quantity");
            a.qty = sc.nextInt();
            if(qty>=5)
                break;
            System.out.println("The quantity of any product can not be less than 5");
        }
    }

    static int search(stock a[], int s)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i].itemno == s)
            {
                return i;
            }
        }
        return -10;
    }

    static void sortName(stock[] a)
    {
        stock t= new stock();
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j].itemname.compareTo(a[i].itemname)<0)
                {
                    t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
            }
        }
    }

    static int search(stock[] a, String n)
    {
        int first =0;
        int last = a.length-1;
        int mid = (first + last)/2;  
        while( first <= last )
        {  
            if ( (a[mid].itemname).compareTo(n) < 0 )
            {  
                first = mid + 1;     
            }
            else if ( (a[mid].itemname).compareTo(n) == 0 )
            {  
                return mid; 
            }
            else
            {  
                last = mid - 1;  
            }  
            mid = (first + last)/2;  
        }    
        return -10;  
    }

    public static void main(String args[])
    {
       System.out.println(" Welcome to Taj Mahal Enterprise ");
        System.out.println("Enter the number of items: ");
        n = sc.nextInt();
        stock ob[] = new stock[n];
        for(int i=0;i<n;i++)
        {
            ob[i] = new stock();
        }
        while(true)
        {
            System.out.println("Enter your choice:");
            System.out.println("1. Input n items in stock where qty>=5 min\n2. Search item in stock by itemno\n3. Display stock data sorted by itemname\n4. Issue item in stock\n5. Return item to stock\n6. Exit");
            int ch = sc.nextInt();
            int s,index;
            String f;
            switch(ch)
            {
                case 1:
                for(int i=0;i<n;i++)
                {
                    ob[i].input(ob[i]);
                }
                stock.sortName(ob);
                break;
                case 2:
                System.out.println("Enter the item number to be searched");
                s = sc.nextInt();
                index = search(ob,s);
                if(index!=-10)
                {
                    System.out.println("Item no. \t Item name \t Quantity");
                    System.out.println("\t"+ob[index].itemno+" \t "+ob[index].itemname+" \t "+ob[index].qty);
                }
                else
                {
                    System.out.println("Not found");
                }
                break;
                case 3:                
                System.out.println("Enter the item name");
                sc.nextLine();
                f = sc.nextLine();
                index = search(ob,f);
                if(index!=-10)
                {
                    System.out.println("Item no. \t Item name \t Quantity");
                    System.out.println("\t"+ob[index].itemno+" \t "+ob[index].itemname+" \t "+ob[index].qty);
                }
                else
                {
                    System.out.println("Not found");
                }
                break;
                case 4:
                System.out.println("Enter the item name to be issued");
                sc.nextLine();
                f = sc.nextLine();
                System.out.println("Enter the quantity");
                s = sc.nextInt();
                index = search(ob,f);
                if(index!=-10)
                {
                    if(ob[index].qty>=5)
                    {
                        if(s<=ob[index].qty)
                        {
                            ob[index].qty -= s;
                            System.out.println(s+" "+ob[index].itemname+" has been issued");
                        }
                        else if(s>ob[index].qty)
                        {
                            System.out.println(ob[index].qty+" "+ob[index].itemname+" is present. Do you want to issue it?");
                            System.out.println("Enter:\n1. To issue\n2. Not issue\n Enter your choice: ");
                            int c = sc.nextInt();
                            switch(c)
                            {
                                case 1:
                                System.out.println(ob[index].qty+" "+ob[index].itemname+" is issued");
                                ob[index].qty=0;
                                break;
                                case 2:
                                System.out.println("Not issued");
                                break;
                                default:
                                System.out.println("Wrong choice");
                            }
                        }
                    }
                    else
                    {
                        System.out.println("The item cannot be issued");
                    }
                }
                else
                {
                    System.out.println("Item not found");
                }
                break;
                case 5:
                System.out.println("Enter the item name you want to return");
                sc.nextLine();
                f = sc.nextLine();
                System.out.println("Enter the quantity you want to return");
                s = sc.nextInt();
                index = stock.search(ob,f);
                if(index!=-10)
                {
                    ob[index].qty+=s;
                    System.out.println("Item returned");
                }
                else
                {
                    System.out.println("Item cannot be returned");
                }
                break;
                case 6:
                System.out.println("You have been exited from the program");
                System.exit(0);
                default:
                System.out.println("Wrong input");
            }
        }
    }
}
