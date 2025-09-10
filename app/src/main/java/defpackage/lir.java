package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class lir implements fre {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lir(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.fre
    public final /* synthetic */ int a() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, pbn] */
    @Override // defpackage.fre
    public final syu b() {
        if (this.c == 0) {
            this.a.a(this.b);
            return ske.M(true);
        }
        Object obj = this.b;
        obj.getClass();
        this.a.e("GpuFaceBeautificationStartup", new hjp(obj, 2));
        return ske.M(true);
    }

    @Override // defpackage.fre
    public final /* synthetic */ String c() {
        return this.c != 0 ? gsn.Z(this) : gsn.Z(this);
    }
}
