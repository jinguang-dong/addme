package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bue extends bua {
    public final azr a = new azz(null, bap.c);
    public final ocq b;

    public bue(ocq ocqVar) {
        this.b = ocqVar;
    }

    @Override // defpackage.bua
    public final Object a(ocq ocqVar) {
        if (ocqVar != this.b) {
            bqs.c("Check failed.");
        }
        Object objA = this.a.a();
        if (objA == null) {
            return null;
        }
        return objA;
    }

    @Override // defpackage.bua
    public final boolean b(ocq ocqVar) {
        return ocqVar == this.b;
    }
}
