package edu.monmouth.hw6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class HW6 {
          public static void main(String[] args) {
           // try-catch block for proper exception handling
                try {
                        // Create a stream of HW6.txt file to redirect standard err and out
                        PrintStream logStream = new PrintStream(HW6Constants.OUT_FILE_NAME);
                        // Redirect standard out to HW6.txt
                        System.setOut(logStream);
                        // Redirect standard err to HW6.txt
                        System.setErr(logStream);
                        
                } catch (FileNotFoundException e) {
                        // If failed to redirect err and out to HW6.txt
                        System.err.println("Failed to redirect STDERR or STDOUT ");
                        e.printStackTrace();
                        System.exit(1);
                }
  // Declare an ArrayList to hold objects of String
                List<String> stringArrayList = new ArrayList<String>();
                // Declare an LinkedList to hold objects of String
                List<String> stringLinkedList = new LinkedList<String>();

                // try-catch block for proper exception handling
                try {
                        // Open the String.txt file for reading
                        Scanner file = new Scanner(new File(HW6Constants.FILENAME1));

                        // Read strings line-by-line
                        while (file.hasNext()) {
                                // Read a line
                                String line = file.nextLine();

                                System.out.println("Read '" + line + "' from " + HW6Constants.FILENAME1 + " file.\n");

                                // Add the line String object to ArrayList stringArrayList
                                stringArrayList.add(line);

                                // Add the line String object to LinkedList stringLinkedList
                                stringLinkedList.add(line);
                        }

                        // Close the file
                        file.close();

                } catch (IOException e) {
                        // If failed to open String.txt file
                        System.err.println("Failed to open '" + HW6Constants.FILENAME1 + "' file.");
                        e.printStackTrace();
                        System.exit(1);
                }
                      //Creating a TreeSet that can only house Book objects
                Iterator<Book> iterator = booksTreeSet.iterator();
                System.out.print("Tree set data: ");

                    
           // try-catch block for proper exception handling
                try {
                        // Open the Book.txt file for reading
                        Scanner file = new Scanner(new File(HW6Constants.FILENAME2));

                        // Read strings line-by-line
                        while (file.hasNext()) {
                                // Read a line
                                String line = file.nextLine();

                                System.out.println("Read '" + line + "' from " + HW6Constants.FILENAME2 + " file.\n");

                                // Split the line string into tokens by using comma as separator
                                String[] tokens = line.split(HW6Constants.SEPARATOR);
                        }
       
             
                while (iterator.hasNext())
                        System.out.print(iterator.next() + " \n");
                //Populate the TreeSet with Book objects created from the data file. Print out the
//TreeSet.
                //using the BookPrice class
                TreeSet<Book> booksPriceTreeSet = new TreeSet<>(new BookPrice());
                booksPriceTreeSet.addAll(booksTreeSet);
                
                iterator = booksPriceTreeSet.iterator();
                System.out.print("\nBook Price Tree set data: \n");

                while (iterator.hasNext())
                        System.out.print(iterator.next() + " \n");
                


        }

}
