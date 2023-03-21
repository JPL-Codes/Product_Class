import java.util.Scanner;

public class Main {

//need "name" "desc" "ID" double cost
//
public static void main(String[] args) {
    boolean again = false;
    Scanner in = new Scanner(System.in);

    Product SuperBot = new Product("Greg","Non-evil","000001",987.23);

    System.out.println(SuperBot);
    System.out.println(SuperBot.getName());

    System.out.println(SuperBot.toCSVRecord());



}}