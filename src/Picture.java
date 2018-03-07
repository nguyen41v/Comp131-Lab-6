// utility stuff
import java.util.ArrayList;

// graphics stuff
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Picture extends JPanel {
    private int canvasWidth;
    private int canvasHeight;

    private ArrayList<GraphicsObject> objects;

    /* Constructor for a window/canvas of a specified size
     *
     * @param width  The width of the canvas.
     * @param height The height of the canvas.
     */
    public Picture(int width, int height) {
        this.canvasWidth = width;
        this.canvasHeight = height;
        this.objects = new ArrayList<GraphicsObject>();
    }

    /* Creates the window and shows it
     */
    public void showCanvas() {
        JFrame frame = new JFrame("Picture");
        frame.getContentPane().add(this, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = new Dimension(this.canvasWidth, this.canvasHeight);
        frame.getContentPane().setPreferredSize(dim);
        frame.pack();
        frame.setVisible(true);
    }

    /* Convenience function to paint all objects.
     */
    public void paint() {
        this.paint(this.getGraphics());
    }

    /* Paint/Draw the canvas.
     *
     * This function overrides the paint function in JPanel. This function is
     * automatically called when the panel is made visible.
     *
     * @param green The Graphics for the JPanel
     */
    @Override
    public void paint(Graphics g) {
        // use a for-each loop to draw each object
        for (GraphicsObject obj : this.objects) {
            obj.draw(g);
        }
    }

    /* Add an object to be draw.
     *
     * @param obj The object to draw.
     */
    public void addObject(GraphicsObject obj) {
        this.objects.add(obj);
    }

    public static void main(String[] args) {
        // make a picture that is 560x560 pixels
        Picture pic = new Picture(1000, 1000);

        // FIXME add the objects for your picture here
        Color sky = new Color (42, 2, 122);
        Color water = new Color(2,145,154);
        Color sky_objects = new Color(255, 254, 189);
        pic.addObject(new Rectangle(0, 0, 1000, 1000, sky));
        pic.addObject(new Rectangle(1000, 700, 1000, 300, new Color(0,0,0)));
        pic.addObject(new Grass(1000, 300, 1000, 1000));
        pic.addObject(new Lake(450, 695, 500, 60, water, sky));
        pic.addObject(new Moon(700, 100, 150, 255, 254, 189, sky));
        pic.addObject(new Moon(700, 700, 50, 255, 254, 189, water));
        pic.addObject(new Stars(1000, 690, 0,0, sky, sky_objects, 300));
        pic.addObject(new Stars(950, 60, 450, 695, sky, sky_objects, 100));
        pic.addObject(new Grass(1000, 1, 750, 20));
        pic.addObject(new Tree(200, 400, new Color(120, 230, 255), new Color (255, 92, 203), 350, 50));



        // for something more complicated, uncomment the next line
        //pic.addObject(new Mondrian(0, 0));

        pic.showCanvas();
        pic.paint();
    }

}