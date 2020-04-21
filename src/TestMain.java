import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class TestMain {

	public static void main(String[] args) {

		Random r = new Random();
		int avg = 0;
		int[][] temp = new int[14][10];
		int gavg = 0;
		FileWriter fw;
		String os = System.getProperty("os.name");
		String version = System.getProperty("os.version");
		
		try {
			fw= new FileWriter("C:\\Users\\Alexander Bertoni\\Documents\\Schule\\3.Klasse\\Programmieren\\measurements.txt", true);
		

		for (int i = 0; i < temp.length; i++) {

			for (int j = 0; j < temp[i].length; j++) {
				temp[i][j] = 20 + r.nextInt(35 - 20 + 1);
				System.out.print(temp[i][j] + " ");
				fw.write(temp[i][j] + " ");
				avg = avg + temp[i][j];
			}
			avg = avg / temp[i].length;
			System.out.println("- Durschnitts-Teperatur: "+avg);
			fw.write("- Durschnitts-Teperatur: "+avg);
			gavg = gavg+avg;
		}	
		gavg = gavg/temp.length;
		System.out.println("Gesamt-Durschnitts-Temperatur: "+gavg);
		fw.write("Gesamt-Durschnitts-Temperatur: "+gavg);
		
		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		
		System.out.println("Erstellt am "+today+"um "+now+" unter "+os+" Version:"+version);
		fw.write("Erstellt am "+today+"um "+now+" unter "+os+""+version);
		fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
