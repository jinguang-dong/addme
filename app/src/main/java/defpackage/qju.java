package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qju implements qff {
    public final qif a;
    public final int b;

    private qju(qif qifVar, int i) {
        this.a = qifVar;
        this.b = i;
    }

    public static qju b(qin qinVar, short... sArr) {
        int length = sArr.length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length + length).order(ByteOrder.nativeOrder());
        byteBufferOrder.asShortBuffer().put(sArr);
        return new qju(qif.b(qinVar, 34963, byteBufferOrder), length);
    }

    @Override // defpackage.qff
    public final qgi a() {
        return this.a.a();
    }

    @Override // defpackage.qff, defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final String toString() {
        return "GLIndexArray{buffer=" + this.a.toString() + ", count=" + this.b + ", glType=5123}";
    }
}
