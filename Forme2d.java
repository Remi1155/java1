public abstract class Forme2d implements IAction
{

    public abstract float calculerSurface();
    public abstract float calculerPerimetre();

    public float getSurface()
    {
        return calculerSurface();
    }

    public float getPerimetre()
    {
        return calculerPerimetre();
    }

    public void afficherInfo()
    {
        System.out.println("Surface : " + getSurface());
        System.out.println("Perimetre : " + getPerimetre());
    }

}