public class Nodo {

    public int dato;
    Nodo siguiente, anterior;

    //Metodo cuando no hay nodos
    public Nodo (int d){
        this(d,null,null);
    }

    //Costructor cuando hay nodos
    public Nodo (int d, Nodo s, Nodo a){

        dato = d;
        siguiente = s;
        anterior = a;
    }




}
