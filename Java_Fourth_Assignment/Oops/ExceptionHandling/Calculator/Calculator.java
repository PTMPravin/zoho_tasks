package Oops.ExceptionHandling.Calculator;

class Calculator {
    public void calculate(int leftNumber, int rightNumber, String operation) throws IllegalOperationException {
        if (operation == null) {
            throw new IllegalOperationException("Operation should not be null");
        }

        if (operation == "") {
            throw new IllegalOperationException("Operation should not be empty");
        }

        switch (operation) {
            case "+" :
                System.out.println(leftNumber + rightNumber);
                break;

            case "-" :
                System.out.println(leftNumber - rightNumber);
                break;

            case "/" :
                try {
                    System.out.println(leftNumber / rightNumber);
                } catch (Exception e) {
                    throw new IllegalOperationException("Division By Zero Is NOt Allowed!"+e);
                }
        }
    }
}
