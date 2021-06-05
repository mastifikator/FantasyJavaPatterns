package Flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class OrcFactory {
    static Map<String, OrcType> orcTypes = new HashMap<>();

    public static OrcType getOrcType(String name, Color color, String otherOrcData){
        OrcType result = orcTypes.get(name);
        if(result == null){
            result = new OrcType(name, color, otherOrcData);
            orcTypes.put(name, result);
        }
        return result;
    }
}
