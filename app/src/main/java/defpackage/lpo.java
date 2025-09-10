package defpackage;

import com.google.android.gms.analytics.EQvQ.UvOvSgfD;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lpo implements lpp {
    private static final sgv b = sgv.g("lpo");
    public final ovx a = new ovx(true);
    private long c = -1;

    private final synchronized void f(boolean z, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = true;
        if (z && jCurrentTimeMillis - this.c < b()) {
            z2 = false;
        }
        ovx ovxVar = this.a;
        if (((Boolean) ovxVar.d).booleanValue() == z || !z2) {
            return;
        }
        this.c = jCurrentTimeMillis;
        sgt sgtVar = (sgt) b.c().M(4309);
        String strC = c();
        Boolean boolValueOf = Boolean.valueOf(z);
        sgtVar.G(UvOvSgfD.QIBXKXTPj, strC, boolValueOf, str);
        ovxVar.a(boolValueOf);
    }

    public abstract int a();

    public abstract long b();

    public abstract String c();

    public abstract void d();

    @Override // defpackage.lpp
    public final synchronized void e(int i, int i2, int i3) {
        String str;
        boolean z = i2 < a();
        switch (i) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "CRITICAL";
                break;
            case 3:
                str = "SEVERE";
                break;
            case 4:
                str = "MODERATE";
                break;
            case 5:
                str = "NORMAL";
                break;
            case 6:
                str = "IDLE";
                break;
            default:
                str = "null";
                break;
        }
        f(z, String.format("State: %s ActiveShots: %s, ticketCount: %s", str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }
}
