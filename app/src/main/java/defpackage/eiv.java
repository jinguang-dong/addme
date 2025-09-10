package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eiv implements eis {
    public final boolean a;
    public final int b;

    public eiv(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.eis
    public final egg a(efs efsVar, efh efhVar, ejh ejhVar) {
        if (efsVar.i) {
            return new egp(this);
        }
        elg.a("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        int i = this.b;
        return a.bw(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE", "MergePaths{mode=", "}");
    }
}
