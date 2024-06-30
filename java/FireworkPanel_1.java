
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Panel in which you can see fireworks.
 */
public class FireworkPanel_1 extends JPanel {

    private static final long serialVersionUID = 5053650234847311814L;
    private Timer timer;
    private static final int DELAY = 0, DIVIDER = 180, MULTIPLY_FACTOR = 36, LINE_LENGTH = 2, FIREWORK_RADIUS = 75;
    private static final int ARRAY_LENGTH = 10;
    private static int X_CENTER[] = new int[ARRAY_LENGTH], Y_CENTER[] = new int[ARRAY_LENGTH];
    private static Color colors[] = new Color[ARRAY_LENGTH];
    private static final double PI = 3.14159;
    int x[] = new int[10], y[] = new int[10];
    private int x1, moveX, index, color_index;
    List<Integer> xx = new ArrayList<Integer>();
    List<Integer> yy = new ArrayList<Integer>();

    public FireworkPanel_1() {
        x1 = index = color_index = 0;
        moveX = 3;
        timer = new Timer(DELAY, new MyChangeListener());
        timer.start();
        X_CENTER[0] = 100;
        Y_CENTER[0] = 100;

        X_CENTER[1] = 200;
        Y_CENTER[1] = 200;

        X_CENTER[2] = 300;
        Y_CENTER[2] = 300;

        X_CENTER[3] = 400;
        Y_CENTER[3] = 400;

        X_CENTER[4] = 500;
        Y_CENTER[4] = 500;

        X_CENTER[5] = 600;
        Y_CENTER[5] = 600;

        X_CENTER[6] = 700;
        Y_CENTER[6] = 600;

        X_CENTER[7] = 800;
        Y_CENTER[7] = 600;

        X_CENTER[8] = 900;
        Y_CENTER[8] = 700;

        X_CENTER[9] = 1000;
        Y_CENTER[9] = 800;

        colors[0] = Color.ORANGE;
        colors[1] = Color.BLUE;
        colors[2] = Color.CYAN;
        colors[3] = Color.RED;
        colors[4] = Color.PINK;
        colors[5] = Color.green;
        colors[6] = Color.DARK_GRAY;
        colors[7] = Color.darkGray;
        colors[8] = Color.red;
        colors[9] = Color.MAGENTA;

        setBackground(Color.black);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2d = (Graphics2D) g;
        Stroke stroke = new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 5, new float[]{9}, 0);
        graphics2d.setStroke(stroke);
        graphics2d.setColor(colors[color_index]);
        for (int i = 0; i < xx.size(); i++) {
            graphics2d.drawLine(xx.get(i), yy.get(i), xx.get(i) + LINE_LENGTH, yy.get(i) + LINE_LENGTH);
        }
    }

    class MyChangeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            x1 += moveX;
            if (x1 == 0 || x1 >= FIREWORK_RADIUS) {
                x1 = 0;
                Random random = new Random();
                index = random.nextInt(ARRAY_LENGTH);
                color_index = random.nextInt(ARRAY_LENGTH);
            }
            xx.clear();
            yy.clear();
            for (int i = 0; i < 10; i++) {
                xx.add((int) (X_CENTER[index] + x1 * Math.cos((MULTIPLY_FACTOR * i * PI) / DIVIDER)));
                yy.add((int) (Y_CENTER[index] + x1 * Math.sin((MULTIPLY_FACTOR * i * PI) / DIVIDER)));
            }
            repaint();
        }
    }
}
