package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnq implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;

    public lnq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lnp a() {
        return new lnp(((hef) this.a).b().booleanValue(), ((hef) this.b).b().booleanValue(), ((hef) this.c).b().booleanValue(), ((hef) this.d).b().booleanValue());
    }
}
