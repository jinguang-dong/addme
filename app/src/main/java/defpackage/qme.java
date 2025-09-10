package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qme implements qmh {
    private final /* synthetic */ int a;

    public qme(int i) {
        this.a = i;
    }

    private static final void b(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.position(i);
        byteBuffer.limit(i + i2);
    }

    @Override // defpackage.qmh
    public final boolean a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (this.a != 0) {
            return byteBuffer.hasArray() && byteBuffer2.hasArray();
        }
        return true;
    }

    @Override // defpackage.qmh
    public final void copyBytes(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3) {
        if (this.a != 0) {
            byteBuffer2.position(0);
            byteBuffer2.put(byteBuffer.array(), 0, i3);
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        b(byteBufferDuplicate, 0, i3);
        ByteBuffer byteBufferDuplicate2 = byteBuffer2.duplicate();
        b(byteBufferDuplicate2, 0, i3);
        byteBufferDuplicate2.put(byteBufferDuplicate);
    }

    @Override // defpackage.qmh
    public final void copyBytes2D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 0;
        if (this.a != 0) {
            int i8 = 0;
            while (i7 < i2) {
                byteBuffer2.position(i7 * i6);
                byteBuffer2.put(byteBuffer.array(), i8, i5);
                i8 += i5;
                i7++;
            }
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        ByteBuffer byteBufferDuplicate2 = byteBuffer2.duplicate();
        int i9 = 0;
        int i10 = 0;
        while (i7 < i2) {
            b(byteBufferDuplicate, i9, i);
            b(byteBufferDuplicate2, i10, i);
            byteBufferDuplicate2.put(byteBufferDuplicate);
            i9 += i5;
            i10 += i6;
            i7++;
        }
    }

    public final String toString() {
        int i = this.a;
        Class<?> cls = getClass();
        return i != 0 ? cls.getSimpleName() : cls.getSimpleName();
    }

    @Override // defpackage.qmh
    public final void copyBytes2D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.a == 0) {
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = i7 * i9;
                int i11 = i8 * i9;
                for (int i12 = 0; i12 < i; i12++) {
                    byteBuffer2.put(i11, byteBuffer.get(i10));
                    i10 += i5;
                    i11++;
                }
            }
            return;
        }
        byte[] bArrArray = byteBuffer.array();
        byte[] bArrArray2 = byteBuffer2.array();
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i2; i15++) {
            int i16 = i13;
            int i17 = i14;
            for (int i18 = 0; i18 < i; i18++) {
                bArrArray2[i16] = bArrArray[i17];
                i17 += i5;
                i16++;
            }
            i14 += i7;
            i13 += i8;
        }
    }
}
