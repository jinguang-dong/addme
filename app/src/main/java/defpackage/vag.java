package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vag implements vap {
    private final InputStream a;

    public vag(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.vap, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.vap
    public final long e(vad vadVar, long j) throws IOException {
        String message;
        try {
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException("interrupted");
            }
            vam vamVarI = vadVar.i(1);
            int i = this.a.read(vamVarI.a, vamVarI.c, (int) Math.min(8192L, 8192 - vamVarI.c));
            if (i != -1) {
                vamVarI.c += i;
                long j2 = i;
                vadVar.b += j2;
                return j2;
            }
            if (vamVarI.b != vamVarI.c) {
                return -1L;
            }
            vadVar.a = vamVarI.a();
            van.b(vamVarI);
            return -1L;
        } catch (AssertionError e) {
            int i2 = vah.a;
            if (e.getCause() == null || (message = e.getMessage()) == null || !ujp.t(message, "getsockname failed")) {
                throw e;
            }
            throw new IOException(e);
        }
    }

    public final String toString() {
        return "source(" + this.a + ")";
    }
}
