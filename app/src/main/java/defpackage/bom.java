package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bom extends bne {
    public final azr a;
    public final azr b;
    public final boh c;
    public int d;
    public final bbd e;
    private float f;
    private bkw g;

    public bom() {
        this(new bnh());
    }

    @Override // defpackage.bne
    public final long a() {
        return ((bki) this.a.a()).a;
    }

    @Override // defpackage.bne
    protected final void b(bmv bmvVar) {
        boh bohVar = this.c;
        bkw bkwVarD = this.g;
        if (bkwVarD == null) {
            bkwVarD = bohVar.d();
        }
        if (((Boolean) this.b.a()).booleanValue() && bmvVar.n() == cib.b) {
            long jL = bmvVar.l();
            bms bmsVarO = bmvVar.o();
            long jA = bmsVarO.a();
            bmsVarO.b().f();
            try {
                bmsVarO.c.h(-1.0f, 1.0f, jL);
                bohVar.g(bmvVar, this.f, bkwVarD);
            } finally {
                bmsVarO.b().d();
                bmsVarO.h(jA);
            }
        } else {
            bohVar.g(bmvVar, this.f, bkwVarD);
        }
        this.d = g();
    }

    @Override // defpackage.bne
    protected final boolean c(float f) {
        this.f = f;
        return true;
    }

    @Override // defpackage.bne
    protected final boolean d(bkw bkwVar) {
        this.g = bkwVar;
        return true;
    }

    public final int g() {
        return this.e.e();
    }

    public bom(bnh bnhVar) {
        bki bkiVar = new bki(0L);
        bap bapVar = bap.c;
        this.a = new azz(bkiVar, bapVar);
        this.b = new azz(false, bapVar);
        boh bohVar = new boh(bnhVar);
        bohVar.d = new bol(this, 0);
        this.c = bohVar;
        this.e = new azw(0);
        this.f = 1.0f;
        this.d = -1;
    }
}
