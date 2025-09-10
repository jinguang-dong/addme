package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class slc extends sle {
    public final ByteBuffer a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @Override // defpackage.sle
    public final void a(char c) {
        this.a.putChar(c);
        b(2);
    }

    public final void b(int i) {
        try {
            c(this.a.array(), i);
        } finally {
            this.a.clear();
        }
    }

    protected void c(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.sle, defpackage.slk
    public final void d(byte[] bArr, int i) {
        rnt.K(0, i, bArr.length);
        c(bArr, i);
    }
}
