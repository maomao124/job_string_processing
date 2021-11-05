/**
 * Project name(项目名称)：作业_字符串处理
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/5
 * Time(创建时间)： 20:48
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static double[][] stringToArray(String str)
    {
        double[][] array = new double[3][];
        array[0] = new double[2];
        array[1] = new double[3];
        array[2] = new double[3];
        String[] str1 = str.split("[,;]");
        int index = 0;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = Double.parseDouble(str1[index]);
                index++;
            }
        }
        return array;
    }

    public static void main(String[] args)
    {
        String str = "1,2;3,4,5;6,7,8";
        double[][] array = stringToArray(str);
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print("[" + i + "][" + j + "]=" + array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
