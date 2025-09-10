package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jav extends gsn {
    final /* synthetic */ gnt a;
    public final /* synthetic */ jbc b;
    final /* synthetic */ nks c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jav(jbc jbcVar, nks nksVar, gnt gntVar) {
        super((int[]) null);
        this.c = nksVar;
        this.a = gntVar;
        this.b = jbcVar;
    }

    @Override // defpackage.gsn
    public final void b() {
        if (this.c.i) {
            return;
        }
        gnt gntVar = this.a;
        gntVar.h(new imf(this, gntVar.a(), 15));
    }

    @Override // defpackage.gsn
    public final void k() {
    }
}
