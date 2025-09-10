package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.brotli.wrapper.dec.DecoderJNI;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vau {
    public final long[] a;
    public final ByteBuffer b;
    public int c = 3;

    public vau() throws IOException {
        long[] jArr = {0, 16384, 0};
        this.a = jArr;
        this.b = DecoderJNI.nativeCreate(jArr);
        if (jArr[0] == 0) {
            throw new IOException("failed to initialize native brotli decoder");
        }
    }

    public final void a() {
        long[] jArr = this.a;
        if (jArr[0] == 0) {
            throw new IllegalStateException("brotli decoder is already destroyed");
        }
        DecoderJNI.nativeDestroy(jArr);
        jArr[0] = 0;
    }

    public final void b() {
        int i = 1;
        long j = this.a[1];
        if (j == 1) {
            i = 2;
        } else if (j == 2) {
            i = 3;
        } else if (j == 3) {
            i = 4;
        } else if (j == 4) {
            i = 5;
        }
        this.c = i;
    }

    public final void c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("negative block length");
        }
        long[] jArr = this.a;
        if (jArr[0] == 0) {
            throw new IllegalStateException("brotli decoder is already destroyed");
        }
        int i2 = this.c;
        if (i2 != 3) {
            if (i2 != 5) {
                throw new IllegalStateException("pushing input to decoder in " + ujk.i(i2) + " state");
            }
            if (i != 0) {
                throw new IllegalStateException("pushing input to decoder in OK state");
            }
        }
        DecoderJNI.nativePush(jArr, i);
        b();
    }

    protected final void finalize() throws Throwable {
        if (this.a[0] != 0) {
            a();
        }
        super.finalize();
    }
}
