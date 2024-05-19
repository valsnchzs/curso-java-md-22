class PokemonAgua extends Pokemon implements Elemental {

    public PokemonAgua (String nombre, int nivel){
        super(nombre, nivel);
    }
    @Override
    public String getElementType(){
        return "Agua";
    }
    @Override
    public void atacar(){
        super.atacar();
        System.out.println(getNombre() + " Lanza una chorro de agua");
    }
}