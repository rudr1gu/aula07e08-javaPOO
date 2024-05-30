package br.edu.eteczl.ufc;

public class Lutador implements ILutador{

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int numVitoria;
    private int numDerrota;
    private int numEmpates;

    public Lutador(String n, int i, float a, float p){
        this.setNome(n);
        this.setIdade(i);
        this.setAltura(a);
        this.setPeso(p);
        this.setNacionalidade("default");
        this.setNumVitoria(0);
        this.setNumDerrota(0);
        this.setNumEmpates(0);

        if(this.getPeso() < 52.2){
            this.setCategoria("Inválido");
        }else if(this.getPeso() <= 70.3){
            this.setCategoria("Leve");
        }else if(this.getPeso() <= 83.9){
            this.setCategoria("Médio");
        }else if(this.getPeso() <= 120.2){
            this.setCategoria("Pesado");
        }else{
            this.setCategoria("Inválido");
        }
    }


    public String getNome() {
        return nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getNumVitoria() {
        return numVitoria;
    }
    public void setNumVitoria(int numVitoria) {
        this.numVitoria = numVitoria;
    }
    public int getNumDerrota() {
        return numDerrota;
    }
    public void setNumDerrota(int numDerrota) {
        this.numDerrota = numDerrota;
    }
    public int getNumEmpates() {
        return numEmpates;
    }
    public void setNumEmpates(int numEmpates) {
        this.numEmpates = numEmpates;
    }


    @Override
    public void apresentar() {
        System.out.println(">>>>>>>  APRESENTAÇÃO  <<<<<<<"); 
        System.out.println("Nome: "+this.getNome());
        System.out.println("Altura: "+this.getAltura());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println("Categoria: "+this.getCategoria());
    }


    @Override
    public void status() {
       System.out.println(">>>>>>>  STATUS  <<<<<<<"); 
       System.out.println("Numero de Vitórias: "+this.getNumVitoria());
       System.out.println("Numero de Empates: "+this.getNumEmpates());
       System.out.println("Numero de Derrotas: "+this.getNumDerrota());
    }


    @Override
    public void ganharLuta() {
        this.setNumVitoria(this.numVitoria += 1);
    }


    @Override
    public void perderLuta() {
        this.setNumDerrota(this.numDerrota += 1);
        
    }


    @Override
    public void empatarLuta() {
        this.setNumEmpates(this.numEmpates += 1);
    }

}
