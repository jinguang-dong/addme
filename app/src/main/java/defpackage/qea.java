package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qea implements qeb {
    public final /* synthetic */ edw a;
    private final /* synthetic */ int b;

    public /* synthetic */ qea(edw edwVar, int i) {
        this.b = i;
        this.a = edwVar;
    }

    @Override // defpackage.qeb
    public final Object a() {
        int i = this.b;
        if (i == 0) {
            Integer numB = this.a.b("http://ns.google.com/photos/1.0/camera/", "MotionPhoto");
            return (numB == null || numB.intValue() <= 0) ? null : 2;
        }
        if (i == 1) {
            return this.a.b("http://ns.google.com/photos/1.0/camera/", "MicroVideoOffset");
        }
        Integer numB2 = this.a.b("http://ns.google.com/photos/1.0/camera/", "MicroVideo");
        return (numB2 == null || numB2.intValue() <= 0) ? null : 1;
    }
}
