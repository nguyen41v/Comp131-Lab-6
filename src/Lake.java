import java.awt.*;

import java.awt.Color;
        import java.awt.Graphics;

public class Lake extends GraphicsObject {

    int width;
    int height;
    Color water;
    Color sky;

    public Lake(int x, int y, int width, int height, Color water, Color sky) {
        super(x, y);
        this.width = width;
        this.height = height;
        this.water = water;
        this.sky = sky;
    }

    /* Draw the moon
     *
     * @param green The Graphics for the JPanel
     */
    @Override
    public void draw(Graphics g) {
        // change the color of the pen
        g.setColor(this.water);
        // draw the rectangle
        g.fillOval(this.x, this.y, this.width, this.height);
        g.setColor(this.sky);
        g.fillRect(this.x, this.y - 70, this.width, this.height);

    }

}