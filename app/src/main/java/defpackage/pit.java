package defpackage;

import android.util.ArraySet;
import android.util.SparseIntArray;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pit {
    public final Object a;
    public Object b;

    public pit(pcf pcfVar, pjp pjpVar) {
        this.b = pcfVar;
        this.a = pjpVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, pbc] */
    private static /* synthetic */ void n(pit pitVar, pfr pfrVar) {
        if (pfrVar.equals(pitVar.b)) {
            return;
        }
        pitVar.a.b(String.valueOf(String.valueOf(pfrVar)).concat(" is now active."));
        pitVar.b = pfrVar;
    }

    public final synchronized float a() {
        return ((piu) this.a).a();
    }

    public final synchronized rwc b() {
        return ((piu) this.a).b();
    }

    public final synchronized void c(Runnable runnable) {
        rnt.M(this.b == null, "Listener is already set, override not supported.");
        this.b = runnable;
    }

    public final synchronized void d(pfr pfrVar) {
        n(this, pfrVar);
    }

    public final synchronized void e(pfr pfrVar) {
        n(this, pfrVar);
    }

    public final synchronized void f(pfr pfrVar) {
        if (this.b == pfrVar) {
            this.b = null;
        }
    }

    public final synchronized boolean g(pfr pfrVar) {
        return pfrVar.equals(this.b);
    }

    public final void h() {
        Object obj = this.a;
        synchronized (obj) {
            ((SparseIntArray) obj).clear();
        }
    }

    public final int i(int i) {
        int i2;
        Object obj = this.a;
        synchronized (obj) {
            i2 = ((SparseIntArray) obj).get(i, -1);
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pjo] */
    public final synchronized paq j(lxi lxiVar) {
        this.a.add(lxiVar);
        ?? r0 = this.b;
        if (r0 != 0) {
            lxiVar.e(r0);
        }
        return new ktu(this, lxiVar, 7, (char[]) null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized void k(pjo pjoVar) {
        this.b = pjoVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lxi) it.next()).e(pjoVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized void l(poe poeVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lxi) it.next()).f(poeVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized void m(phc phcVar, peo peoVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lxi) it.next()).g(phcVar, peoVar);
        }
    }

    public pit(piu piuVar) {
        this.a = piuVar;
    }

    public pit(pbc pbcVar) {
        this.a = pbcVar.a("FrameServerLock");
    }

    public pit(byte[] bArr) {
        this.a = new ArraySet();
    }

    public pit() {
        this(odn.a);
    }

    public pit(odo odoVar) {
        this.a = new SparseIntArray();
        ojl.ay(odoVar);
        this.b = odoVar;
    }
}
