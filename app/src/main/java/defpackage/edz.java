package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class edz {
    public static byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static byte[] b = new byte[255];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 255; i2++) {
            b[i2] = -1;
        }
        while (true) {
            byte[] bArr = a;
            int length = bArr.length;
            if (i >= 64) {
                byte[] bArr2 = b;
                bArr2[9] = -2;
                bArr2[10] = -2;
                bArr2[13] = -2;
                bArr2[32] = -2;
                bArr2[61] = -3;
                return;
            }
            b[bArr[i]] = (byte) i;
            i++;
        }
    }
}
