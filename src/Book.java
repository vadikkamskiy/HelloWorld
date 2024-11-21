public class Book {
    private String name;
    private Author author;
    private int dateRelease;
    public void setBookInfo(String name, Author author, int dr){
        this.name = name;
        this.author = author;
        this.dateRelease = dr;
    }
    public String getBookInfo(){
        String bookInfo = name + " " + author + " " + dateRelease;
        return bookInfo;
    }
}
