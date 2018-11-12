package listalogs;

import java.io.File;

public class ListarLogs {

	public static void main(String[] args) {
		File file = new File("d:/logs");
		File[] arquivos = file.listFiles();
		
		for (File fileTmp : arquivos) {
		     System.out.println(fileTmp.getName() + " - " + fileTmp.getTotalSpace());
		   }
	}
}
