import com.poker.scanner.CardScanner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CardRankTest.class,
        CardSuiteTest.class,
        CardScanner.class,
        RuleTest.class,
        PokerGameTest.class
})

public class AllTests { }
