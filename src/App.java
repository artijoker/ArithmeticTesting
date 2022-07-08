import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    static List<PassedArithmeticTest> PassedTests = new ArrayList<PassedArithmeticTest>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        while (true) {

            System.out.print("testing - Пройти тест\nresults - Посмотреть результаты тестов\nexit - Выход\n>");
            var cmd = scanner.nextLine();

            switch (cmd) {
                case "testing":
                    Testing();
                    break;
                case "results":
                    ShowResultTests();
                    break;
                case "exit":

                    return;
                default:
                    System.out.println("Ошибка! Неизвестная команда.\n");
                    System.out.print("\nДля продолжения нажмите клавишу Enter . . .");
                    scanner.nextLine();
                    break;
            }
        }
    }

    static void Testing() {
        clearScreen();
        System.out.print("Введите имя\n>");
        var name = scanner.nextLine();

        ArithmeticTest test = new ArithmeticTest();
        var result = test.PassTest();

        System.out.println("\nРезультат:");
        for (var item : result) {
            System.out.println(item);
        }

        PassedTests.add(new PassedArithmeticTest(name, result));
        System.out.print("\nДля продолжения нажмите клавишу Enter . . .");
        scanner.nextLine();
        clearScreen();
    }

    static void ShowResultTests() {
        clearScreen();
        if (PassedTests.size() == 0) {
            System.out.println("Нет пройденных тестов");
            System.out.print("\nДля продолжения нажмите клавишу Enter . . .");
            scanner.nextLine();
            clearScreen();
            return;
        }

        System.out.println(String.format("Всего пройденных тестов %d", PassedTests.size()));

        for (var PassedTest : PassedTests) {
            PassedTest.Print();
        }

        System.out.print("\nДля продолжения нажмите клавишу Enter . . .");
        scanner.nextLine();
        clearScreen();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
