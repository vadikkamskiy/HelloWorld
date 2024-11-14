import java.time.LocalDate;

public class App {
    
    public static void main(String[] args) throws Exception {
        //first task
        int year = 2024;
        detectLeapYear(year);
        //second task
        short cellPhoneYear = 2021;
        byte osType = 0;
        System.out.println(detectType(osType,cellPhoneYear));
        //third task
        int distantion = 67;
        System.out.println(detectTimeDelivery(distantion));

    }
    public static void detectLeapYear(int y){
        if(y%4 == 0 && y%100!=0 || y%400==0){
            System.out.println(y + " год является високосным");
        }else{
            System.out.println(y + " год не является високосным");
        }
    }

    public static String detectType(byte os,short y) {
        int currentYear = LocalDate.now().getYear();
        if(os != 0 && os != 1){
            System.out.println("unknow os");
        }
        String osDetecting = os == 1 ? "android " : "IOS";
        String appVersion = y > currentYear ? "обычную" : "облегчённую";
        String detected = "установите " + appVersion + "версию приложения для " + osDetecting;
        return detected;
    }
    public static String detectTimeDelivery(int dist){
        String output = "доставка займёт ";
        if(dist<20) output += "день";
        if (dist>=20 && dist < 60) output += "два дня";
        if (dist>=60 && dist < 100) output += "три дня";
        if(dist >100){
            output = "нет доставки";
        }
        return output;
    }
}
