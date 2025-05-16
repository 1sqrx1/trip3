import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Mountain extends Trip{
    private String season;


    public Mountain(int price, String country, String  numpeople, String duration, String season) {
        super(price, country, numpeople, duration);
        this.season = season;
    }
    public String toString() {

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "===================================" + "\nIts sea trip to " + getCountry() + "\nIt will be a trip for " + getNumpeople() + " people" + "\nIt will take "
                + getDuration() + "\nYour trip will be in " + getSeason() + "\nIt will cost you ~" + getPrice() + "€" + "\n===================================";
    }

    public static void form() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Application Form ---");

        System.out.print("Full name: ");
        String name = sc.nextLine();

        System.out.print("Phone number: ");
        String phone = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.println("\n--- Payment Details ---");
        String details = sc.nextLine();

        System.out.print("Card number (16 digits): ");
        String cardNumber = sc.nextLine();

        System.out.print("Expiration date (MM/YY): ");
        String exp = sc.nextLine();

        System.out.print("CVV (3 digits): ");
        String cvv = sc.nextLine();

        System.out.println("\nThank you, " + name + "! Your booking and payment were successful.");
        System.out.println("\n==================================================================");
        try {
            FileWriter writer = new FileWriter("output.txt", true); // true — добавление в конец
            writer.write("=== New Booking ===\n");
            writer.write("Name: " + name + "\n");
            writer.write("Phone: " + phone + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Details: " + details + "\n");
            writer.write("Card Number: " + cardNumber + "\n");
            writer.write("Expiration: " + exp + "\n");
            writer.write("CVV: " + cvv + "\n");
            writer.write("-------------------------\n");
            writer.close();
        }
        catch (IOException e) {
            System.out.println("Error writing to otput.txt: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }




    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

}