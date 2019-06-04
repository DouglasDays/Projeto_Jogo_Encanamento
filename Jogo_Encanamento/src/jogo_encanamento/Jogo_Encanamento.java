package jogo_encanamento;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Douglas Dias
 */
public class Jogo_Encanamento extends JFrame {
    
    public Jogo_Encanamento() {
        initUI();
    }
    
    private void initUI() {
        add(new Board());
        
        setSize(600, 400);
        
        setTitle("Jogo Encanamento");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFocusable(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Jogo_Encanamento jogo = new Jogo_Encanamento();
            jogo.setVisible(true);
        });
    }
    
}
