
import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageTest {

private static final int HEIGHT = 25;
private static final int WIDTH = 25;

public static void drawImage(char[][] data) {

  final BufferedImage img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
  Graphics2D g = (Graphics2D) img.getGraphics();
  for (int i = 0; i < WIDTH; i++) {
    for (int j = 0; j < HEIGHT; j++) {
      if(data[i][j] == 'X')                            //((float) data[i][j]) / 255;
        g.setColor(new Color(37, 231, 245));    //Turqoise 37, 231, 245
      else
        g.setColor(new Color(176, 37, 245));   //Purple 176, 37, 245
      g.fillRect(i, j, 1, 1);
    }
  }

  JFrame frame = new JFrame("Image test");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  JPanel panel = new JPanel() {
    @Override
    protected void paintComponent(Graphics g) {
      Graphics2D g2d = (Graphics2D) g;
      g2d.clearRect(0, 0, getWidth(), getHeight());
      g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
      // Or _BICUBIC
      g2d.scale(2, 2);
      g2d.drawImage(img, 0, 0, this);
    }
  };
  panel.setPreferredSize(new Dimension(WIDTH * 3, HEIGHT * 3));
  frame.getContentPane().add(panel);
  frame.pack();
  frame.setVisible(true);
}
}
