package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lnm {
    OFF(0),
    AUTO(1),
    MACRO(2),
    CONTINUOUS_VIDEO(3),
    CONTINUOUS_PICTURE(4),
    EDOF(5);

    private static final Map h = new HashMap();
    public final int g;

    static {
        for (lnm lnmVar : values()) {
            h.put(Integer.valueOf(lnmVar.g), lnmVar);
        }
    }

    lnm(int i2) {
        this.g = i2;
    }

    public static lnm a(int i2) {
        lnm lnmVar = (lnm) h.get(Integer.valueOf(i2));
        if (lnmVar != null) {
            return lnmVar;
        }
        throw new IllegalArgumentException(a.bv(i2, "unknown metadata value: "));
    }
}
