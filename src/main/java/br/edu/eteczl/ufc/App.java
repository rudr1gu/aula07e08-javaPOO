package br.edu.eteczl.ufc;

public class App 
{
    public static void main( String[] args ){

        Lutador l1 = new Lutador("John MacareÑa", 27, 1.82f, 79f);

        l1.setNacionalidade("Mexicano");

        l1.apresentar();
        l1.status();

        l1.ganharLuta();
        l1.ganharLuta();
        l1.ganharLuta();
        l1.ganharLuta();
        l1.perderLuta();

        l1.status();

        
    }
}
