package Library_Management;

public class Library {
	private int accessionNumber;
    private String title;
    private String author;
    private int price;

    // Setters
    public void setAccessionNumber(int accessionNumber) {
        this.accessionNumber = accessionNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Getters
    public int getAccessionNumber() {
        return accessionNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    // Display Book Details
    public void display() {
        System.out.print(accessionNumber +" " +title+" "+ author+" "+ price);
    }
}
