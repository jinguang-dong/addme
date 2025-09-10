package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iau implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;

    public iau(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final iat a() {
        hbj hbjVar = (hbj) this.a.a();
        ocq ocqVar = (ocq) this.b.a();
        hqw hqwVar = (hqw) this.c.a();
        pbn pbnVar = (pbn) this.d.a();
        jlz jlzVar = new jlz();
        tzx tzxVar = this.f;
        return new iat(hbjVar, ocqVar, hqwVar, pbnVar, jlzVar);
    }
}
