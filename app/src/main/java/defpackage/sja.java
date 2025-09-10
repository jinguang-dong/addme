package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class sja {
    private static final sja a = new siu();

    public static sja g(sij sijVar, sij sijVar2) {
        int iB = sijVar2.b();
        return iB == 0 ? a : iB <= 28 ? new siy(sijVar, sijVar2) : new siz(sijVar, sijVar2);
    }

    public abstract int a();

    public abstract Object b(shl shlVar);

    public abstract Set c();

    public abstract void d(siq siqVar, Object obj);
}
