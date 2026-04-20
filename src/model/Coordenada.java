
package model;

public class Coordenada {
    private int pos_x;
    private int pos_z;
    private static Coordenada instance;
    
    private Coordenada() {this.pos_x=0; this.pos_z=0;}
    
    public static Coordenada getInstance()
    {
        if (instance==null)
        {
            instance = new Coordenada();
        }
        return instance;
    }
    public int getPos_x() {return pos_x;}
    public int getPos_z() {return pos_z;}
    private void setPos_x(int newPosX) {pos_x=newPosX;}
    private void setPos_z(int newPosZ) {pos_z=newPosZ;}
    
    
    
    public void OverWorld_Nether(int posX, int posZ, int pularX, int pularZ)
    {
        int novaX = (posX + pularX) / 8;
        int novaZ = (posZ + pularZ) / 8;
        setPos_x(novaX);
        setPos_z(novaZ);
    }
    
    public void Nether_OverWorld(int posX, int posZ, int pularX, int pularZ)
    {
        int novaX = (posX + pularX) * 8;
        int novaZ = (posZ + pularZ) * 8;
        setPos_x(novaX);
        setPos_z(novaZ);
    }
}
