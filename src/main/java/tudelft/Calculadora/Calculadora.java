package tudelft.Calculadora;


// Cobertura de sentencias > Verifica cada linea de codigo
// Cobertura de decisiones > Verifica que cada decision sea llamada en el testing
// Cobertura de condiciones > Prueba todas las combinaciones posibles
// Cobertura de caminos > Pruebta todas las rutas logicas

public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public String evaluarNumero(int numero) {
        if (numero > 0 ){
            return "Positivo";
        } else if (numero < 0) {
            return "Negativo";
        } else{
            return "Cero";
        }
    }

    public boolean esPar(int numero){
        return numero % 2 == 0;
    }
}
// Generen los test para que cumplan las condiciones del Testing Estructural (testing de caja blanca)