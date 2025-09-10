package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpg implements bps {
    public final int a;

    public bpg(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.ao(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.a == ((bpg) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AndroidPointerIcon(type=" + this.a + ')';
    }
}
