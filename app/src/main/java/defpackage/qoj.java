package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qoj implements qol {
    private final uzx a;
    private final Comparable b;

    public qoj(uzx uzxVar, Comparable comparable) {
        this.a = uzxVar;
        this.b = comparable;
    }

    @Override // defpackage.qol
    public final long a() {
        int iK;
        uzx uzxVar = this.a;
        if (uzxVar.C()) {
            iK = uzxVar.k(null);
            if (iK < 0) {
                throw new IllegalStateException(a.bv(iK, "serialized size must be non-negative, was "));
            }
        } else {
            int iK2 = uzxVar.aV & Integer.MAX_VALUE;
            if (iK2 == Integer.MAX_VALUE) {
                iK2 = uzxVar.k(null);
                if (iK2 < 0) {
                    throw new IllegalStateException(a.bv(iK2, "serialized size must be non-negative, was "));
                }
                uzxVar.aV = (uzxVar.aV & Integer.MIN_VALUE) | iK2;
            }
            iK = iK2;
        }
        return iK;
    }

    @Override // defpackage.qol
    public final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b.compareTo(((qoj) obj).b);
    }
}
