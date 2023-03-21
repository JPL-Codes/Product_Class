import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class ProductGenerator {
    public static void main(String[] args) {




        String name = "";
        String description = "";
        String ID = "";
        double cost=0;


        Scanner in = new Scanner(System.in);

        {
            ArrayList<String> productCSVData = new ArrayList<>();
            boolean again = false;
            File workingDirectory = new File(System.getProperty("user.dir"));
            Path file = Paths.get(workingDirectory.getPath() + "\\src\\productTestData.txt");
            do{
                name = SafeInput.getNonZeroLenString(in,"Enter the name");
                description = SafeInput.getNonZeroLenString(in,"Enter the description ");
                ID = SafeInput.getNonZeroLenString(in,"Enter the ID as 6 digits");
                cost = SafeInput.getRangedDouble(in,"Enter the cost", 0, 999999);


                String CSVProductRecord = (ID + "," + name + "," + description + "," + cost);
                productCSVData.add(CSVProductRecord);
                again = SafeInput.getYNConfirm(in,"Are you done entering prompts?");


            }while(!again);

            for(String p:productCSVData)

                try
                {

                    OutputStream out =
                            new BufferedOutputStream(Files.newOutputStream(file, CREATE));
                    BufferedWriter writer =
                            new BufferedWriter(new OutputStreamWriter(out));

                    for(String rec : productCSVData)
                    {
                        writer.write(rec, 0, rec.length());
                        writer.newLine();  // adds the new line

                    }
                    writer.close(); // must close the file to seal it and flush buffer
                    System.out.println("Data file written!");
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
           // return ID + "," + name + "," + description + "," + cost;

        }
    }}


