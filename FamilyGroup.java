package models;

public class FamilyGroup {

	private Farm[] farmList;
	private Farm farm;
	public static final int TOTAL_FARM = 1000000;
	private char letter = 65;

	public FamilyGroup() {
		farmList = new Farm[0];
	}

	public Farm createFarm(char nomenclatureFarm, String nameFarm, int totalSquareMetersFarm) {
		this.letter = nomenclatureFarm;
		return new Farm(nomenclatureFarm, nameFarm, totalSquareMetersFarm);
	}

	public char getNomenclatureLetter(){
		letter++;
		return letter;
	}

	public void addFarm(Farm farm) {
		resizeArray();
		farmList[farmList.length - 1] = farm;
	}

	private void resizeArray() {
		Farm[] farmListAux = new Farm[farmList.length + 1];
		for (int i = 0; i < farmList.length; i++) {
			farmListAux[i] = farmList[i];
		}
		farmList = farmListAux;
	}

	public Object[][] toMatrixVector() {
		int sizeDatas = farmList[0].toObjectVector().length;
		Object[][] datasMatrix = new Object[farmList.length][sizeDatas];
		for (int i = 0; i < datasMatrix.length; i++) {
			datasMatrix[i] = farmList[i].toObjectVector();
		}
		return datasMatrix;
	}

	public int searchFarmPosition(char nomenclatureFarm) {
		for (int i = 0; i < farmList.length; i++) {
			if (nomenclatureFarm == farmList[i].getNomenclature()) {
				return i;
			}
		}
		return -1;
	}

	public void addPlotToFarm(char nomenclatureFarm,Plot plot ) {
		int resultSearch = searchFarmPosition(nomenclatureFarm);
		for (int i = 0; i < farmList.length; i++) {
			if( (i == resultSearch) ) {
				farmList[i].addPlot(plot);
			}	
		}
	}
}
