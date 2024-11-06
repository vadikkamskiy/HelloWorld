
public class App {
    
    public static void main(String[] args) throws Exception {
        //firstTask
        int payArr[] = {12000,2500,4780,690,3650};
        int totalPay = 0;
        for(int pay:payArr){
            totalPay+=pay;
        }
        System.out.println("Сумма трат за месяц составила "+totalPay+" рублей");

        //secondTask
        int minimalPay = totalPay;
        int maximumPay = 0;
        for(int pay:payArr){
            if(minimalPay>pay){
                minimalPay = pay;
            }
            if(maximumPay<pay){
                maximumPay = pay;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила "+minimalPay+" рублей. Максимальная сумма трат за неделю составила "+maximumPay+" рублей");

        //thirdTask
        double averageValue = totalPay / payArr.length;
        System.out.println("Средняя сумма трат за месяц составила "+averageValue+" рублей");

        //fourTask
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i = reverseFullName.length-1;i>=0;i--){
            System.out.print(reverseFullName[i]);
        }
    }
}
