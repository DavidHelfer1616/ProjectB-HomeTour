package fixtures;

public abstract class Fixture {
	
	protected String name;
	protected String shortDescription;
	protected String longDescription;
	protected String options;

	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.shortDescription);
		System.out.println(this.longDescription);
		System.out.println(this.options);
	}
	
	public void errorPrint() {
		System.out.println("Try Again");
	}
	
	public String getName(String name) {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getShortD(String shortDescription) {
		return shortDescription;
	}
	
	public void setShortD(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public String getLongD(String longDescription) {
		return longDescription;
	}
	
	public void setLongD(String longDescription) {
		this.longDescription = longDescription;
	}
	
	public String getOptions(String options) {
		return options;
	}
	
	public void setOptions(String options) {
		this.options = options;
	}
	
	
	
	
	

}
