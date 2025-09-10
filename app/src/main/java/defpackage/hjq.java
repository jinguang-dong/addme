package defpackage;

import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hjq implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ hjq(hjy hjyVar, owq owqVar, boolean z, uem uemVar, int i) {
        this.e = i;
        this.b = hjyVar;
        this.d = owqVar;
        this.a = z;
        this.c = uemVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, owq, pau] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, pdn] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, uem] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.e;
        if (i == 0) {
            pka pkaVarL = ((pkb) this.d).l();
            ((hjy) this.b).f(pkaVarL);
            if (this.a) {
                ((hjy) this.c.a()).f(pkaVarL);
                return;
            }
            return;
        }
        if (i == 1) {
            ?? r0 = this.d;
            ((hjy) this.b).e(r0);
            if (this.a) {
                ((hjy) this.c.a()).e(r0);
                return;
            }
            return;
        }
        if (i == 2) {
            boolean z2 = this.a;
            ?? r1 = this.d;
            if (z2 || !r1.equals(((kzl) this.b).e)) {
                for (peo peoVar : r1.i().d()) {
                    if (kzz.i(peoVar)) {
                        ((pfu) this.c).h(peoVar);
                    }
                }
                return;
            }
            return;
        }
        if (i == 3) {
            ?? r02 = this.d;
            r02.a(-1);
            if (!this.a) {
                r02.a(-1);
                return;
            }
            ?? r12 = this.c;
            ((our) this.b).d(((lcu) r12.a()).b().dK(r02, sxo.a));
            return;
        }
        ?? r03 = this.d;
        ?? r13 = this.c;
        boolean z3 = this.a;
        Object obj = this.b;
        try {
            synchronized (((ndn) obj).b) {
                z = ((ndn) obj).f;
            }
            ShutterButton shutterButton = ((ndn) obj).a;
            if (shutterButton.isEnabled() != z) {
                shutterButton.n(z, z3);
                if (!shutterButton.d().equals(ncn.PHOTO_LONGPRESS_LOCKED)) {
                    ((ndn) obj).aF(z);
                } else if (!z) {
                    z = false;
                    ((ndn) obj).aF(z);
                }
            }
        } finally {
            r13.run();
            r03.a();
        }
    }

    public /* synthetic */ hjq(kgw kgwVar, hjy hjyVar, boolean z, uem uemVar, int i) {
        this.e = i;
        this.d = kgwVar;
        this.b = hjyVar;
        this.a = z;
        this.c = uemVar;
    }

    public /* synthetic */ hjq(kzl kzlVar, boolean z, pdn pdnVar, pfu pfuVar, int i) {
        this.e = i;
        this.b = kzlVar;
        this.a = z;
        this.d = pdnVar;
        this.c = pfuVar;
    }

    public /* synthetic */ hjq(ndn ndnVar, boolean z, Runnable runnable, pbp pbpVar, int i) {
        this.e = i;
        this.b = ndnVar;
        this.a = z;
        this.c = runnable;
        this.d = pbpVar;
    }

    public /* synthetic */ hjq(owq owqVar, boolean z, our ourVar, uem uemVar, int i) {
        this.e = i;
        this.d = owqVar;
        this.a = z;
        this.b = ourVar;
        this.c = uemVar;
    }
}
