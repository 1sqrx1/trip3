import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Trip {
    private int price;
    private String country;
    private String numpeople;
    private String duration;

    public Trip(int price, String country, String numpeople, String duration) {
        this.price = price;
        this.country = country;
        this.numpeople = numpeople;
        this.duration = duration;
    }

    public static void writeFile(String content) {
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write(content);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readFile() {
        try (FileReader reader = new FileReader("output.txt")) {
            String result = "";
            int c;
            while ((c = reader.read()) != -1) {
                result += (char) c;
            }
            System.out.println(result);
            return result;
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public static void Start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("   Welcome to Travel Explorer!");
        System.out.println("======================================");

        System.out.println("1. List");
        System.out.println("2. Log In");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");

        String choice = scanner.nextLine();

        switch (choice) {

            case "1":
                System.out.println("Redirecting to list...");
                list();
                break;
            case "2":
                System.out.println("Redirecting to login...");
                login();
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Start();
            case "3":
                System.out.println("Thank you for using Travel Explorer. Safe travels!");
                exit();
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 3.");
        }


        scanner.close();
    }
    public static void login() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i != 1) {
            System.out.println("=== User Log In ===");
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            System.out.println("Enter your email:");
            String email = sc.nextLine();
            System.out.println("Enter your password:");
            String password = sc.nextLine();
            String userdata = "name: " + name + "\nemail: " + email + "\npassword: " + password + "\n";
            if (Trip.readFile().equals(userdata)) {
                System.out.println("Login succesful");
                i++;
                System.out.println("View our list (press button 1)");
            } else {
                System.out.println("Incorrect email or password");
            }
        }
    }
    public static void list() {
        Scanner sc = new Scanner(System.in);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\nChoose the variant: sea, city, mountain, excursion:  ");
        String direction = sc.nextLine();

        if (direction.equals("sea")) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("\n=======================================================");
            System.out.println("Now we order you the variants of availiable vocations- ");
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Choose the variant: Spain, Turkey, Dubai, Sri-Lanka");
            String choise = sc.nextLine();
            if (choise.equals("Spain")) {
                Sea s1 = new Sea(4000, "Spain", "2-6 people", "3 weeks", 24);
                System.out.println(s1);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Will it be good enough for you? (yes/no): ");
                String danet = sc.nextLine();
                if (danet.equals("yes")) {
                    Sea.form();
                }
                else {
                    return;
                }
            }
            if (choise.equals("Turkey")) {
                Sea s2 = new Sea(2000, "Turkey", "2-6 people", "1 week", 28);
                System.out.println(s2);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Will it be good enough for you? (yes/no): ");
                String danet = sc.nextLine();
                if (danet.equals("yes")) {
                    Sea.form();
                }
                else {
                    return;
                }

            }
            if (choise.equals("Dubai")) {
                Sea s3 = new Sea(7000, "Dubai", "2-6 people", "2 weeks", 32);
                System.out.println(s3);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Will it be good enough for you? (yes/no): ");
                String danet = sc.nextLine();
                if (danet.equals("yes")) {
                    Sea.form();
                }
                else {
                    return;
                }
            }
            if (choise.equals("Sri-Lanka")) {
                Sea s4 = new Sea(5000, "Sri-Lanka", "2-6 people", "1 week", 18);
                System.out.println(s4);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Will it be good enough for you? (yes/no): ");
                String danet = sc.nextLine();
                if (danet.equals("yes")) {
                    Sea.form();
                }
                else {
                    return;
                }
            }
        }

        else if (direction.equals("city")) {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("\n=======================================================");
            System.out.println("Now we will give you the variants of availiable vocations- ");
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Choose the variant: Italy, France, Latvija, Greece");
            String choise = sc.nextLine();
            if (choise.equals("Italy")) {
                City c1 = new City(3000, "Italy", "2-6 people", "3 weeks", "hotel");
                System.out.println(c1);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Will it be good enough for you? (yes/no): ");
                String danet = sc.nextLine();
                if (danet.equals("yes")) {
                    City.form();
                }
                else {
                    return;
                }
            }
            if (choise.equals("France")) {
                City c2 = new City(4000, "France", "2-6 people", "1 week", "flat");
                System.out.println(c2);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Will it be good enough for you? (yes/no): ");
                String danet = sc.nextLine();
                if (danet.equals("yes")) {
                    City.form();
                }
                else {
                    return;
                }
            }
            if (choise.equals("Latvija")) {
                City c3 = new City(1000, "Latvija", "2-6 people", "2 weeks", "hotel");
                System.out.println(c3);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Will it be good enough for you? (yes/no): ");
                String danet = sc.nextLine();
                if (danet.equals("yes")) {
                    City.form();
                }
                else {
                    return;
                }
            }
            if (choise.equals("Greece")) {
                City c4 = new City(5000, "Greece", "2-6 people", "1 week", "flat");
                System.out.println(c4);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Will it be good enough for you? (yes/no): ");
                String danet = sc.nextLine();
                if (danet.equals("yes")) {
                    City.form();
                }
                else {
                    return;
                }
            }
        }
        else if (direction.equals("mountain")) {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("\n=======================================================");
            System.out.println("Now we order you the variants of availiable vocations- ");
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Choose the varian: Norwey, Switzerland, Sweden, Finland");
            String choise = sc.nextLine();
            if (choise.equals("Norwey")) {
                Mountain m1 = new Mountain(7000, "Norwey", "2-6 people", "1 week", "summer");
                System.out.println(m1);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Will it be good enough for you? (yes/no): ");
                String danet = sc.nextLine();
                if (danet.equals("yes")) {
                    Mountain.form();
                }
                else {
                    return;
                }
            }
            if (choise.equals("Switzeland")) {
                Mountain m2 = new Mountain(10000, "Switzerland", "2-6 people", "3 weeks", "winter");
                System.out.println(m2);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Will it be good enough for you? (yes/no): ");
                String danet = sc.nextLine();
                if (danet.equals("yes")) {
                    Mountain.form();
                }
                else {
                    return;
                }
            }
            if (choise.equals("Sweden")) {
                Mountain m3 = new Mountain(6000, "Sweden", "2-6 people", "1 week", "spring");
                System.out.println(m3);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Will it be good enough for you? (yes/no): ");
                String danet = sc.nextLine();
                if (danet.equals("yes")) {
                    Mountain.form();
                }
                else {
                    return;
                }
            }
            if (choise.equals("Finland")) {
                Mountain m4 = new Mountain(8000, "Finland", "2-6 people", "2 weeks", "autumn");
                System.out.println(m4);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Will it be good enough for you? (yes/no): ");
                String danet = sc.nextLine();
                if (danet.equals("yes")) {
                    Mountain.form();
                }
                else {
                    return;
                }
            }
        }
        else if (direction.equals("excursion")) {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("\n=======================================================");
            System.out.println("Now we order you the variants of availiable vocations- ");
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Choose the varian: Denmark, India, Ireland, Iceland");
            String choise = sc.nextLine();
            if (choise.equals("Denmark")) {
                Excursion e1 = new Excursion(9000, "Denmark", "2-6 people", "2 weeks", "active");
                System.out.println(e1);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Will it be good enough for you? (yes/no): ");
                String danet = sc.nextLine();
                if (danet.equals("yes")) {
                    Excursion.form();
                }
                else {
                    return;
                }
            }
            if (choise.equals("India")) {
                Excursion e2 = new Excursion(14000, "India", "2-6 people", "1 week", "active");
                System.out.println(e2);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Will it be good enough for you? (yes/no): ");
                String danet = sc.nextLine();
                if (danet.equals("yes")) {
                    Excursion.form();
                }
                else {
                    return;
                }
            }
            if (choise.equals("Ireland")) {
                Excursion e3 = new Excursion(10000, "Ireland", "2-6 people", "3 weeks", "passive");
                System.out.println(e3);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Will it be good enough for you? (yes/no): ");
                String danet = sc.nextLine();
                if (danet.equals("yes")) {
                    Excursion.form();
                }
                else {
                    return;
                }
            }
            if (choise.equals("Iceland")) {
                Excursion e4 = new Excursion(7000, "Iceland","2-6 people" , "1 week", "passive");
                System.out.println(e4);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Will it be good enough for you? (yes/no): ");
                String danet = sc.nextLine();
                if (danet.equals("yes")) {
                    Excursion.form();
                }
                else {
                    return;
                }
            }
        }
    }
    public static void exit(){
        System.out.println("Goodbuy! See you next time!");

    }











    public int getPrice () {
        return price;
    }

    public void setPrice ( int price){
        this.price = price;
    }

    public String getCountry () {
        return country;
    }

    public void setCountry (String country){
        this.country = country;
    }

    public String getNumpeople () {
        return numpeople;
    }

    public void setNumpeople ( String numpeople){
        this.numpeople = numpeople;
    }

    public String getDuration () {
        return duration;
    }

    public void setDuration (String duration){
        this.duration = duration;
    }
}

