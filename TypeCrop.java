package models;

public enum TypeCrop {
		
	BOSQUE(1,"Bosque"),FRUTALES(2,"Frutales"), CEREALES(3,"Cereales");
	
private String name;
private int number;
	
	private TypeCrop(int number, String name) {
		this.name = name;
		this.number = number;
	} 

	public int getNumber(){
		return this.number;

	}
	public String getName() {
		return this.name;
	}
}