package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class uqq {
    public static final uqp a = new uqp();
    public final Object b;

    public /* synthetic */ uqq(Object obj) {
        this.b = obj;
    }

    public static final Object a(Object obj) {
        if (obj instanceof uqp) {
            return null;
        }
        return obj;
    }

    public static final Throwable b(Object obj) {
        uqo uqoVar = obj instanceof uqo ? (uqo) obj : null;
        if (uqoVar != null) {
            return uqoVar.a;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return !(obj instanceof uqp);
    }

    public static final void d(Object obj) {
        if (obj instanceof uqp) {
            if (!(obj instanceof uqo)) {
                throw new IllegalStateException("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
            }
            Throwable th = ((uqo) obj).a;
            if (th == null) {
                throw new IllegalStateException("Trying to call 'getOrThrow' on a channel closed without a cause");
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof uqq) && a.ao(this.b, ((uqq) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return obj instanceof uqo ? ((uqo) obj).toString() : a.bz(obj, "Value(", ")");
    }
}
