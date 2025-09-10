package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lns implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public lns(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lnr a() {
        return new lnr(((hef) this.a).b().booleanValue(), ((hef) this.b).b().booleanValue(), ((hef) this.c).b().booleanValue());
    }
}
