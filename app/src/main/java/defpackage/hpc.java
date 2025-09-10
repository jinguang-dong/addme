package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpc implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public hpc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean a() {
        iso isoVarA = ((hfg) this.a).a();
        hbj hbjVar = (hbj) this.b.a();
        return Boolean.valueOf((isoVarA.m() && ((kil) this.c).a().a) || hbjVar.o(has.c) || hbjVar.p(gyo.f) || hbjVar.p(gzs.at));
    }
}
