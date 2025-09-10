package defpackage;

import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phj {
    public final int a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final rwc e;
    private final int f;

    public phj(int i, Set set, Set set2, Set set3, rwc rwcVar) {
        int i2;
        this.a = i;
        this.b = scn.F(set);
        this.d = scn.F(set2);
        this.c = scn.F(set3);
        synchronized (phh.class) {
            i2 = phh.e;
            phh.e = i2 + 1;
        }
        this.f = i2;
        this.e = rwcVar;
    }

    public final String toString() {
        return zflNUOOzDfM.KCWd + this.f;
    }
}
