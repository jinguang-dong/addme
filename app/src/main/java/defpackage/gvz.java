package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvz implements uiq {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gvz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, uhb] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, syu] */
    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        long j;
        int i = this.b;
        if (i == 0) {
            this.a.get(((Number) obj).intValue());
            return null;
        }
        if (i == 1) {
            bgq bgqVar = (bgq) obj;
            synchronized (bgr.b) {
                j = bgr.d;
                bgr.d = 1 + j;
            }
            return new bgi(j, bgqVar, this.a);
        }
        if (i == 2) {
            this.a.get(((Number) obj).intValue());
            return null;
        }
        if (i != 3) {
            this.a.cancel(false);
            return ufg.a;
        }
        ?? r5 = this.a;
        ufg ufgVar = ufg.a;
        r5.fW(ufgVar);
        return ufgVar;
    }
}
