package defpackage;

import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import org.brotli.wrapper.dec.DecoderJNI;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vat {
    private static final ByteBuffer c = ByteBuffer.allocate(0);
    ByteBuffer a;
    boolean b;
    private final ReadableByteChannel d;
    private final vau e;

    public vat(ReadableByteChannel readableByteChannel) {
        if (readableByteChannel == null) {
            throw new NullPointerException("source can not be null");
        }
        this.d = readableByteChannel;
        this.e = new vau();
    }

    private final void c(String str) throws IOException {
        try {
            b();
        } catch (IOException unused) {
        }
        throw new IOException(str);
    }

    final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.e.a();
        this.d.close();
    }

    final int a() throws IOException {
        while (true) {
            ByteBuffer byteBuffer = this.a;
            if (byteBuffer != null) {
                if (byteBuffer.hasRemaining()) {
                    return this.a.remaining();
                }
                this.a = null;
            }
            vau vauVar = this.e;
            int i = vauVar.c;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            int i3 = -1;
            if (i2 == 1) {
                return -1;
            }
            if (i2 == 2) {
                ByteBuffer byteBuffer2 = vauVar.b;
                byteBuffer2.clear();
                int i4 = this.d.read(byteBuffer2);
                if (i4 == -1) {
                    c(OPuAVreQM.brhMwUPHYoFi);
                } else {
                    i3 = i4;
                }
                if (i3 == 0) {
                    this.a = c;
                    return 0;
                }
                vauVar.c(i3);
            } else if (i2 == 3) {
                long[] jArr = vauVar.a;
                if (jArr[0] == 0) {
                    throw new IllegalStateException("brotli decoder is already destroyed");
                }
                if (i != 4 && jArr[2] == 0) {
                    throw new IllegalStateException("pulling output from decoder in " + ujk.i(i) + " state");
                }
                ByteBuffer byteBufferNativePull = DecoderJNI.nativePull(jArr);
                vauVar.b();
                this.a = byteBufferNativePull;
            } else if (i2 != 4) {
                c("corrupted input");
            } else {
                vauVar.c(0);
            }
        }
    }
}
