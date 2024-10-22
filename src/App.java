import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        firstTask();
        secondTask();
        thirdTask();
        fourTask();
        fiveTask();
        sixTask();
        sevenTask();
        
    }
    public static void firstTask(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        String ageString = scan.nextLine();
        int age = Integer.parseInt(ageString);
        if(!ageString.isEmpty() && age > 0){
            if(age >= 18){
                System.out.println("you are sooo adult \n" + age + " it's to much");
            }
            else{
                System.out.println("you are not old enough");
            }
        }else{
            System.out.println("Something went wrong");
        }
        System.out.println("First task gone\n\n");
    }
    public static void secondTask(){
        Scanner scan = new Scanner(System.in);
        System.out.println("what is the temperature now");
        int temperature = scan.nextInt();
        if(temperature < 5){
            System.out.println("you are need wear hat \n" + temperature + " degrees it's so cold");
        }
        else{
            System.out.println("you are may go walk without hat \n" + temperature + "degrees it's amazing" );
        }
        System.out.println("Second task gone\n\n");
    }
    public static void thirdTask(){
        int currentSpeed = 20;
        String normalSpeed = ", то можно ездить спокойно";
        String highSpeed = ", то придется заплатить штраф";
        String output;
        if(currentSpeed > 60){
            output = highSpeed;
        }else{
            output = normalSpeed;
        }
        System.out.println("ecли скорость : " + currentSpeed + output);
    }
    public static void fourTask(){
        int currentAge = 37;
        if(currentAge > 2 && currentAge <= 6){
            System.out.println("Если возраст человека равен "+ currentAge+", то ему нужно ходить в детский сад ");
        }else if(currentAge > 6 && currentAge <= 17){
            System.out.println("Если возраст человека равен "+ currentAge+", то ему нужно ходить в школу ");
        }else if (currentAge >= 18 && currentAge <= 24) {
            System.out.println("Если возраст человека равен "+ currentAge+", его место в университете ");
        }else if(currentAge > 24){
            System.out.println("Если возраст человека равен "+ currentAge+", он должен работать и обеспечивать семью ");
        }else{
            System.out.println("who are you?");
        }
    }
    public static void fiveTask(){
        int childrenAge  = 5;
        if(childrenAge < 5 ){
            System.out.println("Если возраст ребенка равен " + childrenAge + " нельзя кататься на аттракционе");
        }else if(childrenAge >= 5 && childrenAge < 14){
            System.out.println("Если возраст ребенка равен " + childrenAge + " можно кататься на аттракционе в сопровождении");
        }else if(childrenAge >= 14){
            System.out.println("Если возраст ребенка равен " + childrenAge + " можно кататься без сопровождения взрослого");
        }
    }
    public static void sixTask() {
        Scanner scan = new Scanner(System.in);
        System.out.println("сколько занято мест?");
        int allPlaces = 102;
        int seating = 60;
        int passengers = scan.nextInt();
        if(passengers < seating){
            System.out.println("В вагоне осталось " + (seating - passengers) +" сидячих мест");
        }else if(passengers >= seating && passengers < allPlaces){
            System.out.println("В вагоне осталось " + (allPlaces - passengers) +" стоячих мест");
        }else{
            System.out.println("мест нет");
        }
    }
    public static void sevenTask(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите три числа");
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();
        if(first>second && first > third){
            System.out.println("first max " + first);
        }else if(second > first && second > third){
            System.out.println("second max " + second);
        }else{
            System.out.println("third max " + third);
        }
        scan.close();
    }
}
