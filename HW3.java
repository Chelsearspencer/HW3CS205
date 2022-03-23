package edu.monmouth.hw3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		
	 try {
              PrintStream logStream = new PrintStream(HW3Constants.OUT_FILE_NAME);
              System.setOut(logStream); 
              System.setErr(logStream);
      } catch (FileNotFoundException e) {
              System.err.println("Failed to redirect STDERR or STDOUT ");
              e.printStackTrace();
              System.exit(1);
      }

        List<String> stringArrayList = new ArrayList<String>();
        List<String> stringLinkedList = new LinkedList<String>();
      
        try {
              
                Scanner file = new Scanner(new File(HW3Constants.FILENAME1));
                
                while (file.hasNext()) {
                      String line = file.nextLine();

                    
                        stringArrayList.add(line);
                        stringLinkedList.add(line);
                }

                	file.close();

        } catch (IOException e) {
                System.err.println("cannot open" + HW3Constants.FILENAME1);
                e.printStackTrace();
                System.exit(1);
        }

        
        List<Book> bookArrayList = new ArrayList<Book>();
        List<Book> bookLinkedList = new LinkedList<Book>();


        try {
               
                Scanner file = new Scanner(new File(HW3Constants.FILENAME2));

               
                while (file.hasNext()) {
                       
                        String line = file.nextLine();

                      

                        
                 String[] bookObjects = line.split(HW3Constants.COMMA);
                 String name = bookObjects[0];

          BookTypes type = null;
                if (bookObjects[1].equals("HARDBACK")) {
                                type = BookTypes.HARDBACK;
                    } else if (bookObjects[1].equals("SOFTBACK")) {
                                type = BookTypes.SOFTBACK;
                    } else if (bookObjects[1].equals("ELECTRONIC")) {
                                type = BookTypes.ELECTRONIC;
                    }

                 int noOfPages = Integer.parseInt(bookObjects[2]);


                 try {
                              
                         Book book = new Book(noOfPages, name, type);
                         bookArrayList.add(book);
                         bookLinkedList.add(book);
                                
                                
                  } catch (BookException e) {
                     System.err.println("cannot create Book object");
                     e.printStackTrace();
                     System.out.println("\n");
                  }
                }

             
                file.close();

        } catch (IOException e) {
            System.err.println("cannot open" + HW3Constants.FILENAME2);
            e.printStackTrace();
            System.exit(1);
        }

        System.out.println("is string array list empty:\n" + stringArrayList.isEmpty() + "\n");
        System.out.println("is book array list empty:\n" + bookArrayList.isEmpty() + "\n");

        System.out.println("(1) removed from string array list :\n" + stringArrayList.remove(1) + "\n");
        System.out.println("(1) removed from book array list :\n" + bookArrayList.remove(1) + "\n");

        System.out.println("string array list size:\n" + stringArrayList.size() + "\n");
        System.out.println("book array list size:\n" + bookArrayList.size() + "\n");

        ////
      
        System.out.println("iterator for string ArrayList:");
        
        for (String string : stringArrayList) {
                System.out.println(string);
        }
        System.out.println("\n");

     
        System.out.println("iterator for string LinkedList");
        
        for (String string : stringLinkedList) {
                System.out.println(string);
        }
        System.out.println("\n");
        

  
        System.out.println("ListIterator for string ArrayList (reverse)");
        
        ListIterator<String> iterator1 = stringArrayList.listIterator(stringArrayList.size());
        while (iterator1.hasPrevious()) {
                System.out.println(iterator1.previous());
        }
        System.out.println("\n");
        

      
        System.out.println(" ListIterator for string LinkedList (reverse)");
        ListIterator<String> iterator3 = stringLinkedList.listIterator(stringLinkedList.size());
     
        while (iterator3.hasPrevious()) {
                System.out.println(iterator3.previous());
        }
        System.out.println("\n");
        
        
        
    //////    

        
        System.out.println("iterator for book ArrayList");
        
        for (Book book : bookArrayList) {
                System.out.println(book);
        }
        System.out.println("\n");
        
        
        
        System.out.println("iterator for book LinkedList");
        
        for (Book book : bookLinkedList) {
                System.out.println(book);
        }
        System.out.println("\n");
        
       
        System.out.println("ListIterator for bookArrayList (reverse)");
        
        ListIterator<Book> iterator2 = bookArrayList.listIterator(bookArrayList.size());
        while (iterator2.hasPrevious()) {
                System.out.println(iterator2.previous());
        }
        System.out.println("\n");



        System.out.println("ListIterator for book LinkedList (reverse)");
        
        ListIterator<Book> iterator4 = bookLinkedList.listIterator(bookLinkedList.size());
        while (iterator4.hasPrevious()) {
                System.out.println(iterator4.previous());
        }
        System.out.println("\n");

      
        

}

}