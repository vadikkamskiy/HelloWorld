
public class App {
    
    public static void main(String[] args) throws Exception {
       var dog = 8.0;
       var cat = 3.6;
       var papper = 763789;
       System.out.println(dog + "\n" + cat + "\n" + papper);
       dog += 4;
       cat += 4;
       papper += 4;
       System.out.println("\n" + dog + "\n" + cat + "\n" + papper);
       dog -= 3.5;
       cat -= 1.6;
       papper -= 7639;
       System.out.println("\n" + dog + "\n" + cat + "\n" + papper);
       var friend = 19;
       System.out.println(friend);
       System.out.println(friend += 2);
       System.out.println(friend /= 7);
    }
    
}
