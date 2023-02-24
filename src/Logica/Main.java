package Logica;

public class Main {
    public static void main(String[] args) {

        Squirtle squirtle = new Squirtle();
       Charmander charmander = new Charmander();
       Bulbasaur bulbasaur = new Bulbasaur();
       Pikachu pikachu = new Pikachu();

       squirtle.atacarAraniaso();
       squirtle.atacarBurbuja();
       charmander.atacarAraniaso();
       charmander.atacarLanzaLlamas();
       bulbasaur.atacarAraniaso();
       bulbasaur.atacarDrenaje();
       pikachu.atacarAraniaso();
       pikachu.atacarImpactrueno();

    }
}