package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjb implements uiq {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public cjb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, syu] */
    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.cancel(false);
            return ufg.a;
        }
        if (i == 1) {
            return this.a.a(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
        if (i == 2) {
            this.a.cancel(false);
            return ufg.a;
        }
        if (i != 3) {
            this.a.cancel(false);
            return ufg.a;
        }
        this.a.cancel(false);
        return ufg.a;
    }
}
