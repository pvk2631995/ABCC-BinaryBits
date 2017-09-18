package com.app.data_import;

import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.TimerTask;

public class dataImport extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		URL url;
		
		try {
			// get URL content
			url = new URL("http://localhost:8983/solr/collection1/dataimport?command=full-import");
			URLConnection conn = url.openConnection();
			//conn = url.openConnection();
			System.out.println(new Date() + " ->" + " Data Import Done...!");
		}
		catch(Exception e){
			System.out.println("Data import not done----reason--->"+e);
		}	
	}
}






/*public class GetURLContent {
	public static void main(String[] args) {

		URL url;

		try {
			// get URL content
			url = new URL("http://www.mkyong.com");
			URLConnection conn = url.openConnection();

			// open the stream and put it into BufferedReader
			BufferedReader br = new BufferedReader(
                               new InputStreamReader(conn.getInputStream()));

			String inputLine;

			//save to this filename
			String fileName = "/users/mkyong/test.html";
			File file = new File(fileName);

			if (!file.exists()) {
				file.createNewFile();
			}

			//use FileWriter to write file
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);

			while ((inputLine = br.readLine()) != null) {
				bw.write(inputLine);
			}

			bw.close();
			br.close();

			System.out.println("Done");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}*/