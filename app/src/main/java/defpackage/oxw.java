package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum oxw {
    QUALITY_QCIF(2, oxj.RES_QCIF),
    QUALITY_QVGA(7, oxj.RES_QVGA),
    QUALITY_CIF(3, oxj.RES_CIF),
    QUALITY_480P_4X3(4, oxj.RES_480P_4X3),
    QUALITY_480P(4, oxj.RES_480P),
    QUALITY_720P(5, oxj.RES_720P),
    QUALITY_1080P(6, oxj.RES_1080P),
    QUALITY_1080P_3X4(6, oxj.RES_1080P_3X4),
    QUALITY_2160P(8, oxj.RES_2160P),
    QUALITY_2160P_3X4(8, oxj.RES_2160P_3X4),
    QUALITY_2268P(8, oxj.RES_2268P),
    QUALITY_2256P(8, oxj.RES_2256P),
    QUALITY_4320P(13, oxj.RES_4320P);

    private static final Map p = new HashMap();
    private static final Map q = new HashMap();
    public final int n;
    public final oxj o;

    static {
        for (oxw oxwVar : values()) {
            p.put(oxwVar.o, oxwVar);
            q.put(Integer.valueOf(oxwVar.n), oxwVar);
        }
    }

    oxw(int i, oxj oxjVar) {
        this.n = i;
        this.o = oxjVar;
    }

    public static oxw a(oxj oxjVar) {
        return (oxw) p.get(oxjVar);
    }
}
