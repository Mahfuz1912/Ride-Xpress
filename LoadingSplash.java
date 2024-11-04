import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class LoadingSplash extends JFrame {
  
  private JPanel splashPanel, progressPanel;
  private Image splashImage;
  private JProgressBar progressBar;
  
  public LoadingSplash() {
    
    splashImage = new ImageIcon("splash.png").getImage();
    
   
    splashPanel = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(splashImage, 0, 0, this);
      }
    };
    splashPanel.setPreferredSize(new Dimension(splashImage.getWidth(null), splashImage.getHeight(null)));
    
   
    progressPanel = new JPanel(new BorderLayout());
    progressPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    
   
    progressBar = new JProgressBar();
    progressBar.setStringPainted(true);
    progressBar.setForeground(Color.BLUE);
    progressPanel.add(progressBar, BorderLayout.CENTER);
    
   
    add(splashPanel, BorderLayout.CENTER);
    add(progressPanel, BorderLayout.SOUTH);
    
   
    setUndecorated(true);
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
    
   
    for (int i = 1; i <= 100; i++) {
      progressBar.setValue(i);
      try {
        Thread.sleep(50);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
   
    dispose();
  }
  
  public static void main(String[] args) {
    new LoadingSplash();
  }

}