package pertronshow;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Pertron {
	static int[] feature = new int[18];
	static double[] weight = new double[18];
	static String[][] data = new String[958][10];

	// static int[] hx = new int[862];

	public static void initial(String url) {
		BufferedReader readerranking = null;

		try {
			 readerranking = new BufferedReader(new FileReader(new File(url)));
			// 563/626/299
			//readerranking = new BufferedReader(new FileReader(new File(
			//		"/Users/Tony/Desktop/data.txt")));
			String line = null;

			int j = 0;
			int pn = 0;
			int nn = 0;
			while ((line = readerranking.readLine()) != null) {
				data[j] = line.split(",");
				System.out.println(data[j][1]);

				j++;
			}

			readerranking.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		

	}

	static public String[] run(String url) {
		String[] res = new String[22];
		res[18]="0";
		res[19]="0";
		res[20]="0";
		res[21]="0";
		initial(url);
		System.out.println(data[10][9]);
		for (int i = 0; i < 18; i++) {
			weight[i]=0.3;
		}
		for (int x = 0; x < 200; x++)
			computehx();

		
		for (int i = 863; i < 925; i++) {
			double re = 0;
			// feature=new int[9];

			for (int r = 0; r < 9; r++) {
				// System.out.println(i);
				if (data[i][r].equals("x")) {
					feature[r] = 1;
				} else {
					feature[r] = 0;
				}
				if (data[i][r].equals("o")) {
					feature[r + 9] = 1;
				} else {
					feature[r + 9] = 0;
				}
				re = re + weight[r] * feature[r] + weight[r + 9]
						* feature[r + 9];
			}

			if(re>0) res[18]=Integer.parseInt(res[18])+1+"";
			else res[19]=Integer.parseInt(res[19])+1+"";

		}
		
		for (int i = 925; i < 958; i++) {
			double re = 0;
			// feature=new int[9];

			for (int r = 0; r < 9; r++) {
				// System.out.println(i);
				if (data[i][r].equals("x")) {
					feature[r] = 1;
				} else {
					feature[r] = 0;
				}
				if (data[i][r].equals("o")) {
					feature[r + 9] = 1;
				} else {
					feature[r + 9] = 0;
				}
				re = re + weight[r] * feature[r] + weight[r + 9]
						* feature[r + 9];
			}

			if(re<0) res[20]=Integer.parseInt(res[20])+1+"";
			else res[21]=Integer.parseInt(res[21])+1+"";

		}
		for (int i = 0; i < 18; i++) {
			res[i]=""+weight[i];
		}
		return res;
	}

	public static void computehx() {
		System.out.println("weight" + weight[0]);
		double[] hx = new double[863];
		double hxsum = 0;
		for (int i = 0; i < 863; i++) {
			// feature=new int[18];
			
			for (int r = 0; r < 9; r++) {
				// System.out.println(i);
				if (data[i][r].equals("x")) {
					feature[r] = 1;
				} else {
					feature[r] = 0;
				}
				if (data[i][r].equals("o")) {
					feature[r + 9] = 1;
				} else {
					feature[r + 9] = 0;
				}
				// hx=weight[r]*feature[r];
			}

			if (data[i][9].equals("positive")) {
				// if(hx>0) continue;
				for (int j = 0; j < 18; j++) {
					hx[i] = hx[i] + weight[j] * feature[j];
				}
				hx[i] = 1 - hx[i];
			} else {
				// if(hx<0) continue;
				for (int j = 0; j < 18; j++) {
					hx[i] = hx[i] + weight[j] * feature[j];
				}
				hx[i] = -1 - hx[i];
			}

		}

		// feature=new int[18];

		for (int j = 0; j < 18; j++) {
			hxsum=0;
			for (int i = 0; i < 863; i++) {
				for (int r = 0; r < 9; r++) {
					// System.out.println(i);
					if (data[i][r].equals("x")) {
						feature[r] = 1;
					} else {
						feature[r] = 0;
					}
					if (data[i][r].equals("o")) {
						feature[r + 9] = 1;
					} else {
						feature[r + 9] = 0;
					}
					// hx=weight[r]*feature[r];
				}
				hxsum=hxsum+hx[i]*feature[j];
			}
			weight[j] = weight[j] + 0.0004 * hxsum;

		}

	}

}
