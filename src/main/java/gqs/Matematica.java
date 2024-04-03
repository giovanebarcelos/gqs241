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

    public int fatorial(int numero) {
        if (numero < 2){
            return numero;
        }

        return numero * fatorial(numero - 1);
    }

    public int fatorial1(int numero){
        if (numero < 2){
            return numero;
        }

        int fatorial = 1;
        while (numero > 1){
            fatorial *= numero;
            numero--;
        }

        return fatorial;
    }

    public int fatorial2(int numero){
        int fatorial = numero;
        for (int seq = 2; seq < numero; seq++){
            fatorial *= seq;
        }
        return fatorial;
    }
    
}
