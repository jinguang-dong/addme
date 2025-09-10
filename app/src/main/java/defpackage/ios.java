package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ios {
    private nkw a;
    private sqg b;
    private int c;
    private long d;
    private byte e;
    private int f;

    public ios() {
    }

    public final iot a() {
        nkw nkwVar;
        int i;
        sqg sqgVar;
        if (this.e != 3 || (nkwVar = this.a) == null || (i = this.f) == 0 || (sqgVar = this.b) == null) {
            throw new IllegalStateException();
        }
        return new iot(nkwVar, i, sqgVar, this.c, this.d);
    }

    public final void b(sqg sqgVar) {
        sqgVar.getClass();
        this.b = sqgVar;
    }

    public final void c(int i) {
        this.c = i;
        this.e = (byte) (this.e | 1);
    }

    public final void d(long j) {
        this.d = j;
        this.e = (byte) (this.e | 2);
    }

    public final void e(nkw nkwVar) {
        nkwVar.getClass();
        this.a = nkwVar;
    }

    public final void f(int i) {
        if (i == 0) {
            throw null;
        }
        this.f = i;
    }

    public ios(iot iotVar) {
        this.a = iotVar.a;
        this.f = iotVar.e;
        this.b = iotVar.b;
        this.c = iotVar.c;
        this.d = iotVar.d;
        this.e = (byte) 3;
    }
}
