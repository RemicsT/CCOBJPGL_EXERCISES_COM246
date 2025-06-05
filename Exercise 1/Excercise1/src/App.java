import java.io.File;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Enter your username: ");
        Scanner loginScanner = new Scanner(System.in);
        String username_from_input = loginScanner.nextLine();

        System.out.println("Enter your password: ");
        String password_from_input = loginScanner.nextLine();

        //user object
        User me = new User(username_from_input, password_from_input);

        //file object
        File myfile = new File ("accounts.txt");

        if (myfile.exists()) {
            System.out.println("\nFile Exists.");
        }

        Scanner fileScanner = new Scanner(myfile);
        Boolean accountexists = false;

        while (fileScanner.hasNextLine()) {

            String filedata = fileScanner.nextLine();
            System.out.println(filedata);

            String username_from_file = filedata.split(", ")[0];
            String password_from_file = filedata.split(", ")[1];

            if (username_from_input.equals(username_from_file) && password_from_input.equals(password_from_file)) {
                accountexists = true;
                break;  
            }
        }

        if (accountexists) {
            System.out.println("\nLogin Successful. Hello "+ me.getUsername());
        } else {
            System.out.println("\nAccount does not exist.\n");
        }
        
        fileScanner.close();
    }
}