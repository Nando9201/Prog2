import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aufgabe22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Dateinamen: ");
        String filename = br.readLine();


        System.out.print("Zeile: ");
        int n = Integer.parseInt(br.readLine());

        System.out.print("Text: ");
        String text = br.readLine();

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        BufferedWriter writer = new BufferedWriter(new FileWriter("BlaBla.txt"));
        for (int i = 0; i < n - 1; i++) {
            writer.write(reader.readLine());
            writer.newLine();
        }

        writer.write(text);
        writer.newLine();
        String zeile;
        while ((zeile = reader.readLine()) != null) {
            writer.write(zeile);
            writer.newLine();
        }
        reader.close();
        writer.close();

        Charset charset = StandardCharsets.UTF_8;
        Path filePath = Paths.get("BlaBLa.txt");
        Path outputPath = Paths.get(filename);

        var input = Files.readAllLines(filePath, charset);
        Files.write(outputPath,input);

    }
}
