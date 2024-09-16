import java.util.Scanner;

public class App {
    public static void getMessage(){
        System.out.println("ru or eng?");
        Scanner console = new Scanner(System.in);
        String lang = console.nextLine();
        String output = Message(lang);
        System.out.println(output);
        if(output == "Try again" ){
            getMessage();
        }
        console.close();
    }
    public static void main(String[] args) throws Exception {
        getMessage();
    }
    public static String Message(String lang){
        switch (lang) {
            case "ru":
                return"Привет мир!!!";
            case "eng":
                return "HelloWorld!!!";
            default:
                return "Try again";
        }
    } 
}
