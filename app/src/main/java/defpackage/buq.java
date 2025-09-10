package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buq {
    private final bwz a = new bwz(bus.a);

    public final bvm a() {
        bvm bvmVar = (bvm) this.a.first();
        e(bvmVar);
        return bvmVar;
    }

    public final void b(bvm bvmVar) {
        if (!bvmVar.ag()) {
            bqs.c("DepthSortedSet.add called on an unattached node");
        }
        this.a.add(bvmVar);
    }

    public final boolean c(bvm bvmVar) {
        return this.a.contains(bvmVar);
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    public final void e(bvm bvmVar) {
        if (!bvmVar.ag()) {
            bqs.c("DepthSortedSet.remove called on an unattached node");
        }
        this.a.remove(bvmVar);
    }

    public final String toString() {
        return this.a.toString();
    }
}
