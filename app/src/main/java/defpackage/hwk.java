package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hwk implements klr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hwk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r4v1, types: [inz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, uem] */
    @Override // defpackage.klr, java.lang.Runnable
    public final void run() {
        boolean zF;
        int i = this.b;
        if (i == 0) {
            this.a.close();
            return;
        }
        if (i == 1) {
            ((gox) this.a.a()).m();
            return;
        }
        if (i == 2) {
            ((jsb) this.a.a()).b();
            return;
        }
        if (i == 3) {
            kai kaiVar = (kai) this.a.a();
            kaiVar.k = true;
            kaiVar.n();
        } else {
            if (i == 4) {
                ((our) this.a).close();
                return;
            }
            Object obj = this.a;
            owd owdVar = (owd) obj;
            owdVar.d.f("ShotPipeline#shutdown");
            synchronized (obj) {
                ((owd) obj).a = true;
                zF = ((owd) obj).f();
            }
            if (zF) {
                owdVar.e();
            }
            owdVar.d.g();
        }
    }
}
