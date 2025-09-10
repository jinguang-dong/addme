package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hso implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final /* synthetic */ int d;

    public hso(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i) {
        this.d = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.d;
        return i != 0 ? i != 1 ? i != 2 ? b() : b() : b() : b();
    }

    public final kgt b() {
        int i = this.d;
        if (i == 0) {
            kgu kguVar = (kgu) this.a.a();
            tzx tzxVar = this.c;
            rwc rwcVarB = ((fkh) this.b).b();
            qqq qqqVar = (qqq) tzxVar.a();
            kguVar.getClass();
            qqqVar.getClass();
            return kguVar.a(qqqVar, rwcVarB, new qyc(false), nkw.SERENGETI);
        }
        if (i == 1) {
            return ((kgu) this.a.a()).a((qqq) this.b.a(), ((fkh) this.c).b(), new qyc(false), nkw.COTTAGE);
        }
        if (i != 2) {
            return ((kgu) this.a.a()).a(((jcx) this.b).a(), ((fkh) this.c).b(), new qyc(false), nkw.LANDSCAPE);
        }
        return ((kgu) this.a.a()).a(((jcx) this.b).a(), ((fkh) this.c).b(), new qyc(false), nkw.ACTION_PAN);
    }
}
