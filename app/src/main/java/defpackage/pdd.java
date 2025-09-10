package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pdd extends FilterOutputStream {
    public final ByteBuffer a;

    public pdd(OutputStream outputStream) {
        super(outputStream);
        this.a = ByteBuffer.allocate(4);
    }

    public final void a(int i) throws IOException {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.rewind();
        byteBuffer.putInt(i);
        this.out.write(byteBuffer.array());
    }

    public final void b(short s) throws IOException {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.rewind();
        byteBuffer.putShort(s);
        this.out.write(byteBuffer.array(), 0, 2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
    }
}
