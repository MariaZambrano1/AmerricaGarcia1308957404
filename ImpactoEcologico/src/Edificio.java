
	public class Edificio implements ImpactoEcologico {
	    private int numeroPisos;
	    private int numeroHabitantes;
	    private String fechaConstruccion;

	    public Edificio(int numeroPisos, int numeroHabitantes, String fechaConstruccion) {
	        this.numeroPisos = numeroPisos;
	        this.numeroHabitantes = numeroHabitantes;
	        this.fechaConstruccion = fechaConstruccion;
	    }

	    public int getNumeroPisos() {
	        return numeroPisos;
	    }

	    public int getNumeroHabitantes() {
	        return numeroHabitantes;
	    }

	    public String getFechaConstruccion() {
	        return fechaConstruccion;
	    }

	    @Override
	    public String obtenerImpactoEcologico() {
	        // Implementación del cálculo del impacto ecológico para un edificio
	        // ...
	        return "Impacto ecológico del edificio";
	    }
	}

