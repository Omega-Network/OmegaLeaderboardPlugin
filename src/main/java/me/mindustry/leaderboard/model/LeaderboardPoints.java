package me.mindustry.leaderboard.model;

import org.jetbrains.annotations.*;

public interface LeaderboardPoints {

  static @NotNull LeaderboardPoints of(final @NotNull String name, final @NotNull String description, final long points, final boolean silent) {
    return new SimpleLeaderboardPoints(name, description, points, silent);
  }

  static @NotNull LeaderboardPoints of(final @NotNull String name, final @NotNull String description, final long points) {
    return new SimpleLeaderboardPoints(name, description, points);
  }

  static @NotNull LeaderboardPoints of(final @NotNull String name, final long points, final boolean silent) {
    return new SimpleLeaderboardPoints(name, points, silent);
  }

  static @NotNull LeaderboardPoints of(final @NotNull String name, final long points) {
    return new SimpleLeaderboardPoints(name, points);
  }

  @NotNull String getName();

  @NotNull String getDescription();

  long getPoints();

  /**
   * Returns whether the player should be notified when getting the points or not.
   */
  default boolean isSilent() {
    return false;
  }
}
