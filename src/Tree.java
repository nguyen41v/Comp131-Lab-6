import java.awt.*;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Tree extends GraphicsObject {

    Color bark;
    Color leaves;
    int height;
    int width;

    public Tree(int x, int y, Color bark, Color leaves, int height, int width) {
        super(x, y);
        this.bark = bark;
        this.leaves = leaves;
        this.height = height;
        this.width = width;
    }

    /* Draw the Tree
     *
     * @param green The Graphics for the JPanel
     */
    @Override
    public void draw(Graphics g) {
        // change the color of the pen
        g.setColor(this.bark);
        // draw the tree trunk
        g.fillRect(this.x, this.y, this.width, this.height);
        g.setColor(this.leaves);
        int centerX = this.x - (width/2);
        int centerY = this.y - (height/2);
        int center_radius = (width + height) / 2;
        g.fillOval(centerX, centerY, center_radius, center_radius);
        g.fillOval(centerX - 100, centerY + 30, height/2, height/2);
        g.fillOval(centerX - 70, centerY - 70, height/2, height/2);
        g.fillOval(centerX + 30, centerY - 100, center_radius, height/2);
        g.fillOval(centerX + 80, centerY, center_radius - 15, center_radius - 15);


    }

}
