package controllers;

import models.*;
import views.Console;

public class Controller {
	
	private FamilyGroup familyGroup;
	private Farm farm;
	private Console console;
	
	public Controller() {
		console = new Console();
		familyGroup = new FamilyGroup();
		createFamilyGroup();
		manageApp();
	}

	private void createFamilyGroup() {
		familyGroup.addFarm(new Farm('A', "Finca Grande",100000));
	//	familyGroup.addPlotToFarm('A', new Plot(1,"Campo Bajo", 100,TypeCrop.BOSQUE));
	//	familyGroup.addFarm(new Farm('B', "Finca chica",100000));
	//	familyGroup.addPlotToFarm('B', new Plot(1,"Campo Alto", 100,TypeCrop.BOSQUE));
	}
	
	private void manageApp() {
		console.showDatas(familyGroup.toMatrixVector());	
	}
	
	private Farm createFarm() {
		char nomenclatureFarm = familyGroup.getNomenclatureLetter();
		String nameFarm = console.readNameFarm();
		int totalSquareMetersFarm = console.readMeterSquareFarm();
		return new Farm(nomenclatureFarm,nameFarm,totalSquareMetersFarm);
	}
	private Plot createPlot() {
		int  number = farm.getNomenclatureNumber();
		String nameString = console.readNamePlot();
		int squareMeterPlot = console.readMeterSquarePlot();
		TypeCrop typeCrop = console.readTypeCrop();
		return new Plot(number,nameString,squareMeterPlot,typeCrop);
	}
}
