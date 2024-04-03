package gqs;

public class Matematica {
    public int somar(int num1, int num2){
        return num1 + num2;
    }

    public int subtrair(int num1, int num2){
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public int dividir(int num1, int num2) throws DivisionByZeroException{
        if (num2 == 0){
            throw new DivisionByZeroException();
        }
        return num1 / num2;
    }
    
}
