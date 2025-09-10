package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class slf extends sle {
    public final ByteBuffer a;

    protected slf() {
        a.I(true);
        this.a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void j() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= 16) {
            h(byteBuffer);
        }
        byteBuffer.compact();
    }

    @Override // defpackage.sle
    public final void a(char c) {
        this.a.putChar(c);
        g();
    }

    protected abstract sli c();

    @Override // defpackage.sle, defpackage.slk
    public final void d(byte[] bArr, int i) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, i).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            g();
            return;
        }
        int iPosition = 16 - byteBuffer.position();
        for (int i2 = 0; i2 < iPosition; i2++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        j();
        while (byteBufferOrder.remaining() >= 16) {
            h(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
    }

    public final void g() {
        if (this.a.remaining() < 8) {
            j();
        }
    }

    protected abstract void h(ByteBuffer byteBuffer);

    protected void i(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.slk
    public final sli m() {
        j();
        ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        if (byteBuffer.remaining() > 0) {
            i(byteBuffer);
            byteBuffer.position(byteBuffer.limit());
        }
        return c();
    }
}
