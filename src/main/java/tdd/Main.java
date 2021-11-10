package tdd;

import heroes.King;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) throws Exception {

        ObjectAnalyzer analyzer = new ObjectAnalyzer();

        analyzer.runAllTestsForClassName("tdd.HeroTest");
    }
}
