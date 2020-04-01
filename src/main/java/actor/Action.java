package actor;

import state.GameState;

/**
 * Represents a generic actor.Action that can be taken by an actor. This must also determine how a game state should be updated
 * if this action is chosen.
 *
 * @param <STATE> - The type of state.GameState that this action operates on.
 */
public interface Action<STATE extends GameState<?>> {
    /**
     * @return actor.Actor which chose this action
     */
    Actor<STATE, ?> getActor();

    /**
     * Executes this current action and updates {@code currentGameState} to reflect this change.
     *
     * For example, for a Pacman game, an actor.Action might be "PacMan Moves Left 1 Tile". Calling {@code updateState} should
     * update {@code currentGameState} such that Pacman is 1 tile to the left.
     *
     * @param currentGameState - Mutable gamestate which will be updated
     */
    void updateState(STATE currentGameState);

    /**
     *
     * @return What will be the reward to the actor upon completing this action?
     * This must be an actual reward and not a prediction or heuristic reward.
     *
     * For example, in a PacMan game, the action of eating a dot could give +1 point.
     *
     */
    double getImmediateReward();
}
