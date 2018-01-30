package hideEditer;

import java.awt.SystemTray;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class PackWriter {

	public static void exportPack(){

		    File file = new File("./testpack.zip");
		    try {
		    	if(file.exists()){
		    		file.createNewFile();
		    	}


		   	 String[] data = {"あいうえお","かきくけこ","さしすせそ"};
			    ByteArrayInputStream[] input = new  ByteArrayInputStream[data.length];

			    for (int i = 0; i < data.length; i++){
			        input[i] =  new ByteArrayInputStream(data[i].getBytes());
			    }

			    ByteArrayOutputStream output = new ByteArrayOutputStream();



		    	FileOutputStream out = new FileOutputStream(file);
			    ZipOutputStream zipOut = new ZipOutputStream(out,Charset.forName("Shift_JIS"));




			    int count = 0;

		        for (InputStream stream: input){
		            ZipEntry entry = new ZipEntry("test/"+(count ++) + ".txt" );

		            zipOut.putNextEntry(entry);

		            try (InputStream is = new BufferedInputStream(stream)) {
		                byte[] buf = new byte[1024];
		                for (int len = 0; 0 < (len = is.read(buf))  ;) {
		                	zipOut.write(buf, 0, len);
		                }
		            }

		        }

		        zipOut.close();




			} catch (IOException e) {
				e.printStackTrace();
			}

	}
	public static void zipWriter(File file, InputStream... input) throws IOException{

	    try(ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(file))){
	        int count = 0;

	        for (InputStream stream: input){

	            ZipEntry entry = new ZipEntry((count ++) + ".txt" );
	            zos.putNextEntry(entry);


	            try (InputStream is = new BufferedInputStream(stream)) {
	                byte[] buf = new byte[1024];
	                for (int len = 0; 0 < (len = is.read(buf))  ;) {
	                    zos.write(buf, 0, len);
	                }
	            }
	        }
	    }
	}

	/**
	 * zipを書き込んで、zipを展開して内容を確認する。<br/>
	 * ByteArrayOuputStreamで実施しているため、close処理が適当、、、
	 */

}
