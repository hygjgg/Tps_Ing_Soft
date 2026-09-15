// Clase que implementa el patrón Singleton
public class DocumentacionEnBlanco {
    // 1. Atributo privado y estático que guardará la única instancia
    private static DocumentacionEnBlanco instance = null; 

    // 2. Constructor privado para evitar que usen 'new' desde afuera
    private DocumentacionEnBlanco() {
        System.out.println("[Singleton] Instancia de Documentación en Blanco creada.");
    } 

    // 3. Método público y estático para obtener la instancia global
    public static DocumentacionEnBlanco getInstance() { 
        // Si nunca se creó, la crea acá (Lazy Initialization)
        if (instance == null) { 
            instance = new DocumentacionEnBlanco(); 
        } 
        return instance; 
    } 

    // Un método cualquiera para demostrar que funciona
    public void mostrarMensaje() {
        System.out.println("[Singleton] Usando la instancia única del sistema.");
    }
}
