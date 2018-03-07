import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends GraphicsObject {

    int width;
    int height;
    Color color;

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y);
        this.width = width;
        this.height = height;
        this.color = color;
    }

    /* Draw the rectangle
     *
     * @param green The Graphics for the JPanel
     */
    @Override
    public void draw(Graphics g) {
        // change the color of the pen
        g.setColor(this.color);
        // draw the rectangle
        g.fillRect(this.x, this.y, this.width, this.height);
    }

}