import java.io.*;

class sr {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void addRecords() throws IOException {
        // Create or modify a file for database
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("studentRecords.txt", true)));
        String name, studentClass;
        int rollNo, gradeNumber;
        String s;
        boolean addMore;

        // Read data from the user
        do {
            System.out.print("\nEnter name: ");
            name = br.readLine();

            System.out.print("Class: ");
            studentClass = br.readLine();

            System.out.print("Roll number: ");
            rollNo = Integer.parseInt(br.readLine());

            System.out.print("Grade number: ");
            gradeNumber = Integer.parseInt(br.readLine());

            // Print to the file
            pw.println(name);
            pw.println(studentClass);
            pw.println(rollNo);
            pw.println(gradeNumber);

            System.out.print("\nRecords added successfully!\n\nDo you want to add more records? (y/n): ");
            s = br.readLine();
            addMore = s.equalsIgnoreCase("y");

        } while (addMore);

        pw.close();
        showMenu();
    }

    public void readRecords() throws IOException {
        try {
            // Open the file for reading
            BufferedReader file = new BufferedReader(new FileReader("studentRecords.txt"));
            String name;
            int i = 1;

            // Read records from the file
            while ((name = file.readLine()) != null) {
                System.out.println("S.No. : " + (i++));
                System.out.println("-------------");
                System.out.println("Name: " + name);
                System.out.println("Class: " + file.readLine());
                System.out.println("Roll number: " + file.readLine());
                System.out.println("Grade number: " + file.readLine());
                System.out.println();
            }

            file.close();
            showMenu();

        } catch (FileNotFoundException e) {
            System.out.println("\nERROR: File not found!");
        }
    }

    public void clear() throws IOException {
        // Create a blank file
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("studentRecords.txt")));
        pw.close();
        System.out.println("\nAll records cleared successfully!");
        showMenu();
    }

    public void showMenu() throws IOException {
        System.out.print("1: Add Records\n2: Display Records\n3: Clear All Records\n4: Exit\n\nYour Choice: ");
        int choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1:
                addRecords();
                break;
            case 2:
                readRecords();
                break;
            case 3:
                clear();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("\nInvalid choice!");
                showMenu();
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        sr call = new sr();
        call.showMenu();
    }
}