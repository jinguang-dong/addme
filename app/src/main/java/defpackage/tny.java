package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tny {
    public static final /* synthetic */ int a = 0;
    private static volatile int b = 100;

    static double a(byte[] bArr, int i) {
        return Double.longBitsToDouble(s(bArr, i));
    }

    static float b(byte[] bArr, int i) {
        return Float.intBitsToFloat(d(bArr, i));
    }

    static int c(byte[] bArr, int i, tnx tnxVar) {
        int iL = l(bArr, i, tnxVar);
        int i2 = tnxVar.a;
        if (i2 < 0) {
            throw new tpz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iL) {
            throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            tnxVar.c = toj.b;
            return iL;
        }
        tnxVar.c = toj.r(bArr, iL, i2);
        return iL + i2;
    }

    static int d(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int e(trg trgVar, byte[] bArr, int i, int i2, int i3, tnx tnxVar) {
        Object objE = trgVar.e();
        int iP = p(objE, trgVar, bArr, i, i2, i3, tnxVar);
        trgVar.g(objE);
        tnxVar.c = objE;
        return iP;
    }

    static int f(trg trgVar, byte[] bArr, int i, int i2, tnx tnxVar) {
        Object objE = trgVar.e();
        int iQ = q(objE, trgVar, bArr, i, i2, tnxVar);
        trgVar.g(objE);
        tnxVar.c = objE;
        return iQ;
    }

    static int g(trg trgVar, int i, byte[] bArr, int i2, int i3, tpw tpwVar, tnx tnxVar) {
        int iF = f(trgVar, bArr, i2, i3, tnxVar);
        tpwVar.add(tnxVar.c);
        while (iF < i3) {
            int iL = l(bArr, iF, tnxVar);
            if (i != tnxVar.a) {
                break;
            }
            iF = f(trgVar, bArr, iL, i3, tnxVar);
            tpwVar.add(tnxVar.c);
        }
        return iF;
    }

    static int h(byte[] bArr, int i, tpw tpwVar, tnx tnxVar) {
        tpi tpiVar = (tpi) tpwVar;
        int iL = l(bArr, i, tnxVar);
        int i2 = tnxVar.a + iL;
        while (iL < i2) {
            iL = l(bArr, iL, tnxVar);
            tpiVar.g(tnxVar.a);
        }
        if (iL == i2) {
            return iL;
        }
        throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int i(byte[] bArr, int i, tnx tnxVar) {
        int iL = l(bArr, i, tnxVar);
        int i2 = tnxVar.a;
        if (i2 < 0) {
            throw new tpz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            tnxVar.c = "";
            return iL;
        }
        tnxVar.c = new String(bArr, iL, i2, tpx.a);
        return iL + i2;
    }

    static int j(byte[] bArr, int i, tnx tnxVar) {
        int iL = l(bArr, i, tnxVar);
        int i2 = tnxVar.a;
        if (i2 < 0) {
            throw new tpz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            tnxVar.c = "";
            return iL;
        }
        int i3 = trx.a;
        tnxVar.c = rnt.aW(bArr, iL, i2);
        return iL + i2;
    }

    static int k(int i, byte[] bArr, int i2, int i3, trq trqVar, tnx tnxVar) {
        if (tsa.a(i) == 0) {
            throw new tpz("Protocol message contained an invalid tag (zero).");
        }
        int iB = tsa.b(i);
        if (iB == 0) {
            int iO = o(bArr, i2, tnxVar);
            trqVar.e(i, Long.valueOf(tnxVar.b));
            return iO;
        }
        if (iB == 1) {
            trqVar.e(i, Long.valueOf(s(bArr, i2)));
            return i2 + 8;
        }
        if (iB == 2) {
            int iL = l(bArr, i2, tnxVar);
            int i4 = tnxVar.a;
            if (i4 < 0) {
                throw new tpz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i4 > bArr.length - iL) {
                throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i4 == 0) {
                trqVar.e(i, toj.b);
            } else {
                trqVar.e(i, toj.r(bArr, iL, i4));
            }
            return iL + i4;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new tpz("Protocol message contained an invalid tag (zero).");
            }
            trqVar.e(i, Integer.valueOf(d(bArr, i2)));
            return i2 + 4;
        }
        trq trqVar2 = new trq();
        int i5 = (i & (-8)) | 4;
        int i6 = tnxVar.e + 1;
        tnxVar.e = i6;
        t(i6);
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iL2 = l(bArr, i2, tnxVar);
            int i8 = tnxVar.a;
            if (i8 == i5) {
                i7 = i8;
                i2 = iL2;
                break;
            }
            i2 = k(i8, bArr, iL2, i3, trqVar2, tnxVar);
            i7 = i8;
        }
        tnxVar.e--;
        if (i2 > i3 || i7 != i5) {
            throw new tpz("Failed to parse the message.");
        }
        trqVar.e(i, trqVar2);
        return i2;
    }

    static int l(byte[] bArr, int i, tnx tnxVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return m(b2, bArr, i2, tnxVar);
        }
        tnxVar.a = b2;
        return i2;
    }

    static int m(int i, byte[] bArr, int i2, tnx tnxVar) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            tnxVar.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            tnxVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            tnxVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            tnxVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                tnxVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int n(int i, byte[] bArr, int i2, int i3, tpw tpwVar, tnx tnxVar) {
        tpi tpiVar = (tpi) tpwVar;
        int iL = l(bArr, i2, tnxVar);
        tpiVar.g(tnxVar.a);
        while (iL < i3) {
            int iL2 = l(bArr, iL, tnxVar);
            if (i != tnxVar.a) {
                break;
            }
            iL = l(bArr, iL2, tnxVar);
            tpiVar.g(tnxVar.a);
        }
        return iL;
    }

    static int o(byte[] bArr, int i, tnx tnxVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            tnxVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & 127) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & 127) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        tnxVar.b = j2;
        return i3;
    }

    static int p(Object obj, trg trgVar, byte[] bArr, int i, int i2, int i3, tnx tnxVar) {
        int i4 = tnxVar.e + 1;
        tnxVar.e = i4;
        t(i4);
        int iC = ((tqu) trgVar).c(obj, bArr, i, i2, i3, tnxVar);
        tnxVar.e--;
        tnxVar.c = obj;
        return iC;
    }

    static int q(Object obj, trg trgVar, byte[] bArr, int i, int i2, tnx tnxVar) {
        int iM = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM = m(i3, bArr, iM, tnxVar);
            i3 = tnxVar.a;
        }
        int i4 = iM;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = tnxVar.e + 1;
        tnxVar.e = i5;
        t(i5);
        int i6 = i4 + i3;
        trgVar.i(obj, bArr, i4, i6, tnxVar);
        tnxVar.e--;
        tnxVar.c = obj;
        return i6;
    }

    static int r(int i, byte[] bArr, int i2, int i3, tnx tnxVar) {
        if (tsa.a(i) == 0) {
            throw new tpz("Protocol message contained an invalid tag (zero).");
        }
        int iB = tsa.b(i);
        if (iB == 0) {
            return o(bArr, i2, tnxVar);
        }
        if (iB == 1) {
            return i2 + 8;
        }
        if (iB == 2) {
            return l(bArr, i2, tnxVar) + tnxVar.a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i2 + 4;
            }
            throw new tpz("Protocol message contained an invalid tag (zero).");
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = l(bArr, i2, tnxVar);
            i5 = tnxVar.a;
            if (i5 == i4) {
                break;
            }
            i2 = r(i5, bArr, i2, i3, tnxVar);
        }
        if (i2 > i3 || i5 != i4) {
            throw new tpz("Failed to parse the message.");
        }
        return i2;
    }

    static long s(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    private static void t(int i) throws tpz {
        if (i >= b) {
            throw new tpz("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
