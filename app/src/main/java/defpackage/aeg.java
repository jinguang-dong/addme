package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aeg extends CancellationException {
    public aeg() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(aeh.a);
        return this;
    }
}
