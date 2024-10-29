
public class App {
    
    public static void main(String[] args) throws Exception {
        firstTask();
        secondTask();
        thirdTask();
        fourTask();
        fiveTask();
        sixTask();
        sevenTask();
        eightTask();
        nineTask();
        tenTask();        
    }
    public static void firstTask(){
        for(int i = 1; i < 10; i++){
            System.out.println(i);
        }
    }
    public static void secondTask(){
        for(int i = 10; i>1; i--){
            System.out.println(i);
        }
    }
    public static void thirdTask(){
        for(int i = 0; i < 17; i+=2){
            if(i!=0){
                System.out.println(i);
            }
        }
    }
    public static void fourTask(){
        for(int j = 10; j>-10; j--){
            System.out.println(j);
        }
    }
    public static void fiveTask(){
        for(int y = 1904; y < 2096; y +=4){
            System.out.println(y + " год является високосным");
        }
    }
    public static void sixTask(){
        for(int u = 0; u < 100; u+=7){
            if(u!=0){
                System.out.println(u);
            }
        }
    }
    public static void sevenTask(){
        for(int o = 1; o < 1000; o*=2){
            System.out.println(o);
        }
    }
    public static void eightTask(){
        int cash = 29000;
        int stockpiling = 0;
        for(int b = 1; b<=12; b++){
            stockpiling += cash;
            System.out.println("Месяц " +b+ " , сумма накоплений равна "+stockpiling+" рублей");
        }
    }
    public static void nineTask(){
        int cash = 29000;
        int stockpiling = 0;
        for(int m = 1; m<=12;m++){
            stockpiling += stockpiling/100;
            stockpiling += cash;
            System.out.println("Месяц "+m+", сумма накоплений равна "+stockpiling+" рублей");

        }
    }
    public static void tenTask(){
        for(int g = 1; g<=10;g++){
            System.out.println("2*"+g+"="+g*2);
        }
    }
}