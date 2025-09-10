package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ws {
    private final Runnable a;
    private final int b;

    public ws(int i, Runnable runnable) {
        this.b = i;
        this.a = runnable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws)) {
            return false;
        }
        ws wsVar = (ws) obj;
        return this.b == wsVar.b && a.ao(this.a, wsVar.a);
    }

    public final int hashCode() {
        int i = this.b;
        a.aQ(i);
        return (i * 31) + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShutdownTask(type=");
        int i = this.b;
        sb.append((Object) (i != 1 ? i != 2 ? "THREAD" : "SCOPE" : "CAMERA"));
        sb.append(", action=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
