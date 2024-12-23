import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class BankInfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 3 digits of your account number: ");
        String userPrefix = scanner.nextLine().trim();


        String fileUrl = "https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt";

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new URL(fileUrl).openStream(), "UTF-8"))) {

            String line;
            boolean found = false;


            while ((line = br.readLine()) != null) {



                if (line.length() >= 3) {
                    String prefix = line.substring(0, 3).trim();
                    if (prefix.equals(userPrefix)) {

                        System.out.println("Match found:");
                        System.out.println("Bank prefix: " + prefix);
                        System.out.println("Bank name: " + bankName);
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("The bank with the specified prefix was not found: " + userPrefix);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
