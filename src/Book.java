public class Book {
    private String name;
    private Author author;
    private int dateRelease;
    public void setBookInfo(String name, Author author, int dr){
        this.name = name;
        this.author = author;
        this.dateRelease = dr;
    }
    @Override
    public String toString(){
        return name + " " + author.toString() + " " + dateRelease;
    }
    public void setReleaseYear(int y){
        dateRelease = y;
    }
    @Override
    public boolean equals(Object other){
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b2 = (Book) other;
        return name.equals(b2.name) && dateRelease == b2.dateRelease && author.equals(b2.author);
    }

    @Override
    public int hashCode(){
        return java.util.Objects.hash(name , dateRelease , author);
    }
}
