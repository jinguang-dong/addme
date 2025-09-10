package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lnn {
    INACTIVE(0),
    PASSIVE_SCAN(1),
    PASSIVE_FOCUSED(2),
    ACTIVE_SCAN(3),
    FOCUSED_LOCKED(4),
    NOT_FOCUSED_LOCKED(5),
    PASSIVE_UNFOCUSED(6);

    private static final Map i = new HashMap();
    public final int h;

    static {
        for (lnn lnnVar : values()) {
            i.put(Integer.valueOf(lnnVar.h), lnnVar);
        }
    }

    lnn(int i2) {
        this.h = i2;
    }

    public static lnn a(int i2) {
        lnn lnnVar = (lnn) i.get(Integer.valueOf(i2));
        if (lnnVar != null) {
            return lnnVar;
        }
        throw new IllegalArgumentException(a.bv(i2, "unknown metadata value: "));
    }

    public final boolean b() {
        return this == PASSIVE_FOCUSED || this == PASSIVE_UNFOCUSED || this == FOCUSED_LOCKED || this == NOT_FOCUSED_LOCKED || this == INACTIVE;
    }
}
