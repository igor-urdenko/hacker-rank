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

    /**  **/
    public static String arr2str(int [] arr) {
        if (arr == null || arr.length == 0) {
            return "[ ]";
        }
        StringBuilder sb = new StringBuilder("[ ");

        for (int n : arr) {
            sb.append(n).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}
