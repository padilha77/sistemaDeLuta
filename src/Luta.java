import java.util.Random;

public class Luta {
    //atributos
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    //metodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l2 != l1) {
            this.desafiante = l1;
            this.desafiado = l2;
            this.aprovada = true;
        } else {
            this.desafiante = null;
            this.desafiado = null;
            this.aprovada = false;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("Desafiando a luta: ");
            this.desafiante.apresentar();
            System.out.println("Sendo desafiado: ");
            this.desafiado.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:  // empate
                    System.out.println("A luta empatou ");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiante vence
                    System.out.println("O desafiante " + desafiante.getNome() + " ganhou a luta!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                case 2: // desafiado vence
                    System.out.println("O desafiado " + desafiado.getNome() + " ganhou a luta!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }

    //metodos especias
    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
