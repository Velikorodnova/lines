public class Main {
    public static void main(String[] args) {
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
        fullName = fullName.toUpperCase();
        System.out.println(fullName);
        fullName = "Иванов Семён Семёнович";
        if (fullName.contains("ё")) {
            System.out.println("Буква ё присутствует");
            fullName = fullName.replace("ё", "е");
                System.out.println(fullName);
            }
        }
    }
