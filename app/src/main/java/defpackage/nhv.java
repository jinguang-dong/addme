package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nhv implements uiu {
    final /* synthetic */ boolean a;
    final /* synthetic */ nhz b;
    private final /* synthetic */ int c;

    public nhv(nhz nhzVar, boolean z, int i) {
        this.c = i;
        this.b = nhzVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [bbo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [bbo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [bbo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [bbo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [bbo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [bbo, java.lang.Object] */
    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.c == 0) {
            ayc aycVar = (ayc) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && aycVar.G()) {
                aycVar.r();
            } else {
                boolean z = this.a;
                gsn.l(z, true, bdq.k(-1538738727, new nhv(this.b, z, 1), aycVar), aycVar, 384, 0);
            }
            return ufg.a;
        }
        ayc aycVar2 = (ayc) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && aycVar2.G()) {
            aycVar2.r();
        } else {
            nhz nhzVar = this.b;
            jsv.V((nhy) nhzVar.c.a(), (mxm) nhzVar.h.a(), nhzVar.b(), (String) nhzVar.b.a(), ((bbd) nhzVar.k).e(), (gox) nhzVar.a, (nhw) nhzVar.e.a(), (nhw) nhzVar.d.a(), ((Boolean) nhzVar.f.a()).booleanValue(), this.a, aycVar2, 0, 0);
        }
        return ufg.a;
    }

    public nhv(boolean z, nhz nhzVar, int i) {
        this.c = i;
        this.a = z;
        this.b = nhzVar;
    }
}
