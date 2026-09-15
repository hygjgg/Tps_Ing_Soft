public class Main {
    public static void main(String[] args) {
        System.out.println("--- PROBANDO PATRONES DE DISEÑO ---\n");

        // 1. Probar Singleton
        DocumentacionEnBlanco s1 = DocumentacionEnBlanco.getInstance();
        DocumentacionEnBlanco s2 = DocumentacionEnBlanco.getInstance();
        s1.mostrarMensaje();
        System.out.println("¿s1 y s2 son la misma instancia?: " + (s1 == s2) + "\n");

        // 2. Probar Observer
        Subject canalNotificaciones = new Subject();
        AlertaStockUI pantallaStock = new AlertaStockUI();
        
        canalNotificaciones.attach(pantallaStock); // Suscribir pantalla
        canalNotificaciones.notifyObservers("El stock bajó de 5 unidades.");
        System.out.println();

        // 3. Probar Strategy
        Pedido miPedido = new Pedido();
        
        miPedido.setStrategy(new ImpuestoArgentina());
        System.out.println("[Strategy] Total con IVA Argentina: " + miPedido.calcularTotal(1000));
        
        miPedido.setStrategy(new ImpuestoExento());
        System.out.println("[Strategy] Total Exento de impuestos: " + miPedido.calcularTotal(1000));
    }
}