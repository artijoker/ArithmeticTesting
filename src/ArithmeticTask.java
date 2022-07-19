enum ArithmeticAction {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE
}

public class ArithmeticTask {
    private int _numberA;
    private int _numberB;
    private ArithmeticAction _arithmeticAction;

    public ArithmeticTask(int numberA, int numberB, ArithmeticAction arithmeticAction) {
        _numberA = numberA;
        _numberB = numberB;
        _arithmeticAction = arithmeticAction;
    }

    public boolean IsCheckAnswer(int answer) throws Exception {
        return GetCorrectAnswer() == answer;
    }

    public int GetCorrectAnswer() throws Exception {
        switch (_arithmeticAction) {
            case ADD:
                return _numberA + _numberB;
            case SUBTRACT:
                return _numberA - _numberB;
            case MULTIPLY:
                return _numberA * _numberB;
            case DIVIDE:
                return _numberA / _numberB;
            default:
                throw new Exception("Unknown arithmetic operation.");
        }

    }
    @Override
    public String toString()
        {
            switch (_arithmeticAction) {
                case ADD:
                    return String.format("%d + %d",  _numberA, _numberB);
                case SUBTRACT:
                    return String.format("%d - %d",  _numberA, _numberB);
                case MULTIPLY:
                    return String.format("%d * %d",  _numberA, _numberB);
                case DIVIDE:
                    return String.format("%d / %d",  _numberA, _numberB);
                default:
                    return "Incorrect arithmetic task";
            }
        }
}
