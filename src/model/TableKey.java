package model;

/**
 * The TableKey record represents a custom key for use by the {@link SkillMap} class.
 * The key enables skill -> method -> xp searching.
 *
 * @param skill - skill name
 * @param method - grinding method
 */
public record TableKey(String skill, String method) { }
