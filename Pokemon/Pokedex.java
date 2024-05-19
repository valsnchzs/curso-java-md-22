public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charizard =new PokemonFuego("Charizard", 50);
        PokemonAgua squirtle =new PokemonAgua ("Squirtle", 30);

        charizard.atacar();
        squirtle.atacar();
    }
}