import java.util.*;
class BookStore1 {
    private ArrayList<Book> book_list = new ArrayList<Book>();
    private Queue<Customer> customer_queue = new LinkedList<Customer>();
    private Stack<Book> new_deliveries = new Stack<Book>();
    
    BookStore1(){
        System.out.println("Book Store created successfully");
    }
    
    public ArrayList<Book> getbooklist(){
        return this.book_list;
    }
    
    public Queue<Customer> getcustomerqueue(){
        return this.customer_queue;
    }
    
    public Stack<Book> getdeliveries(){
        return this.new_deliveries;
    }
    
    public void addCustomer(Customer cu) {
        this.customer_queue.add(cu);
    }
    
    public void processCustomer() {
        if(this.customer_queue.size()==0) {
            System.out.println("No customer in the store");
        }
        else {
            int nf = 0;
            Customer obj = this.customer_queue.poll();
            int i = 0, val2 = this.book_list.size();
            if(val2==0) {
                System.out.println("No books available");
            }
            else {
                for(i=0;i<this.book_list.size();i++) {
                    if(this.book_list.get(i).getbookname().equals(obj.getrequestedbook())) {
                        if(this.book_list.get(i).getcopies() >= obj.getneededcopies()) {
                            System.out.println("Request successfully processed . . .");
                            System.out.println(obj.getcustomername() + "\n" + obj.getrequestedbook() + "\n" + obj.getneededcopies());
                            this.book_list.get(i).setCopies(obj.getneededcopies());
                            nf = 0;
                            break;
                        }
                        else {
                            nf = 1;
                        }
                    }
                }
                if(nf==1) {
                    System.out.println("Unable to process request because requested copies are greater than available copies");
                }
                if(i==val2 && nf==0) {
                    System.out.println("No such book requested by customer is found in store");
                }
            }
        }
    }
    
    public void addDelivery(Book b) {
        this.new_deliveries.add(b);
    }
    
    public void processDelivery() {
        if(this.new_deliveries.size()==0) {
            System.out.println("No deliveries yet");
        }
        else {
            Book nb = this.new_deliveries.pop();
            this.book_list.add(nb);
            System.out.println("Delivery Processed");
        }
    }
    
    public void addBook(Book b) {
        this.book_list.add(b);
    }
}