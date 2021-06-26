package classes;

public class TestAluno {
    public static void main(String[] args) {

        Curso curso1 = new Curso(12000, "sistemas de informacao");
        Aluno aluno1 = new Aluno("Maria ", "123.453.454-77", 28, curso1);

        System.out.println("-------------RELATORIO ALUNO-------------");

        System.out.println("nome: " +aluno1.getNome() + "\n" +
                            "CPF: " +aluno1.getCpf() +"\n"+
                            "Idade: "+ aluno1.getIdade() + "\n"+
                            "Curso: " + aluno1.getCurso());

    }
}