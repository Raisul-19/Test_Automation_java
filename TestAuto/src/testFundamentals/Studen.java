package testFundamentals;

public class Studen {
	
	private int id;
	private String name;
	private String level;
	
	
	public Studen(int id, String name, String level) {
		this.id = id;
		this.name = name;
		this.level = level;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		level = level;
		
	}

}
