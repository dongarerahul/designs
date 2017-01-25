import com.game.card.CardRankTest;
import com.game.card.CardSuiteTest;
import com.game.card.CardTest;
import com.game.poker.PokerGameTest;
import com.game.poker.RuleTest;
import com.game.scanner.Deck52ScannerTest;
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
