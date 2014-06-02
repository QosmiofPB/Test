

public enum Loot {

	Meat("Meat", 0), Leather("Leather", 0), Bones("Bones", 0);

	private int id;
	private String name;

	private Loot(String name, int id) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
