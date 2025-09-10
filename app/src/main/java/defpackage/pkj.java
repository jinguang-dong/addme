package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pkj extends poh implements poo {
    public final Object a;
    public boolean b;
    public int c;
    private boolean d;

    public pkj(poo pooVar) {
        super(pooVar);
        this.a = new Object();
        this.d = false;
        this.c = 0;
    }

    @Override // defpackage.poh, defpackage.poo, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            if (!this.d && !this.b) {
                this.b = true;
                j();
            }
        }
    }

    @Override // defpackage.poh, defpackage.poo
    public final poj f() {
        poj pojVarF;
        synchronized (this.a) {
            if (this.b || this.d || (pojVarF = super.f()) == null) {
                return null;
            }
            this.c++;
            return new pki(this, pojVarF);
        }
    }

    @Override // defpackage.poh, defpackage.poo
    public final poj g() {
        poj pojVarG;
        synchronized (this.a) {
            if (this.b || this.d || (pojVarG = super.g()) == null) {
                return null;
            }
            this.c++;
            return new pki(this, pojVarG);
        }
    }

    @Override // defpackage.poh, defpackage.poo
    public final void i(pon ponVar, Handler handler) {
        super.i(new pkh(this, ponVar), handler);
    }

    public final void j() {
        if (this.d) {
            return;
        }
        if (this.c == 0) {
            this.d = true;
            super.close();
        } else {
            poj pojVarF = super.f();
            if (pojVarF != null) {
                pojVarF.close();
            }
            h();
        }
    }
}
