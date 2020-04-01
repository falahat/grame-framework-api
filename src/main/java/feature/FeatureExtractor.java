package feature;

import state.GameState;

import java.util.Collection;

/**
 * @param <S> - The type of gamestates this feature extractor can work on
 * @param <F> - The value type of this feature (i.e. Double for a distance-based feature, or Boolean for a yes/no.)
 */
public interface FeatureExtractor <S extends GameState<?>, F extends Feature<?>> {
    Collection<F> get(S state); // TODO: we can cache this by passing state through the constructor and caching the value of get
}
