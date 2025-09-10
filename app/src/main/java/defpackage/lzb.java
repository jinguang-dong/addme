package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lzb implements lzh {
    private lzm a;
    private boolean b;
    public lzl d;

    @Override // defpackage.lzh
    public void dM() {
        this.d = null;
        lzm lzmVar = this.a;
        if (lzmVar != null) {
            lzmVar.a();
            this.a = null;
        }
    }

    @Override // defpackage.lzh
    public void eZ(lzm lzmVar) {
        this.a = lzmVar;
        lzl lzlVar = this.d;
        if (lzlVar != null) {
            lzmVar.b(lzlVar);
        }
    }

    @Override // defpackage.lzh
    public void f() {
        this.b = true;
    }

    @Override // defpackage.lzh
    public final void fa() {
        this.b = false;
        lzl lzlVar = this.d;
        if (lzlVar != null) {
            lzm lzmVar = this.a;
            lzmVar.getClass();
            lzmVar.b(lzlVar);
        }
    }

    public final void k() {
        this.d = null;
        lzm lzmVar = this.a;
        if (lzmVar != null) {
            lzmVar.a();
        }
    }

    protected final void l(lzl lzlVar) {
        lzk lzkVar = new lzk(lzlVar);
        Runnable runnable = lzlVar.e;
        if (runnable != null) {
            lzkVar.c = new lsn(this, runnable, 7);
        }
        Runnable runnable2 = lzlVar.h;
        if (runnable2 != null) {
            lzkVar.f = new lsn(this, runnable2, 8);
        }
        Runnable runnable3 = lzlVar.f;
        if (runnable3 != null) {
            lzkVar.d = new lsn(this, runnable3, 9);
        }
        Runnable runnable4 = lzlVar.k;
        if (!lzlVar.l) {
            lzkVar.i = new lsn(this, runnable4, 10);
        }
        lzl lzlVarA = lzkVar.a();
        lzm lzmVar = this.a;
        if (lzmVar != null && !this.b) {
            if (this.d != null) {
                lzmVar.c(lzlVarA);
            } else {
                lzmVar.b(lzlVarA);
            }
        }
        this.d = lzlVarA;
    }
}
