package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fxd implements paq {
    public static final sgv a = sgv.g("fxd");
    public final fxe b;
    public final gav c;
    public final fyc d;
    public final uhf e;
    public gaw f;
    public gau g;
    public uol h;
    public syu i;
    public final our j;
    public gdv k;
    public final CopyOnWriteArrayList l;
    public volatile fyv m;
    public final gkf n;
    public lbj o;
    public fxa p;
    public final jod q;
    public final hkk r;
    public final jod s;

    public fxd(jod jodVar, fxe fxeVar, gav gavVar, jod jodVar2, fyc fycVar, gkf gkfVar, hkk hkkVar, uhf uhfVar) {
        jodVar.getClass();
        fxeVar.getClass();
        gavVar.getClass();
        jodVar2.getClass();
        fycVar.getClass();
        gkfVar.getClass();
        hkkVar.getClass();
        this.q = jodVar;
        this.b = fxeVar;
        this.c = gavVar;
        this.s = jodVar2;
        this.d = fycVar;
        this.n = gkfVar;
        this.r = hkkVar;
        this.e = uhfVar;
        this.j = new our();
        this.l = new CopyOnWriteArrayList();
        this.m = fyv.a;
    }

    public final void a(fyv fyvVar) {
        fyvVar.getClass();
        this.m = fyvVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        fyv fyvVar = this.m;
        fyv fyvVar2 = fyv.g;
        if (fyvVar == fyvVar2) {
            return;
        }
        a(fyvVar2);
        this.j.close();
        lbj lbjVar = this.o;
        if (lbjVar != null) {
            lbjVar.close();
        }
        syu syuVar = this.i;
        uol uolVar = null;
        if (syuVar == null) {
            ujp.c("viewfinderSinkFuture");
            syuVar = null;
        }
        if (!syuVar.isDone()) {
            syu syuVar2 = this.i;
            if (syuVar2 == null) {
                ujp.c("viewfinderSinkFuture");
                syuVar2 = null;
            }
            syuVar2.cancel(false);
        }
        uol uolVar2 = this.h;
        if (uolVar2 == null) {
            ujp.c("oneCamcorderJob");
            uolVar2 = null;
        }
        if (uolVar2.t()) {
            uol uolVar3 = this.h;
            if (uolVar3 == null) {
                ujp.c("oneCamcorderJob");
            } else {
                uolVar = uolVar3;
            }
            uolVar.s(null);
        }
    }
}
