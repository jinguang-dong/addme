package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum oxv {
    QUALITY_480P(2002, oxj.RES_480P),
    QUALITY_720P(2003, oxj.RES_720P),
    QUALITY_720P_3X4(2003, oxj.RES_720P_3X4),
    QUALITY_1080P(2004, oxj.RES_1080P),
    QUALITY_1080P_3X4(2004, oxj.RES_1080P_3X4),
    QUALITY_2160P(2005, oxj.RES_2160P);

    private static final Map h = new HashMap();
    private static final Map i = new HashMap();
    public final int g;
    private final oxj k;

    static {
        for (oxv oxvVar : values()) {
            h.put(oxvVar.k, oxvVar);
            i.put(Integer.valueOf(oxvVar.g), oxvVar);
        }
    }

    oxv(int i2, oxj oxjVar) {
        this.g = i2;
        this.k = oxjVar;
    }

    public static oxv a(oxj oxjVar) {
        return (oxv) h.get(oxjVar);
    }
}
