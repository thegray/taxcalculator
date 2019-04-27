package pbkurnianto.utils;

import java.util.HashMap;
import java.util.Map;

public enum TaxCode {

    NONE (0), FOOD (1), TOBACCO (2), ENTERTAINMENT (3);

    private int value;
    private static Map map = new HashMap<>();

    TaxCode(int value) {
        this.value = value;
    }

    static {
        for (TaxCode taxCode : TaxCode.values()) {
            map.put(taxCode.value, taxCode);
        }
    }

    public static TaxCode valueOf(int taxCode) {
        return (TaxCode) map.get(taxCode);
    }

    public int getValue() {
        return value;
    }
}
