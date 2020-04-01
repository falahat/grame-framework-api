package state;

import feature.FeatureExtractor;

import java.util.Collection;

public interface GameStateView<S extends GameState<?>> {
    Collection<FeatureExtractor<S, ?>> getRequiredExtractors();
}
