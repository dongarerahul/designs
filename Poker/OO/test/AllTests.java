import game.scanner.Deck52Scanner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CardRankTest.class,
        CardSuiteTest.class,
        Deck52ScannerTest.class,
        CardTest.class, 
        RuleTest.class,
        PokerGameTest.class
})

public class AllTests { }
