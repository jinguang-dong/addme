package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhv implements bdg, uhd {
    public static final bhu a = new bhu();
    public final ayg b;

    public bhv(ayg aygVar) {
        this.b = aygVar;
    }

    @Override // defpackage.bdg
    public final List a() {
        return this.b.T();
    }

    public final void b(Throwable th, Object obj) {
        bad.i(th, new aet(this, obj, 8));
    }

    @Override // defpackage.uhf
    public final Object fold(Object obj, uiu uiuVar) {
        return ske.aF(this, obj, uiuVar);
    }

    @Override // defpackage.uhd, defpackage.uhf
    public final uhd get(uhe uheVar) {
        return ske.aG(this, uheVar);
    }

    @Override // defpackage.uhd
    public final uhe getKey() {
        return a;
    }

    @Override // defpackage.uhf
    public final uhf minusKey(uhe uheVar) {
        return ske.aH(this, uheVar);
    }

    @Override // defpackage.uhf
    public final uhf plus(uhf uhfVar) {
        return ske.aI(this, uhfVar);
    }
}
