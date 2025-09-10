package defpackage;

import android.os.Trace;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vct extends UploadDataSink {
    public final Executor b;
    public final vdl c;
    public ByteBuffer d;
    public long e;
    public long f;
    public int g;
    public final HttpURLConnection h;
    public WritableByteChannel i;
    public OutputStream j;
    public final /* synthetic */ vda k;
    private final Executor l;
    public final AtomicInteger a = new AtomicInteger(3);
    private final AtomicBoolean m = new AtomicBoolean(false);

    public vct(vda vdaVar, Executor executor, Executor executor2, HttpURLConnection httpURLConnection, vdl vdlVar) {
        this.k = vdaVar;
        this.l = new vcs(this, executor, 0);
        this.b = executor2;
        this.c = new vdl(vdlVar);
        this.h = httpURLConnection;
    }

    private final void h(Runnable runnable, String str) {
        new jps("JavaUploadDataSinkBase#executeOnExecutor ".concat(str), 3, null);
        try {
            this.b.execute(new vcq(str, runnable, 0));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void a(vdb vdbVar, String str) {
        try {
            new jps(mn.g(str, "Cronet JavaUploadDataSinkBase#executeOnUploadExecutor "), 3, null);
            try {
                this.l.execute(new qej(this, str, vdbVar, 7));
                Trace.endSection();
            } finally {
            }
        } catch (RejectedExecutionException e) {
            g(e);
        }
    }

    public final void b() {
        a(new vcp(this, 1), "readFromProvider");
    }

    public final void c() {
        h(d(new vcp(this, 0)), "startRead");
    }

    protected final Runnable d(vdb vdbVar) {
        return new vcq(this.k, vdbVar, 3);
    }

    public final void e() {
        if (this.i == null || !this.m.compareAndSet(false, true)) {
            return;
        }
        this.i.close();
    }

    protected final void f() {
        e();
        this.k.g();
    }

    protected final void g(Throwable th) {
        this.k.c(th);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        g(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(0, 2)) {
            h(d(new vcr(this, z, 0)), "onReadSucceeded");
            return;
        }
        throw new IllegalStateException("onReadSucceeded() called when not awaiting a read result; in state: " + atomicInteger.get());
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        g(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(1, 2)) {
            c();
            return;
        }
        throw new IllegalStateException("onRewindSucceeded() called when not awaiting a rewind; in state: " + atomicInteger.get());
    }
}
