
package jogo_encanamento;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {
    
    private Cano cano;
    private Agua agua;
    
    private final int DELAY = 20;
    
    public Board() {
        initBoard();
    }
    
    private void initBoard() {
        cano = new Cano(40, 40);
        agua = new Agua(40, 168);
        
        Timer timer  = new Timer(DELAY, this);
        timer.start();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        doDrawing(g);
        
        Toolkit.getDefaultToolkit().sync();
    }
    
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.drawImage(cano.getImg(), cano.getX(), cano.getY(), this);
        
        g2d.drawImage(agua.getImg(), agua.getX(), agua.getY(), this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        repaint();
    }
}
