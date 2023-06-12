package InterfazGrafica;

import javax.swing.JFrame;

public class FrameUtils {
    public static void disposeFrame(JFrame frame) {
        if (frame != null) {
            frame.dispose();
        }
    }
}
