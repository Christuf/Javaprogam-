import java.io.File;

public class NumberOfFilesInDirectory {
    public static void main(String[] args) {
        String directoryPath = "path/to/directory"; // Replace with the actual directory path
        
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        
        int numFiles = 0;
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    numFiles++;
                }
            }
        }
        
        System.out.println("Number of files in directory: " + numFiles);
    }
}