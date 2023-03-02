import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Lista_Doble listita = new Lista_Doble();

        int opcion=0,ele;

        do {

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Agregar un nodo al inicio \n" +
                        "2. Agregar un nodo al final\n" +
                        "3. Mostara la Lista de Inicio a Final\n" +
                        "4. Mostara la lista de final a Inicio\n" +
                        "5. Salir","Menu de Opciones", JOptionPane.INFORMATION_MESSAGE));
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }

            switch (opcion){
                case 1:
                    ele = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento del nodo","Agregando al nodo inicio", JOptionPane.INFORMATION_MESSAGE));
                    listita.AgregarInicio(ele);
                    break;
                case 2:
                    ele = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento del nodo","Agregando al nodo Final", JOptionPane.INFORMATION_MESSAGE));
                    listita.AgregarFinal(ele);
                    break;
                case 3:
                    if (!listita.Vacia()){
                        listita.MostrarIF();
                    }else {
                        JOptionPane.showMessageDialog(null, "No hay nodos aun", "Lista vacia",JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 4:
                    if (!listita.Vacia()){
                        listita.MostrarFI();
                    }else {
                        JOptionPane.showMessageDialog(null, "No hay nodos aun", "Lista vacia",JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 5:

                    JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin",JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opcion no esta en el menu","Incorrecto", JOptionPane.INFORMATION_MESSAGE);
            }
        }while (opcion !=5);

    }
}
