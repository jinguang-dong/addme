package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyg extends cxm {
    public static final cxp a = new cyf();
    public final aab b = new aab();
    public boolean c = false;

    public final void a() {
        this.c = false;
    }

    public final cyd b() {
        return (cyd) aac.a(this.b, 54321);
    }

    @Override // defpackage.cxm
    protected final void ff() {
        aab aabVar = this.b;
        int iC = aabVar.c();
        for (int i = 0; i < iC; i++) {
            ((cyd) aabVar.e(i)).k();
        }
        int i2 = aabVar.d;
        Object[] objArr = aabVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        aabVar.d = 0;
        aabVar.a = false;
    }
}
