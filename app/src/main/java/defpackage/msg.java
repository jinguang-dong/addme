package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class msg implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ msg(Object obj, boolean z, boolean z2, boolean z3, int i) {
        this.e = i;
        this.d = obj;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e == 0) {
            msh mshVar = (msh) this.d;
            pfz pfzVar = mshVar.q;
            boolean z = this.c;
            mshVar.e(this.a, pfzVar, this.b, z);
            mshVar.p = null;
            return;
        }
        Object obj = this.d;
        mje mjeVar = (mje) obj;
        if (mjeVar.M == null) {
            szh szhVar = mjeVar.X;
            if (szhVar != null) {
                szhVar.e(null);
                return;
            }
            return;
        }
        boolean z2 = this.c;
        boolean z3 = this.b;
        if (this.a) {
            mjeVar.z.h(new nto(obj, z3, z2, 1), false);
            return;
        }
        szh szhVar2 = mjeVar.X;
        if (szhVar2 != null) {
            szhVar2.e(null);
        }
        mjeVar.f(z3, z2);
    }
}
