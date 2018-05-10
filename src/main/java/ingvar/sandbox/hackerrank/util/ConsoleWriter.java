package ingvar.sandbox.hackerrank.util;

public class ConsoleWriter {
    /**  **/
    public static void out(String format, Object ... args) {
        System.out.print(String.format(format, args));
    }

    /**  **/
    public static void outln(String format, Object ... args) {
        System.out.println(String.format(format, args));
    }
}
