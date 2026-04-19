
package model;

public class Coordenada {
    private int pos_x;
    private int pos_y;
    private static Coordenada instance;
    
    private Coordenada() {this.pos_x=0; this.pos_y=0;}
    
    public static Coordenada getInstance()
    {
        if (instance==null)
        {
            instance = new Coordenada();
        }
        return instance;
    }
    private int getPos_x() {return pos_x;}
    private int getPos_y() {return pos_y;}
    private void setPos_x (int newPos_x) {pos_x = newPos_x;}
    private void setPos_y (int newPos_y) {pos_y; = newPos_y;}
}
