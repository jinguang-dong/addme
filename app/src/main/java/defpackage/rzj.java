package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rzj extends rzl {
    @Override // defpackage.rzl
    public final int a() {
        return 0;
    }

    @Override // defpackage.rzl
    public final rzl b(Comparable comparable, Comparable comparable2) {
        int iCompareTo = comparable.compareTo(comparable2);
        return iCompareTo < 0 ? rzl.c : iCompareTo > 0 ? rzl.d : rzl.b;
    }
}
