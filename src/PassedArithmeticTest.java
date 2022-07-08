import java.util.List;

public class PassedArithmeticTest {
    private List<ArithmeticTaskAndAnswer> _tasksAndAnswers;
    private String _studentName;
    
    public PassedArithmeticTest(String studentName, List<ArithmeticTaskAndAnswer> tasksAndAnswers )
    {
        _studentName = studentName;
        _tasksAndAnswers = tasksAndAnswers;
    }

    public void Print()
    {
        System.out.println(String.format("\nУченик: %s", _studentName));
        for (var taskAndAnswer : _tasksAndAnswers)
        {
            System.out.println(taskAndAnswer);
        }
    }
}
