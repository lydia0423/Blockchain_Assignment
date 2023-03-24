package HelperClass;

import java.io.File;

public class FileHandler {

    final private static String textFilePath = System.getProperty("user.dir") + System.getProperty("file.separator") + "src" + System.getProperty("file.separator") + "Database";

    public static File retrievePath(String folderName, String fileName) {
        String path;
        if (fileName.equals("null")) { // retrieve folder path
            path = textFilePath + System.getProperty("file.seperator") + folderName;
        } else { // retreive specific path
            path = textFilePath + System.getProperty("file.seperator") + folderName + System.getProperty("file.seperator") + fileName;
        }

        return new File(path);
    }

    // check for existing file path and create if not available
    public static File createFilePath(String folderName, String fileName) {
        // check and create the folder (if not found) to hold all text files

        String textFolder = textFilePath;
        File textFolderLocation = new File(textFolder);
        if (!textFolderLocation.exists()) {
            textFolderLocation.mkdir();
        }

        // check and create the folder to hold text files of a specifc type
        String classFolder = textFolder + System.getProperty("file.seperator") + folderName;
        File saveLocation = new File(classFolder, fileName);

        if (!saveLocation.exists()) {
            saveLocation.mkdir();
            File myFile = new File(classFolder, fileName);
            return myFile;
        } else {
            File myFile = new File(classFolder, fileName);
            return myFile;
        }
    }
}
