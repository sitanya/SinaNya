package dice.sinanya.tools;

import dice.sinanya.entity.EntityRollAndCheck;
import dice.sinanya.entity.EntityTypeMessages;

import java.util.concurrent.Callable;

import static dice.sinanya.tools.MakeRollCheckResult.makeResult;

public class MakeRcl implements Callable<Integer> {
    EntityTypeMessages entityTypeMessages;
    String rolls;

    public MakeRcl(EntityTypeMessages entityTypeMessages, String rolls) {
        this.entityTypeMessages = entityTypeMessages;
        this.rolls = rolls;
    }

    @Override
    public Integer call() {
        EntityRollAndCheck entityRollAndCheck = makeResult(entityTypeMessages, rolls);
        CheckResultLevel checkResultLevel = new CheckResultLevel(entityRollAndCheck.getRandom(), entityRollAndCheck.getSkill(), true);
        return checkResultLevel.getLevelResult().getLevel();
    }

}
