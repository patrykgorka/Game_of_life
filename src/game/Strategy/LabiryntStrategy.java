package game.Strategy;

public class LabiryntStrategy extends SurviveStrategy {

    @Override
    protected boolean decideIfKill(int count) {
        if(count == 0 || count > 5){
            return true;
        }
        return false;
    }

    @Override
    protected boolean decideIfBear(int count) {
        if(count == 3){
            return true;
        }
        return false;
    }

}
