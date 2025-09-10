package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class udn implements udm {
    public static final qzh a;
    public static final qzh b;

    static {
        qzn qznVar = uco.a;
        a = qzi.c("45359255", false, "com.google.android.libraries.performance.primes", qznVar);
        b = qzi.c("36", true, "com.google.android.libraries.performance.primes", qznVar);
    }

    @Override // defpackage.udm
    public final boolean a(Context context) {
        return ((Boolean) a.fs(context)).booleanValue();
    }

    @Override // defpackage.udm
    public final boolean b(Context context) {
        return ((Boolean) b.fs(context)).booleanValue();
    }
}
