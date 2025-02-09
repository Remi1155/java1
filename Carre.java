public class Carre extends Forme2d
{
    private float cote;

    public Carre(float cote) 
    {
        this.cote = cote;
    }

    @Override
    public void dessiner() 
    {
        System.out.println("Carre dessiné");
    }

    @Override
    public float calculerSurface() 
    {
        return (float)(cote * cote);
    }

    @Override
    public float calculerPerimetre() 
    {
        return (float)(4 * cote);
    }
    
}
