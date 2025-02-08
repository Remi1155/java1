public class Main
{
    public static void main(String[] args) 
    {

        Cercle cercle = new Cercle(10.0f);
        cercle.dessiner();  
        System.out.println("Surface du cercle: " + cercle.surface);
        System.out.println("Perimetre du cercle " + cercle.perimetre);


        System.out.println("========================================");


        Carre carre = new Carre(10.0f);   
        carre.dessiner();   
        System.out.println("Surface du Carre: " + carre.surface);
        System.out.println("Perimetre du Carre: " + carre.perimetre);

    }
}