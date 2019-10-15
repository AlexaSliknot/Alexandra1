package views;

import java.util.Scanner;
import utilities.*;
import models.TypeCrop;

public class Console {
	
	private Scanner scanner;
	
	public static final String FORMAT = "%1$-15s %2$-15s %3$-10s %4$-15s %5$-15s";
	public static final Object[] HEADERS = {"Finca/Parcela","Nombre Finca", "Nombre Parcela","Tipo cultivo", "m2 Parcela"};
	
	public Console() {
		scanner = new Scanner( System.in );
	}
	
	public void generateHeader() {
		System.out.println( String.format(FORMAT, HEADERS ));
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public void showDatas( Object[][] datasFarm ) { 
		generateHeader();
		for (int i = 0; i < datasFarm.length; i++) {
			System.out.println( String.format( FORMAT, datasFarm[i] ));
		}
	}

	public String readNameFarm() {
		System.out.println("*********Agregar Finca************");
		System.out.println( "Ingrese Nombre de Finca");
		return scanner.nextLine();
	}

	public int readMeterSquareFarm() {
		System.out.println( "Ingrese metros cuadrados totales de la Finca");
		return Integer.parseInt(scanner.nextLine());
	}

	public String readNamePlot(){
		System.out.println("*********Agregar Parcela************");
		System.out.println("Ingrese Nombre de Parcela");
		return scanner.nextLine();
	}

	public int readMeterSquarePlot(){
		System.out.println( "Ingrese metros cuadrados totales de la Parcela");
		return Integer.parseInt(scanner.nextLine());
	}

	public TypeCrop readTypeCrop() {
		for (TypeCrop typeCrop : TypeCrop.values()) {
			 System.out.println("\n " + typeCrop.getNumber() + " " + typeCrop.getName());
		}
		System.out.println("Ingrese digito del tipo de cultivo");
		int selection = Integer.parseInt( scanner.nextLine() );
		return Utilities.getTypeCrop( selection );
	}
}
