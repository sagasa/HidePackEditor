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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import types.BulletData;
import types.GunData;

public class PackWriter {
	/**出力用データ*/
	class ExportData{
		public ByteArrayInputStream inStream;
		public String Name;

		public ExportData(String name,byte[] data){
			inStream = new ByteArrayInputStream(data);
			Name = name;
		}
	}

	public static void exportPack(File file){
		//パックがあるなら
		if(MainWindow.Pack!=null){
			//データをまとめる
			ArrayList<ExportData> dataList = new ArrayList<ExportData>();
			PackWriter This = new PackWriter();
			//銃のデータ
			for (GunData d:MainWindow.gunMap.values()){
				dataList.add(This.new ExportData("guns/"+GunData.GunDataList.DISPLAY_NAME.getData(d).toString()+".json",d.MakeJsonData().getBytes()));
			}
			//弾のデータ
			for (BulletData d:MainWindow.bulletMap.values()){
				dataList.add(This.new ExportData("bullets/"+BulletData.BulletDataList.DISPLAY_NAME.getData(d).toString()+".json",d.MakeJsonData().getBytes()));
			}

			//パックデータ
			dataList.add(This.new ExportData("pack.json",MainWindow.Pack.MakeJsonData().getBytes()));

		    try {
		    	if(file.exists()){
		    		file.createNewFile();
		    	}
		    	zipWriter(file,dataList.toArray(new ExportData[dataList.size()]));



				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	public static void zipWriter(File file, ExportData[] dataes) throws IOException {

		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(file),Charset.forName("Shift_JIS"));
		for (ExportData data : dataes) {
			System.out.println(data.Name);
			ZipEntry entry = new ZipEntry(data.Name);
			zos.putNextEntry(entry);

			try (InputStream is = new BufferedInputStream(data.inStream)) {
				byte[] buf = new byte[1024];
				for (int len = 0; 0 < (len = is.read(buf));) {
					zos.write(buf, 0, len);
				}
			}
		}
		zos.close();

	}

	/**
	 * zipを書き込んで、zipを展開して内容を確認する。<br/>
	 * ByteArrayOuputStreamで実施しているため、close処理が適当、、、
	 */

}
