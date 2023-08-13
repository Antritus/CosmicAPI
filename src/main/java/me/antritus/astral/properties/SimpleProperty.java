package me.antritus.astral;

/**
 * @author Antritus
 * @since 1.1-SNAPSHOT
 */
public class SimpleProperty<T> extends Property<String, T>{
	public SimpleProperty(String key, T value) {
		super(key, value);
	}
}
