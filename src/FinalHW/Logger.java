package FinalHW;

public class Logger implements ILogger {
    @Override
    public void log(String line) {
        System.out.println("LOG: " + line);
    }
}
