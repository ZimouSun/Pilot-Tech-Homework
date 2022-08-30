package org.example;

import java.io.Serializable;
import java.util.*;

/**
 * Zimou Sun
 * Tue Aug 23 2022
 *
 * Homework1
 */
public class Main {

    public static String[] String_Problem_1 ()
    {
        String input="Algorithms";

        return new String[]{input.substring(2, 4), input.substring(0, 4)};


    }
    public static boolean String_Problem_2(String str1, String str2)
    {
        return str1.equals(str2) && str1.compareTo(str2)==0;
    }
    public static List<String> String_Problem_3()
    {
        String input ="https://www.amazon.com/demo?test=abc";
        String regex = "[:/+.?=]";
        StringTokenizer st= new StringTokenizer(input,regex);
        List<String> tokens = new ArrayList<String>();

        while(st.hasMoreTokens())
        {
            tokens.add(st.nextToken());
        }

        return tokens;
    }

    public static StringBuilder String_Problem_4( List<String[]> listOfStringArray)
    {
        StringBuilder s= new StringBuilder();
        for(String[] sa: listOfStringArray)
        {
            for(String str : sa)
            {
                s.append(str);
            }
        }
    return s;
    }
    public final class Happy{
        private static final int score =100;

        public static final void changeScore()
        {
            //score=1;
        }
    }

    public static void main(String[] args) {
        //String ----------------------------------------------------------------------------------------------
        //Problem 1
        System.out.println("String Problem 1");
        for(String s: String_Problem_1())
        {
            System.out.println(s);
        }

        //Problem 2
        System.out.println("\n"+"String Problem 2");
        System.out.println("hello vs hello :"+String_Problem_2("hello","hello"));
        System.out.println("hello vs Hello :"+String_Problem_2("hello","Hello"));

        //Problem 3
        System.out.println("\n"+"String Problem 3");
        for(String s: String_Problem_3())
        {
            System.out.println(s);
        }
        //Problem 4
        System.out.println("\n"+"String Problem 4");
        String[] strs={"i ","am ","a ","dog,"};
        String[] strs2={"i ","am ","a ","cat ","too !"};
        List<String[]> l = new ArrayList<String[]>();
        l.add(strs);
        l.add(strs2);
        System.out.println(String_Problem_4(l)+"\n");

        //Static-----------------------------------------------------------------------------------------------
        //Problem 2
        System.out.println("Static Problem 2 Display all the books");
        for( BookSeller.Book b : BookSeller.sellBooks())
        {
            System.out.println(b.getId()+" "+b.getName());

        }

        //OOP
        //Problem 1
        OracleConnection o = new OracleConnection();
        DatabaseConnection d = o.getConnection();
        MySqlConnection m = new MySqlConnection();
        DatabaseConnection d2 = m.getConnection();
        //MySqlConnection m2 = m.getConnection(); not complied

        //Problem 2


    }
}
// Given a database table “Book” with columns (id, isbn, name, author, publish date), define a java class that matches this table and then use a static block to initialize this table with some records
class BookTable
{

    private static List<Integer> ids=new ArrayList<Integer>();
    private static List<Integer> isbns=new ArrayList<Integer>();
    private static List<String> names=new ArrayList<String>();
    private static List<String> authors=new ArrayList<String>();;
    private static List<String> publish_dates=new ArrayList<String>();;

    static {

        ids.add(1);
        ids.add(2);

        isbns.add(1);
        isbns.add(2);

        names.add("A");
        names.add("B");

        authors.add("alan");
        authors.add("sun");

        publish_dates.add("1/1/1111");
        publish_dates.add("2/2/2222");


    }

    public static List<Integer> getIds() {
        return ids;
    }

    public static void setIds(List<Integer> ids) {
        BookTable.ids = ids;
    }

    public static List<Integer> getIsbns() {
        return isbns;
    }

    public static void setIsbns(List<Integer> isbns) {
        BookTable.isbns = isbns;
    }

    public static List<String> getNames() {
        return names;
    }

    public static void setNames(List<String> names) {
        BookTable.names = names;
    }

    public static List<String> getAuthors() {
        return authors;
    }

    public static void setAuthors(List<String> authors) {
        BookTable.authors = authors;
    }

    public static List<String> getPublish_dates() {
        return publish_dates;
    }

    public static void setPublish_dates(List<String> publish_dates) {
        BookTable.publish_dates = publish_dates;
    }
}

/*Define a Java class “BookSeller” and then define a static inner class “Book”, and use a static method “sellBooks” to initialize several books, and in the main method display all the books by calling the “sellBooks” method
 */
 class BookSeller
{
    private static List<Book> books = new ArrayList<Book>();
    protected static class Book
    {
        private int id;
        private String name;

        public Book(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static List<Book> sellBooks()
    {
        books.add(new Book(1,"Book1"));
        books.add(new Book(2,"Book2"));
        return books;
    }
}
//Define an interface “DatabaseConnection” and then define class “OracleConnection”, “MySqlConnection”, “SqlServerConnection”. They should all implements the “getConnection” method from the interface. The method should initialize data source and return a database connection.
interface DatabaseConnection{
     DatabaseConnection getConnection();
}
class OracleConnection implements DatabaseConnection
{

    public OracleConnection getConnection()
    {
        return new OracleConnection();
    }
}
class MySqlConnection implements DatabaseConnection
{
    public DatabaseConnection getConnection()
    {
        return new MySqlConnection();
    }
}
class SqlServerConnection implements DatabaseConnection
{
    public SqlServerConnection getConnection()
    {
        return new SqlServerConnection();
    }
}
abstract class CreditCard {
     String holderName;
     int cardNumber;
     double accountBalance;
     String cardType;
     abstract boolean isCardAcceptable(String cardType);
     protected void payBill(double bill){
         accountBalance+=bill;
     }
}
class VisaCard extends CreditCard
{
    public VisaCard(String holderName,int cardNumber,double accountBalance) {
        this.holderName=holderName;
        this.cardNumber= cardNumber;
        this.accountBalance= accountBalance;
        this.cardType="Visa";
    }
    public boolean isCardAcceptable(String cardType)
    {
        return this.cardType.equals(cardType);
    }
}
class MasterCard extends CreditCard
{
    public MasterCard(String holderName,int cardNumber,double accountBalance) {
        this.holderName=holderName;
        this.cardNumber= cardNumber;
        this.accountBalance= accountBalance;
        this.cardType="Master";
    }
    public boolean isCardAcceptable(String cardType)
    {
        return this.cardType.equals(cardType);
    }

    //Static polymorphism
    void print(){

    }
    void print(int a)
    {

    }

    //Dynamic polymorphism
    @Override
    public void payBill(double bill)
    {
        int SERVICE_FEE=1;
        accountBalance+=bill-SERVICE_FEE;
    }
}

 class Employee implements Serializable
{
    // default field
    String name;

    // public field
    public String id;

    // private salary
    private double salary;

    //arg-constructor to initialize fields
    public Employee(String name, String id,
                    double salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // getter method for name
    public String getName()
    {
        return name;
    }

    // getter method for id
    public String getId()
    {
        return id;
    }

    // getter method for salary
    public Double getSalary()
    {
        return salary;
    }
}
//Create a singleton class called “AppleDesignerFactory”
class AppleDesignerFactory
{
    private static AppleDesignerFactory instance;
    private AppleDesignerFactory(){};
    public synchronized AppleDesignerFactory getInstance()
    {
        if(instance==null)
        {
            instance=new AppleDesignerFactory();
        }

        return instance;
    }

    protected Object  clone() throws CloneNotSupportedException
    {
    throw new CloneNotSupportedException();
    }

    protected Object readResolve()
    {
        return instance;
    }

}

 class Currency
{
    String name;

}
class CNY extends Currency{

     CNY()
     {
         name="CNY";
     }

}
class USD extends Currency
{
    public USD() {
        name="USD";
    }
}
class CurrencyExchange{

     public static Currency getCurrency(String country)
     {
         if(country.equals("USA"))
         {
             return new USD();
         }
         if (country.equals("China"))
         {
             return new CNY();
         }
         return null;
     }


}

class ParkingLot{

     private Map<Car, Integer> lots ;
     private Set<Integer> availables; //
     //Constructor

    public ParkingLot() {
        this.lots = new HashMap<Car,Integer>() ;
        this.availables= new HashSet<Integer>() ;
        for(int i=0;i<11;i++)
            availables.add(i);
    }


    //Enter
    public boolean Enter(Car c)
    {
        if(this.availables.isEmpty())
        {
            return false;
        }
        else {
            Iterator<Integer> i= this.availables.iterator();
            Integer index = i.next();
            lots.put(c,index);
            availables.remove(index);
            return true;
        }

    }

     //Exit
     public void Exit(Car c)
     {



         Integer index = lots.get(c);
         lots.remove(index);
         availables.add(index);



     }

     protected static class Car
     {
         String name;

         public Car(String name) {
             this.name = name;
         }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

     }
}