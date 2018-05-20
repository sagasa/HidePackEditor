package helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


/**オブジェモデルを読むパーサー*/
public class ObjWrapper {
	/**頂点 x y z w マテリアル*/
	public class Vertex{
		float X;
		float Y;
		float Z;
		float W;

		public Vertex(float x,float y,float z,float w) {
			X = x;
			Y = y;
			Z = z;
			W = w;
		}
	}
	private static final Pattern WHITE_SPACE = Pattern.compile("\\s+");
	public ObjWrapper(){
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("ModelR1918.obj")));

			List<Vertex> VertexList = new ArrayList<Vertex>();
			String currentLine;
			while((currentLine = reader.readLine())!=null){
				//コメントはスキップ
				if (currentLine.isEmpty() || currentLine.startsWith("#")) continue;
				System.out.println(currentLine);
				String[] fields = WHITE_SPACE.split(currentLine, 2);
                String key = fields[0];
                String data = fields[1];
                String[] splitData = WHITE_SPACE.split(data);
                if(key.equalsIgnoreCase("v")){
                	float[] floatSplitData = new float[splitData.length];
                    for (int i = 0; i < splitData.length; i++)
                        floatSplitData[i] = Float.parseFloat(splitData[i]);
                    Vertex ver = new Vertex(floatSplitData[0], floatSplitData[1], floatSplitData[2], floatSplitData.length == 4 ? floatSplitData[3] : 1);
                    VertexList.add(ver);
                    System.out.println(floatSplitData[0]+" "+floatSplitData[1]+" "+floatSplitData[2]);
                }else if(key.equalsIgnoreCase("vn")){

                }
























			}
			reader.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
