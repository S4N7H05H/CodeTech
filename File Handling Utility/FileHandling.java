import java.util.*;
import java.io.*;

public class FileHandling {
    public static void Write(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
            System.out.println("Successfully written to file : " + filename);
        } catch (IOException e) {
            System.out.println("Error :"+e.getMessage());
        }
    }

    public static void Delete(String filename) {
        File file = new File(filename);
        if(file.delete())
            System.out.println("File deleted Successfully");
        else{
            System.out.println("Error in deleting the file.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename,content;

        System.out.println(" FILE HANDLING UTILITY ");
        while (true) {
            System.out.println("1.Write to File");
            //System.out.println("2.Read from File");
            //System.out.println("3.Modify File (Replace Text)");
            //System.out.println("4.Append to File");
            System.out.println("5.Delete File");
            System.out.println("6.Exit");
            System.out.print("Enter your choice (1-6): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Enter the filename(With extension) :");
                    filename = sc.nextLine();
                    
                    System.out.print("Enter the content to write in the file :");
                    content = sc.nextLine();
                    Write(filename, content);
                }
                case 5 -> {
                    sc.nextLine();
                    System.out.print("Enter the file name to delete(with extension) :");
                    filename = sc.nextLine();
                    Delete(filename);
                }
                case 6 ->{
                    System.out.println("Exiting Program..");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Enter the valid choice....");
            }

        }

        
        
        
        
    }
}