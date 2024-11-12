
public class App {
    
    public static void main(String[] args) throws Exception {
        //first task
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName +" "+firstName+" "+lastName;
        System.out.println("Ф. И. О. сотрудника " + fullName);
        //second task
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullName.toUpperCase());
        //third task
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName);
    }
}
