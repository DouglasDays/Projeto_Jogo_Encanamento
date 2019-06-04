
package jogo_encanamento;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Sprite {
    //Variáveis da classe
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean visible;
    protected Image img;
    
    //Construtor da classe
    public Sprite(int x, int y) {
        this.x = x;
        this.y = y;
        visible = true;
    }
    
    protected void loadImage(String image) {
        ImageIcon ii = new ImageIcon("src/img/"+image);
        img = ii.getImage();
    }
    
    protected void getImageDimensions() {
        width = img.getWidth(null);
        height = img.getHeight(null);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImg() {
        return img;
    }
    
    public Boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
}
