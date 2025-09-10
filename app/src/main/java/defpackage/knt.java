package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knt implements kmz {
    private final /* synthetic */ int a;

    public knt(int i) {
        this.a = i;
    }

    @Override // defpackage.kmz
    public final owf a() {
        return this.a != 0 ? new owi(true) : new owi(true);
    }

    @Override // defpackage.kmz
    public final owf b() {
        return this.a != 0 ? new owi(qpt.cl()) : new owi(qpt.cl());
    }

    @Override // defpackage.kmz
    public final void c(kmy kmyVar, gga ggaVar) throws pco {
        if (this.a == 0) {
            throw new pco("Fallback command not available");
        }
    }
}
