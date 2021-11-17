package hi;

public class changearr {
	public static void main(String[] args) {
		int[][]twodm= {
				{1,2,3},
				{7,8,9}
				};
			System.out.println("Original Array");
			print_array(twodm);
			System.out.println("After changing");
			transpose(twodm);
}
	private static void print_array(int[][]twodm)
	{
		for(int i=0;i<twodm.length;i++) {
			for(int j=0;j<twodm[0].length;j++) {
				System.out.println(twodm[i][j]+" ");
			}
		}
	}
	private static void transpose(int[][]twodm) {
		int[][]newtwodm=new int[twodm[0].length][twodm.length];
		for(int i=0;i<twodm.length;i++) {
			for(int j=0;j<twodm[0].length;j++) {
				newtwodm[j][i]=twodm[i][j];
			}
		}
		print_array(newtwodm);
	}
}
