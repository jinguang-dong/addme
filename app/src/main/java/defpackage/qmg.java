package defpackage;

import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qmg implements qmh {
    private final /* synthetic */ int a;
    private final Object b;

    public qmg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private static int b(int i, int i2, int i3) {
        return Math.max(Math.max(i, i2), i3);
    }

    private static int c(int i, int i2, int i3) {
        return Math.min(Math.min(i, i2), i3);
    }

    private final void d(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (a(byteBuffer, byteBuffer2)) {
            return;
        }
        throw new IllegalArgumentException("MemCopier does not support copying from buffer '" + String.valueOf(byteBuffer) + "' to '" + String.valueOf(byteBuffer2) + "'!");
    }

    private static void e(int i, int i2) {
        int i3;
        if (i2 < 0) {
            i3 = -i2;
        } else {
            i3 = i2;
            i2 = 0;
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.bE(i2, "Attempting to copy from negative buffer index ", "!"));
        }
        if (i < i3) {
            throw new ArrayIndexOutOfBoundsException(a.bD(i, i3, "Attempting to copy ", " bytes at offset 0 on ", "-byte buffer!"));
        }
    }

    private static void f() {
        throw new IllegalArgumentException("No MemCopier found to copy between buffers.");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, qmh] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, qmh] */
    @Override // defpackage.qmh
    public final boolean a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int i = this.a;
        if (i == 0) {
            return this.b.a(byteBuffer, byteBuffer2);
        }
        if (i != 1) {
            return this.b.a(byteBuffer, byteBuffer2);
        }
        for (int i2 = 0; i2 < 3; i2++) {
            if (((qmh[]) this.b)[i2].a(byteBuffer, byteBuffer2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qmh] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, qmh] */
    @Override // defpackage.qmh
    public final void copyBytes(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3) {
        int i4 = this.a;
        if (i4 == 0) {
            d(byteBuffer, byteBuffer2);
            int iCapacity = byteBuffer.capacity();
            int iCapacity2 = byteBuffer2.capacity();
            e(iCapacity, i3);
            e(iCapacity2, i3);
            this.b.copyBytes(byteBuffer, byteBuffer2, 0, 0, i3);
            return;
        }
        if (i4 != 1) {
            this.b.copyBytes(byteBuffer, byteBuffer2, 0, 0, i3);
            return;
        }
        for (int i5 = 0; i5 < 3; i5++) {
            qmh qmhVar = ((qmh[]) this.b)[i5];
            if (qmhVar.a(byteBuffer, byteBuffer2)) {
                qmhVar.copyBytes(byteBuffer, byteBuffer2, 0, 0, i3);
                return;
            }
        }
        f();
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, qmh] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, qmh] */
    @Override // defpackage.qmh
    public final void copyBytes2D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.a;
        if (i7 == 0) {
            d(byteBuffer, byteBuffer2);
            int iCapacity = byteBuffer.capacity();
            int iCapacity2 = byteBuffer2.capacity();
            e(iCapacity, i2 * i5);
            e(iCapacity2, i2 * i6);
            this.b.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, i6);
            return;
        }
        if (i7 != 1) {
            if (i5 == i6 && i5 == i) {
                copyBytes(byteBuffer, byteBuffer2, 0, 0, i5 * i2);
                return;
            } else {
                this.b.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, i6);
                return;
            }
        }
        for (int i8 = 0; i8 < 3; i8++) {
            qmh qmhVar = ((qmh[]) this.b)[i8];
            if (qmhVar.a(byteBuffer, byteBuffer2)) {
                qmhVar.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, i6);
                return;
            }
        }
        f();
    }

    public final String toString() throws IOException {
        int i = this.a;
        if (i == 0) {
            return "checked[" + this.b.toString() + "]";
        }
        if (i != 1) {
            return yoGAhrpjU.ZmxAlanSc + this.b.toString() + "]";
        }
        Class<?> cls = getClass();
        Object obj = this.b;
        return cls.getSimpleName() + "[" + rnt.Z(Arrays.asList((Object[]) obj), ",") + "]";
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, qmh] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, qmh] */
    @Override // defpackage.qmh
    public final void copyBytes2D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i5 == 1) {
                    copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i7, i8);
                    return;
                } else {
                    this.b.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, 1, i7, i8);
                    return;
                }
            }
            for (int i10 = 0; i10 < 3; i10++) {
                qmh qmhVar = ((qmh[]) this.b)[i10];
                if (qmhVar.a(byteBuffer, byteBuffer2)) {
                    qmhVar.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, 1, i7, i8);
                    return;
                }
            }
            f();
            return;
        }
        d(byteBuffer, byteBuffer2);
        int iCapacity = byteBuffer.capacity();
        int iCapacity2 = byteBuffer2.capacity();
        int i11 = i - 1;
        int i12 = i5 * i11;
        int i13 = i2 - 1;
        int i14 = i7 * i13;
        int i15 = i14 + i12;
        int iC = c(i12, i14, i15);
        int iB = b(i12, i14, i15);
        e(iCapacity, iC);
        e(iCapacity, iB);
        int i16 = i8 * i13;
        int i17 = i16 + i11;
        int iC2 = c(i11, i16, i17);
        int iB2 = b(i11, i16, i17);
        e(iCapacity2, iC2);
        e(iCapacity2, iB2);
        this.b.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, 1, i7, i8);
    }
}
