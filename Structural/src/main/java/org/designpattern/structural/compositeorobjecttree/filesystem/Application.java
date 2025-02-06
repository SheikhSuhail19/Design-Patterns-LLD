package org.designpattern.structural.compositeorobjecttree.filesystem;

public class Application
{
	public static void main(String[] args)
	{
		// Creating files
		File file1 = new File("Document1.txt");
		File file2 = new File("Photo.png");
		File file3 = new File("Video.mp4");
		File file4 = new File("Notes.txt");

		// Creating folders
		Folder rootFolder = new Folder("Root");
		Folder subFolder1 = new Folder("Documents");
		Folder subFolder2 = new Folder("Media");
		Folder subFolder3 = new Folder("Text Files");

		// Adding files to folders
		subFolder1.addComponent(file1);
		subFolder1.addComponent(subFolder3);  // Adding nested folder
		subFolder3.addComponent(file4);       // Adding file inside nested folder
		subFolder2.addComponent(file2);
		subFolder2.addComponent(file3);

		// Adding subfolders to root folder
		rootFolder.addComponent(subFolder1);
		rootFolder.addComponent(subFolder2);

		// Displaying the file system structure
		rootFolder.showDetails(0);
	}
}
