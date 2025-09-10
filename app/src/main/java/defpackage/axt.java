package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axt implements uiq {
    final /* synthetic */ axu a;
    final /* synthetic */ ujy b;
    final /* synthetic */ cwi c;

    public axt(cwi cwiVar, axu axuVar, ujy ujyVar) {
        this.c = cwiVar;
        this.a = axuVar;
        this.b = ujyVar;
    }

    @Override // defpackage.uiq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        bff bffVar;
        int i;
        cwi cwiVar = this.c;
        cwiVar.a = null;
        cwiVar.b = null;
        int i2 = this.b.a;
        do {
            bffVar = this.a.b;
            i = bffVar.get();
        } while (!bffVar.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
        return ufg.a;
    }
}
