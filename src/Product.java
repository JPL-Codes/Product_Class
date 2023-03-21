import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Year;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;
public class Product {



        Scanner in = new Scanner(System.in);
        private String name;
        private String desciprtion;
        private String ID;
        private double cost;


        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\productTestData.txt");

        static private int IDSeed = 1;


        public static void setIDSeed(int IDSeed) {Product.IDSeed = IDSeed; }
        public static int getIDSeed() {return IDSeed; }

        public Product(String name, String desciprtion, String ID, double cost) {
            this.name = name;
            this.desciprtion = desciprtion;
            this.ID = ID;
            this.cost = cost;


        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getDesciprtion()
        {
            return desciprtion;
        }

        public void setDesciprtion(String desciprtion)
        {
            this.desciprtion = desciprtion;
        }

        public String getID()
        {
            return ID;
        }

        public void setID(String ID)
        {
            this.ID = ID;
        }

        public void setCost(double cost)
        {
            this.cost = cost;
        }
        public double getCost()
        {
            return cost;
        }
        public String toCSVRecord()
        {
        return  name + "," + desciprtion+ ","+ID + ","+ cost;

        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", desciprtion='" + desciprtion + '\'' +
                    ", ID='" + ID + '\'' +
                    ", cost='" + cost +
                    '}';
        }


    }


