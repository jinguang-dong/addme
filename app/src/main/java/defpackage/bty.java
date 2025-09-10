package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bty extends bua {
    public buc a;

    public bty(buc bucVar) {
        this.a = bucVar;
    }

    @Override // defpackage.bua
    public final Object a(ocq ocqVar) {
        if (ocqVar != this.a.e()) {
            bqs.c("Check failed.");
        }
        return this.a.d();
    }

    @Override // defpackage.bua
    public final boolean b(ocq ocqVar) {
        return ocqVar == this.a.e();
    }
}
