import java.util.LinkedList;
import javax.swing.*;
public class SnakeGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        frame.add(new GamePanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
private LinkedList<Point> snake;
private char direction = 'R';
private boolean running = false;
private javax.swing.Timer timer;

public void startGame() {
    snake = new LinkedList<>();
    snake.add(new Point(5, 5));
    direction = 'R';
    running = true;
    timer = new javax.swing.Timer(150, this);
    timer.start();
}
private Point food;
private void spawnFood() {
    int x = (int)(Math.random() * (width / boxSize));
    int y = (int)(Math.random() * (height / boxSize));
    food = new Point(x, y);
}




