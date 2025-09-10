package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mla {
    public oxh a;
    public oxj b;
    public rwc c;
    public gcc d;
    public rwc e;
    public mky f;
    public int g;
    public boolean h;
    public float i;
    public byte j;
    private String k;
    private boolean l;
    private lte m;
    private int n;

    public mla() {
        throw null;
    }

    public final mlb a() {
        oxh oxhVar;
        oxj oxjVar;
        gcc gccVar;
        mky mkyVar;
        String str;
        lte lteVar;
        if (this.j != 31 || (oxhVar = this.a) == null || (oxjVar = this.b) == null || (gccVar = this.d) == null || (mkyVar = this.f) == null || (str = this.k) == null || (lteVar = this.m) == null) {
            throw new IllegalStateException();
        }
        return new mlb(oxhVar, oxjVar, this.c, gccVar, this.e, mkyVar, this.g, str, this.l, lteVar, this.h, this.i, this.n);
    }

    public final void b(int i) {
        this.n = i;
        this.j = (byte) (this.j | 16);
    }

    public final void c(boolean z) {
        this.l = z;
        this.j = (byte) (this.j | 2);
    }

    public final void d(lte lteVar) {
        lteVar.getClass();
        this.m = lteVar;
    }

    public final void e() {
        this.k = "";
    }

    public mla(mlb mlbVar) {
        rvk rvkVar = rvk.a;
        this.c = rvkVar;
        this.e = rvkVar;
        this.a = mlbVar.a;
        this.b = mlbVar.b;
        this.c = mlbVar.c;
        this.d = mlbVar.d;
        this.e = mlbVar.e;
        this.f = mlbVar.f;
        this.g = mlbVar.g;
        this.k = mlbVar.h;
        this.l = mlbVar.i;
        this.m = mlbVar.j;
        this.h = mlbVar.k;
        this.i = mlbVar.l;
        this.n = mlbVar.m;
        this.j = (byte) 31;
    }

    public mla(byte[] bArr) {
        rvk rvkVar = rvk.a;
        this.c = rvkVar;
        this.e = rvkVar;
    }
}
