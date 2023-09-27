package OperacaoBasica;
import java.util.ArrayList;
import java.util.List;
public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {

        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(t);
            }

        }
        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefa() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefa() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de itens da lista é: " + listaTarefa.obterNumeroTotalTarefa());

        listaTarefa.adicionarTarefa ( "Tarefa 1");
        listaTarefa.adicionarTarefa ( "Tarefa 1");
        listaTarefa.adicionarTarefa ( "Tarefa 2"); //teste
        System.out.println("O numero total de itens da lista é: " + listaTarefa.obterNumeroTotalTarefa());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de itens da lista é: " + listaTarefa.obterNumeroTotalTarefa());

        listaTarefa.obterDescricoesTarefa();

    }
}
//void porque não quero retomar a nada e sim add.
//abaixo veremos uma adição dentro da arraylist
