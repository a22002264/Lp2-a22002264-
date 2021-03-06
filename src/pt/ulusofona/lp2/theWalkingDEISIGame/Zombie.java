package pt.ulusofona.lp2.theWalkingDEISIGame;

public abstract class Zombie extends Creature {
    int numeroVivosTransformados;

    public Zombie(int id, int idTipo, String nome, int x, int y, String imagemPng) {
        super(idTipo, id, x, y, nome, imagemPng);
    }


    @Override
    public String getImagePNG() {
        return "zombie.png";
    }


    public int getTipo() {
        return idTipo;
    }


    public String getNomeEquipa() {
        return "Os Outros";
    }

}
