/* name: 病毒 
 * Auther: maical
 * 
 */

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.AWTException;
import java.awt.Robot;
import java.math.BigInteger;

public class Main {

    // 窗口生成
    private void window() {
        while (true) {
            // 随机数
            int temp_1 = (int) (Math.random() * 1920);
            int temp_2 = (int) (Math.random() * 1080);
            // 窗口生成
            JFrame jframe = new JFrame("只因你太美");
            jframe.setSize(300, 150);
            jframe.setVisible(true);
            jframe.setLocation(temp_1, temp_2);
        }

    }

    // 鼠标控制
    private void MouseMove() throws AWTException {
        while (true) {
            int mousemove_1 = (int) (Math.random() * 1920);
            int mousemove_2 = (int) (Math.random() * 1080);
            Robot robot = new Robot();
            robot.mouseMove(mousemove_1, mousemove_2);
        }

    }

    public static void main(String[] args) throws AWTException {
        Main main = new Main();
        main.window();
        main.MouseMove();
    }
}