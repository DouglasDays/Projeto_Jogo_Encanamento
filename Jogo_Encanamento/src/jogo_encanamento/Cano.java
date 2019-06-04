
package jogo_encanamento;

public class Cano extends Sprite {
    
    public Cano(int x, int y) {
        super(x, y);
        
        initCano();
    }
    
    private void initCano() {
        loadImage("cano.png");
        getImageDimensions();
    }
    
}
