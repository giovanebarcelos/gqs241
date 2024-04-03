package gqs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MatematicaTest {
    @Test
    public void deveSomar(){
        // 3A
        // Arrange - Cenário
        Matematica matematica = 
            new Matematica();

        // Action - Ação 
        int resultado = 
            matematica.somar(8, 5);            

        // Assert - Asserção
        assertEquals(13, resultado);
    }

    @Test
    public void deveSubtrair(){
        // 3A
        // Arrange - Cenário
        Matematica matematica = 
            new Matematica();

        // Action - Ação 
        int resultado = 
            matematica.subtrair(8, 5);            

        // Assert - Asserção
        assertEquals(3, resultado);
    }

    @Test
    public void deveMultiplicar(){
        // 3A
        // Arrange - Cenário
        Matematica matematica = 
            new Matematica();

        // Action - Ação 
        int resultado = 
            matematica.multiplicar(8, 5);            

        // Assert - Asserção
        assertEquals(40, resultado);
    }

    @Test
    public void deveDividir(){
        // 3A
        // Arrange - Cenário
        Matematica matematica = 
            new Matematica();

        // Action - Ação 
        int resultado = 
            matematica.dividir(9, 3);            

        // Assert - Asserção
        assertEquals(3, resultado);
    }


    
}
