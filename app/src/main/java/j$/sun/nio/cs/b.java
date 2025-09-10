package j$.sun.nio.cs;

import java.nio.charset.CharsetEncoder;

/* loaded from: classes3.dex */
public final class b extends CharsetEncoder {
    public final /* synthetic */ int a = 0;
    public e b;

    public b(c cVar) {
        super(cVar, 1.0f, 1.0f);
        this.b = new e();
    }

    public static int a(char[] cArr, int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        if (i3 <= 0) {
            return 0;
        }
        cArr.getClass();
        bArr.getClass();
        if (i < 0 || i >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        if (i2 < 0 || i2 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i2);
        }
        int i5 = (i + i3) - 1;
        if (i5 < 0 || i5 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i5);
        }
        int i6 = (i2 + i3) - 1;
        if (i6 < 0 || i6 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i6);
        }
        while (i4 < i3) {
            int i7 = i + 1;
            char c = cArr[i];
            if (c > 255) {
                break;
            }
            bArr[i2] = (byte) c;
            i4++;
            i = i7;
            i2++;
        }
        return i4;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c) {
        switch (this.a) {
            case 0:
                return c <= 255;
            default:
                return !Character.isSurrogate(c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    @Override // java.nio.charset.CharsetEncoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.nio.charset.CoderResult encodeLoop(java.nio.CharBuffer r19, java.nio.ByteBuffer r20) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.sun.nio.cs.b.encodeLoop(java.nio.CharBuffer, java.nio.ByteBuffer):java.nio.charset.CoderResult");
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return (bArr.length == 1 && bArr[0] >= 0) || super.isLegalReplacement(bArr);
        }
    }

    public b(f fVar) {
        super(fVar, 1.1f, 3.0f);
    }
}
