package utility;

public class ScreenContext {

	private static ThreadLocal<String> screen = new ThreadLocal<>();

    public static void setScreen(String screenName) {
        screen.set(screenName);
    }

    public static String getScreen() {
        return screen.get();
    }

    public static void clear() {
        screen.remove();
    }
}
