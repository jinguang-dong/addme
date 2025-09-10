package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejd implements eis {
    public final eil a;
    public final boolean b;
    private final String c;
    private final int d;

    public ejd(String str, int i, eil eilVar, boolean z) {
        this.c = str;
        this.d = i;
        this.a = eilVar;
        this.b = z;
    }

    @Override // defpackage.eis
    public final egg a(efs efsVar, efh efhVar, ejh ejhVar) {
        return new egv(efsVar, ejhVar, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.c + ", index=" + this.d + "}";
    }
}
