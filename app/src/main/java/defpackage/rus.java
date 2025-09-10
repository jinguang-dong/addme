package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum rus {
    MONOCHROME(1),
    RGB(3);

    public static final Map c = new HashMap();
    public final int d;

    static {
        for (rus rusVar : values()) {
            c.put(Integer.valueOf(rusVar.d), rusVar);
        }
    }

    rus(int i) {
        this.d = i;
    }
}
