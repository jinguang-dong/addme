package defpackage;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pcz {
    public static final /* synthetic */ int h = 0;
    private static final Charset i = Charset.forName("US-ASCII");
    private static final int[] j = {0, 1, 1, 2, 4, 8, 0, 1, 0, 4, 8};
    public final short a;
    public final short b;
    public boolean c;
    public int d;
    public int e;
    public Object f = null;
    public int g;

    static {
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
    }

    public pcz(short s, short s2, int i2, int i3, boolean z) {
        this.a = s;
        this.b = s2;
        this.d = i2;
        this.c = z;
        this.e = i3;
    }

    public static String c(short s) {
        switch (s) {
            case 1:
                return "UNSIGNED_BYTE";
            case 2:
                return "ASCII";
            case 3:
                return "UNSIGNED_SHORT";
            case 4:
                return "UNSIGNED_LONG";
            case 5:
                return "UNSIGNED_RATIONAL";
            case 6:
            case 8:
            default:
                return "";
            case 7:
                return "UNDEFINED";
            case 9:
                return "LONG";
            case 10:
                return "RATIONAL";
        }
    }

    public static boolean f(int i2) {
        return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
    }

    private final boolean n(int i2) {
        return this.c && this.d != i2;
    }

    public final int a() {
        return this.d * j[this.b];
    }

    public final long b(int i2) {
        Object obj = this.f;
        if (obj instanceof long[]) {
            return ((long[]) obj)[i2];
        }
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i2];
        }
        throw new IllegalArgumentException("Cannot get integer value from ".concat(c(this.b)));
    }

    public final String d() {
        Object obj = this.f;
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof byte[]) {
            byte[] bArrCopyOf = (byte[]) obj;
            int length = bArrCopyOf.length - 1;
            if (bArrCopyOf[length] == 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, length);
            }
            return new String(bArrCopyOf, i);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            return iArr.length == 1 ? String.valueOf(iArr[0]) : Arrays.toString(iArr);
        }
        if (!(obj instanceof long[])) {
            return null;
        }
        long[] jArr = (long[]) obj;
        return jArr.length == 1 ? String.valueOf(jArr[0]) : Arrays.toString(jArr);
    }

    public final boolean e() {
        return this.f != null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof pcz)) {
            pcz pczVar = (pcz) obj;
            if (pczVar.a == this.a && pczVar.d == this.d && pczVar.b == this.b) {
                Object obj2 = this.f;
                if (obj2 != null) {
                    Object obj3 = pczVar.f;
                    if (obj3 == null) {
                        return false;
                    }
                    if (obj2 instanceof long[]) {
                        if (obj3 instanceof long[]) {
                            return Arrays.equals((long[]) obj2, (long[]) obj3);
                        }
                        return false;
                    }
                    if (obj2 instanceof pap[]) {
                        if (obj3 instanceof pap[]) {
                            return Arrays.equals((pap[]) obj2, (pap[]) obj3);
                        }
                        return false;
                    }
                    if (!(obj2 instanceof byte[])) {
                        return obj2.equals(obj3);
                    }
                    if (obj3 instanceof byte[]) {
                        return Arrays.equals((byte[]) obj2, (byte[]) obj3);
                    }
                    return false;
                }
                if (pczVar.f == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g(int i2) {
        return j(new int[]{i2});
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(java.lang.String r7) {
        /*
            r6 = this;
            short r0 = r6.b
            r1 = 0
            r2 = 7
            r3 = 2
            if (r0 == r3) goto La
            if (r0 != r2) goto L33
            r0 = r2
        La:
            java.nio.charset.Charset r4 = defpackage.pcz.i
            byte[] r7 = r7.getBytes(r4)
            int r4 = r7.length
            r5 = 1
            if (r4 <= 0) goto L22
            int r3 = r4 + (-1)
            r3 = r7[r3]
            if (r3 == 0) goto L2c
            if (r0 == r2) goto L2c
            int r4 = r4 + r5
            byte[] r7 = java.util.Arrays.copyOf(r7, r4)
            goto L2c
        L22:
            if (r0 != r3) goto L2c
            int r0 = r6.d
            if (r0 != r5) goto L2c
            byte[] r7 = new byte[r5]
            r7[r1] = r1
        L2c:
            int r0 = r7.length
            boolean r2 = r6.n(r0)
            if (r2 == 0) goto L34
        L33:
            return r1
        L34:
            r6.d = r0
            r6.f = r7
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcz.h(java.lang.String):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Short.valueOf(this.a), Short.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), this.f, Integer.valueOf(this.g)});
    }

    public final boolean i(byte[] bArr) {
        short s;
        int length = bArr.length;
        if (n(length) || ((s = this.b) != 1 && s != 7)) {
            return false;
        }
        byte[] bArr2 = new byte[length];
        this.f = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
        this.d = length;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b A[LOOP:1: B:26:0x0038->B:28:0x003b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0043 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(int[] r7) {
        /*
            r6 = this;
            int r0 = r7.length
            boolean r1 = r6.n(r0)
            r2 = 0
            if (r1 == 0) goto L9
            goto L34
        L9:
            short r1 = r6.b
            r3 = 3
            r4 = 4
            if (r1 == r3) goto L16
            r5 = 9
            if (r1 == r5) goto L16
            if (r1 != r4) goto L34
            r1 = r4
        L16:
            if (r1 != r3) goto L27
            r1 = r2
        L19:
            if (r1 >= r0) goto L35
            r3 = r7[r1]
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 > r4) goto L34
            if (r3 < 0) goto L34
            int r1 = r1 + 1
            goto L19
        L27:
            if (r1 != r4) goto L35
            int r0 = r7.length
            r1 = r2
        L2b:
            if (r1 >= r0) goto L35
            r3 = r7[r1]
            if (r3 < 0) goto L34
            int r1 = r1 + 1
            goto L2b
        L34:
            return r2
        L35:
            int r0 = r7.length
            long[] r0 = new long[r0]
        L38:
            int r1 = r7.length
            if (r2 >= r1) goto L43
            r1 = r7[r2]
            long r3 = (long) r1
            r0[r2] = r3
            int r2 = r2 + 1
            goto L38
        L43:
            r6.f = r0
            r6.d = r1
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcz.j(int[]):boolean");
    }

    public final boolean k(long[] jArr) {
        if (!n(jArr.length) && this.b == 4) {
            for (long j2 : jArr) {
                if (j2 >= 0 && j2 <= 4294967295L) {
                }
            }
            this.f = jArr;
            this.d = jArr.length;
            return true;
        }
        return false;
    }

    public final boolean l(pap[] papVarArr) {
        if (!n(papVarArr.length)) {
            short s = this.b;
            if (s == 5) {
                for (pap papVar : papVarArr) {
                    long j2 = papVar.a;
                    if (j2 >= 0 && papVar.b >= 0 && j2 <= 4294967295L) {
                    }
                }
                this.f = papVarArr;
                this.d = papVarArr.length;
                return true;
            }
            if (s == 10) {
                for (pap papVar2 : papVarArr) {
                    long j3 = papVar2.a;
                    if (j3 >= -2147483648L) {
                        long j4 = papVar2.b;
                        if (j3 <= 2147483647L && j4 <= 2147483647L) {
                        }
                    }
                }
                this.f = papVarArr;
                this.d = papVarArr.length;
                return true;
            }
        }
        return false;
    }

    public final int[] m() {
        Object obj = this.f;
        int[] iArr = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            iArr = new int[jArr.length];
            for (int i2 = 0; i2 < jArr.length; i2++) {
                iArr[i2] = (int) jArr[i2];
            }
        }
        return iArr;
    }

    public final String toString() {
        String str = String.format("tag id: %04X\n", Short.valueOf(this.a));
        int i2 = this.e;
        int i3 = this.d;
        int i4 = this.g;
        Object obj = this.f;
        String string = "";
        if (obj != null) {
            if (obj instanceof byte[]) {
                string = this.b == 2 ? new String((byte[]) obj, i) : Arrays.toString((byte[]) obj);
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                string = jArr.length == 1 ? String.valueOf(jArr[0]) : Arrays.toString(jArr);
            } else if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        string = obj2.toString();
                    }
                } else {
                    string = Arrays.toString(objArr);
                }
            } else {
                string = obj.toString();
            }
        }
        return str + "ifd id: " + i2 + "\ntype: " + c(this.b) + "\ncount: " + i3 + "\noffset: " + i4 + "\nvalue: " + string + "\n";
    }
}
