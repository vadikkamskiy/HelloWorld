import java.text.MessageFormat;

public class App {
    
    public static void main(String[] args) throws Exception {
        firstTask();
        secondTask();
    }
    public static void firstTask(){
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

        Double doubleVariable = 3453.4567568876;
        String doubleOutput = MessageFormat.format("Значение переменной doubleVariable с типом double равно {0}", doubleVariable);
        System.out.println(doubleOutput);
    }
    public static void secondTask(){
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
}
