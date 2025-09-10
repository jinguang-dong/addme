package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oyd implements oyj {
    private final syu a;
    private boolean b;

    public oyd(syu syuVar) {
        this.a = syuVar;
    }

    protected final oyj a() {
        try {
            return (oyj) ((swn) this.a).t(5L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.b = true;
            throw new IllegalStateException("MuxerProcessor isn't available", e);
        }
    }

    @Override // defpackage.oyj
    public final rwc b(MediaFormat mediaFormat) {
        return !this.b ? a().b(mediaFormat) : rvk.a;
    }

    @Override // defpackage.oyj
    public final void c(MediaFormat mediaFormat) {
        if (this.b) {
            return;
        }
        a().c(mediaFormat);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        a().close();
    }

    @Override // defpackage.oyj
    public final void d(oyk oykVar) {
        if (this.b) {
            return;
        }
        a().d(oykVar);
    }

    @Override // defpackage.oyj
    public final void e(long j) {
        if (this.b) {
            return;
        }
        a().e(j);
    }

    @Override // defpackage.oyj
    public final void f(MediaFormat mediaFormat) {
        if (this.b) {
            return;
        }
        a().f(mediaFormat);
    }

    @Override // defpackage.oyj
    public final void g() {
        if (this.b) {
            return;
        }
        a().g();
    }

    @Override // defpackage.oyj
    public final void h(oyk oykVar) {
        if (this.b) {
            return;
        }
        a().h(oykVar);
    }

    @Override // defpackage.oyj
    public final void i(FileDescriptor fileDescriptor) {
        if (this.b) {
            return;
        }
        a().i(fileDescriptor);
    }

    @Override // defpackage.oyj
    public final void j() {
        if (this.b) {
            return;
        }
        a().j();
    }

    @Override // defpackage.oyj
    public final void k(long j) {
        if (this.b) {
            return;
        }
        a().k(j);
    }

    @Override // defpackage.oyj
    public final void l() {
        if (this.b) {
            return;
        }
        a().l();
    }

    @Override // defpackage.oyj
    public final void m(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.b) {
            return;
        }
        a().m(byteBuffer, bufferInfo);
    }

    @Override // defpackage.oyj
    public final void n(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i) {
        if (this.b) {
            return;
        }
        a().n(byteBuffer, bufferInfo, i);
    }

    @Override // defpackage.oyj
    public final void o(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.b) {
            return;
        }
        a().o(byteBuffer, bufferInfo);
    }

    @Override // defpackage.oyj
    public final boolean p() {
        if (this.a.isDone() && !this.b) {
            return a().p();
        }
        return false;
    }

    @Override // defpackage.oyj
    public final void q(Object obj) {
        if (this.b) {
            return;
        }
        a().q(obj);
    }
}
