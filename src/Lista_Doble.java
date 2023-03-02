import javax.swing.*;

public class Lista_Doble {

    private Nodo inicio,fin;

    public Lista_Doble(){
        inicio = fin =null;
    }

    //Identificar si la lista esta vacia
    public boolean Vacia(){
        return inicio ==null;
    }

    // Metodo para agregar metodos al final
    public void AgregarFinal (int d){
        if (!Vacia()){
            fin = new Nodo(d,null,fin);
            fin.anterior.siguiente =fin;
        }else {
            inicio = fin = new Nodo(d);
        }
    }

    //Metodo para agregar al inicio
    public void AgregarInicio (int d){
        if (!Vacia()){
            inicio = new Nodo(d,inicio,null);
            inicio.siguiente.anterior =inicio;
        }else {
            inicio = fin = new Nodo(d);
        }
    }

    //Metodo para mostrar la lista de Inicio a Fin
    public void MostrarIF (){
        if (!Vacia()){
            String datos ="<=>";
            Nodo aux=inicio;
            while (aux !=null){
                datos = datos + "["+aux.dato+"]<=>";
                aux = aux.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos,"Mostrando lista de inicio a fin", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //Metodo para mostrar la lista de fin a inicio
    public void MostrarFI (){
        if (!Vacia()){
            String datos ="<=>";
            Nodo aux=fin;
            while (aux !=null){
                datos = datos + "["+aux.dato+"]<=>";
                aux = aux.anterior;
            }
            JOptionPane.showMessageDialog(null, datos,"Mostrando lista de inicio a fin", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //






}
