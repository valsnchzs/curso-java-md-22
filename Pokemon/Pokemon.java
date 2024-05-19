interface Elemental{
    String getElementType();
}

public class Pokemon {
    //nombre/ nivel / elemento

    private String nombre;
    private int nivel;

    public Pokemon (String nombre, int nivel){
        this.nombre = nombre;
        this.nivel = nivel;
    }
    public void atacar(){
        System.out.println(nombre + " esta en ataque!");
    }

    public String getNombre(){
        return nombre;

    }
    public int getNivel() {
        return nivel;
    }
    
}