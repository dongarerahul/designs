import com.poker.card.Card;
import com.poker.rule.Rule;
import com.poker.rule.StraightRule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.poker.card.Rank.*;
import static com.poker.card.Rank.FIVE;
import static com.poker.card.Suite.*;
import static org.junit.Assert.assertEquals;

public class RuleTest {
    
    private final Rule evaluator = new StraightRule();
    
    @Test
    public void testEvalute(){
        List<Card> list = new ArrayList<Card>();
        list.add(new Card(HEART, ACE));
        list.add(new Card(HEART, TWO));
        list.add(new Card(SPADE, THREE));
        list.add(new Card(DIAMOND, FOUR));
        list.add(new Card(CLUB, FIVE));
        
        assertEquals(true, evaluator.validate(list));
    }
}
