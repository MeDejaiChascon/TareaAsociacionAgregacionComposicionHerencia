import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Cuaderno {
    private List<Hoja> hojas;

    public Cuaderno() {
        hojas = new ArrayList<>();
        // Agregamos 100 hojas al cuaderno al inicio
        for (int i = 1; i <= 100; i++) {
            hojas.add(new Hoja(i));
        }
    }

    public void agregarHoja() {
        if (hojas.size() < 100) {
            hojas.add(new Hoja(hojas.size() + 1));
            System.out.println("Se agrego una hoja al cuaderno.");
        } else {
            System.out.println("El cuaderno esta lleno, no se puede agregar mas hojas.");
        }
    }

    public void eliminarHoja(int numeroHoja) {
        Iterator<Hoja> iterator = hojas.iterator();
        while (iterator.hasNext()) {
            Hoja hoja = iterator.next();
            if (hoja.getNumero() == numeroHoja) {
                iterator.remove();
                System.out.println("Se elimino la hoja " + numeroHoja + " del cuaderno.");
                return;
            }
        }
        System.out.println("No se encontro la hoja " + numeroHoja + " en el cuaderno.");
    }

    public void buscarHojaPorNumero(int numeroHoja) {
        for (Hoja hoja : hojas) {
            if (hoja.getNumero() == numeroHoja) {
                System.out.println("Se encontro la hoja " + numeroHoja + " en el cuaderno.");
                return;
            }
        }
        System.out.println("No se encontro la hoja " + numeroHoja + " en el cuaderno.");
    }
}