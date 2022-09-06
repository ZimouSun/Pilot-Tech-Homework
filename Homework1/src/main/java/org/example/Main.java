package org.example;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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
    public static void runSameTime() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<String> ma = service.submit(new A());
        Future<String> mb = service.submit(new B());
        boolean allDone= false;
        while(!allDone)
        {
            if(ma.isDone()&& mb.isDone())
            {
                System.out.println(mb.get()+" "+ma.get());
                allDone=true;
            }
        }
        return;
    }
    public static final class Happy{
        private static final int score =100;

        public static final void changeScore()
        {
            //score=1;
        }
    }
    public static final class A implements Callable
    {
        @Override
        public Object call() throws Exception {
            return getMethod();
        }

        public  String getMethod()
        {
            return "A.getMethod";
        }
    }
    public static final class B implements Callable
    {
        @Override
        public Object call() throws Exception {
            return getMethod();
        }
        public String getMethod()
        {
            return "B.getMethod";
        }
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
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

        //Collection
        //Problem 1
        ArrayList<String> a=new ArrayList<String>(Arrays.asList("a","b","c"));
        ArrayList<String> b=new ArrayList<String>(Arrays.asList("a","b"));
        Set<String> trueFriend = new HashSet<String>(a);
        trueFriend.retainAll(b);
        Iterator<String> it = trueFriend.iterator();
        System.out.println("\n Collection Problem 1 ");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //Problem 2
        System.out.println("\n Collection Problem 2 :");
        String str1= "sdjjsljfldsjfdk";

        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for( int i=0; i<str1.length();i++)
        {
            Character c = str1.charAt(i);
            if(map.get(c)!=null)
            {   Integer k = map.get(c);
                map.put(c,++k);
            }
            else {
                map.put(c,1);
            }
        }
        for( Character c : map.keySet())
        {
            Integer i = map.get(c);
            if(i!=null && i >1);
            {
                System.out.println(c +" "+i);
            }
        }

        //Problem 3
        System.out.println("\nCollection Problem 3");
        Map<Integer,String> database = new HashMap<Integer, String >();
        //Create
        database.put(1,"this is the first record");
        //Read
        database.get(1);
        //Update
        database.put(1,"this is the first record  update");
        //Delete
        database.remove(1);

        //ExecutorService
        //Problem 1
        System.out.println("\nExecutorService Problem 1 ");
        runSameTime();

        //Java8
        //Problem 1
        VisaCard v=new VisaCard("alan",123,111);
        MasterCard mc=new MasterCard("alan",123,111);
        v.payBill_2(1);
        CreditCard_2.refund(12);





    }
}
//Java 8

class MyStream {
    public interface Multi
    {
        public int multiple(int i);
    }
    public static List<Integer> MyMap(List<Integer> list)
    {
       List<Integer> a = list.stream().map(o->o*3).collect(Collectors.toList());

       return a;
    }
    public static void main(String args[])
    {

        Multi m = (i)-> i*3;
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        List<Integer> result = MyStream.MyMap(l);
        for(Integer i : result)
        {
            System.out.println(i);
        }
    }
}
//Exception Handling

 class CardTypeException extends Exception
{
    CardTypeException(String msg)
    {
        super(msg);
    }
}
class AddressException extends Exception
{
    AddressException(String msg)
    {
        super(msg);
    }
}
class ExceptionHandler
{
    static void handleException(String cardType, String address)
    {
       try {
            if (!cardType.equals("AMEX")) {
                throw new CardTypeException("Not AMEX");
            }
            if(!address.equals("US"))
            {
                throw new AddressException("Not US");
            }
        } catch (CardTypeException e) {
           System.out.println(e);
       } catch (AddressException e) {
           System.out.println(e);
       }catch (Exception e)
       {
           System.out.println(e);
       }

    }
    public static void main(String[] args)
    {
        ExceptionHandler.handleException("AMEX","US");
        ExceptionHandler.handleException("AEX","US");
        ExceptionHandler.handleException("AMEX","U");
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
interface CreditCard_2
{

    default void payBill_2(double bill)
    {
       System.out.println("pay "+bill);
    }

    static void refund(double amount)
    {
        System.out.println("refund "+amount);
    }

}
class VisaCard extends CreditCard implements CreditCard_2
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
class MasterCard extends CreditCard implements CreditCard_2
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
    //print
    public void update(){
        System.out.println("Parking:");
        for(Car c : lots.keySet()) {
            System.out.println(c.name +" at " +lots.get(c));
        }
        System.out.println();

    }


    //Enter the parking
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
            update();
            return true;
        }

    }

     //Exit the parking
     public void Exit(Car c)
     {



         Integer index = lots.get(c);
         lots.remove(c);
         availables.add(index);
         update();



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

         @Override
         public boolean equals(Object o) {
             if (this == o)
                 return true;
             if (o == null || getClass() != o.getClass())
                 return false;
             Car that = (Car) o;
             return that.name.equals(this.name);
         }

         @Override
         public int hashCode() {
             return this.name.hashCode();
         }

     }
     public static void main(String[] args)
     {
         ParkingLot p = new ParkingLot();
         Car a=new Car("a");
         p.Enter(a);
         p.Enter(new Car("b"));
         p.Exit(a);
     }
}