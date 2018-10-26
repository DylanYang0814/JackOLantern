public class JackOLantern extends java.lang.Object{

    private static String[][] faceFeatures;

    public JackOLantern(java.lang.String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }

    public String toString()
    {
        String pumpkin = "";
        for (int i = 0; i < faceFeatures.length; i++)
        {
            for (int x = 0; x < faceFeatures[i].length; x++)
            {
                pumpkin += (faceFeatures[i][x]) + "/n";
            }
        }
        return pumpkin;
    }

    public static void edit(String replace, int row, int colum)
    {
        faceFeatures[row][colum] = replace;
    }

    public static void fill (String str)
    {
        for (int i = 0 ; i < faceFeatures.length; i++)
        {
            for (int x = 0; x < faceFeatures[i].length; x++)
            {
                faceFeatures[i][x] = str;
            }
        }
    }
}
