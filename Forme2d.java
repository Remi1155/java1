public abstract class Forme2d implements IAction
{

    protected float surface;
    protected float perimetre;

    public Forme2d()
    {
        this.surface = 0;
        this.perimetre = 0;
    }
    
    public abstract float calculerSurface();
    public abstract float calculerPerimetre();

}