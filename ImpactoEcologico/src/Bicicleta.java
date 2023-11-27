
public class Bicicleta implements ImpactoEcologico {
    private String marca;
    private String modelo;
    private String tipo;

    public Bicicleta(String marca, String modelo, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String obtenerImpactoEcologico() {
        // Implementación del cálculo del impacto ecológico para una bicicleta
        // ...
        return "Impacto ecológico de la bicicleta";
    }
}
