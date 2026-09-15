// Interfaz común para todas las estrategias de cálculo
interface CalculoImpuestoStrategy {
    double calcular(double importe);
}

// Estrategia Concreta 1: Aplica el IVA de Argentina (21%)
class ImpuestoArgentina implements CalculoImpuestoStrategy {
    @Override
    public double calcular(double importe) {
        return importe * 0.21;
    }
}

// Estrategia Concreta 2: No aplica impuestos (0%)
class ImpuestoExento implements CalculoImpuestoStrategy {
    @Override
    public double calcular(double importe) {
        return 0.0;
    }
}

// Clase Contexto (el Pedido) que usa las estrategias dinámicamente
class Pedido {
    private CalculoImpuestoStrategy estrategia;

    // Método para cambiar la estrategia en cualquier momento
    public void setStrategy(CalculoImpuestoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularTotal(double importe) {
        double impuesto = estrategia.calcular(importe);
        return importe + impuesto;
    }
}
