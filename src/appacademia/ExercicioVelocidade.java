
package appacademia;


class ExercicioVelocidade implements Exercicio {
    private String nome;

    public ExercicioVelocidade(String nome) {
        this.nome = nome;
    }

    @Override
    public void realizar() {
        System.out.println("Realizando exercício de velocidade: " + nome);
    }
}