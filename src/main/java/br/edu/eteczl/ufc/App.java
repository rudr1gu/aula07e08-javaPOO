package br.edu.eteczl.ufc;

public class App 
{
    public static void main( String[] args ){

        Lutador l1 = new Lutador("Rudr1gu", 28, 1.82f, 70f); // (nome, idade, altura, peso
        Lutador l2 = new Lutador("Dragon", 25, 1.75f, 75f);
        Lutador l3 = new Lutador("Luffy", 19, 1.70f, 70f);
        Lutador l4 = new Lutador("Zoro", 30, 1.75f, 80f);
        Lutador l5 = new Lutador("Nami", 25, 1.70f, 65f);
        Lutador l6 = new Lutador("Sanji", 28, 1.80f, 75f);
        Lutador l7 = new Lutador("Chopper", 20, 1.50f, 50f);
        Lutador l8 = new Lutador("Robin", 24, 1.65f, 55f);
        Lutador l9 = new Lutador("Franky", 32, 1.85f, 85f);
        Lutador l10 = new Lutador("Brook", 40, 1.95f, 90f);
        Lutador l11 = new Lutador("Jinbe", 38, 1.88f, 88f);
        Lutador l12 = new Lutador("Carrot", 18, 1.55f, 45f);
        Lutador l13 = new Lutador("Law", 29, 1.78f, 77f);
        Lutador l14 = new Lutador("Kid", 26, 1.72f, 70f);
        Lutador l15 = new Lutador("Killer", 25, 1.75f, 75f);
        Lutador l16 = new Lutador("Apoo", 27, 1.80f, 80f);
        Lutador l17 = new Lutador("Drake", 30, 1.85f, 85f);
        Lutador l18 = new Lutador("Hawkins", 32, 1.90f, 90f);
        Lutador l19 = new Lutador("Kaido", 50, 2.00f, 100f);
        Lutador l20 = new Lutador("Big Mom", 48, 1.95f, 95f);
        Lutador l21 = new Lutador("Shanks", 50, 2.05f, 105f);

        
        l1.setNacionalidade("Mexicano");
        l2.setNacionalidade("Brasileiro");
        l3.setNacionalidade("Brasileiro");
        l4.setNacionalidade("Japonês");
        l5.setNacionalidade("Sueco");
        l6.setNacionalidade("Francês");
        l7.setNacionalidade("Canadense");
        l8.setNacionalidade("Alemão");
        l9.setNacionalidade("Australiano");
        l10.setNacionalidade("Inglês");
        l11.setNacionalidade("Chinês");
        l12.setNacionalidade("Coreano");
        l13.setNacionalidade("Russo");
        l14.setNacionalidade("Italiano");
        l15.setNacionalidade("Espanhol");
        l16.setNacionalidade("Português");
        l17.setNacionalidade("Holandês");
        l18.setNacionalidade("Belga");
        l19.setNacionalidade("Americano");
        l20.setNacionalidade("Canadense");
        l21.setNacionalidade("Alemão");



        Luta luta1 = new Luta();
        Luta luta2 = new Luta();
        luta1.marcarLuta(l3, l1);
        luta1.lutar();
        l3.status();
        l4.status();

        luta2.marcarLuta(l15, l13);
        luta2.lutar();
        l1.status();
        l21.status();
    }
}
