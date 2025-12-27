import java.util.Arrays;
import java.util.List;
import java.nio.file.*;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)throws IOException {
        Path path1 = Paths.get("simple.txt");
        List<String> list1 = Arrays.asList("Текст — это сочетание предложений, объединённых общей темой и связанных между собой с помощью грамматических и смысловых средств.");
        Files.write(path1,list1, StandardOpenOption.CREATE);

        Path path2 = Paths.get("simple.txt");
        List<String> list2 = Arrays.asList("Java — строго типизированный объектно‑ориентированный язык программирования общего назначения.");
        Files.write(path2,list2, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }
}