package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class csr implements uhd {
    private final csr a;
    private final cru b;

    public csr(csr csrVar, cru cruVar) {
        this.a = csrVar;
        this.b = cruVar;
    }

    public final void a(cru cruVar) {
        if (this.b == cruVar) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        csr csrVar = this.a;
        if (csrVar != null) {
            csrVar.a(cruVar);
        }
    }

    @Override // defpackage.uhf
    public final Object fold(Object obj, uiu uiuVar) {
        return ske.aF(this, obj, uiuVar);
    }

    @Override // defpackage.uhd, defpackage.uhf
    public final uhd get(uhe uheVar) {
        return ske.aG(this, uheVar);
    }

    @Override // defpackage.uhd
    public final uhe getKey() {
        return csq.a;
    }

    @Override // defpackage.uhf
    public final uhf minusKey(uhe uheVar) {
        return ske.aH(this, uheVar);
    }

    @Override // defpackage.uhf
    public final uhf plus(uhf uhfVar) {
        return ske.aI(this, uhfVar);
    }
}
