import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArithmeticTest {
    private List<ArithmeticTask> _arithmeticTasks;

    public ArithmeticTest() {
        _arithmeticTasks = Create();
    }

    private static List<ArithmeticTask> Create() {
        List<ArithmeticTask> tasks = new ArrayList<ArithmeticTask>();
        Random rand = new Random();
        tasks.add(new ArithmeticTask(
                rand.nextInt(1, 100),
                rand.nextInt(1, 100),
                ArithmeticAction.ADD));

        int a = rand.nextInt(1, 100);
        int b = rand.nextInt(1, 100);
        if (a > b)
            tasks.add(new ArithmeticTask(a, b, ArithmeticAction.SUBTRACT));
        else
            tasks.add(new ArithmeticTask(b, a, ArithmeticAction.SUBTRACT));

        tasks.add(new ArithmeticTask(
                rand.nextInt(1, 100),
                rand.nextInt(1, 100),
                ArithmeticAction.MULTIPLY));

        while (true) {
            a = rand.nextInt(1, 100);
            b = rand.nextInt(1, 100);

            if (a % b == 0) {
                tasks.add(new ArithmeticTask(a, b, ArithmeticAction.DIVIDE));
                break;
            }
        }
        return tasks;
    }

    public List<ArithmeticTaskAndAnswer> PassTest()
        {
            List<ArithmeticTaskAndAnswer> result = new ArrayList<ArithmeticTaskAndAnswer>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nАрифметический тест:");
            for (var task : _arithmeticTasks) {
                while (true)
                {
                    try
                    {
                        System.out.print(String.format("%s = ", task));
                        int answer = Integer.parseInt(scanner.nextLine());
                        result.add(new ArithmeticTaskAndAnswer(task, answer));
                        break;
                    }
                    catch (Exception e)
                    {
                        System.out.println("Ошибка! Некорректный ответ.\n");
                    }
                }
            }

            return result;
        }
}
