package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class drj implements dri {
    public final rar a;
    private final dsd b;

    public drj(dsd dsdVar, rar rarVar) {
        this.b = dsdVar;
        this.a = rarVar;
    }

    @Override // defpackage.dri
    public final void a(blm blmVar) {
        this.b.b(blmVar, this.a.c());
    }

    @Override // defpackage.dri
    public final void b(blm blmVar) {
        this.b.c(blmVar, this.a.c());
    }

    @Override // defpackage.dri
    public final bne c(bne bneVar, blp blpVar) {
        return this.b.d(this, bneVar, blpVar);
    }

    public final boolean equals(Object obj) {
        drj drjVar = obj instanceof drj ? (drj) obj : null;
        return drjVar != null && this.b == drjVar.b && this.a == drjVar.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
