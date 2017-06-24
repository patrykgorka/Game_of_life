package game.Strategy;

public class ConweyStrategy extends SurviveStrategy {

    @Override
    protected boolean decideIfKill(int count) {
        if(count < 2 || count > 3) {
            return true;
        }
        return false;
    }

    @Override
    protected boolean decideIfBear(int count) {
        if(count == 3) {
            return true;
        }
        return false;
    }

}
