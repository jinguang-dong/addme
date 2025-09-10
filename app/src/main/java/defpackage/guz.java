package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guz {
    public final long a;
    private long b = 0;
    private int c = 0;
    private final int d;

    public guz(int i, long j) {
        this.d = i;
        this.a = j;
    }

    final synchronized sqp a(long j) {
        tpc tpcVarM;
        tpcVarM = sqp.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        int i = this.d;
        tph tphVar = tpcVarM.b;
        sqp sqpVar = (sqp) tphVar;
        sqpVar.c = i - 1;
        sqpVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        long j2 = j - this.a;
        tph tphVar2 = tpcVarM.b;
        sqp sqpVar2 = (sqp) tphVar2;
        sqpVar2.b |= 2;
        sqpVar2.d = j2;
        long j3 = this.b;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        sqp sqpVar3 = (sqp) tphVar3;
        sqpVar3.b |= 4;
        sqpVar3.e = j3;
        int i2 = this.c;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        sqp sqpVar4 = (sqp) tpcVarM.b;
        sqpVar4.b |= 8;
        sqpVar4.f = i2;
        return (sqp) tpcVarM.l();
    }

    final synchronized void b() {
        this.c++;
    }

    final synchronized void c() {
        this.b++;
    }
}
