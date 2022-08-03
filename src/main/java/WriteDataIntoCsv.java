import com.opencsv.CSVWriter;


import java.io.*;
import java.util.Scanner;


public class WriteDataIntoCsv {
    public final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    public String actual1= "admin";

    public static void main(String[] args) {
        WriteDataIntoCsv writeDataIntoCsv = new WriteDataIntoCsv();
        writeDataIntoCsv.writeDataLineByLine("/Users/confluxsys/work/Practice/SarveshProject/sample.csv");
    }

    public  void writeDataLineByLine(String filePath)
    {

        File file = new File(filePath);
        try {

            FileWriter outputfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputfile);
            String[] header = { "Url", "Username", "Password" };
            writer.writeNext(header);

            Scanner sc = new Scanner(System.in);
// taking input like url, username, password
            System.out.println("Enter url");
            String url = sc.nextLine();
           // actual = url;
           // System.setOut(new PrintStream(outContent));*/


            System.out.println("Enter username ");
            String username = sc.nextLine();

            System.out.println("Enter password ");
            String password = sc.nextLine();


            String[] data1 = { url, username, password };
            writer.writeNext(data1);

//            String[] data2 = { "Suraj", "10", "630" };
//            writer.writeNext(data2);


            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }





}
