package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqo extends uqp {
    public final Throwable a;

    public uqo(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof uqo) && a.ao(this.a, ((uqo) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.uqp
    public final String toString() {
        return "Closed(" + this.a + ")";
    }
}
