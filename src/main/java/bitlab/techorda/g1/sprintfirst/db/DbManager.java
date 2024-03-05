package bitlab.techorda.g1.sprintfirst.db;

import bitlab.techorda.g1.sprintfirst.model.Developer;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class DbManager {

    @Getter
    private static List<Developer> developers = new ArrayList<>();
    private static Long id = 12L;

    static {
        developers.add(new Developer(1L, "ИМАНБЕКОВ  БАҒЛАН  АБДУЛӘШІМҰЛЫ", 18, "ALMATY"));
        developers.add(new Developer(2L, "АМРАЕВ  ТИЛИВАЛЬДИ", 18, "ALMATY"));
        developers.add(new Developer(3L, "ЖУМАГАЛИЕВ  АМИР  ЕРЛАНОВИЧ", 18, "ALMATY"));
        developers.add(new Developer(4L, "ӘМІРБЕК  АБЫЛАЙ  БАҚЫТЖАНҰЛЫ", 18, "ALMATY"));
        developers.add(new Developer(5L, "ЖАНСАЯ", 18, "ALMATY"));
        developers.add(new Developer(6L, "ДИНА", 18, "ALMATY"));
        developers.add(new Developer(7L, "ГҮЛШАТ", 18, "ALMATY"));
        developers.add(new Developer(8L, "РАЙХАН", 18, "ALMATY"));
        developers.add(new Developer(9L, "АЛЬБИНА", 18, "ALMATY"));
        developers.add(new Developer(10L, "КУЛАШ", 18, "ALMATY"));
        developers.add(new Developer(11L, "АЖАРА", 18, "ALMATY"));
    }

    public static void createDeveloper(Developer developer) {
        developer.setId(id);
        id++;
        developers.add(developer);
    }
}
