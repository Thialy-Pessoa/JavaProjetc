package classes;

public class Curso {

    private double codigo;
    private String nome;

    public Curso(double codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  nome +"\n"+
                "CODIGO: " + codigo +"\n";
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
