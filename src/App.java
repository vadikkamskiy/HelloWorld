
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
        
    }
    public static void firstTask(){
        int total = 0;
        short month = 0;
        while(total < 2_459_000){
            month++;
            total += 15000;
            System.out.println("Месяц "+month+", сумма накоплений равна "+total+" рублей");
        }

    }
    public static void secondTask(){
        int count = 0;
        while(count<10){
            count++;
            System.out.print(count+" ");
        }
        System.out.print("\n");
        for(;count>0;count--){
            System.out.print(count+" ");
        }
    }
    public static void thirdTask(){
        System.out.println("\n");
        int population = 12_000_000;
        short year = 2024;
        while (year < 2034) {
            population += (population/1000*17);
            population -= (population/1000*8);
            System.out.println("in " + year + " year, population equals " + population );
            year++;
        }
    }
    public static void fourTask(){
        int deposit = 15000;
        short month = 0;
        while(deposit<2_000_000){
            month++;
            deposit+=(deposit/100*7);
            System.out.println(month + " month deposit equals "+ deposit);
        }
    }
    public static void fiveTask(){
        int deposit = 15000;
        short month = 0;
        while(deposit<2_000_000){
            month++;
            deposit+=(deposit/100*7);
            if(month%6 == 0)
                System.out.println(month + " month deposit equals "+ deposit);
        }
    }
    public static void sixTask() {
        int deposit = 15000;
        float year = 0;
        while(year < 9){
            year+=0.5;
            deposit+=((deposit/100*7)*6);
            System.out.println(year+ " year, deposit equals "+ deposit);
        }
    }
    public static void sevenTask(){
        int friday = 1;
        int month = 0;
        while(month < 31){
            month++;
            if(month%7==friday){
                System.out.println("Сегодня пятница, "+month+"-е число. Необходимо подготовить отчет");
            }
        }
    }
    public static void eightTask(){
        short year = 2024;
        short cometYear = 79;
        short countYear = 0;
        do{
            countYear+=cometYear;
            if(countYear>year-200){
                System.out.println(countYear);
            }
        }while(countYear<year);
    }
}
