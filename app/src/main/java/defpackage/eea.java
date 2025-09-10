package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eea {
    public byte[] a;
    public int b;
    private String c;

    public eea(int i) {
        this.c = null;
        this.a = new byte[i];
        this.b = 0;
    }

    public final InputStream a() {
        return new ByteArrayInputStream(this.a, 0, this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005c A[PHI: r1
      0x005c: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v1 java.lang.String) binds: [B:33:0x005a, B:36:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            r10 = this;
            java.lang.String r0 = r10.c
            if (r0 != 0) goto L70
            int r0 = r10.b
            java.lang.String r1 = "UTF-8"
            r2 = 2
            if (r0 >= r2) goto Lf
            r10.c = r1
            goto L70
        Lf:
            byte[] r3 = r10.a
            r4 = 0
            r4 = r3[r4]
            java.lang.String r5 = "UTF-32"
            r6 = 254(0xfe, float:3.56E-43)
            r7 = 1
            r8 = 4
            r9 = 255(0xff, float:3.57E-43)
            if (r4 != 0) goto L3d
            if (r0 < r8) goto L38
            r0 = r3[r7]
            if (r0 == 0) goto L25
            goto L38
        L25:
            r0 = r3[r2]
            r0 = r0 & r9
            if (r0 != r6) goto L35
            r0 = 3
            r0 = r3[r0]
            r0 = r0 & r9
            if (r0 != r9) goto L35
            java.lang.String r0 = "UTF-32BE"
            r10.c = r0
            goto L70
        L35:
            r10.c = r5
            goto L70
        L38:
            java.lang.String r0 = "UTF-16BE"
            r10.c = r0
            goto L70
        L3d:
            r4 = r4 & r9
            r9 = 128(0x80, float:1.8E-43)
            if (r4 >= r9) goto L58
            r4 = r3[r7]
            if (r4 == 0) goto L49
            r10.c = r1
            goto L70
        L49:
            if (r0 < r8) goto L53
            r0 = r3[r2]
            if (r0 == 0) goto L50
            goto L53
        L50:
            java.lang.String r0 = "UTF-32LE"
            goto L55
        L53:
            java.lang.String r0 = "UTF-16LE"
        L55:
            r10.c = r0
            goto L70
        L58:
            r7 = 239(0xef, float:3.35E-43)
            if (r4 != r7) goto L5f
        L5c:
            r10.c = r1
            goto L70
        L5f:
            java.lang.String r1 = "UTF-16"
            if (r4 != r6) goto L64
            goto L5c
        L64:
            if (r0 < r8) goto L6e
            r0 = r3[r2]
            if (r0 == 0) goto L6b
            goto L6e
        L6b:
            r10.c = r5
            goto L70
        L6e:
            r10.c = r1
        L70:
            java.lang.String r10 = r10.c
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eea.b():java.lang.String");
    }

    public final void c(byte[] bArr) {
        e(bArr, bArr.length);
    }

    public final void d(int i) {
        byte[] bArr = this.a;
        int length = bArr.length;
        if (i > length) {
            byte[] bArr2 = new byte[length + length];
            this.a = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
    }

    public final void e(byte[] bArr, int i) {
        d(this.b + i);
        System.arraycopy(bArr, 0, this.a, this.b, i);
        this.b += i;
    }

    public eea(InputStream inputStream) throws IOException {
        this.c = null;
        this.b = 0;
        this.a = new byte[16384];
        while (true) {
            int i = inputStream.read(this.a, this.b, 16384);
            if (i <= 0) {
                return;
            }
            int i2 = this.b + i;
            this.b = i2;
            if (i != 16384) {
                return;
            } else {
                d(i2 + 16384);
            }
        }
    }

    public eea(byte[] bArr) {
        this.c = null;
        this.a = bArr;
        this.b = bArr.length;
    }
}
