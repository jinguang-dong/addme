package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmv implements kmz {
    private final kmz a;
    private final boolean b;
    private final int c;

    public kmv(kmz kmzVar, int i, boolean z) {
        kmzVar.getClass();
        this.a = kmzVar;
        this.c = i;
        this.b = z;
    }

    @Override // defpackage.kmz
    public final owf a() {
        return this.a.a();
    }

    @Override // defpackage.kmz
    public final owf b() {
        return this.a.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lss] */
    @Override // defpackage.kmz
    public final void c(kmy kmyVar, gga ggaVar) {
        ?? r0 = ggaVar.b;
        ((mdo) r0.o()).c = this.b;
        r0.am(this.c);
        this.a.c(kmyVar, ggaVar);
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.b("delegate", this.a);
        return rwbVarW.toString();
    }
}
