
package jogo_encanamento;

public class Agua extends Sprite {
    
    public Agua(int x, int y) {
        super(x, y);
        
        initAgua();
    }
    
    private void initAgua() {
        loadImage("agua.gif");
        getImageDimensions();
    }
    
}
