package FileGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FileGenV1 {
    public static void main(String[] args) {
        // Example file name and date
        String fileName = "File1.txt";
        LocalDate date = LocalDate.now();

        // Call the method to create directories and copy the file
        createDirectoriesAndCopyFile(fileName, date);
    }

    /**
     * Creates directories based on the given date and copies the specified file into the new directory,
     * appending the date to the file name.
     *
     * @param fileName the name of the file to be copied
     * @param date     the LocalDate object representing the date
     */
    public static void createDirectoriesAndCopyFile(String fileName, LocalDate date) {
        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter fileFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        // Format the date
        String formattedDate = date.format(formatter);
        String formattedFileDate = date.format(fileFormatter);

        // Split the formatted date into parts
        String[] dateParts = formattedDate.split("/");

        // Get the content root path (current working directory)
        Path contentRoot = Paths.get("").toAbsolutePath();

        // Create the directory path from the content root
        Path directoryPath = contentRoot.resolve(Paths.get(dateParts[0], dateParts[1], dateParts[2]));

        try {
            // Create the directories
            Files.createDirectories(directoryPath);
            System.out.println("Directories created: " + directoryPath.toString());

            // Copy the file to the new directory with the date appended to the file name
            Path sourcePath = contentRoot.resolve(fileName);
            String newFileName = fileName.replaceFirst("(\\.[^.]+$)", "_" + formattedFileDate + "$1");
            Path destinationPath = directoryPath.resolve(newFileName);

            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied to: " + destinationPath.toString());
        } catch (IOException e) {
            System.err.println("Failed to create directories or copy file: " + e.getMessage());
        }
    }
}
