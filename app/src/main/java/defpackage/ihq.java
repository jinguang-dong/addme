package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihq implements tzt {
    private final tzx a;
    private final tzx b;

    public ihq(tzx tzxVar, tzx tzxVar2) {
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long a() {
        return Long.valueOf(Math.max(1000000000L, ((((hbj) this.b.a()).p(gzs.X) ? ihp.b : ihp.a) * ((hyd) this.a.a()).a) + ojl.aZ(500)));
    }
}
