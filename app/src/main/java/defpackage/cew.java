package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cew {
    private final cfc a;
    private final Object b = null;

    public cew(cfc cfcVar) {
        this.a = cfcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cew)) {
            return false;
        }
        cew cewVar = (cew) obj;
        if (!a.ao(this.a, cewVar.a)) {
            return false;
        }
        Object obj2 = cewVar.b;
        return a.ao(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.a + ", loaderKey=null)";
    }
}
