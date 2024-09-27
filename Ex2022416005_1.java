import java.io.*;

public class Ex2022416005_1 {
    public static void main(String[] args) {
        String sourceFilePath = "C:\\Users\\lenovo\\IdeaProjects\\exp112702\\src\\src.txt";
        String destFilePath = "C:\\Users\\lenovo\\IdeaProjects\\exp112702\\src\\dest.txt";

        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             FileOutputStream fos = new FileOutputStream(destFilePath);
             BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("文件复制成功！");
        } catch (IOException e) {
            System.out.println("文件复制失败：" + e.getMessage());
        }
    }
}
