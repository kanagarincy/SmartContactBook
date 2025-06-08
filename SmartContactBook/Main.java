import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactManager manager = new ContactManager();

        while (true) {
            System.out.println("\nContact Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    manager.addContact(sc);
                    break;
                case 2:
                    manager.viewContacts();
                    break;
                case 3:
                    manager.searchContact(sc);
                    break;
                case 4:
                    manager.updateContact(sc);
                    break;
                case 5:
                    manager.deleteContact(sc);
                    break;
                case 6:
                    System.out.println("Thank you for using Smart Contact Book!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
