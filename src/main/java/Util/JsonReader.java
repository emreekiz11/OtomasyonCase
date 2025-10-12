package Util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class JsonReader {

    private static Map<String, Map<String, String>> jsonData;

    public static Map<String, Map<String, String>> initializeJson() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            File file = new File("src/test/resources/veriler.json");
            jsonData = mapper.readValue(file, new TypeReference<Map<String, Map<String, String>>>() {});
        } catch (IOException e) {
            throw new RuntimeException("JSON dosyası okunamadı: " + e.getMessage(), e);
        }

        return getJsonData();
    }

    public static Map<String, Map<String, String>> getJsonData() {
        if (jsonData == null) {
            initializeJson();
        }
        return jsonData;
    }

    // Tek bir test case'e ait username veya password almak için
    public static String getValue(String testCaseKey, String field) {
        if (jsonData == null) {
            initializeJson();
        }

        Map<String, String> credentials = jsonData.get(testCaseKey);
        if (credentials == null) {
            throw new IllegalArgumentException("Anahtar bulunamadı: " + testCaseKey);
        }

        return credentials.get(field);
    }
}
