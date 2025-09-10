package defpackage;

import com.google.common.io.ByteStreams;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pcq extends FilterInputStream implements InputStreamRetargetInterface {
    public int a;
    public final ByteBuffer b;
    private final byte[] c;

    protected pcq(InputStream inputStream) {
        super(inputStream);
        this.a = 0;
        byte[] bArr = new byte[8];
        this.c = bArr;
        this.b = ByteBuffer.wrap(bArr);
    }

    public final int a() throws IOException {
        f(this.c, 4);
        ByteBuffer byteBuffer = this.b;
        byteBuffer.rewind();
        return byteBuffer.getInt();
    }

    public final int b() {
        return (char) d();
    }

    public final long c() {
        return a() & 4294967295L;
    }

    public final short d() throws IOException {
        f(this.c, 2);
        ByteBuffer byteBuffer = this.b;
        byteBuffer.rewind();
        return byteBuffer.getShort();
    }

    public final void e(ByteOrder byteOrder) {
        this.b.order(byteOrder);
    }

    public final void f(byte[] bArr, int i) throws IOException {
        ByteStreams.readFully(this, bArr, 0, i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = this.in.read();
        this.a += i >= 0 ? 1 : 0;
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = this.in.skip(j);
        this.a += (int) jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.in.read(bArr);
        this.a += Math.max(i, 0);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.in.read(bArr, i, i2);
        this.a += Math.max(i3, 0);
        return i3;
    }
}
