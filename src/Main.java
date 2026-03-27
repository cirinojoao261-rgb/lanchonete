import model.Cliente;
import model.Hamburguer;
import model.Pedido;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> ingredienteList = new ArrayList<String>();
        ingredienteList.add("pao");
        ingredienteList.add("hamburguer");
        ingredienteList.add("queijo");
        ingredienteList.add("bacon");
        ingredienteList.add("jiló");
        ingredienteList.add("ovo");




        Hamburguer hamburguer = new Hamburguer(ingredienteList,19);



        System.out.println("Antes de tirar " + hamburguer.getIngredientes());

         hamburguer.tirarIngredientes("jiló");

        System.out.println("Depois de tirar " + hamburguer.getIngredientes());
    }
}

