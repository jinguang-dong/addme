package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
class key extends kfa {
    final /* synthetic */ kez b;

    public key(kez kezVar) {
        this.b = kezVar;
    }

    @Override // defpackage.kfa, defpackage.mcz, defpackage.mda
    public final void a() throws Resources.NotFoundException {
        kez kezVar = this.b;
        owf owfVar = kezVar.j;
        ((nkw) owfVar.dL()).name();
        boolean zK = kezVar.i.k();
        kezVar.k(zK);
        if (zK) {
            kezVar.h.ab();
            return;
        }
        int iOrdinal = ((nkw) owfVar.dL()).ordinal();
        if (iOrdinal == 1) {
            kezVar.h.af();
        } else if (iOrdinal == 6) {
            kezVar.h.ah();
        } else {
            if (iOrdinal != 10) {
                return;
            }
            kezVar.h.ac();
        }
    }

    @Override // defpackage.kfa
    public void c() {
        kez kezVar = this.b;
        kezVar.k.c();
        kezVar.m();
        kezVar.l();
        kezVar.n();
    }

    @Override // defpackage.kfa
    public void f() {
    }

    @Override // defpackage.kfa
    public void h() {
    }
}
