package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qkr implements qff {
    public final qif a;
    public final qhi[] b;
    public final int c;
    private final int[] d;

    public qkr(qif qifVar, qhi[] qhiVarArr, int[] iArr, int i) {
        a.I(qhiVarArr.length == iArr.length);
        this.a = qifVar;
        this.b = qhiVarArr;
        this.d = iArr;
        this.c = i;
    }

    public static qkr e(qin qinVar, qkt... qktVarArr) {
        int i = qktVarArr[0].c;
        int length = qktVarArr.length;
        qhi[] qhiVarArr = new qhi[length];
        int[] iArr = new int[length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= qktVarArr.length) {
                break;
            }
            qkt qktVar = qktVarArr[i2];
            qhi qhiVar = qktVar.d;
            int i4 = qktVar.e;
            i3 += i4 * 32 * i;
            qhiVarArr[i2] = qhiVar;
            iArr[i2] = i4;
            i2++;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3 / 8).order(ByteOrder.nativeOrder());
        for (qkt qktVar2 : qktVarArr) {
            for (int i5 = 0; i5 < i; i5++) {
                qktVar2.a(i5, byteBufferOrder);
            }
        }
        byteBufferOrder.rewind();
        return new qkr(qif.b(qinVar, 34962, byteBufferOrder), qhiVarArr, iArr, i);
    }

    @Override // defpackage.qff
    public final qgi a() {
        return this.a.a();
    }

    public final int b(int i) {
        return (d(i).a() * c(i)) / 8;
    }

    public final int c(int i) {
        return this.d[i];
    }

    @Override // defpackage.qff, defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final qhi d(int i) {
        return this.b[i];
    }

    public final String toString() {
        int[] iArr = this.d;
        qhi[] qhiVarArr = this.b;
        return "GLVertexArray{buffer=" + this.a.toString() + ", types=" + Arrays.toString(qhiVarArr) + ", dimensions=" + Arrays.toString(iArr) + ", count=" + this.c + ", isInterleaved=false}";
    }
}
