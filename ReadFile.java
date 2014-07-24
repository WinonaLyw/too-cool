import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadFile {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(
								new File(
										"C:\\Users\\Winona\\workspace\\Read Test\\src\\readme.txt"))));
		ArrayList<String> list = new ArrayList<String>();
		String line = null;

		while ((line = br.readLine()) != null) {
			String g = "&gt";
			String l = "&lt";
			line = line.replace("<", l);
			line = line.replace(">", g);
			list.add(line + "<br/>");

		}
		br.close();
		for (String got : list) {
			System.out.println(got);
			 FileWriter writer=new FileWriter("C:\\Users\\Winona\\workspace\\Read Test\\src\\result.txt");
			   for (String gotline:list) {
			    writer.write(gotline + "\n");
			     }
			   writer.flush();
			   writer.close();
		}
	}

}
