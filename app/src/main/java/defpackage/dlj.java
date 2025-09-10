package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dlj implements btb {
    private final uiu a;

    public dlj(uiu uiuVar) {
        this.a = uiuVar;
    }

    @Override // defpackage.bik
    public final /* synthetic */ boolean c(uiq uiqVar) {
        return bay.s(this, uiqVar);
    }

    @Override // defpackage.bik
    public final /* synthetic */ bik cM(bik bikVar) {
        return bay.t(this, bikVar);
    }

    @Override // defpackage.bik
    public final /* synthetic */ Object cN(Object obj, uiu uiuVar) {
        return bay.r(this, obj, uiuVar);
    }

    @Override // defpackage.btb
    public final Object d(Object obj) {
        return obj instanceof dmk ? new dlv(this.a, (dmk) obj) : obj instanceof dlv ? new dlv(this.a, ((dlv) obj).b) : new dlv(this.a, 2);
    }
}
