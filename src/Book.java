class Book {
    private String book_name;
    private int price;
    private int number_of_available_copies;
    
    Book(String bname, int pr, int copies){
        this.book_name = bname;
        this.price = pr;
        this.number_of_available_copies = copies;
    }
    
    public String getbookname() {
        return this.book_name;
    }
    
    public int getPrice() {
        return this.price;
    }
    
    public int getcopies() {
        return this.number_of_available_copies;
    }
    
    public void setCopies(int copy) {
        this.number_of_available_copies -= copy;
    }
    
}