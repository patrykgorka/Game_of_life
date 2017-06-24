package game.Strategy;

public class NaroslStrategy extends SurviveStrategy {

    @Override
    protected boolean decideIfKill(int count) {
        if (count == 1) {
            return true;
        }
        return false;
    }

    @Override
    protected boolean decideIfBear(int count) {
        if (count == 1) {
            return true;
        }
        return false;
    }
}