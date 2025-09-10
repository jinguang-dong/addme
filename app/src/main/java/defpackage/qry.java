package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qry implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public qry(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qrx a() {
        return new qrx(((qrm) this.a).a(), ((qrl) this.b).a(), this.c);
    }
}
