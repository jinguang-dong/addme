package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class unv implements uoh {
    public final boolean a;

    public unv(boolean z) {
        this.a = z;
    }

    @Override // defpackage.uoh
    public final upa fK() {
        return null;
    }

    @Override // defpackage.uoh
    public final boolean fM() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(true != this.a ? "New" : "Active");
        sb.append("}");
        return sb.toString();
    }
}
