package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpi {
    public long d = 0;
    public long c = 0;
    public int b = 0;
    public int a = 0;

    public final jpi a() {
        jpi jpiVar;
        synchronized (this) {
            jpiVar = new jpi();
            jpiVar.a = this.a;
            jpiVar.b = this.b;
            jpiVar.c = this.c;
            jpiVar.d = this.d;
        }
        return jpiVar;
    }
}
