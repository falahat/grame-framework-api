package runner;

import state.GameState;

public interface GameRunner <STATE extends GameState<?>> {

    /**
     * Called each turn. This will get actions from actors and create a new gamestate from them.
     */
    void turn();

    /**
     * Called when we need to draw the current state of the gameboard. This can be called from a separate thread than "turn".
     */
    void draw();

    STATE getCurrentState();
}
