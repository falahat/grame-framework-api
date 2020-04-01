package state;

/**
 * state.GameState is a generic interface to store the current "state" in any game.
 *
 * For example, for a chess game, this might contain the location of all the pieces and which pieces have been taken.
 * For a Poker game, this might contain all of the hands of each player and which cards are in the deck.
 *
 * @param <COPYTYPE> - When we request copies of this state, this is the return type of the expected copies.
 *        When a programmer implements the state.GameState interface, they must implement the {@link #copy()} method and
 *        return a gamestate of type COPYTYPE.
 *
 *        Most of the time, COPYTYPE will be the type of the implementing class. However, one could return a ReadOnly
 *        version of the class as well.
 *
 */
public interface GameState<COPYTYPE extends GameState<?>> {
    COPYTYPE copy();
}
