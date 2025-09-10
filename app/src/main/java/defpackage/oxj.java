package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum oxj {
    RES_UNKNOWN(-1, -1),
    RES_QCIF(176, 144),
    RES_QVGA(320, 240),
    RES_CIF(352, 288),
    RES_480P_4X3(640, 480),
    RES_480P(720, 480),
    RES_720P(1280, 720),
    RES_720P_3X4(720, 960),
    RES_1080P(1920, 1080),
    RES_1080P_3X4(1080, 1440),
    RES_2160P(3840, 2160),
    RES_2160P_3X4(2272, 3024),
    RES_2268P(4032, 2268),
    RES_2256P(4000, 2256),
    RES_4320P(7680, 4320);

    private static final Map p = new HashMap();
    private final int r;
    private final int s;

    static {
        for (oxj oxjVar : values()) {
            p.put(new pas(oxjVar.r, oxjVar.s), oxjVar);
        }
    }

    oxj(int i, int i2) {
        this.r = i;
        this.s = i2;
    }

    public static oxj b(pas pasVar) {
        return (oxj) p.get(pasVar);
    }

    public final long a() {
        return this.r * this.s;
    }

    public final pas c() {
        return new pas(this.r, this.s);
    }

    public final boolean d() {
        return RES_1080P.equals(this) || RES_1080P_3X4.equals(this);
    }

    public final boolean e() {
        return this == RES_2160P || this == RES_2160P_3X4 || this == RES_2268P || this == RES_2256P;
    }
}
