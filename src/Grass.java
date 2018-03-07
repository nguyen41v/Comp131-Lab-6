import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Grass extends GraphicsObject {

    int ground_x;
    int ground_y;
    int size;
    int length = 20;
    int iterations;

    public Grass(int ground_x, int ground_y, int size, int iterations) {
        super(ground_x, ground_y);
        this.ground_x = ground_x;
        this.ground_y = ground_y;
        this.size = size;
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
            g.setColor(new Color(156, 255, 243));
            Random num = new Random();
            int grass_x = num.nextInt(this.ground_x);
            int grass_y = size - num.nextInt(this.ground_y);
            int length = num.nextInt(this.length);
            g.fillRect(grass_x, grass_y, 5, length);

            g.setColor(new Color(5, 255, 43));
            grass_x = num.nextInt(this.ground_x);
            grass_y = size - num.nextInt(this.ground_y);
            length = num.nextInt(this.length);
            g.fillRect(grass_x, grass_y, 5, length);

            g.setColor(new Color(255, 0, 0));
            grass_x = num.nextInt(this.ground_x);
            grass_y = size - num.nextInt(this.ground_y);
            length = num.nextInt(this.length);
            g.fillRect(grass_x, grass_y, 5, length);

            g.setColor(new Color(242, 255, 0));
            grass_x = num.nextInt(this.ground_x);
            grass_y = size - num.nextInt(this.ground_y);
            length = num.nextInt(this.length);
            g.fillRect(grass_x, grass_y, 5, length);

            g.setColor(new Color(206, 145, 255));
            grass_x = num.nextInt(this.ground_x);
            grass_y = size - num.nextInt(this.ground_y);
            length = num.nextInt(this.length);
            g.fillRect(grass_x, grass_y, 5, length);

            g.setColor(new Color(255, 255, 255));
            grass_x = num.nextInt(this.ground_x);
            grass_y = size - num.nextInt(this.ground_y);
            length = num.nextInt(this.length);
            g.fillRect(grass_x, grass_y, 5, length);

            i += 1;
        }


    }

}
