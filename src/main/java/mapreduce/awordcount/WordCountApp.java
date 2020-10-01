package mapreduce.awordcount;

/**
 * @Author chengh
 **/
public class WordCountApp {

    public static final String HDFS_URL = "";
    public static final String HADOOP_USER_NAME = "root";

    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Input and output paths are necessary!");
            return;
        }

        // 指定hadoop用户名，否则在HDFS创建目录时，可能抛出权限不足的异常
        System.setProperty("HADOOP_USER_NAME", HADOOP_USER_NAME);

    }
}
