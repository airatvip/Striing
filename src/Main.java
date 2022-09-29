public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println(" Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " +  fullName);


        //Задача 2
        System.out.println(" Задача 2");
        fullName = fullName.toUpperCase();
        System.out.println(fullName);


        //Задача 3
        System.out.println(" Задача 3");
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println(fullName1);


    }
}