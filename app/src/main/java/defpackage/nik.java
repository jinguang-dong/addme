package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nik implements uiu {
    public final /* synthetic */ String a;
    public final /* synthetic */ mxm b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    private final /* synthetic */ int f;

    public /* synthetic */ nik(String str, mxm mxmVar, boolean z, float f, int i, int i2) {
        this.f = i2;
        this.a = str;
        this.b = mxmVar;
        this.c = z;
        this.d = f;
        this.e = i;
    }

    @Override // defpackage.uiu
    public final Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            ayc aycVar = (ayc) obj;
            ((Integer) obj2).intValue();
            int i = this.e;
            float f = this.d;
            boolean z = this.c;
            jsv.R(this.a, this.b, z, f, aycVar, bay.j(i | 1));
            return ufg.a;
        }
        ayc aycVar2 = (ayc) obj;
        ((Integer) obj2).intValue();
        int i2 = this.e;
        float f2 = this.d;
        boolean z2 = this.c;
        jsv.P(this.a, this.b, z2, f2, aycVar2, bay.j(i2 | 1));
        return ufg.a;
    }
}
