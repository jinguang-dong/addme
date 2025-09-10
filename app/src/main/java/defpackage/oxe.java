package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum oxe {
    AAC(3, oxg.AAC),
    AAC_ELD(5, oxg.AAC),
    HE_AAC(4, oxg.AAC),
    d(1, oxg.AMR_NB),
    AMR_WB(2, oxg.AMR_WB),
    VORBIS(6, oxg.VORBIS);

    private static final Map i = new HashMap();
    public final int g;
    public final oxg h;

    oxe(int i2, oxg oxgVar) {
        this.g = i2;
        this.h = oxgVar;
    }

    public static oxe a(int i2) {
        oxe oxeVar = (oxe) i.get(Integer.valueOf(i2));
        if (oxeVar != null) {
            return oxeVar;
        }
        throw new IllegalArgumentException(a.bv(i2, "unknown CamcorderProfile value: "));
    }

    static {
        for (oxe oxeVar : values()) {
            i.put(Integer.valueOf(oxeVar.g), oxeVar);
        }
    }
}
