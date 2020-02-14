public class TableauxExploration {
    public  static void initTen(int tab2d[][]){
        int nbligne =tab2d.length;
        int nbcolums =tab2d[0].length;
        for (int i =0;i<nbligne;i++){
            for (int j =0;j<nbcolums;j++){
                tab2d[i][j] =10;
            }
        }
    }
    public static void initDiagonaleTen(int tab2d[][]){
        int nbligne =tab2d.length;
        int nbcolums =tab2d[0].length;
        for (int i =0;i<nbligne;i++){
            for (int j =0;j<nbcolums;j++){
                if (tab2d[i]==tab2d[j]){
                    tab2d[i][j]=10;
                }
            }
        }

    }
    public static void initPosition(){

    }
}
