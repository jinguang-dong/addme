package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyp implements jzf {
    private final jzf a;
    private poj b = null;
    private boolean c = false;

    public jyp(jzf jzfVar) {
        this.a = jzfVar;
    }

    @Override // defpackage.jzf
    public final synchronized boolean a(poj pojVar) {
        if (this.c) {
            return this.a.a(pojVar);
        }
        pkf pkfVar = new pkf(pojVar);
        poj pojVar2 = this.b;
        if (pojVar2 != null) {
            pojVar2.close();
        }
        poj pojVarK = pkfVar.k();
        pojVarK.getClass();
        this.b = new kax(pojVarK, pkfVar.d() + 100000);
        return this.a.a(pkfVar);
    }

    @Override // defpackage.jzf, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.c = true;
            poj pojVar = this.b;
            if (pojVar != null) {
                this.a.a(pojVar);
                this.b = null;
            }
        }
        this.a.close();
    }
}
