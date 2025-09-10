package defpackage;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbe extends Handler {
    public static final pbe a = new pbe();
    private final out b = out.b;

    private pbe() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        Throwable thrown = logRecord.getThrown();
        String message = logRecord.getMessage();
        if (thrown != null) {
            this.b.execute(new pev(message, thrown, 1));
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
