import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Employee> employeeslist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите информацию о сотруднике(фамилия,имя,возраст,пол,образование,должность,отдел)");
            System.out.println("Фамилия");
            String surName = scanner.next();
            System.out.println("Имя");
            String name = scanner.next();
            System.out.println("Возраст");
            int age = scanner.nextInt();
            System.out.println("Пол");
            String men = scanner.next();
            System.out.println("Образование");
            String education = scanner.next();
            System.out.println("Должность");
            String post = scanner.next();
            System.out.println("Отдел");
            String separately = scanner.next();
            Employee employee = new Employee(surName, name, age, men, education, post, separately);
            employeeslist.add(employee);
            System.out.println("Чтобы выйти из программы пишите end ");
            String input = scanner.next();
            if (input.equals("end")) {
                for (Employee employee1 : employeeslist) {
                    System.out.println(employee1.toString());
                }
                break;
            }
        }
        while (true) {
            System.out.println("Хотите внести изменение: \n"  +
                    "Если да пишите да" +" "+
                    "Если нет пишите нет");
            String input = scanner.next();
            if (input.equalsIgnoreCase("Нет")) {
                break;
            }
            if (input.equalsIgnoreCase("Да")) {
                System.out.println("Введите фамилия и имя работников, для которого хотите изменить данные:");
                String name = scanner.next();
                String surName = scanner.next();
                int empIndex = searchBySurname(surName, name, employeeslist);
                if (empIndex != -1) {
                    while (true) {
                        System.out.println("Какой данный меняем? " + employeeslist.get(empIndex).toString() + "\n" +
                                "Введите имя пункта которую хотите изменить");
                        String selection = scanner.next();
                        if (selection.equalsIgnoreCase("Фамилия")) {
                            System.out.println("Введите данный:");
                            String surName1 = scanner.next();
                            employeeslist.get(empIndex).setSurName(surName1);
                            System.out.println("Изменено");
                        }
                        if (selection.equalsIgnoreCase("Имя")) {
                            System.out.println("Введите данный:");
                            String Name1 = scanner.next();
                            employeeslist.get(empIndex).setName(Name1);
                            System.out.println("Изменено");
                        }
                        if (selection.equalsIgnoreCase("Возраст")) {
                            System.out.println("Введите данный:");
                            int age1 = scanner.nextInt();
                            employeeslist.get(empIndex).setAge(age1);
                            System.out.println("Изменено");
                        }
                        if (selection.equalsIgnoreCase("Пол")) {
                            System.out.println("Введите данный:");
                            String men1 = scanner.next();
                            employeeslist.get(empIndex).setMen(men1);
                            System.out.println("Изменено");
                        }
                        if (selection.equalsIgnoreCase("Образование")) {
                            System.out.println("Введите данный:");
                            String education1 = scanner.next();
                            employeeslist.get(empIndex).setEducation(education1);
                            System.out.println("Изменено");
                        }
                        if (selection.equalsIgnoreCase("Должность")) {
                            System.out.println("Введите данный:");
                            String post1 = scanner.next();
                            employeeslist.get(empIndex).setPost(post1);
                            System.out.println("Изменено");
                        }
                        if (selection.equalsIgnoreCase("Отдел")) {
                            System.out.println("Введите данный:");
                            String separately1 = scanner.next();
                            employeeslist.get(empIndex).setSeparately(separately1);
                            System.out.println("Изменено");
                        }
                        System.out.println("Для завершение пишите end");
                        if (selection.equalsIgnoreCase("end")) {
                            for (Employee employee : employeeslist) {
                                System.out.println(employee.toString());
                            }
                        }
                        break;
                    }
                } else {
                    System.out.println("Указанный вами сотрудник " + surName + name + " не найден");
                }

            }
        }
    }

    public static int searchBySurname(String surName, String name, List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equals(surName)) {
                if (employees.get(i).getName().equals(name)) {
                    return 0;
                }
            }
        }
        return -1;
    }

}
