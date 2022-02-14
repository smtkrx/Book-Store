class Customer {
    private String customer_name;
    private String requested_book;
    private int needed_copies;
    
    Customer(String cusname, String reqbook, int nd_copies){
        this.customer_name = cusname;
        this.requested_book = reqbook;
        this.needed_copies = nd_copies;
    }
    
    public String getcustomername() {
        return this.customer_name;
    }
    
    public String getrequestedbook() {
        return this.requested_book;
    }
    
    public int getneededcopies() {
        return this.needed_copies;
    }
    
}