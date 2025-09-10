package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qdn implements puq {
    public final rwc a;
    private final sxh b;

    public qdn(sxh sxhVar, rwc rwcVar) {
        this.b = sxhVar;
        this.a = rwcVar;
    }

    @Override // defpackage.puq
    public final syu a(pvu pvuVar) {
        try {
            return swz.j(this.b.a(), rsx.c(new pzn(this, pvuVar, 16, null)), sxo.a);
        } catch (Exception e) {
            qbu.f(e, "Failed to get ManifestConfig.");
            return ske.L(e);
        }
    }
}
