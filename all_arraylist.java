
import java.util.*;
public class all_arraylist extends ArrayList<String>{
    public static void main(String[]args){
//1:add(),2.sort() methode and traverse using for loop

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("mango");
        fruits.add("orange");//adding
        System.out.println(fruits);
        Collections.sort(fruits);//sorting
        System.out.println(fruits);
       

        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        System.out.println(number);
        for(Integer sort1:number) //Traversing list through the for-each loop  
        System.out.println(sort1);
        System.out.println("\n\n");

//3:addAlll() methode
        List<Integer> Number1 = new ArrayList<>();
        Number1.add(2);
        Number1.add(3);
        Number1.add(5);
        Number1.add(7);
        Number1.add(11);
        List<Integer>Num = new ArrayList<>(Number1);
        List<Integer> Number2 = new ArrayList<>();
        Number2.add(13);
        Number2.add(17);
        Number2.add(19);
        Number2.add(23);
        Number2.add(29);
        Num.addAll(Number2);//adding
        System.out.println(Num+"\n\n");

//4:isEmpty(),5.size(),6.set(),7.get()methode
        List<String> Languages = new ArrayList<>();
        System.out.println("Is my list is Empty Before adding element ? "+Languages.isEmpty());//isEmpty()
        Languages.add("C");
        Languages.add("C++");
        Languages.add("Java");
        Languages.add("Python");
        Languages.add(".net");
        System.out.println("My Added list are  : "+Languages);
        System.out.println("There are "+Languages.size()+" language in the given list");
        String print_dotnet=Languages.get(Languages.size()-1);
        System.out.println("Last language in the list is"+print_dotnet);//size()
        Languages.set(0,"c#");//set()
        String set_lang=Languages.get(0);
        System.out.println("c is changed to c# using set() : "+set_lang);
        String get_java_lang_out=Languages.get(2);//get()
        System.out.println("Acessing our fav language :"+get_java_lang_out+"\n\n"); 


//8.:remove(),9.10.removeAll(integer,object),11.clear() methode

        List<String> color = new ArrayList<>();
        color.add("Blue");
        color.add("Red");
        color.add("Orange");
        color.add("Black");
        color.add("White");
        color.add("Yellow");
        System.out.println("my color : "+color);
        color.remove(3);//index
        color.remove("Yellow");//element
        System.out.println("After removing Black  and yellow color  ,Remaining color are : "+color);
        List < String > new_color  = new ArrayList < > (color);
        List<String> add_color = new ArrayList<>();
        add_color.add("Gold");
        add_color.add("Silver");
        add_color.add("Copper");
        new_color.addAll(add_color);
        System.out.println("Added a new color in the  list : "+new_color);
        new_color.removeAll(add_color);
        System.out.println("After removed the added color : "+new_color);
        new_color.clear();
        System.out.println("After using clear() list will be : " + new_color);

//12:indexOf(),13.lastIndexOf()

        List<Integer> check_List = new ArrayList<>();
        check_List.add(100);
        check_List.add(200);
        check_List.add(300);
        check_List.add(200);
        check_List.add(300);
        check_List.add(500);
        System.out.println("My check list are  : "+check_List);
        int index = check_List.indexOf(400);
        System.out.println("index ofelement 400  is --->" + index);
        int lastIndex = check_List.lastIndexOf(100);
        System.out.println(" lastIndex 100 --->" + lastIndex+"\n\n");


//14.Iterating
//a.element iterates in reverse order 
//b.for loop
//c.forEach()
//d.forEachRemaining()
/*The method hasPrevious( ) in ListIterator returns true if there are more elements
 in the List while traversing in the reverse direction*/
/*The Lambda expression is used to provide the implementation of an interface which has functional interface. It saves a lot of code. In case of lambda expression,
  we don't need to define the method again for providing the implementation,[ is a new and important feature of Java which was included in Java SE 8]*/

        ArrayList<String> names=new ArrayList<>();
        names.add("john");
        names.add("Antony");
        names.add("Rick");
        names.add("Jack");
        names.add("Rolex");
        System.out.println(names);
        ListIterator<String>lst =names.listIterator(names.size());  
              while(lst.hasPrevious())  
              {  
                  String reverse=lst.previous();  
                  System.out.println(reverse); //reverse
              }System.out.println("\n");

        for(int i=0;i<names.size();i++)  
           {  
            System.out.println(names.get(i)); //iterate using for loop
           }System.out.println("\n");

/*The arrow operator is used to create lambda expressions, linking/separating parameters with the lambda body.
 syntax: (parameters) -> {expression}; */

        names.forEach(a->{ //Here, we are using lambda expression  
                System.out.println(a);  //forEach()
              });   System.out.println("\n");

        lst.forEachRemaining(a-> //Here, we are using lambda expression  
              {  
            System.out.println(a); }); System.out.println("\n\n");

//15.retainAll() methode--> It retains only those elements of an ArrayList that are present in the Collection that is passed to the method.
        ArrayList<String> pets=new ArrayList<String>();  
        pets.add("cat");  
        pets.add("dog");  
        pets.add("parret");
        pets.add("fish");
        ArrayList<String>pet = new ArrayList<>(pets);  
        ArrayList<String> pets1=new ArrayList<String>();  
        pets1.add("fish");  
        pets1.add("dog");  
        pet.addAll(pets1);
        System.out.println(pet);
        pets.retainAll(pets1);  
        System.out.println(pets1);

//16.contain() methode
        ArrayList<Character> alphabets=new ArrayList<Character>();  
        alphabets.add('A');  
        alphabets.add('B');  
        alphabets.add('C');
        alphabets.add('D');
        boolean ans=alphabets.contains('A');
        if(ans==true){
                System.out.println("alphabets contain given character ");
        }
        else{
               System.out.println("alphabets does not contain given character "); 
        }
//17.containsAll() methode
        ArrayList<Character> alphabets1=new ArrayList<Character>();  
        alphabets1.add('A');  
        alphabets1.add('B');  
        alphabets1.add('C');
        alphabets1.add('D');
        ArrayList<Character> alphabets2=new ArrayList<Character>(); 
        alphabets2.add('A');  
        alphabets2.add('B');  
        alphabets2.add('Z');
        alphabets2.add('D'); 
        boolean answer=alphabets1.containsAll(alphabets2);
        if(answer==true){
                System.out.println("alphabets1 contain all  character in alphabets2 ");
        }
        else{
               System.out.println("alphabets1 does not contain all  character in alphabets2  "); 
        }

//18.equals()
        ArrayList<Integer> lista=new ArrayList<Integer>();  
        lista.add(1);  
        lista.add(2);  
        lista.add(3);
        lista.add(4);
        ArrayList<Integer> listb=new ArrayList<Integer>(); 
        listb.add(1);  
        listb.add(2);  
        listb.add(3);
        listb.add(4); 
        boolean answers=lista.equals(listb);
        if(answers==true){
                System.out.println("list a is equals to listb");
        }
        else{
               System.out.println("lista is not equals to listb  "); 
        }
//19.getclass()methode
//getClass() in Java is a method of the Object class present in java. lang package. getClass() returns the runtime class of the object 


        Object obj1 = new Object();
        System.out.println("Class of obj1: " + obj1.getClass());

    // getClass() with String
        String obj2 = new String();
        System.out.println("Class of obj2: " + obj2.getClass());

    // getClass() with ArrayList
        ArrayList<Integer> obj3 = new ArrayList<>();
        System.out.println("Class of obj3: " + obj3.getClass());

//20.hashcode() methode
//The hashCode() method is used to generate the hash values of objects. Using these hash values, these objects are stored in Java collections such as HashMap, HashSet and HashTable
        ArrayList<String> al = new ArrayList<String>();

        for(int i=0;i<15;i++){
         al.add("Temp"+i);
         System.out.println("Hashcode for "+i+" element "+al.hashCode());
        }

//21.ListIterator() methode
//b.listIterator(int index) methode
        try {
        ArrayList<String> arrlist = new ArrayList<String>();
        arrlist.add("A");
        arrlist.add("B");
        arrlist.add("C");
        arrlist.add("D");
        System.out.println("ArrayList: " + arrlist);
        ListIterator<String>iterator = arrlist.listIterator();
        System.out.println("Using ListIterator:");
        while (iterator.hasNext()) {
            System.out.println("Value is : " + iterator.next());
        }  }
        catch (NullPointerException e) {
        System.out.println("Exception thrown : " + e);}

        //b
        
        try {
        ArrayList<String> arrlist = new ArrayList<String>();
        arrlist.add("A");
        arrlist.add("B");
        arrlist.add("C");
        arrlist.add("D");
        System.out.println("/nArrayList: "+ arrlist);
        ListIterator<String>iterator = arrlist.listIterator(2);
        System.out.println("\nUsing ListIterator"+ " from Index 2:\n");
        while (iterator.hasNext()) {
        System.out.println("Value is : " + iterator.next());
        }}
        catch (IndexOutOfBoundsException e) {
                System.out.println("Exception thrown : " + e);}



//22.remove if() methode
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(15);
        Numbers.add(32);
        Numbers.add(45);
        Numbers.add(63);
        Numbers.removeIf(n -> (n % 3 == 0));
        for (int i : Numbers) {
                System.out.println(i);}


//23. replaceAll() methode
     ArrayList<String> languages = new ArrayList<>();
     languages.add("java");
     languages.add("javascript");
     languages.add("swift");
     languages.add("python");
     System.out.println("ArrayList: " + languages);

     // replace all elements to uppercase
     languages.replaceAll(e -> e.toUpperCase());
     System.out.println("Updated ArrayList: " + languages);


//24.clone() methode

        // ArrayList<String> c1= new ArrayList<String>();
        // c1.add("Red");
        // c1.add("Green");
        // c1.add("Black");
        // c1.add("White");
        // c1.add("Pink");
        // System.out.println("Original array list: " + c1);
        // ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
        // System.out.println("Cloned array list: " + newc1); 

        ArrayList<Integer> prime = new ArrayList<>();
        prime.add(2);
        prime.add(3);
        prime.add(5);
        System.out.println("Prime Number: " + prime);
        System.out.println("Return value of clone(): " + prime.clone());

//25.spliterator()methode
        ArrayList<String> NAME = new ArrayList<>();
        NAME.add("Kumar");
        NAME.add("Bob");
        NAME.add("Raj");
        NAME.add("David");
        NAME.add("Eve");
        System.out.println("PRiNT NAME: " +NAME);
        Spliterator<String> spliterator= NAME.spliterator();
        spliterator.forEachRemaining(System.out::println);

//stream()methode
//There are two types of java streams: Byte Stream and Character Stream. Byte streams are used to perform input and output of 8-bit bytes. When we want to read/write binary data, we can use byte streams. The character stream is used to perform 16-bit Unicode input and output operations.

//26.sublist() methode
try {
  
        // Creating object of ArrayList<Integer>
        ArrayList<String>arrlist = new ArrayList<String>();
        arrlist.add("A");
        arrlist.add("B");
        arrlist.add("C");
        arrlist.add("D");
        arrlist.add("E");
        System.out.println("Original arrlist: "+ arrlist);
        List<String> arrlist2 = arrlist.subList(2, 4);
        System.out.println("Sublist of arrlist: " + arrlist2);}
    catch (IndexOutOfBoundsException e) {
        System.out.println("Exception thrown : " + e);}
    catch (IllegalArgumentException e) {
        System.out.println("Exception thrown : " + e);}


//27.toArray() methode
        ArrayList<Integer> ArrLis= new ArrayList<Integer>();
        ArrLis.add(32);
        ArrLis.add(67);
        ArrLis.add(98);
        ArrLis.add(100);
        System.out.println("ArrayList: " + ArrLis);
        Object[] arr = ArrLis.toArray();
        System.out.println("Elements of ArrayList" + " as Array: "+ Arrays.toString(arr));
//28.tostring() methode
        ArrayList < String > list = new ArrayList <> ();
        list.add ("asd");
        list.add ("qwe");
        list.add ("qwed");
        list.add ("qaz");
        list.add ("wsdc");
        System.out.println (list);
        // convert arraylist to string using toString() method
        String result = list.toString ();
        System.out.println ("The new string is : " + result);


//29.ensurecapacity()
        try {
        ArrayList<Integer>arrlist = new ArrayList<Integer>();
        arrlist.add(10);
        arrlist.add(20);
        arrlist.add(30);
        arrlist.add(40);
        System.out.println("ArrayList: " + arrlist);
        arrlist.ensureCapacity(10000);
        System.out.println("ArrayList can now"+ " surely store upto"+ " 10000 elements.");}
        catch (NullPointerException e) {
        System.out.println("Exception thrown : " + e);}

//30.containAll()methode

        List<String> cl = new ArrayList<String>();
        cl.add("Welcome");
        cl.add("To");
        cl.add("Geeks");
        cl.add("4");
        cl.add("Geeks");
        System.out.println("List: " + cl);
        List<String> listTemp = new ArrayList<String>();
        listTemp.add("Geeks");
        listTemp.add("4");
        listTemp.add("Geeks");
        System.out.println("Are all the contents equal? "+ cl.containsAll(listTemp));
//31.trimtosize()
        ArrayList<Integer> trim = new ArrayList<Integer>(9);
        // using add(), add 5 values
        trim.add(2);
        trim.add(4);
        trim.add(5);
        trim.add(6);
        trim.add(11);
        // trims the size to the number of elements
        trim.trimToSize();
        System.out.println("The List elements are:");
        for (Integer trimsize : trim) {
            System.out.println("Number = " + trimsize);}

//32.removeRange()
all_arraylist arr0 = new all_arraylist();
arr0.add("kkk");
arr0.add("jjj");
arr0.add("lll");
arr0.add("uuu");
arr0.add("ooo");
arr0.add("eee");
System.out.println("The list before using removeRange:" + arr0);
arr0.removeRange(0, 2);
System.out.println("The list after using removeRange:" + arr0);

///few more methode of arraylist 

/*notify()
  notifyall()
  parallelstream()
  stream()
  wait()
*/
}
}





