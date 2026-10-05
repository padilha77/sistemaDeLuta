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

    // métodoConstrutor


    public Lutador(String no, int id, float pe, float al, String na, int vi, int de, int em) {
        setNome(no);
        setPeso(pe);
        setAltura(al);
        setNacionalidade(na);
        setVitorias(vi);
        setDerrotas(de);
        setEmpates(em);
    }

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
        setCategoria();
    }

    private void setCategoria() {
        if (peso < 52.5) {
            categoria = "Inválido";
        } else if (peso > 52.5 && peso < 70.3) {
            categoria = "Peso leve";
        } else if (peso > 70.3 && peso < 90.3) {
            categoria = "Peso médio";
        } else if (peso > 90.3 && peso < 113.9) {
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

    //métodos implementados
    @Override
    public void apresentar() {
        System.out.println("O lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println("com " + getAltura() + " de altura");
        System.out.println("pesando" + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }

    @Override
    public void status() {
        System.out.println(getNome());
        System.out.println("é um peso " + getPeso());
        System.out.println(getVitorias() + " vitórias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}

