import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Stars extends GraphicsObject {

    Color sky;
    Color star;
    int sky_x;
    int sky_y;
    int low_x;
    int low_y;
    int radius = 10;
    int iterations;

    public Stars(int sky_x, int sky_y, int low_x, int low_y, Color sky, Color star, int iterations) {
        super(sky_x, sky_y);
        this.sky = sky;
        this.star = star;
        this.sky_x = sky_x;
        this.sky_y = sky_y;
        this.low_x = low_x;
        this.low_y = low_y;
        this.iterations = iterations;
    }

    /* Draw the star
     *
     * @param green The Graphics for the JPanel
     */
    @Override
    public void draw(Graphics g) {
        int i = 0;
        while (i < iterations) {
            g.setColor(this.star);
            Random num = new Random();
            int leavesX = num.nextInt(this.sky_x) + low_x;
            int leavesY = num.nextInt(this.sky_y) + low_y;
            int radius = num.nextInt(this.radius);
            g.fillOval(leavesX, leavesY, radius, radius);
            i += 1;
        }


    }

}
