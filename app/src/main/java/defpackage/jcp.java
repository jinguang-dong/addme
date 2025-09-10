package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcp implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final /* synthetic */ int e;

    public jcp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i) {
        this.e = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        return this.e != 0 ? b() : b();
    }

    public final kgt b() {
        if (this.e == 0) {
            kgu kguVar = (kgu) this.a.a();
            rwc rwcVarB = ((fkh) this.c).b();
            gzi gziVar = gzo.a;
            return kguVar.a(((jcx) this.b).a(), rwcVarB, new qyc(false), nkw.PORTRAIT);
        }
        kgu kguVar2 = (kgu) this.a.a();
        rwc rwcVarB2 = ((fkh) this.c).b();
        hbj hbjVar = (hbj) this.d.a();
        gzi gziVar2 = gzo.a;
        return kguVar2.a(((jcx) this.b).a(), rwcVarB2, new qyc(hbjVar.p(gzs.at)), nkw.NIGHT_SIGHT);
    }
}
