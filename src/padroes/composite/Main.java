package padroes.composite;

import java.util.ArrayList;
import java.util.List;

import padroes.composite.model.FileSystemItem;
import padroes.composite.model.Folder;

public class Main {
	
	public static FileSystemItem createCompositeFromFile(java.io.File file) {
		if(!file.isDirectory()) return new padroes.composite.model.File(file.getName());
		List<FileSystemItem> childs = new ArrayList<>();
		java.io.File[] files = file.listFiles();
		for(java.io.File javaFile: files){
			childs.add(createCompositeFromFile(javaFile));
		}
		return new Folder(file.getName(), childs);
	}

	public static void main(String[] args) {

		//folder.print("");
		
		System.out.println("----------");
		
		String dir = System.getProperty("user.dir");
		FileSystemItem fromDisk = createCompositeFromFile(new java.io.File(dir + java.io.File.separator + "src"));
		fromDisk.print(">");
	}
}
