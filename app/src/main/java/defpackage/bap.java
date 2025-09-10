package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bap implements bbi {
    private final /* synthetic */ int d;
    public static final bap c = new bap(2);
    public static final bap b = new bap(1);
    public static final bap a = new bap(0);

    private bap(int i) {
        this.d = i;
    }

    @Override // defpackage.bbi
    public final boolean a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return obj == obj2;
        }
        if (i != 1) {
            return a.ao(obj, obj2);
        }
        return false;
    }

    public final String toString() {
        int i = this.d;
        return i != 0 ? i != 1 ? "StructuralEqualityPolicy" : "NeverEqualPolicy" : "ReferentialEqualityPolicy";
    }
}
