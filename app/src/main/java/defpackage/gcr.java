package defpackage;

import android.hardware.camera2.CaptureResult;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gcr implements oyh {
    private final byte[] a;
    private final byte[] b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final boolean g;

    public gcr(poe poeVar) {
        this.a = (byte[]) b(nvl.o, poeVar);
        this.b = (byte[]) b(nvl.p, poeVar);
        this.c = (byte[]) b(nvl.q, poeVar);
        this.d = (byte[]) b(nvj.t, poeVar);
        this.e = (byte[]) b(nvq.f, poeVar);
        this.f = (byte[]) b(nvq.g, poeVar);
        Integer num = (Integer) b(nvn.g, poeVar);
        boolean z = false;
        if (num != null && num.intValue() == 2) {
            z = true;
        }
        this.g = z;
    }

    private static Object b(CaptureResult.Key key, poe poeVar) {
        if (key != null) {
            return poeVar.a(key);
        }
        return null;
    }

    private static final byte[] c(byte[] bArr, byte b, boolean z) {
        int i = true != z ? 2 : 5;
        int length = bArr.length;
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i + length).order(ByteOrder.nativeOrder()).put(b);
        if (z) {
            byteBufferPut.put(ByteBuffer.allocate(4).order(ByteOrder.nativeOrder()).putInt(length).array());
        } else {
            byteBufferPut.put((byte) length);
        }
        return byteBufferPut.put(bArr).array();
    }

    @Override // defpackage.oyh
    public final byte[] a() {
        byte[] bArrC;
        byte[] bArrC2;
        byte[] bArrC3;
        byte[] bArrC4;
        byte[] bArr = this.b;
        if (bArr == null) {
            bArrC = new byte[0];
        } else {
            boolean z = this.g;
            if (!z) {
                rnt.M(bArr.length < 256, "AF data too large.");
            }
            bArrC = c(bArr, true != z ? (byte) 1 : (byte) 4, z);
        }
        byte[] bArr2 = this.a;
        if (bArr2 == null) {
            bArrC2 = new byte[0];
        } else {
            boolean z2 = this.g;
            if (!z2) {
                rnt.M(bArr2.length < 256, "AE data too large.");
            }
            bArrC2 = c(bArr2, true != z2 ? (byte) 2 : (byte) 5, z2);
        }
        byte[] bArr3 = this.c;
        if (bArr3 == null) {
            bArrC3 = new byte[0];
        } else {
            boolean z3 = this.g;
            if (!z3) {
                rnt.M(bArr3.length < 256, "AWB data too large.");
            }
            bArrC3 = c(bArr3, true != z3 ? (byte) 3 : (byte) 6, z3);
        }
        byte[] bArr4 = this.d;
        byte[] bArrC5 = bArr4 == null ? new byte[0] : c(bArr4, (byte) 7, true);
        boolean z4 = this.g;
        byte[] bArr5 = z4 ? this.f : this.e;
        if (bArr5 == null) {
            bArrC4 = new byte[0];
        } else {
            if (!z4) {
                rnt.M(bArr5.length <= 240, "PD data too large.");
            }
            bArrC4 = c(bArr5, true != z4 ? (byte) 8 : (byte) 9, z4);
        }
        byte[][] bArr6 = {bArrC, bArrC2, bArrC3, bArrC5, bArrC4};
        long length = 0;
        for (int i = 0; i < 5; i++) {
            length += bArr6[i].length;
        }
        int i2 = (int) length;
        rnt.E(length == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int", length);
        byte[] bArr7 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < 5; i4++) {
            byte[] bArr8 = bArr6[i4];
            int length2 = bArr8.length;
            System.arraycopy(bArr8, 0, bArr7, i3, length2);
            i3 += length2;
        }
        return bArr7;
    }
}
