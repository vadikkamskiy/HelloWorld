import java.text.MessageFormat;

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
        System.out.println("First task \n");
        int integerVariable = Integer.MAX_VALUE;
        String integerOutput = MessageFormat.format("Значение переменной integerVariable с типом int равно {0}", integerVariable);
        System.out.println(integerOutput);

        byte byteVariable = Byte.MAX_VALUE;
        String byteOutput = MessageFormat.format("Значение переменной byteVariable с типом byte равно {0}", byteVariable);
        System.out.println(byteOutput);

        short shortVariable = Short.MAX_VALUE;
        String shortOutput = MessageFormat.format("Значение переменной shortVariable с типом short равно {0}", shortVariable);
        System.out.println(shortOutput);

        Long longVariable = Long.MAX_VALUE;
        String longOutput = MessageFormat.format("Значение переменной longVariable с типом long равно {0}", longVariable);
        System.out.println(longOutput);

        float floatVariable = 14.5456f;
        String floatOutput = MessageFormat.format("Значение переменной floatVariable с типом float равно {0}", floatVariable);
        System.out.println(floatOutput);

        double doubleVariable = 3453.4567568876;
        String doubleOutput = MessageFormat.format("Значение переменной doubleVariable с типом double равно {0}", doubleVariable);
        System.out.println(doubleOutput);
    }
    public static void secondTask(){
        System.out.println("\n Second task \n");

        Object[] variables = new Object[7];
        float varOne = 27.12f;
        long varTwo = 987678965549L;
        double varThree = 2.786;
        short varFour = 569;
        var varFive = -159;
        int varSix = 27897;
        byte varSeven = 67;

        variables[0] = varOne;
        variables[1] = varTwo;
        variables[2] = varThree;
        variables[3] = varFour;
        variables[4] = varFive;
        variables[5] = varSix;
        variables[6] = varSeven;

        for(int i = 0; i < 7; i++){
            System.out.println(variables[i]);
        }
    }
    public static void thirdTask(){
        System.out.println("\n Third task \n");

        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        int allStudents = studentsAS + studentsEA + studentsLP;
        short allPapers = 480;
        int papersToStudent = allPapers / allStudents;
        System.out.println("На каждого ученика расчитано " + papersToStudent +" листов бумаги");
    }
    public static void fourTask(){
        System.out.println("\n Four task \n");

        int bottleInMinute = 16 /2;
        int firstVar = 20;
        int secondVar = 24 * 60;
        int thirdVar = 3 * 24 * 60;
        int fourVar = 30 * 24 * 60;
        System.out.println("За "+ firstVar +" минут машина произвела " + bottleInMinute * firstVar + " штук бутылок");
        System.out.println("За "+ secondVar + " минут машина произвела " + bottleInMinute * secondVar + " штук бутылок");
        System.out.println("За "+ thirdVar + " минут машина произвела " + bottleInMinute * thirdVar + " штук бутылок");
        System.out.println("За "+ fourVar + " минут машина произвела " + bottleInMinute * fourVar + " штук бутылок");
    }
    public static void fiveTask(){
        System.out.println("\n Five task \n");

        byte jarOfPaint = 120;
        byte brownPaintToClass = 4;
        byte whitePaintToClass = 2;
        int jarToOneClass = brownPaintToClass + whitePaintToClass;
        int Classes = jarOfPaint / jarToOneClass;
        int whitePaint = Classes * whitePaintToClass;
        int brownPaint = Classes * brownPaintToClass;
        System.out.println("В школе, где "+ Classes +" классов, нужно " +whitePaint+ " банок белой краски и " +brownPaint+ " банок коричневой краски");
    }
    public static void sixTask(){
        System.out.println("\n Six task \n");

        float bananasWeight = 0.080f;
        float milkWeight = 0.105f/0.100f;
        float iceCreamWeight = 0.100f;
        float eggsWeight = 0.070f;
        float weightOfBreakfast = bananasWeight * 5 + milkWeight * 0.2f + iceCreamWeight *2 + eggsWeight *4;
        System.out.println("Breakfast weight: " + weightOfBreakfast + " kg");
        System.out.println("Breakfast weight: " + weightOfBreakfast * 1000 + " ml");
    }
    public static void sevenTask(){
        System.out.println("\n Seven task \n");

        float needWeightLoss = 7f;
        float hardWeightLoss = 0.5f;
        float liteWeightLoss = 0.25f;
        System.out.println("быстрый вариант: " + needWeightLoss / hardWeightLoss+" дней");
        System.out.println("другой вариант: " + needWeightLoss / liteWeightLoss+" дней");
        System.out.println("среднее значение: " + ((needWeightLoss / hardWeightLoss)+(needWeightLoss / liteWeightLoss))/2+" день");
    }
    public static void eightTask(){
        System.out.println("\n Eight task \n");

        int[] workersWage = new int[3];
        int maryWage = 67760;
        int denWage = 83690;
        int krisWage = 76230;
        workersWage[0] = maryWage;
        workersWage[1] = denWage;
        workersWage[2] = krisWage;
        for(byte i = 0;i<workersWage.length;i++){
            String name;
            int newWage = (workersWage[i]/100)*110; //можно сделать лучше...
            switch (i) {
                case 0:
                    name = "Mary";
                    break;
                case 1:
                    name = "Den";
                case 2:
                    name = "Kristi";
                default:
                name = "empty";
            }
            System.out.println(name + " теперь получает " + newWage + " рублей. Годовой доход вырос на " + (newWage - workersWage[i]) + " рублей");
        }
    }
}
