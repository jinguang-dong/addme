package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uax implements uaw {
    public static final qzh a;
    public static final qzh b;
    public static final qzh c;
    public static final qzh d;

    static {
        qzn qznVar = uar.a;
        a = qzi.c("45694881", false, "com.google.android.gms.clearcut_client", qznVar);
        b = qzi.a("45694883", 1048576L, "com.google.android.gms.clearcut_client", qznVar);
        c = qzi.a("45694884", 5L, "com.google.android.gms.clearcut_client", qznVar);
        d = qzi.a("45694882", 100L, "com.google.android.gms.clearcut_client", qznVar);
    }

    @Override // defpackage.uaw
    public final long a(Context context) {
        return ((Long) b.fs(context)).longValue();
    }

    @Override // defpackage.uaw
    public final long b(Context context) {
        return ((Long) c.fs(context)).longValue();
    }

    @Override // defpackage.uaw
    public final long c(Context context) {
        return ((Long) d.fs(context)).longValue();
    }

    @Override // defpackage.uaw
    public final boolean d(Context context) {
        return ((Boolean) a.fs(context)).booleanValue();
    }
}
