public class ArithmeticTaskAndAnswer {
    private ArithmeticTask _arithmeticTask;
    private int _answer;

    public ArithmeticTaskAndAnswer(ArithmeticTask arithmeticTask, int answer) {
        _arithmeticTask = arithmeticTask;
        _answer = answer;
    }

    @Override
    public String toString() {
        try {
            if (_arithmeticTask.IsCheckAnswer(_answer))
                return String.format("%s = %d - Верно", _arithmeticTask, _answer);
            else

                return String.format("%s = %d - Не верно. Ответ %d", _arithmeticTask, _answer,
                        _arithmeticTask.GetCorrectAnswer());
        } catch (Exception e) {
            return "Incorrect arithmetic task. Message: " + e.getMessage();
        }

    }
}
