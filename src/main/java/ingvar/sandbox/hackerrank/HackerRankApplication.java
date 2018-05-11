package ingvar.sandbox.hackerrank;

import ingvar.sandbox.hackerrank.problemsolving.DiagonalDiffSolution;
import ingvar.sandbox.hackerrank.problemsolving.PlusMinusSolution;
import ingvar.sandbox.hackerrank.problemsolving.Solution;
import ingvar.sandbox.hackerrank.problemsolving.StaircaseSolution;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static ingvar.sandbox.hackerrank.util.ConsoleWriter.out;
import static ingvar.sandbox.hackerrank.util.ConsoleWriter.outln;

/** **/
@SpringBootApplication
public class HackerRankApplication implements CommandLineRunner {
    private static final Scanner scan = new Scanner(System.in);

    private Map<Integer, Solution> solutions;

    /**  **/
    public static void main(String[] args) {
        SpringApplication.run(HackerRankApplication.class, args);
    }

    @Override
    public void run(String... args) {
        init();
        menu();

        int choice = Integer.parseInt(scan.nextLine().trim());

        while (choice != -1) {
            Solution solution = solutions.get(choice);

            if (solution != null) {
                outln("\n\n\nYour choice : %s\n", solution.name());
                solution.solve();
                outln("\n");
            }
            menu();
            choice = Integer.parseInt(scan.nextLine().trim());
        }
        outln("Finished!");
    }

    /**  **/
    private void init() {
        solutions = new TreeMap<>();

        solutions.put(1, new DiagonalDiffSolution());
        solutions.put(2, new PlusMinusSolution());
        solutions.put(3, new StaircaseSolution());
    }

    /**  **/
    private void menu() {
        outln("Available solutions:");

        for (Integer key : solutions.keySet()) {
            outln("%5d. %s", key, solutions.get(key).name());
        }
        outln("--------------------------------------------");
        out("Make your choice (-1 for exit) : ");
    }
}
