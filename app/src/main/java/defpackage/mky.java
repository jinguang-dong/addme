package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum mky {
    AUTO_FPS_30_5X(mkx.SLOW, 30, true, 6.0d, 6.0d, 3.0d, 1.0d, 0.25d),
    MANUAL_FPS_30_1X(mkx.SLOWEST, 30, false, 30.0d, 6.0d, 3.0d, 1.0d, 0.25d),
    MANUAL_FPS_60_2X(mkx.SLOWEST, 60, false, 60.0d, 8.0d, 4.0d, 1.0d, 0.25d);

    public final int d;
    public final int e = 30;
    public final mkx f;
    public final sbv g;
    public final sbp h;

    mky(mkx mkxVar, int i2, boolean z, double... dArr) {
        this.d = i2;
        if (z) {
            this.f = mkx.AUTO;
        } else {
            this.f = mkx.SLOW;
        }
        int iOrdinal = mkxVar.ordinal();
        HashMap map = new HashMap(ujp.au(5));
        ArrayList arrayList = new ArrayList(5);
        for (int i3 = 0; i3 < 5; i3++) {
            if (!z) {
                int i4 = i3 + iOrdinal;
                map.put(mkx.values()[i4], Double.valueOf(dArr[i3]));
                arrayList.add(mkx.values()[i4]);
            } else if (i3 == 0) {
                mkx mkxVar2 = mkx.AUTO;
                map.put(mkxVar2, Double.valueOf(dArr[0]));
                arrayList.add(mkxVar2);
            } else {
                int i5 = (i3 - 1) + iOrdinal;
                map.put(mkx.values()[i5], Double.valueOf(dArr[i3]));
                arrayList.add(mkx.values()[i5]);
            }
        }
        this.g = sbv.m(map);
        this.h = sbp.j(arrayList);
    }

    public final double a(double d) {
        return this.e / d;
    }

    public final double b(mkx mkxVar) {
        Double d = (Double) this.g.get(mkxVar);
        d.getClass();
        return d.doubleValue();
    }

    public final oxh c() {
        for (oxh oxhVar : oxh.values()) {
            int i2 = this.d;
            if (i2 == oxhVar.k && this.e == oxhVar.l && i2 == oxhVar.m) {
                return oxhVar;
            }
        }
        throw new IllegalArgumentException("No camcorderCaptureRate found.");
    }
}
