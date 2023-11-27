
public class Auto implements ImpactoEcologico {
	    private String marca;
	    private String modelo;
	    private int añoFabricacion;
	    private String tipoCombustible;

	    public Auto(String marca, String modelo, int añoFabricacion, String tipoCombustible) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.añoFabricacion = añoFabricacion;
	        this.tipoCombustible = tipoCombustible;
	    }

	    public String getMarca() {
	        return marca;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public int getAñoFabricacion() {
	        return añoFabricacion;
	    }

	    public String getTipoCombustible() {
	        return tipoCombustible;
	    }

	    public String obtenerImpactoEcologico() {
	        // Implementación del cálculo del impacto ecológico para un auto
	        // ...
	        return "Impacto ecológico del auto";
	        }
	}

	    
