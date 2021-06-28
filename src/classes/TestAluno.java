package classes;

public class TestAluno {

    public static void main(String[] args) {

        Curso curso1 = new Curso(12000, "sistemas de informacao");
        Aluno aluno1 = new Aluno("Maria Joana ", "123.453.454-77", 28, curso1);

        Curso curso2 = new Curso(300292, "Direito");
        Aluno aluno2 = new Aluno("Joao Paulo ", "123.334.554-10", 25, curso2);

        System.out.println("-------------RELATORIO ALUNO-------------");
        System.out.println(aluno1);

        System.out.println("-------------RELATORIO ALUNO-------------");
        System.out.println(aluno2);

    }
}