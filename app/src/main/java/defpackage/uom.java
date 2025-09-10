package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uom extends CancellationException implements umw {
    private final transient uol a;

    public uom(String str, Throwable th, uol uolVar) {
        super(str);
        this.a = uolVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.umw
    public final /* bridge */ /* synthetic */ Throwable a() {
        if (!unf.a) {
            return null;
        }
        String message = getMessage();
        message.getClass();
        return new uom(message, this, b());
    }

    public final uol b() {
        uol uolVar = this.a;
        return uolVar == null ? upb.a : uolVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uom) {
            uom uomVar = (uom) obj;
            if (a.ao(uomVar.getMessage(), getMessage()) && a.ao(uomVar.b(), b()) && a.ao(uomVar.getCause(), getCause())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (unf.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = (message.hashCode() * 31) + b().hashCode();
        Throwable cause = getCause();
        return (iHashCode * 31) + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + b();
    }
}
