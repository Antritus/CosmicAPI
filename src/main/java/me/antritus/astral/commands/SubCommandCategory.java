package me.antritus.astral.commands;

public enum SubCommandCategory {
	ADMIN("admin"),
	SETTINGS("settings"),
	UNKNOWN(),

	PLAYER("player"),
	CONSOLE("console"),
	;
	private final String[] categories;
	SubCommandCategory(String... types) {
		this.categories = types;
	}

	public String[] getCategories() {
		return categories;
	}
}
