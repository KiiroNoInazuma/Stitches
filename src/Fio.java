public class Fio {
    public static void main(String[] args) {
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich";
        String fullName = firstName+middleName+lastName;
        System.out.println("ФИО сотрудника — " +fullName);
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName);
    }
}
