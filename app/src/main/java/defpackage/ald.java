package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ald implements bii {
    private final uiq a;
    private ami b;

    public ald(uiq uiqVar) {
        this.a = uiqVar;
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

    public final void d(bud budVar) {
        ami amiVar = (ami) budVar.m(amk.a);
        if (a.ao(amiVar, this.b)) {
            return;
        }
        this.b = amiVar;
        this.a.a(amiVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ald) && ((ald) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
