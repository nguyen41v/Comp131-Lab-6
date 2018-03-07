import java.awt.Color;
import java.awt.Graphics;

public class Moon extends GraphicsObject {

    int radius;
    int red;
    int green;
    int blue;
    Color color;
    Color sky;

    public Moon(int x, int y, int radius, int r, int gr, int b, Color sky) {
        super(x, y);
        this.radius = radius;
        this.red = r;
        this.green = gr;
        this.blue = b;
        this.sky = sky;
    }

    /* Draw the moon
     *
     * @param green The Graphics for the JPanel
     */
    @Override
    public void draw(Graphics g) {
        // change the color of the pen
        //while ((this.red > 0) && (this.green > 0) && (this.blue > 0) && (radius > 0)) {
            color = new Color(this.red, this.green, this.blue);
            g.setColor(this.color);
            g.fillOval(this.x, this.y, this.radius, this.radius);
            g.setColor(sky);
            g.fillOval(this.x - radius/10, this.y, this.radius, this.radius);
            /*this.red -= 10;
            this.green -= 10;
            this.blue -= 10;
            this.radius -= 8;
            this.x += 4;
            this.y += 4;
        }
        */

        /*int i = 0;
        while (i < 3) {
            if ((this.red > 0) && (this.green > 0) && (this.blue > 0) && (radius > 0)) {
                color = new Color(this.red, this.green, this.blue);
                g.setColor(this.color);
                g.fillOval(this.x, this.y, this.radius, this.radius);
                this.red -= 10;
                this.green -= 10;
                this.blue -= 10;
                this.radius -= 10;
                this.x += 5;
                this.y += 5;
                i += 1;
            } else {
                i = 40;
            }
        }*/
    }
}
