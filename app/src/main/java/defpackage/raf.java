package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class raf {
    public final qyk a;
    public final rag b;

    public raf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof raf) {
            raf rafVar = (raf) obj;
            qyk qykVar = this.a;
            if (qykVar != null ? qykVar.equals(rafVar.a) : rafVar.a == null) {
                if (this.b.equals(rafVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        qyk qykVar = this.a;
        return this.b.hashCode() ^ (((qykVar == null ? 0 : qykVar.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        rag ragVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + ragVar.toString() + "}";
    }

    public raf(qyk qykVar, rag ragVar) {
        this.a = qykVar;
        this.b = ragVar;
    }
}
