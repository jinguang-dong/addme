package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bqt extends CancellationException {
    public bqt(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(bqu.a);
        return this;
    }

    public /* synthetic */ bqt() {
        super(null);
    }
}
