import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        firstTask();
        secondTask();
        thirdTask();
        fourTask();
        fiveTask();        
    }
    public static void firstTask(){
        byte clientOS = 0;
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else{
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }
    public static void secondTask(){
        byte clientOS = 0;
        short clientDeviceYear = 2014;
        if(clientDeviceYear <= 2015 && clientOS == 0){
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }else if(clientDeviceYear > 2015 && clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if(clientDeviceYear <= 2015 && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else{
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }
    public static void thirdTask(){
        short year = 2021;
        int testFourHundred = year % 400;
        int testHundred = year % 100;
        if(year % 4 == 0 && year > 1584 && (testFourHundred == 0 || testHundred != 0)){
            System.out.println(year + " - leap year");
        }else{
            System.out.println(year + " - not leap year");
        }
    }
    public static void fourTask(){
        int deliveryDistance = 95;
        byte deliveryDay = 1;
        if(deliveryDistance>=20 && deliveryDistance < 60){
            deliveryDay++;
        }else if(deliveryDistance>=60 && deliveryDistance < 100){
            deliveryDay++;
        }else{
            deliveryDay = 0;
        }
        switch (deliveryDay) {
            case 0:
                System.out.println("not delivery");
                break;
        
            default:
                System.out.println("Потребуется дней: " + deliveryDay);
                break;
        }
    }
    public static void fiveTask(){
        byte monthNumber =  5;
        if(monthNumber <= 12 && monthNumber > 0){
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Winter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("autmun");
                    break;
                default:
                    break;
            }
        }else{
            System.out.println("Error");
        }
    }
}