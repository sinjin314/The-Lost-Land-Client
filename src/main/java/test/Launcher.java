package test;

import org.lwjgl.Version;
import org.tll.core.WindowManager;

public class Launcher {

    public static void main(String[] args) {
        System.out.println("This is the lwjgl version!" + Version.getVersion() + "!");
        WindowManager window = new WindowManager("Test", 800, 600, true);
        window.init();

        while (!window.shouldClose()) {
            window.update();
        }

        window.cleanUp();
    }
}
