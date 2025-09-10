package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class esi implements fba {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public esi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [cnj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [cnj, java.lang.Object] */
    @Override // defpackage.fba
    public final /* synthetic */ Object a() {
        if (this.b != 0) {
            ode odeVar = (ode) this.a;
            return new esa((esj) odeVar.b, odeVar.c);
        }
        gko gkoVar = (gko) this.a;
        Object obj = gkoVar.a;
        Object obj2 = gkoVar.d;
        Object obj3 = gkoVar.b;
        Object obj4 = gkoVar.c;
        return new eso((eue) obj, (eue) obj2, (eue) obj3, (ree) obj4, (ree) gkoVar.e, gkoVar.f);
    }
}
