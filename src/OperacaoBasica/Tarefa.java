package OperacaoBasica;

public class Tarefa {
    private final String descricao;

    public Tarefa(String descricao){

        this.descricao = descricao;
    }

    public String getDescricao() {

        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }//um template
    //caso queira deixar mais bonito e não quiser toda a frase, basta apagar e deixar somente a descrição.
}
