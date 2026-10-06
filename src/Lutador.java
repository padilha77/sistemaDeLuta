public class Lutador implements MetodosDeLuta {

    //atributos
    private String nome;
    private String categoria;
    private int idade;
    private float peso;
    private float altura;
    private String nacionalidade;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Métod Construtor
    public Lutador(String no, int id, float pe, float al, String na, int vi, int de, int em) {
        setNome(no);
        setIdade(id);
        setPeso(pe);
        setAltura(al);
        setNacionalidade(na);
        setVitorias(vi);
        setDerrotas(de);
        setEmpates(em);
    }
        // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    private void setCategoria() {
        if (peso < 52.5) {
            categoria = "Inválido";
        } else if (this.peso > 52.5 && this.peso < 70.3) {
            categoria = "Peso leve";
        } else if (this.peso > 70.3 && this.peso < 90.3) {
            categoria = "Peso médio";
        } else if (this.peso > 90.3 && this.peso < 113.9) {
            categoria = "Peso pesado";
        } else {
            categoria = "Inválida";
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }

    // Métodos públicos implementados
    @Override
    public void apresentar() {
        System.out.println("---------------APRESENTAÇÃO---------------");
        System.out.println("Chegou o lutador " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println("com " + this.getAltura() + " de altura");
        System.out.println("pesando: " + this.getPeso() + "Kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }

    @Override
    public void status() {
        System.out.println("---------------STATUS--------------");
        System.out.println(this.getNome());
        System.out.println("Pertencendo a categoria " + this.categoria);
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}

