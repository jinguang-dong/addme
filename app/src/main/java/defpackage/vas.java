package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vas extends InputStream implements InputStreamRetargetInterface {
    private final vat a;

    public vas(InputStream inputStream) {
        this.a = new vat(Channels.newChannel(inputStream));
    }

    @Override // java.io.InputStream
    public final int available() {
        ByteBuffer byteBuffer = this.a.a;
        if (byteBuffer != null) {
            return byteBuffer.remaining();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.b();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int iA;
        vat vatVar = this.a;
        if (vatVar.b) {
            throw new IOException("read after close");
        }
        do {
            iA = vatVar.a();
        } while (iA == 0);
        if (iA == -1) {
            return -1;
        }
        return vatVar.a.get() & 255;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        vat vatVar = this.a;
        if (vatVar.b) {
            throw new IOException("read after close");
        }
        long j2 = 0;
        while (j > 0 && vatVar.a() != -1) {
            int iMin = (int) Math.min(j, vatVar.a.remaining());
            ByteBuffer byteBuffer = vatVar.a;
            byteBuffer.position(byteBuffer.position() + iMin);
            if (!vatVar.a.hasRemaining()) {
                vatVar.a = null;
            }
            long j3 = iMin;
            j2 += j3;
            j -= j3;
        }
        return j2;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        vat vatVar = this.a;
        if (!vatVar.b) {
            if (vatVar.a() == -1) {
                return -1;
            }
            int i3 = 0;
            while (i2 > 0) {
                int iMin = Math.min(i2, vatVar.a.remaining());
                vatVar.a.get(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
                i3 += iMin;
                if (vatVar.a() == -1) {
                    break;
                }
            }
            return i3;
        }
        throw new IOException("read after close");
    }
}
