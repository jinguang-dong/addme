package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgm implements pdk {
    public final pdv a;
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private pgf d;
    private paq e;
    private boolean f;
    private final ojl g;

    public pgm(pdv pdvVar, ojl ojlVar) {
        this.a = pdvVar;
        this.g = ojlVar;
    }

    @Override // defpackage.pdk
    public final synchronized pdk a() {
        if (this.f) {
            return null;
        }
        pgf pgfVar = this.d;
        if (pgfVar != null) {
            return pgy.k(pgfVar, this.g);
        }
        pgm pgmVar = new pgm(this.a, this.g);
        this.c.add(pgmVar);
        return pgmVar;
    }

    @Override // defpackage.pdk
    public final synchronized pdo b() {
        pgf pgfVar = this.d;
        if (pgfVar == null) {
            return null;
        }
        return pgfVar.c;
    }

    @Override // defpackage.pdk
    public final pdv c() {
        return this.a;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.f) {
            this.f = true;
            this.b.clear();
            paq paqVar = this.e;
            if (paqVar != null) {
                paqVar.close();
                this.e = null;
            }
        }
    }

    @Override // defpackage.pdk
    public final synchronized poe d() {
        pgf pgfVar = this.d;
        if (pgfVar == null) {
            return null;
        }
        return pgfVar.d();
    }

    @Override // defpackage.pdk
    public final synchronized poj e(peo peoVar) {
        pgf pgfVar = this.d;
        if (pgfVar != null && !this.f) {
            return pgfVar.e(peoVar);
        }
        return null;
    }

    @Override // defpackage.pdk
    public final synchronized boolean f() {
        return this.f;
    }

    @Override // defpackage.pdk
    public final synchronized boolean g() {
        pgf pgfVar = this.d;
        if (pgfVar != null) {
            if (pgfVar.l()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pdk
    public final synchronized boolean h() {
        pgf pgfVar = this.d;
        if (pgfVar != null) {
            if (pgfVar.m()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pdk
    public final synchronized boolean i() {
        pgf pgfVar = this.d;
        if (pgfVar != null) {
            if (pgfVar.n()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pdk
    public final synchronized void j(ojl ojlVar) {
        pgf pgfVar = this.d;
        if (pgfVar == null) {
            this.b.add(ojlVar);
        } else {
            if (this.f) {
                return;
            }
            pgfVar.p(ojlVar);
        }
    }

    public final synchronized void k(pgf pgfVar) {
        paq paqVar;
        pgfVar.getClass();
        rnt.M(this.d == null, "FrameStreamResult was set twice!");
        this.d = pgfVar;
        this.e = pgfVar.b();
        List list = this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pgfVar.p((ojl) it.next());
        }
        list.clear();
        List list2 = this.c;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((pgm) it2.next()).k(pgfVar);
        }
        list2.clear();
        if (!this.f || (paqVar = this.e) == null) {
            return;
        }
        paqVar.close();
        this.e = null;
    }
}
