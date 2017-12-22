import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel
{
    public int x;
    public int y;

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.ORANGE);
        g2d.fillOval(x, y, 30, 30);
    }

    public static void main(String[] args) throws InterruptedException
    {
        JFrame frame = new JFrame("Шар в стакане");
        Game game = new Game();
        frame.add(game);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Ball ball = new Ball(150, 200, 1, 1);

        while (true)
        {
            ball.moveBall();
            game.x = ball.getX();
            game.y = ball.getY();
            game.repaint();
            Thread.sleep(5);
        }
    }
}

class Ball
{
    private int x = 150;
    private int y = 200;
    private int directionX = 1; // Can be 1 and -1
    private int directionY = 1; // Can be 1 and -1

    public Ball(int x, int y, int directionX, int directionY)
    {
        this.x = x;
        this.y = y;
        this.directionX = directionX;
        this.directionY = directionY;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getDirectionX()
    {
        return directionX;
    }

    public void setDirectionX(int directionX)
    {
        this.directionX = directionX;
    }

    public int getDirectionY()
    {
        return directionY;
    }

    public void setDirectionY(int directionY)
    {
        this.directionY = directionY;
    }

    public void moveBall()
    {
        x = x + directionX;
        if (x>255) directionX = -1;
        if (x<0) directionX = 1;

        y = y + directionY;
        if (y>330) directionY = -1;
        if (y<0) directionY = 1;
    }
}