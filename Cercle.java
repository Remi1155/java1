public class Cercle extends Forme2d
{

    private float rayon;

    public Cercle(float rayon) 
    {
        this.rayon = rayon;
        this.perimetre = this.calculerPerimetre();
        this.surface = this.calculerSurface();
    }

    @Override
    public void dessiner() 
    {
        System.out.println("Cercle dessiné");
    }

    @Override
    public float calculerSurface() 
    {
        return (float)(Math.PI * rayon * rayon);
    }

    @Override
    public float calculerPerimetre() 
    {
        return (float)(2 * Math.PI * rayon);
    }

}