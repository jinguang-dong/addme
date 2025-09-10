package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajf implements aim {
    final /* synthetic */ aji a;
    final /* synthetic */ rnu b;

    public ajf(aji ajiVar, rnu rnuVar) {
        this.a = ajiVar;
        this.b = rnuVar;
    }

    @Override // defpackage.aim
    public final float a(float f) {
        if (Math.abs(f) != 0.0f) {
            aji ajiVar = this.a;
            if ((f > 0.0f && !ajiVar.a.d()) || ((f < 0.0f && !ajiVar.a.c()) || !((Boolean) ajiVar.f.a()).booleanValue())) {
                throw new aht();
            }
        }
        aji ajiVar2 = this.a;
        return ajiVar2.a(ajiVar2.b(this.b.n(ajiVar2.d(ajiVar2.f(f)), 2)));
    }
}
