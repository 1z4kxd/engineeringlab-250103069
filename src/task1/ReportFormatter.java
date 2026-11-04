package task1;

/** Strategy: interchangeable report formatting. */
public interface ReportFormatter {
    String format(String title, String[] headers, String[][] rows);
}
