public class Main
{
    public static void main(String[] args) 
    {

        Cercle cercle = new Cercle(10.0f);
        cercle.dessiner();
        cercle.afficherInfo();


        System.out.println("========================================");


        Carre carre = new Carre(10.0f);   
        carre.dessiner();
        carre.afficherInfo();
        
    }
}