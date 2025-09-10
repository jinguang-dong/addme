package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gar implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public gar(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final got a() {
        oxn oxnVar = (oxn) this.a.a();
        return new got(oxnVar, (pkc) this.c.a());
    }
}
