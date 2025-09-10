package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nid implements uiu {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ nid(bgz bgzVar, int i, uiq uiqVar, float f, boolean z, int i2, int i3) {
        this.g = i3;
        this.e = bgzVar;
        this.a = i;
        this.f = uiqVar;
        this.b = f;
        this.c = z;
        this.d = i2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, uiq] */
    @Override // defpackage.uiu
    public final Object a(Object obj, Object obj2) {
        if (this.g != 0) {
            ayc aycVar = (ayc) obj;
            ((Integer) obj2).intValue();
            int i = this.d;
            boolean z = this.c;
            float f = this.b;
            ?? r3 = this.f;
            gsn.T((bgz) this.e, this.a, r3, f, z, aycVar, bay.j(i | 1));
            return ufg.a;
        }
        ayc aycVar2 = (ayc) obj;
        ((Integer) obj2).intValue();
        int i2 = this.d;
        boolean z2 = this.c;
        float f2 = this.b;
        jsv.W((nhy) this.e, (gox) this.f, this.a, f2, z2, aycVar2, bay.j(i2 | 1));
        return ufg.a;
    }

    public /* synthetic */ nid(nhy nhyVar, gox goxVar, int i, float f, boolean z, int i2, int i3) {
        this.g = i3;
        this.e = nhyVar;
        this.f = goxVar;
        this.a = i;
        this.b = f;
        this.c = z;
        this.d = i2;
    }
}
