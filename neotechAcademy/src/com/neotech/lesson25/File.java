package com.neotech.lesson25;

public abstract class File {
	
	public void edit() {
		System.out.println("File can be editted");
	}
	public void close() {
		System.out.println("File can be closed");
	}
	
	public abstract void open();
	
}class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("Java File opens!");
		
	}
	
}class WordFile extends File{

	@Override
	public void open() {
		System.out.println("Word File opens!");
		
	}
	
}class PdfFile extends File{

	@Override
	public void open() {
		System.out.println("Pdf File opens!");
		
	}
	
}
