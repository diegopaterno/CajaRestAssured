package helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * clase auxiliar para manejar operaciones comunes con JsonNode utilizando la biblioteca Jackson
 */
public class JsonNodeHelper {
    private static final ObjectMapper objectMapper = new ObjectMapper();

/**
 * crea un JsonNode a partir de una cadena Json
 *
 * @param json la cadena JSON
 * @return el jsonNode correspondiente
 * @throws RuntimeException si la cadena JSON  no se puede parsear
  */
public static JsonNode createJsonNodeFromString(String json){
    try{
        return objectMapper.readTree(json);
    }catch (Exception e){
        throw new RuntimeException("falla al parsear JSON string ", e);
    }
}













}
