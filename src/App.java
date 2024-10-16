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
        int integeriable = Integer.MAX_VALUE;
        String integerOutput = MessageFormat.format("Значение переменной integeriable с типом int равно {0}", integeriable);
        System.out.println(integerOutput);

        byte byteiable = Byte.MAX_VALUE;
        String byteOutput = MessageFormat.format("Значение переменной byteiable с типом byte равно {0}", byteiable);
        System.out.println(byteOutput);

        short shortiable = Short.MAX_VALUE;
        String shortOutput = MessageFormat.format("Значение переменной shortiable с типом short равно {0}", shortiable);
        System.out.println(shortOutput);

        Long longiable = Long.MAX_VALUE;
        String longOutput = MessageFormat.format("Значение переменной longiable с типом long равно {0}", longiable);
        System.out.println(longOutput);

        float floatiable = 14.5456f;
        String floatOutput = MessageFormat.format("Значение переменной floatiable с типом float равно {0}", floatiable);
        System.out.println(floatOutput);

        double doubleiable = 3453.4567568876;
        String doubleOutput = MessageFormat.format("Значение переменной doubleiable с типом double равно {0}", doubleiable);
        System.out.println(doubleOutput);
    }
    public static void secondTask(){
        System.out.println("\n Second task \n");

        Object[] iables = new Object[7];
        float One = 27.12f;
        long Two = 987678965549L;
        double Three = 2.786;
        short Four = 569;
        int Five = -159;
        int Six = 27897;
        byte Seven = 67;

        iables[0] = One;
        iables[1] = Two;
        iables[2] = Three;
        iables[3] = Four;
        iables[4] = Five;
        iables[5] = Six;
        iables[6] = Seven;

        for(int i = 0; i < 7; i++){
            System.out.println(iables[i]);
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
        int first = 20;
        int second = 24 * 60;
        int third = 3 * 24 * 60;
        int four = 30 * 24 * 60;
        System.out.println("За "+ first +" минут машина произвела " + bottleInMinute * first + " штук бутылок");
        System.out.println("За "+ second + " минут машина произвела " + bottleInMinute * second + " штук бутылок");
        System.out.println("За "+ third + " минут машина произвела " + bottleInMinute * third + " штук бутылок");
        System.out.println("За "+ four + " минут машина произвела " + bottleInMinute * four + " штук бутылок");
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
