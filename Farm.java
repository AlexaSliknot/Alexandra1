package models;

import utilities.Utilities;

public class Farm {

	
	private Plot plot;
	private char nomenclature;
	private String nameFarm;
	private int totalSquareMetersFarm;
	private Plot[] plotList; 
	private int numberNomenclature = 1 ;

	
	public Farm(char nomenclature, String nameFarm,int totalSquareMetersFarm) {
		this.nomenclature = nomenclature;
		this.nameFarm = nameFarm;
		this.totalSquareMetersFarm = totalSquareMetersFarm;
	}
	
	public char getNomenclature() {
		return nomenclature;
	}
	public String getNameFarm() {
		return nameFarm;
	}
	public int getTotalSquareMetersFarm() {
		return totalSquareMetersFarm;
	}
	public Plot[] getfarmList() {
		return plotList;
	}
	public Farm(){
		plotList = new Plot[0];
	}
	public Plot createPlot(int number, String namePlot, int squareMetersPlot, TypeCrop typeCrop) {
		this.numberNomenclature = number;
		return new Plot( number, namePlot,squareMetersPlot,typeCrop);
	}

	public int getNomenclatureNumber(){
		numberNomenclature++;
		return numberNomenclature;
	}

	public void addPlot(Plot plot) {
		resizeArray();
		plotList[plotList.length-1] = plot;
	}
	
	private void resizeArray() {
		Plot[] plotListAux = new Plot[plotList.length + 1];
		for (int i = 0; i < plotList.length; i++) {
			 plotListAux[i] = plotList[i];
		}
		plotList = plotListAux;
	}
	
	
	public int calcultateTotalPlotMetter() {
		int totalMetterSquarePlot = 0;
		for (int i = 0; i < plotList.length; i++) {
			totalMetterSquarePlot += plotList[i].getSquareMetersPlot();
		}
	    return totalMetterSquarePlot;
	}
	
	public Object[][] toMatrixVector() {
		int sizeDatas = plotList[0].toObjectVectorPlot().length;
		Object[][] datasMatrix = new Object[plotList.length][sizeDatas];
		for (int i = 0; i < datasMatrix.length; i++) {
			datasMatrix[i] = plotList[i].toObjectVectorPlot();
		}
		return datasMatrix;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	public Object[] toObjectVector(){
		return Utilities.concatObjectArrays(new Object[] {nomenclature,nameFarm},plot.toObjectVectorPlot());
	}

}
