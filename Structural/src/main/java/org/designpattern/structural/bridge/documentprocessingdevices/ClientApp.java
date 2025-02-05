package org.designpattern.structural.bridge.documentprocessingdevices;

import org.designpattern.structural.bridge.documentprocessingdevices.abstraction.Document;
import org.designpattern.structural.bridge.documentprocessingdevices.abstraction.ExcelDocument;
import org.designpattern.structural.bridge.documentprocessingdevices.abstraction.PDFDocument;
import org.designpattern.structural.bridge.documentprocessingdevices.abstraction.WordDocument;
import org.designpattern.structural.bridge.documentprocessingdevices.implementation.Printer;
import org.designpattern.structural.bridge.documentprocessingdevices.implementation.Projector;
import org.designpattern.structural.bridge.documentprocessingdevices.implementation.Screen;

public class ClientApp
{
	public static void main(String[] args)
	{
		Document pdfOnPrinter = new PDFDocument(new Printer());
		pdfOnPrinter.render();
		// Output: Printing: PDF Content

		Document wordOnScreen = new WordDocument(new Screen());
		wordOnScreen.render();
		// Output: Displaying on Screen: Word Content

		Document excelOnProjector = new ExcelDocument(new Projector());
		excelOnProjector.render();
		// Output: Projecting: Excel Content
	}
}
