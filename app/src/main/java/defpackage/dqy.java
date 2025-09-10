package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dqy implements uif {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ dqy(Object obj, float f, int i) {
        this.c = i;
        this.b = obj;
        this.a = f;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dpj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [dkf, java.lang.Object] */
    @Override // defpackage.uif
    public final Object a() {
        if (this.c != 0) {
            return Float.valueOf(ukc.k(this.b.b() - this.a, 0.0f));
        }
        ?? r0 = this.b;
        return new dox(r0.a(), r0.b(), this.a);
    }
}
