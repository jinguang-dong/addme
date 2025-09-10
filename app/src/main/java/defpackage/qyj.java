package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qyj implements rww {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ qyj(lat latVar, String str, String str2, int i) {
        this.d = i;
        this.a = latVar;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, owf] */
    @Override // defpackage.rww
    public final Object fr() {
        boolean z = false;
        if (this.d == 0) {
            int i = slm.a;
            int i2 = slr.a;
            slq slqVar = new slq();
            slqVar.f(((String) this.b).getBytes());
            slqVar.a.put((byte) 0);
            slqVar.g();
            slqVar.f(((String) this.c).getBytes());
            return ((smb) ((lat) this.a).a).g(slqVar.m().e());
        }
        ltq ltqVar = (ltq) this.b.dL();
        jjq jjqVar = (jjq) this.c.dL();
        boolean z2 = jjqVar.f.isPresent() || jjqVar.g.isPresent();
        boolean z3 = (ltqVar == null || ltqVar == ltq.ON || ltqVar == ltq.ON_LOCKED) ? false : true;
        ibb ibbVar = (ibb) this.a;
        if (((ibbVar.i() && ibbVar.c.b) || ibbVar.a.equals(iao.NIGHT_SIGHT) || z2) && !z3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public /* synthetic */ qyj(owf owfVar, owf owfVar2, ibb ibbVar, int i) {
        this.d = i;
        this.b = owfVar;
        this.c = owfVar2;
        this.a = ibbVar;
    }
}
