package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cim {
    static final cim a;
    static final cim b;
    final boolean c;
    final Throwable d;

    static {
        if (ciu.a) {
            b = null;
            a = null;
        } else {
            b = new cim(false, null);
            a = new cim(true, null);
        }
    }

    public cim(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
