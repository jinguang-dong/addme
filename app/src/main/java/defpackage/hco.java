package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hco implements tzt {
    private final tzx a;

    public hco(tzx tzxVar) {
        this.a = tzxVar;
    }

    public static pbb c(pbc pbcVar) {
        return pbcVar instanceof pbb ? (pbb) pbcVar : new hcq(pbcVar);
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final pbb a() {
        return c(((pba) this.a).a());
    }
}
