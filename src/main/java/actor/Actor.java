package actor;

import state.GameState;
import state.GameStateView;

import java.util.Collection;

public interface Actor<STATE extends GameState<?>, VIEW extends GameStateView<STATE>> {

    /**
     * @param allowedActions - The domain of actions that the actor will choose from.
     * @return An action given the current gamestate
     * @see #getAllowedActions(GameState)
     */
    Action<STATE> decide(GameStateView<STATE> currentState, Collection<Action<STATE>> allowedActions);

    Action<STATE> decide(GameStateView<STATE> currentState);

    /**
     *
     * @return A collection of actions which are legal for this actor to make given the current postion
     */
    Collection<Action<STATE>> getAllowedActions(STATE currentState);

    /**
     * @return The view that this actor will use to make decisions. This view will determine which features the actor
     * will extract / observe from the global state. This method will calculate the required features immediately.
     */
    VIEW getRequestedView(STATE currentState);

    /**
     * This is called each time the actor makes a decision. The actor can observe the changes and adjust internal parameters
     */
    void learn(Action<STATE> decided, STATE firstState, VIEW firstView, STATE nextState, VIEW nextView);
}
