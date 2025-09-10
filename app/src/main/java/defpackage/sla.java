package defpackage;

import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.AccessibleObject;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sla {
    private sla() {
    }

    public static int A(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iA = ((tit) it.next()).a();
            if (iA != 2) {
                return iA;
            }
        }
        return 1;
    }

    public static BigDecimal B(String str) {
        G(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(String.valueOf(str)));
    }

    public static BigInteger C(String str) {
        G(str);
        return new BigInteger(str);
    }

    private static int D(byte b) {
        return b & 63;
    }

    private static boolean E(byte b) {
        return b > -65;
    }

    private static final int F(int i) {
        int iBinarySearch = Arrays.binarySearch(trf.a, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    private static void G(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static void a(String str, Object... objArr) {
        System.err.println(sla.class.toString() + ": " + String.format(str, objArr));
    }

    public static Object b(sec secVar) {
        if (secVar == null) {
            return null;
        }
        return secVar.b();
    }

    public static Object c(sec secVar) {
        if (secVar != null) {
            return secVar.b();
        }
        throw new NoSuchElementException();
    }

    public static boolean d(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = sel.a;
            }
        } else {
            if (!(iterable instanceof sfn)) {
                return false;
            }
            comparator2 = ((sfn) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    public static void e(Map map, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static void f(sea seaVar, ObjectInputStream objectInputStream, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collectionB = seaVar.b(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collectionB.add(objectInputStream.readObject());
            }
        }
    }

    public static void g(Map map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public static void h(sea seaVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(seaVar.q().size());
        for (Map.Entry entry : seaVar.q().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static rtl i(Class cls, String str) {
        try {
            return new rtl(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static /* synthetic */ int j(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ String k(int i) {
        return i != 2 ? i != 3 ? "INSTALL" : CGlJpiVWrCQOq.GPPGfFRrAvEp : "START_FLOW";
    }

    public static int[] l() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    public static String m(int i) {
        return Integer.toString(i - 1);
    }

    public static void n(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (E(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || E(b3) || E(b4)) {
            throw new tpz("Protocol message had invalid UTF-8.");
        }
        int iD = ((b & 7) << 18) | (D(b2) << 12) | (D(b3) << 6) | D(b4);
        cArr[i] = (char) ((iD >>> 10) + 55232);
        cArr[i + 1] = (char) ((iD & 1023) + 56320);
    }

    public static void o(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void p(byte r2, byte r3, byte r4, char[] r5, int r6) {
        /*
            boolean r0 = E(r3)
            if (r0 != 0) goto L30
            r0 = -96
            r1 = -32
            if (r2 != r1) goto Lf
            if (r3 < r0) goto L30
            r2 = r1
        Lf:
            r1 = -19
            if (r2 != r1) goto L16
            if (r3 >= r0) goto L30
            r2 = r1
        L16:
            boolean r0 = E(r4)
            if (r0 != 0) goto L30
            r2 = r2 & 15
            int r3 = D(r3)
            int r4 = D(r4)
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L30:
            tpz r2 = new tpz
            java.lang.String r3 = "Protocol message had invalid UTF-8."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sla.p(byte, byte, byte, char[], int):void");
    }

    public static void q(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || E(b2)) {
            throw new tpz("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b & 31) << 6) | D(b2));
    }

    public static boolean r(byte b) {
        return b >= 0;
    }

    public static boolean s(byte b) {
        return b < -16;
    }

    public static boolean t(byte b) {
        return b < -32;
    }

    public static final void v(toj tojVar, ArrayDeque arrayDeque) {
        if (!tojVar.h()) {
            if (!(tojVar instanceof trf)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(tojVar.getClass()))));
            }
            trf trfVar = (trf) tojVar;
            int[] iArr = trf.a;
            v(trfVar.e, arrayDeque);
            v(trfVar.f, arrayDeque);
            return;
        }
        int iF = F(tojVar.d());
        int iC = trf.c(iF + 1);
        if (arrayDeque.isEmpty() || ((toj) arrayDeque.peek()).d() >= iC) {
            arrayDeque.push(tojVar);
            return;
        }
        int iC2 = trf.c(iF);
        toj trfVar2 = (toj) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((toj) arrayDeque.peek()).d() < iC2) {
            trfVar2 = new trf((toj) arrayDeque.pop(), trfVar2);
        }
        trf trfVar3 = new trf(trfVar2, tojVar);
        while (!arrayDeque.isEmpty()) {
            if (((toj) arrayDeque.peek()).d() >= trf.c(F(trfVar3.d) + 1)) {
                break;
            } else {
                trfVar3 = new trf((toj) arrayDeque.pop(), trfVar3);
            }
        }
        arrayDeque.push(trfVar3);
    }

    public static final toj w(tos tosVar, byte[] bArr) {
        tosVar.ah();
        return new toh(bArr);
    }

    public static String x(String str) {
        return "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str);
    }

    public static til y(tml tmlVar) {
        boolean z;
        try {
            try {
                tmlVar.t();
                try {
                    return tkh.d(tmlVar);
                } catch (EOFException e) {
                    e = e;
                    z = false;
                    if (z) {
                        return tin.a;
                    }
                    throw new tis(e);
                }
            } catch (NumberFormatException e2) {
                throw new tis(e2);
            } catch (tmn e3) {
                throw new tis(e3);
            } catch (IOException e4) {
                throw new tim(e4);
            }
        } catch (EOFException e5) {
            e = e5;
            z = true;
        }
    }

    public static boolean z(AccessibleObject accessibleObject, Object obj) {
        return tju.b.a(accessibleObject, obj);
    }

    public static String u(toj tojVar) {
        StringBuilder sb = new StringBuilder(tojVar.d());
        for (int i = 0; i < tojVar.d(); i++) {
            byte bA = tojVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append(uCzt.hoQwcgmohxu);
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bA);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
