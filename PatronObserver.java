import java.util.ArrayList;
import java.util.List;

// Interfaz que obliga a todos los observadores a tener el mismo método
interface Observer {
    void update(String mensaje);
}

// Clase Sujeto que mantiene la lista de observadores y los notifica
class Subject {
    private List<Observer> observadores = new ArrayList<>();

    // Agrega un observador a la lista
    public void attach(Observer o) {
        observadores.add(o);
    }

    // Quita un observador de la lista
    public void detach(Observer o) {
        observadores.remove(o);
    }

    // Recorre la lista y avisa a todos invocando su método update
    public void notifyObservers(String mensaje) {
        for (Observer o : observadores) {
            o.update(mensaje);
        }
    }
}

// Observador Concreto: Una interfaz de usuario ficticia
class AlertaStockUI implements Observer {
    @Override
    public void update(String mensaje) {
        System.out.println("[Observer] La UI recibió la alerta: " + mensaje);
    }
}