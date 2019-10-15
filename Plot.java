package models;

public class Plot {

	private int number;
	private String namePlot;
	private int squareMetersPlot;
	private TypeCrop typeCrop;
	
	public Plot( int number, String namePlot, int squareMetersPlot, TypeCrop typeCrop) {
		this.number = number;
		this.namePlot = namePlot;
		this.squareMetersPlot = squareMetersPlot;
		this.typeCrop = typeCrop;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getNamePlot() {
		return namePlot;
	}
	public void setNamePlot(String namePlot) {
		this.namePlot = namePlot;
	}
	public int getSquareMetersPlot() {
		return squareMetersPlot;
	}
	public void setSquareMetersPlot(int squareMetersPlot) {
		this.squareMetersPlot = squareMetersPlot;
	}
	public TypeCrop getTypeCrop() {
		return typeCrop;
	}
	public void setTypeCrop(TypeCrop typeCrop) {
		this.typeCrop = typeCrop;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	public Object[] toObjectVectorPlot(){
		return (new Object[] {namePlot,typeCrop,squareMetersPlot});
	}
}
