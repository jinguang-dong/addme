package defpackage;

import com.google.ar.core.ImageFormat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.UrlRequest;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tqu implements trg {
    public static final int[] a = new int[0];
    public static final Unsafe b = trv.i();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final tqr g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final trp m;

    public tqu(int[] iArr, Object[] objArr, int i, int i2, tqr tqrVar, int[] iArr2, int i3, int i4, trp trpVar, rnt rntVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = tqrVar instanceof tph;
        boolean z = false;
        if (rntVar != null && (tqrVar instanceof tpf)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = trpVar;
        this.g = tqrVar;
    }

    private final Object A(Object obj, int i, Object obj2, trp trpVar, Object obj3) {
        tpl tplVarY;
        int iP = p(i);
        Object objG = trv.g(obj, w(v(i)));
        if (objG == null || (tplVarY = y(i)) == null) {
            return obj2;
        }
        tql tqlVarAX = rnt.aX(B(i));
        Iterator it = ((tqm) objG).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!tplVarY.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = trpVar.b(obj3);
                }
                int iH = rtl.h(tqlVarAX, entry.getKey(), entry.getValue());
                toj tojVar = toj.b;
                byte[] bArr = new byte[iH];
                tos tosVarAg = tos.ag(bArr);
                try {
                    rtl.i(tosVarAg, tqlVarAX, entry.getKey(), entry.getValue());
                    trpVar.c(obj2, iP, sla.w(tosVarAg, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private final Object B(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private final Object C(Object obj, int i) {
        trg trgVarZ = z(i);
        long jW = w(v(i));
        if (!N(obj, i)) {
            return trgVarZ.e();
        }
        Object object = b.getObject(obj, jW);
        if (Q(object)) {
            return object;
        }
        Object objE = trgVarZ.e();
        if (object != null) {
            trgVarZ.h(objE, object);
        }
        return objE;
    }

    private final Object D(Object obj, int i, int i2) {
        trg trgVarZ = z(i2);
        if (!R(obj, i, i2)) {
            return trgVarZ.e();
        }
        Object object = b.getObject(obj, w(v(i2)));
        if (Q(object)) {
            return object;
        }
        Object objE = trgVarZ.e();
        if (object != null) {
            trgVarZ.h(objE, object);
        }
        return objE;
    }

    private static void E(Object obj) {
        if (!Q(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void F(Object obj, Object obj2, int i) {
        if (N(obj2, i)) {
            long jW = w(v(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + p(i) + " is present but null: " + obj2.toString());
            }
            trg trgVarZ = z(i);
            if (!N(obj, i)) {
                if (Q(object)) {
                    Object objE = trgVarZ.e();
                    trgVarZ.h(objE, object);
                    unsafe.putObject(obj, jW, objE);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                H(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!Q(object2)) {
                Object objE2 = trgVarZ.e();
                trgVarZ.h(objE2, object2);
                unsafe.putObject(obj, jW, objE2);
                object2 = objE2;
            }
            trgVarZ.h(object2, object);
        }
    }

    private final void G(Object obj, Object obj2, int i) {
        int iP = p(i);
        if (R(obj2, iP, i)) {
            long jW = w(v(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + p(i) + " is present but null: " + obj2.toString());
            }
            trg trgVarZ = z(i);
            if (!R(obj, iP, i)) {
                if (Q(object)) {
                    Object objE = trgVarZ.e();
                    trgVarZ.h(objE, object);
                    unsafe.putObject(obj, jW, objE);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                I(obj, iP, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!Q(object2)) {
                Object objE2 = trgVarZ.e();
                trgVarZ.h(objE2, object2);
                unsafe.putObject(obj, jW, objE2);
                object2 = objE2;
            }
            trgVarZ.h(object2, object);
        }
    }

    private final void H(Object obj, int i) {
        int iS = s(i);
        long j = 1048575 & iS;
        if (j == 1048575) {
            return;
        }
        trv.q(obj, j, (1 << (iS >>> 20)) | trv.d(obj, j));
    }

    private final void I(Object obj, int i, int i2) {
        trv.q(obj, s(i2) & 1048575, i);
    }

    private final void J(Object obj, int i, Object obj2) {
        b.putObject(obj, w(v(i)), obj2);
        H(obj, i);
    }

    private final void K(Object obj, int i, int i2, Object obj2) {
        b.putObject(obj, w(v(i2)), obj2);
        I(obj, i, i2);
    }

    private final boolean L(Object obj, Object obj2, int i) {
        return N(obj, i) == N(obj2, i);
    }

    private static boolean M(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean N(Object obj, int i) {
        int iS = s(i);
        long j = 1048575 & iS;
        if (j != 1048575) {
            return ((1 << (iS >>> 20)) & trv.d(obj, j)) != 0;
        }
        int iV = v(i);
        long jW = w(iV);
        switch (u(iV)) {
            case 0:
                return Double.doubleToRawLongBits(trv.b(obj, jW)) != 0;
            case 1:
                return Float.floatToRawIntBits(trv.c(obj, jW)) != 0;
            case 2:
                return trv.e(obj, jW) != 0;
            case 3:
                return trv.e(obj, jW) != 0;
            case 4:
                return trv.d(obj, jW) != 0;
            case 5:
                return trv.e(obj, jW) != 0;
            case 6:
                return trv.d(obj, jW) != 0;
            case 7:
                return trv.u(obj, jW);
            case 8:
                Object objG = trv.g(obj, jW);
                if (objG instanceof String) {
                    return !((String) objG).isEmpty();
                }
                if (objG instanceof toj) {
                    return !toj.b.equals(objG);
                }
                throw new IllegalArgumentException();
            case 9:
                return trv.g(obj, jW) != null;
            case 10:
                return !toj.b.equals(trv.g(obj, jW));
            case 11:
                return trv.d(obj, jW) != 0;
            case 12:
                return trv.d(obj, jW) != 0;
            case 13:
                return trv.d(obj, jW) != 0;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return trv.e(obj, jW) != 0;
            case 15:
                return trv.d(obj, jW) != 0;
            case 16:
                return trv.e(obj, jW) != 0;
            case 17:
                return trv.g(obj, jW) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean O(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? N(obj, i) : (i3 & i4) != 0;
    }

    private static boolean P(Object obj, int i, trg trgVar) {
        return trgVar.k(trv.g(obj, w(i)));
    }

    private static boolean Q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof tph) {
            return ((tph) obj).C();
        }
        return true;
    }

    private final boolean R(Object obj, int i, int i2) {
        return trv.d(obj, (long) (s(i2) & 1048575)) == i;
    }

    private static boolean S(Object obj, long j) {
        return ((Boolean) trv.g(obj, j)).booleanValue();
    }

    private final void T(Object obj, int i, too tooVar) {
        if (M(i)) {
            trv.s(obj, w(i), tooVar.v());
        } else if (this.i) {
            trv.s(obj, w(i), tooVar.u());
        } else {
            trv.s(obj, w(i), tooVar.o());
        }
    }

    private static final int U(byte[] bArr, int i, int i2, Ctry ctry, Class cls, tnx tnxVar) {
        Ctry ctry2 = Ctry.DOUBLE;
        switch (ctry.ordinal()) {
            case 0:
                int i3 = i + 8;
                tnxVar.c = Double.valueOf(tny.a(bArr, i));
                return i3;
            case 1:
                int i4 = i + 4;
                tnxVar.c = Float.valueOf(tny.b(bArr, i));
                return i4;
            case 2:
            case 3:
                int iO = tny.o(bArr, i, tnxVar);
                tnxVar.c = Long.valueOf(tnxVar.b);
                return iO;
            case 4:
            case 12:
            case 13:
                int iL = tny.l(bArr, i, tnxVar);
                tnxVar.c = Integer.valueOf(tnxVar.a);
                return iL;
            case 5:
            case 15:
                int i5 = i + 8;
                tnxVar.c = Long.valueOf(tny.s(bArr, i));
                return i5;
            case 6:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int i6 = i + 4;
                tnxVar.c = Integer.valueOf(tny.d(bArr, i));
                return i6;
            case 7:
                int iO2 = tny.o(bArr, i, tnxVar);
                tnxVar.c = Boolean.valueOf(tnxVar.b != 0);
                return iO2;
            case 8:
                return tny.j(bArr, i, tnxVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return tny.f(tra.a.a(cls), bArr, i, i2, tnxVar);
            case 11:
                return tny.c(bArr, i, tnxVar);
            case 16:
                int iL2 = tny.l(bArr, i, tnxVar);
                tnxVar.c = Integer.valueOf(ton.H(tnxVar.a));
                return iL2;
            case 17:
                int iO3 = tny.o(bArr, i, tnxVar);
                tnxVar.c = Long.valueOf(ton.J(tnxVar.b));
                return iO3;
        }
    }

    private static final void V(int i, Object obj, ocq ocqVar) {
        if (obj instanceof String) {
            ocqVar.P(i, (String) obj);
        } else {
            ocqVar.A(i, (toj) obj);
        }
    }

    static trq d(Object obj) {
        tph tphVar = (tph) obj;
        trq trqVar = tphVar.aW;
        if (trqVar != trq.a) {
            return trqVar;
        }
        trq trqVar2 = new trq();
        tphVar.aW = trqVar2;
        return trqVar2;
    }

    public static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    private static double n(Object obj, long j) {
        return ((Double) trv.g(obj, j)).doubleValue();
    }

    private static float o(Object obj, long j) {
        return ((Float) trv.g(obj, j)).floatValue();
    }

    private final int p(int i) {
        return this.c[i];
    }

    private static int q(Object obj, long j) {
        return ((Integer) trv.g(obj, j)).intValue();
    }

    private final int r(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return t(i, 0);
    }

    private final int s(int i) {
        return this.c[i + 2];
    }

    private final int t(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iP = p(i4);
            if (i == iP) {
                return i4;
            }
            if (i < iP) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int u(int i) {
        return (i >>> 20) & 255;
    }

    private final int v(int i) {
        return this.c[i + 1];
    }

    private static long w(int i) {
        return i & 1048575;
    }

    private static long x(Object obj, long j) {
        return ((Long) trv.g(obj, j)).longValue();
    }

    private final tpl y(int i) {
        int i2 = i / 3;
        return (tpl) this.d[i2 + i2 + 1];
    }

    private final trg z(int i) {
        Object[] objArr = this.d;
        int i2 = i / 3;
        int i3 = i2 + i2;
        trg trgVar = (trg) objArr[i3];
        if (trgVar != null) {
            return trgVar;
        }
        trg trgVarA = tra.a.a((Class) objArr[i3 + 1]);
        objArr[i3] = trgVarA;
        return trgVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x03c8  */
    @Override // defpackage.trg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqu.a(java.lang.Object):int");
    }

    @Override // defpackage.trg
    public final int b(Object obj) {
        int i;
        int iR;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.c.length; i4 += 3) {
            int iV = v(i4);
            int iP = p(i4);
            long jW = w(iV);
            int iHashCode = 37;
            switch (u(iV)) {
                case 0:
                    i = i3 * 53;
                    long jDoubleToLongBits = Double.doubleToLongBits(trv.b(obj, jW));
                    byte[] bArr = tpx.b;
                    iR = a.r(jDoubleToLongBits);
                    i3 = i + iR;
                    break;
                case 1:
                    i = i3 * 53;
                    iR = Float.floatToIntBits(trv.c(obj, jW));
                    i3 = i + iR;
                    break;
                case 2:
                    i = i3 * 53;
                    long jE = trv.e(obj, jW);
                    byte[] bArr2 = tpx.b;
                    iR = a.r(jE);
                    i3 = i + iR;
                    break;
                case 3:
                    i = i3 * 53;
                    long jE2 = trv.e(obj, jW);
                    byte[] bArr3 = tpx.b;
                    iR = a.r(jE2);
                    i3 = i + iR;
                    break;
                case 4:
                    i = i3 * 53;
                    iR = trv.d(obj, jW);
                    i3 = i + iR;
                    break;
                case 5:
                    i = i3 * 53;
                    long jE3 = trv.e(obj, jW);
                    byte[] bArr4 = tpx.b;
                    iR = a.r(jE3);
                    i3 = i + iR;
                    break;
                case 6:
                    i = i3 * 53;
                    iR = trv.d(obj, jW);
                    i3 = i + iR;
                    break;
                case 7:
                    i = i3 * 53;
                    boolean zU = trv.u(obj, jW);
                    byte[] bArr5 = tpx.b;
                    iR = a.o(zU);
                    i3 = i + iR;
                    break;
                case 8:
                    i = i3 * 53;
                    iR = ((String) trv.g(obj, jW)).hashCode();
                    i3 = i + iR;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objG = trv.g(obj, jW);
                    if (objG != null) {
                        iHashCode = objG.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iR = trv.g(obj, jW).hashCode();
                    i3 = i + iR;
                    break;
                case 11:
                    i = i3 * 53;
                    iR = trv.d(obj, jW);
                    i3 = i + iR;
                    break;
                case 12:
                    i = i3 * 53;
                    iR = trv.d(obj, jW);
                    i3 = i + iR;
                    break;
                case 13:
                    i = i3 * 53;
                    iR = trv.d(obj, jW);
                    i3 = i + iR;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    i = i3 * 53;
                    long jE4 = trv.e(obj, jW);
                    byte[] bArr6 = tpx.b;
                    iR = a.r(jE4);
                    i3 = i + iR;
                    break;
                case 15:
                    i = i3 * 53;
                    iR = trv.d(obj, jW);
                    i3 = i + iR;
                    break;
                case 16:
                    i = i3 * 53;
                    long jE5 = trv.e(obj, jW);
                    byte[] bArr7 = tpx.b;
                    iR = a.r(jE5);
                    i3 = i + iR;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objG2 = trv.g(obj, jW);
                    if (objG2 != null) {
                        iHashCode = objG2.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case ImageFormat.RGBA_FP16 /* 22 */:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case ImageFormat.YUV_420_888 /* 35 */:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iR = trv.g(obj, jW).hashCode();
                    i3 = i + iR;
                    break;
                case 50:
                    i = i3 * 53;
                    iR = trv.g(obj, jW).hashCode();
                    i3 = i + iR;
                    break;
                case 51:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        long jDoubleToLongBits2 = Double.doubleToLongBits(n(obj, jW));
                        byte[] bArr8 = tpx.b;
                        iR = a.r(jDoubleToLongBits2);
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iR = Float.floatToIntBits(o(obj, jW));
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        long jX = x(obj, jW);
                        byte[] bArr9 = tpx.b;
                        iR = a.r(jX);
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        long jX2 = x(obj, jW);
                        byte[] bArr10 = tpx.b;
                        iR = a.r(jX2);
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iR = q(obj, jW);
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        long jX3 = x(obj, jW);
                        byte[] bArr11 = tpx.b;
                        iR = a.r(jX3);
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iR = q(obj, jW);
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        boolean zS = S(obj, jW);
                        byte[] bArr12 = tpx.b;
                        iR = a.o(zS);
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iR = ((String) trv.g(obj, jW)).hashCode();
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iR = trv.g(obj, jW).hashCode();
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iR = trv.g(obj, jW).hashCode();
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iR = q(obj, jW);
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iR = q(obj, jW);
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iR = q(obj, jW);
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        long jX4 = x(obj, jW);
                        byte[] bArr13 = tpx.b;
                        iR = a.r(jX4);
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iR = q(obj, jW);
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        long jX5 = x(obj, jW);
                        byte[] bArr14 = tpx.b;
                        iR = a.r(jX5);
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iR = trv.g(obj, jW).hashCode();
                        i3 = i + iR;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + trp.f(obj).hashCode();
        return this.h ? (iHashCode2 * 53) + rnt.bd(obj).hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int c(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, defpackage.tnx r40) {
        /*
            Method dump skipped, instructions count: 3906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqu.c(java.lang.Object, byte[], int, int, int, tnx):int");
    }

    @Override // defpackage.trg
    public final Object e() {
        return ((tph) this.g).o();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    @Override // defpackage.trg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = Q(r8)
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r8 instanceof defpackage.tph
            r1 = 0
            if (r0 == 0) goto L20
            r0 = r8
            tph r0 = (defpackage.tph) r0
            int r2 = r0.aV
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 | r3
            r0.aV = r2
            r0.aT = r1
            r0.z()
        L20:
            int[] r0 = r7.c
        L22:
            int r2 = r0.length
            if (r1 >= r2) goto L89
            int r2 = r7.v(r1)
            long r3 = w(r2)
            int r2 = u(r2)
            r5 = 9
            if (r2 == r5) goto L73
            r5 = 60
            if (r2 == r5) goto L5b
            r5 = 68
            if (r2 == r5) goto L5b
            switch(r2) {
                case 17: goto L73;
                case 18: goto L53;
                case 19: goto L53;
                case 20: goto L53;
                case 21: goto L53;
                case 22: goto L53;
                case 23: goto L53;
                case 24: goto L53;
                case 25: goto L53;
                case 26: goto L53;
                case 27: goto L53;
                case 28: goto L53;
                case 29: goto L53;
                case 30: goto L53;
                case 31: goto L53;
                case 32: goto L53;
                case 33: goto L53;
                case 34: goto L53;
                case 35: goto L53;
                case 36: goto L53;
                case 37: goto L53;
                case 38: goto L53;
                case 39: goto L53;
                case 40: goto L53;
                case 41: goto L53;
                case 42: goto L53;
                case 43: goto L53;
                case 44: goto L53;
                case 45: goto L53;
                case 46: goto L53;
                case 47: goto L53;
                case 48: goto L53;
                case 49: goto L53;
                case 50: goto L41;
                default: goto L40;
            }
        L40:
            goto L86
        L41:
            sun.misc.Unsafe r2 = defpackage.tqu.b
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L86
            r6 = r5
            tqm r6 = (defpackage.tqm) r6
            r6.c()
            r2.putObject(r8, r3, r5)
            goto L86
        L53:
            tpw r2 = defpackage.rnt.bb(r8, r3)
            r2.b()
            goto L86
        L5b:
            int r2 = r7.p(r1)
            boolean r2 = r7.R(r8, r2, r1)
            if (r2 == 0) goto L86
            trg r2 = r7.z(r1)
            sun.misc.Unsafe r5 = defpackage.tqu.b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.g(r3)
            goto L86
        L73:
            boolean r2 = r7.N(r8, r1)
            if (r2 == 0) goto L86
            trg r2 = r7.z(r1)
            sun.misc.Unsafe r5 = defpackage.tqu.b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.g(r3)
        L86:
            int r1 = r1 + 3
            goto L22
        L89:
            trp r0 = r7.m
            r0.e(r8)
            boolean r7 = r7.h
            if (r7 == 0) goto L95
            defpackage.rnt.bg(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqu.g(java.lang.Object):void");
    }

    @Override // defpackage.trg
    public final void h(Object obj, Object obj2) {
        E(obj);
        obj2.getClass();
        for (int i = 0; i < this.c.length; i += 3) {
            int iV = v(i);
            long jW = w(iV);
            int iP = p(i);
            switch (u(iV)) {
                case 0:
                    if (N(obj2, i)) {
                        trv.o(obj, jW, trv.b(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (N(obj2, i)) {
                        trv.p(obj, jW, trv.c(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (N(obj2, i)) {
                        trv.r(obj, jW, trv.e(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (N(obj2, i)) {
                        trv.r(obj, jW, trv.e(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (N(obj2, i)) {
                        trv.q(obj, jW, trv.d(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (N(obj2, i)) {
                        trv.r(obj, jW, trv.e(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (N(obj2, i)) {
                        trv.q(obj, jW, trv.d(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (N(obj2, i)) {
                        trv.k(obj, jW, trv.u(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (N(obj2, i)) {
                        trv.s(obj, jW, trv.g(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    F(obj, obj2, i);
                    break;
                case 10:
                    if (N(obj2, i)) {
                        trv.s(obj, jW, trv.g(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (N(obj2, i)) {
                        trv.q(obj, jW, trv.d(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (N(obj2, i)) {
                        trv.q(obj, jW, trv.d(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (N(obj2, i)) {
                        trv.q(obj, jW, trv.d(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (N(obj2, i)) {
                        trv.r(obj, jW, trv.e(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (N(obj2, i)) {
                        trv.q(obj, jW, trv.d(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (N(obj2, i)) {
                        trv.r(obj, jW, trv.e(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    F(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case ImageFormat.RGBA_FP16 /* 22 */:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case ImageFormat.YUV_420_888 /* 35 */:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    tpw tpwVarBb = rnt.bb(obj, jW);
                    tpw tpwVarBb2 = rnt.bb(obj2, jW);
                    int size = tpwVarBb.size();
                    int size2 = tpwVarBb2.size();
                    if (size > 0 && size2 > 0) {
                        if (!tpwVarBb.c()) {
                            tpwVarBb = tpwVarBb.e(size2 + size);
                        }
                        tpwVarBb.addAll(tpwVarBb2);
                    }
                    if (size > 0) {
                        tpwVarBb2 = tpwVarBb;
                    }
                    trv.s(obj, jW, tpwVarBb2);
                    break;
                case 50:
                    trp trpVar = trh.a;
                    trv.s(obj, jW, rnt.aZ(trv.g(obj, jW), trv.g(obj2, jW)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (R(obj2, iP, i)) {
                        trv.s(obj, jW, trv.g(obj2, jW));
                        I(obj, iP, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    G(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (R(obj2, iP, i)) {
                        trv.s(obj, jW, trv.g(obj2, jW));
                        I(obj, iP, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    G(obj, obj2, i);
                    break;
            }
        }
        trh.n(obj, obj2);
        if (this.h) {
            trh.m(obj, obj2);
        }
    }

    @Override // defpackage.trg
    public final void i(Object obj, byte[] bArr, int i, int i2, tnx tnxVar) {
        c(obj, bArr, i, i2, 0, tnxVar);
    }

    @Override // defpackage.trg
    public final boolean j(Object obj, Object obj2) {
        boolean zK;
        for (int i = 0; i < this.c.length; i += 3) {
            int iV = v(i);
            long jW = w(iV);
            switch (u(iV)) {
                case 0:
                    if (!L(obj, obj2, i) || Double.doubleToLongBits(trv.b(obj, jW)) != Double.doubleToLongBits(trv.b(obj2, jW))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!L(obj, obj2, i) || Float.floatToIntBits(trv.c(obj, jW)) != Float.floatToIntBits(trv.c(obj2, jW))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!L(obj, obj2, i) || trv.e(obj, jW) != trv.e(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!L(obj, obj2, i) || trv.e(obj, jW) != trv.e(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!L(obj, obj2, i) || trv.d(obj, jW) != trv.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!L(obj, obj2, i) || trv.e(obj, jW) != trv.e(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!L(obj, obj2, i) || trv.d(obj, jW) != trv.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!L(obj, obj2, i) || trv.u(obj, jW) != trv.u(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (L(obj, obj2, i)) {
                        Object objG = trv.g(obj, jW);
                        Object objG2 = trv.g(obj2, jW);
                        trp trpVar = trh.a;
                        if (a.K(objG, objG2)) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (L(obj, obj2, i)) {
                        Object objG3 = trv.g(obj, jW);
                        Object objG4 = trv.g(obj2, jW);
                        trp trpVar2 = trh.a;
                        if (a.K(objG3, objG4)) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (L(obj, obj2, i)) {
                        Object objG5 = trv.g(obj, jW);
                        Object objG6 = trv.g(obj2, jW);
                        trp trpVar3 = trh.a;
                        if (a.K(objG5, objG6)) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (!L(obj, obj2, i) || trv.d(obj, jW) != trv.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!L(obj, obj2, i) || trv.d(obj, jW) != trv.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!L(obj, obj2, i) || trv.d(obj, jW) != trv.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (!L(obj, obj2, i) || trv.e(obj, jW) != trv.e(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!L(obj, obj2, i) || trv.d(obj, jW) != trv.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!L(obj, obj2, i) || trv.e(obj, jW) != trv.e(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (L(obj, obj2, i)) {
                        Object objG7 = trv.g(obj, jW);
                        Object objG8 = trv.g(obj2, jW);
                        trp trpVar4 = trh.a;
                        if (a.K(objG7, objG8)) {
                            continue;
                        }
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case ImageFormat.RGBA_FP16 /* 22 */:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case ImageFormat.YUV_420_888 /* 35 */:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    Object objG9 = trv.g(obj, jW);
                    Object objG10 = trv.g(obj2, jW);
                    trp trpVar5 = trh.a;
                    zK = a.K(objG9, objG10);
                    break;
                case 50:
                    Object objG11 = trv.g(obj, jW);
                    Object objG12 = trv.g(obj2, jW);
                    trp trpVar6 = trh.a;
                    zK = a.K(objG11, objG12);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jS = s(i) & 1048575;
                    if (trv.d(obj, jS) == trv.d(obj2, jS)) {
                        Object objG13 = trv.g(obj, jW);
                        Object objG14 = trv.g(obj2, jW);
                        trp trpVar7 = trh.a;
                        if (a.K(objG13, objG14)) {
                            continue;
                        }
                    }
                    return false;
                default:
            }
            if (!zK) {
                return false;
            }
        }
        if (!trp.f(obj).equals(trp.f(obj2))) {
            return false;
        }
        if (this.h) {
            return rnt.bd(obj).equals(rnt.bd(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    @Override // defpackage.trg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqu.k(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x040e, code lost:
    
        r3.put(r2, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0411, code lost:
    
        r23.a.A(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0418, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x041c, code lost:
    
        r23.a.A(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0421, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x04ac, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0822, code lost:
    
        r5 = r6.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x082e, code lost:
    
        r0 = r1.k;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0835, code lost:
    
        r5 = r6;
        r4 = r1.A(r2, r1.j[r0], r4, r5, r22);
        r6 = r5;
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x084c, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x084f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x085f A[LOOP:3: B:294:0x085b->B:296:0x085f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0822 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0403 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x082e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:436:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0187 A[Catch: all -> 0x01b8, TryCatch #12 {all -> 0x01b8, blocks: (B:19:0x0054, B:20:0x0058, B:22:0x0060, B:23:0x0068, B:56:0x0176, B:64:0x01a3, B:61:0x0187, B:63:0x0191, B:25:0x006e, B:26:0x0078, B:27:0x0082, B:28:0x008c, B:29:0x0096, B:30:0x009d, B:31:0x009e, B:32:0x00a8, B:33:0x00ae, B:35:0x00bb, B:37:0x00ca, B:38:0x00d7, B:39:0x00dc, B:40:0x00e8, B:42:0x00f5, B:44:0x0104, B:45:0x0111, B:46:0x0116, B:47:0x012a, B:48:0x012f, B:49:0x0138, B:50:0x0141, B:51:0x014a, B:52:0x0153, B:53:0x015c, B:54:0x0165, B:55:0x016e, B:66:0x01ad, B:67:0x01b0, B:69:0x01b3), top: B:320:0x0054 }] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // defpackage.trg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(java.lang.Object r22, defpackage.too r23, defpackage.tow r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqu.l(java.lang.Object, too, tow):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    @Override // defpackage.trg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(java.lang.Object r21, defpackage.ocq r22) {
        /*
            Method dump skipped, instructions count: 1772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqu.m(java.lang.Object, ocq):void");
    }
}
