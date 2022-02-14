import java.util.*;
public class TestStore{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookStore1 bs = new BookStore1();
        System.out.println("Books available in the store right now - ");
        System.out.println();
        System.out.println("Book Name, Price, Number of Copies");
        bs.addBook(new Book("Game of Thrones", 100, 50));
        bs.addBook(new Book("The Flash", 50, 50));
        bs.addBook(new Book("Stranger Things",45, 50));
        bs.addBook(new Book("Lost in Space", 150, 50));
        bs.addBook(new Book("Doctor Who", 200, 50));
        ArrayList<Book> bb = bs.getbooklist();
        for(int i=0;i<bb.size();i++) {
            System.out.println(bb.get(i).getbookname() + ", " + bb.get(i).getPrice() + ", "+ bb.get(i).getcopies());
        }
        System.out.println();
        
        System.out.println("10 customers are waiting to be processed. . .");
        bs.addCustomer(new Customer("Shiva","Game of Thrones", 2));
        bs.addCustomer(new Customer("Ram","The Flash", 4));
        bs.addCustomer(new Customer("Harish","Lost in Space", 1));
        bs.addCustomer(new Customer("Shyam","Stranger Things", 1));
        bs.addCustomer(new Customer("John","Game of Thrones", 3));
        bs.addCustomer(new Customer("Michael","Money Heist", 5));
        bs.addCustomer(new Customer("Akhil","The Flash", 1));
        bs.addCustomer(new Customer("James","Doctor Who", 8));
        bs.addCustomer(new Customer("Larry Page","Stranger Things", 2));
        bs.addCustomer(new Customer("Shane Warne","Altered Carbon", 1));
        
        System.out.println("Delivery 1 arrived. . .");
        bs.addDelivery(new Book("The Alchemist", 150, 25));
        bs.addDelivery(new Book("Think and Grow Rich", 300, 10));
        bs.addDelivery(new Book("Dark", 100, 25));
        
        System.out.println("Delivery 2 arrived. . .");
        bs.addDelivery(new Book("The Monk who sold his Ferrari", 150, 25));
        bs.addDelivery(new Book("American Billionare", 350, 5));
        bs.addDelivery(new Book("Stranger Things", 45, 20));
        
        System.out.println();
        while(true){
            System.out.println("Please choose an option from the menu !!");
            System.out.println("1.Add a new customer into the store");
            System.out.println("2.Process a customer's request");
            System.out.println("3.Add a New Delivery to the store");
            System.out.println("4.Process a new delivery");
            System.out.println("5.Exit");
            int opt = sc.nextInt();
            sc.nextLine();
            if(opt == 5){
                System.out.println("Exiting...");
                break;
            }
            else {
                switch(opt) {
                    case 1:
                        System.out.println("Enter name of customer");
                        String cus_name = sc.nextLine();
                        System.out.println("Enter the book name needed by the customer");
                        String book_needed = sc.nextLine();
                        System.out.println("Enter no. of copies");
                        int copy = sc.nextInt();
                        Customer cu = new Customer(cus_name, book_needed, copy);
                        bs.addCustomer(cu);
                        System.out.println("Customer Added");
                        break;
                    case 2:
                        bs.processCustomer();
                        break;
                    case 3:
                        System.out.println("Enter number of delivery items");
                        int it = sc.nextInt();
                        for(int i=0;i<it;i++) {
                            sc.nextLine();
                            System.out.println("Enter book name");
                            String book_n = sc.nextLine();
                            System.out.println("Enter price of book");
                            int pr = sc.nextInt();
                            System.out.println("Enter number of copies delivering");
                            int cp = sc.nextInt();
                            Book b = new Book(book_n, pr,cp);
                            bs.addDelivery(b);
                        }
                        break;
                    case 4:
                        bs.processDelivery();
                        break;
                    default:
                        System.out.println("Enter valid option");
                }
            }
        }
    }

}