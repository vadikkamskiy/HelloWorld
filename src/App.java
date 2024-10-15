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

        float floatVariable = Float.MAX_VALUE;
        String floatOutput = MessageFormat.format("Значение переменной floatVariable с типом float равно {0}", floatVariable);
        System.out.println(floatOutput);

        Double doubleVariable = Double.MAX_VALUE;
        String doubleOutput = MessageFormat.format("Значение переменной doubleVariable с типом double равно {0}", doubleVariable);
        System.out.println(doubleOutput);
    }
    public static void secondTask(){
        
    }
}
