package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfm implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public pfm(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        return this.c != 0 ? b() : b();
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, pjo] */
    public final pjo b() {
        if (this.c == 0) {
            return ((pab) this.a).a().a(((pfn) this.b).a().a);
        }
        got gotVar = (got) this.b.a();
        ngw ngwVar = (ngw) this.a.a();
        Object obj = gotVar.a;
        pjr pjrVarF = ngwVar.f();
        pjrVarF.getClass();
        return ((got) obj).y(pjrVarF).b;
    }

    public pfm(tzx tzxVar, tzx tzxVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
