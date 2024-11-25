

public class App {
    
    public static void main(String[] args) throws Exception {
        Book TheCatcherInTheRye = new Book();
        Author TheCatcherInTheRyeAuthor = new Author();
        TheCatcherInTheRyeAuthor.setName("Jerome D.", "Salinger ");
        TheCatcherInTheRye.setBookInfo("The catcher in the rye",TheCatcherInTheRyeAuthor, 1951 );

        Book TheWildBoys = new Book();
        Author TheWildBoysAuthor = new Author();
        TheWildBoysAuthor.setName("William S.", "Burroughs");
        TheWildBoys.setBookInfo("The Wild Boys", TheWildBoysAuthor, 1971);

        System.out.println(TheCatcherInTheRye.getBookInfo());
        System.out.println(TheWildBoys.getBookInfo());
    }
}


