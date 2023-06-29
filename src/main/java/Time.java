import java.util.ArrayList;

public class Time {

    private String nome;
    private int idade;
    private boolean estadio;

    private ArrayList<Jogador> jogadores;
    private Tecnico tecnico = new Tecnico();

    public Time() {
        jogadores = new ArrayList<Jogador>();
    }

    public void adicionarJogador(Jogador jogador){
        jogadores.add(jogador);
    }

    public void excluirJogador(Jogador jogador){
        jogadores.remove(jogador);
    }

    public int quantidadeJogadores(){
        return jogadores.size();
    }

    public Jogador getJogador(int indice){
        return jogadores.get(indice);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
