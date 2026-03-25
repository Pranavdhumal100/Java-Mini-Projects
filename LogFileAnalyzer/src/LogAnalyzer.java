import java.io.*;
import java.util.*;

public class LogAnalyzer {

    public static void main(String[] args) throws Exception {

        List<String> lines = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("log.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        br.close();

        int mid = lines.size() / 2;

        String[] part1 = lines.subList(0, mid).toArray(new String[0]);
        String[] part2 = lines.subList(mid, lines.size()).toArray(new String[0]);

        LogProcessor t1 = new LogProcessor(part1);
        LogProcessor t2 = new LogProcessor(part2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("INFO: " + (t1.infoCount + t2.infoCount));
        System.out.println("ERROR: " + (t1.errorCount + t2.errorCount));
        System.out.println("WARNING: " + (t1.warningCount + t2.warningCount));
    }
}