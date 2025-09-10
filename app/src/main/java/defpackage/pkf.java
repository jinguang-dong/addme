package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pkf extends pog {
    private int a;

    public pkf(poj pojVar) {
        this(pojVar, 1);
    }

    @Override // defpackage.pog, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        l();
    }

    public final poj k() {
        synchronized (this) {
            int i = this.a;
            if (i <= 0) {
                return null;
            }
            this.a = i + 1;
            return new pkg(this);
        }
    }

    public final void l() {
        synchronized (this) {
            int i = this.a;
            if (i <= 0) {
                return;
            }
            int i2 = i - 1;
            this.a = i2;
            if (i2 == 0) {
                super.close();
            }
        }
    }

    @Override // defpackage.pog
    public final String toString() {
        String string;
        synchronized (this) {
            rwb rwbVarW = rnt.W(this);
            rwbVarW.e("refCount", this.a);
            rwbVarW.a(super.toString());
            string = rwbVarW.toString();
        }
        return string;
    }

    public pkf(poj pojVar, int i) {
        super(pojVar);
        rnt.B(i > 0, "Initial reference count must be greater than zero!");
        this.a = i;
    }
}
