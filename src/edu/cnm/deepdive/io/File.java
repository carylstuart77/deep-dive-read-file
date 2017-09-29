package edu.cnm.deepdive.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class File {
  private static final String FILENAME = "largest-product-data.txt";

  public static String[] getLines(String filename)
   throws FileNotFoundException, IOException
  {

    //Exception handling
    try (
        FileInputStream inStream = new FileInputStream(filename);
        InputStreamReader reader = new InputStreamReader(inStream);
        BufferedReader buffer = new BufferedReader(reader);
    )
    {
      /*inStream = new FileInputStream(filename);
      reader = new InputStreamReader(inStream);
      buffer = new BufferedReader(reader);
      //expands array */
      List<String> lines = new LinkedList<>();

      //String line;
      //Boolean expression True go in; False next; Testing if you have a valid line.
      // while ((line= buffer.readLine()) != null) {
      // }
      for (String line = buffer.readLine();
          line != null;
          line = buffer.readLine()) {
        //trim blank spaces from beginning and end; cleans and returns string
        line = line.trim();
        if (!line.isEmpty()) {
          lines.add(line);

        }
      }
      return lines.toArray(new String[0]);
    }
  }

  //cant put methods inside methods
  public static void main(String[] args) {

    //inhanced for loop; this will iterate through array
    //to add try catch select section-top of screen select Code-select Sorround with-try/catch
    try {
      for (String line : getLines(FILENAME)) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}












