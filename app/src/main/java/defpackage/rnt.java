package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import com.google.android.material.tabs.TabLayout;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.HalAfMetadata;
import j$.lang.Iterable$EL;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rnt {
    public rnt() {
    }

    public static String A(String str, int i) {
        str.getClass();
        if (str.length() >= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i);
        for (int length = str.length(); length < i; length++) {
            sb.append('0');
        }
        sb.append(str);
        return sb.toString();
    }

    public static void B(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void C(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(z(str, Character.valueOf(c)));
        }
    }

    public static void D(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(z(str, Integer.valueOf(i)));
        }
    }

    public static void E(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(z(str, Long.valueOf(j)));
        }
    }

    public static void F(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(z(str, obj));
        }
    }

    public static void G(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(z(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void H(boolean z, String str, long j, long j2) {
        if (!z) {
            throw new IllegalArgumentException(z(str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    public static void I(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(z(str, obj, obj2));
        }
    }

    public static void J(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalArgumentException(z(str, obj, obj2, obj3));
        }
    }

    public static void K(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? bm(i, i3, "start index") : (i2 < 0 || i2 > i3) ? bm(i2, i3, "end index") : z("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void L(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void M(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void N(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(z(str, Integer.valueOf(i)));
        }
    }

    public static void O(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(z(str, obj));
        }
    }

    public static void P(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(z(str, obj, obj2));
        }
    }

    public static void Q(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalStateException(z(str, obj, obj2, obj3));
        }
    }

    public static void R(boolean z, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z) {
            throw new IllegalStateException(z(str, obj, obj2, obj3, obj4));
        }
    }

    public static void S(int i, int i2) {
        String strZ;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strZ = z("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(a.bv(i2, "negative size: "));
                }
                strZ = z("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strZ);
        }
    }

    public static void T(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(bm(i, i2, "index"));
        }
    }

    public static String U(String str) {
        return str == null ? "" : str;
    }

    public static boolean V(String str) {
        return str == null || str.isEmpty();
    }

    public static rwb W(Object obj) {
        return new rwb(obj.getClass().getSimpleName());
    }

    public static Object X(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    static CharSequence Y(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static String Z(Iterable iterable, String str) throws IOException {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        aa(sb, it, str);
        return sb.toString();
    }

    public static /* synthetic */ void aA(float[] fArr, float[] fArr2, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = fArr.length;
        }
        av(fArr, fArr2, i);
    }

    public static /* synthetic */ void aB(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        aw(iArr, iArr2, i, 0, i2);
    }

    public static void aD(long[] jArr, long j, int i) {
        jArr.getClass();
        Arrays.fill(jArr, 0, i, j);
    }

    public static /* synthetic */ String aH(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) throws IOException {
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        charSequence.getClass();
        if ((i & 2) != 0) {
            charSequence2 = "";
        }
        charSequence2.getClass();
        if ((i & 4) != 0) {
            charSequence3 = "";
        }
        charSequence3.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            a.F(sb, obj, null);
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public static void aI(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            collection.add(obj);
        }
    }

    public static /* synthetic */ void aJ(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        ay(objArr, objArr2, 0, i, i2);
    }

    public static int aK(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        return (-2147483639) + i3 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
    }

    public static double aL(long j) {
        return j + 0.0d;
    }

    public static Object aM(Throwable th) {
        th.getClass();
        return new uew(th);
    }

    public static void aN(Object obj) {
        if (obj instanceof uew) {
            throw ((uew) obj).a;
        }
    }

    public static ues aO(int i, uif uifVar) {
        return i + (-1) != 1 ? new ufh(uifVar) : new uey(uifVar);
    }

    public static void aP(tzx tzxVar, List list) {
        list.add(tzxVar);
    }

    public static void aQ(tzx tzxVar, List list) {
        list.add(tzxVar);
    }

    public static void aR(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static int aS(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static LinkedHashMap aT(int i) {
        return new LinkedHashMap(aS(i));
    }

    public static List aU(int i) {
        return i == 0 ? Collections.EMPTY_LIST : new ArrayList(i);
    }

    public static String aV(ByteBuffer byteBuffer, int i, int i2) throws tpz {
        int i3;
        if ((((byteBuffer.limit() - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = byteBuffer.get(i);
            if (!sla.r(b)) {
                break;
            }
            i++;
            sla.o(b, cArr, i5);
            i5++;
        }
        int i6 = i5;
        while (i < i4) {
            int i7 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (sla.r(b2)) {
                sla.o(b2, cArr, i6);
                i6++;
                i = i7;
                while (i < i4) {
                    byte b3 = byteBuffer.get(i);
                    if (sla.r(b3)) {
                        i++;
                        sla.o(b3, cArr, i6);
                        i6++;
                    }
                }
            } else {
                if (sla.t(b2)) {
                    if (i7 >= i4) {
                        throw new tpz("Protocol message had invalid UTF-8.");
                    }
                    i3 = i6 + 1;
                    i += 2;
                    sla.q(b2, byteBuffer.get(i7), cArr, i6);
                } else if (sla.s(b2)) {
                    if (i7 >= i4 - 1) {
                        throw new tpz("Protocol message had invalid UTF-8.");
                    }
                    i3 = i6 + 1;
                    int i8 = i + 2;
                    i += 3;
                    sla.p(b2, byteBuffer.get(i7), byteBuffer.get(i8), cArr, i6);
                } else {
                    if (i7 >= i4 - 2) {
                        throw new tpz("Protocol message had invalid UTF-8.");
                    }
                    byte b4 = byteBuffer.get(i7);
                    int i9 = i + 3;
                    byte b5 = byteBuffer.get(i + 2);
                    i += 4;
                    sla.n(b2, b4, b5, byteBuffer.get(i9), cArr, i6);
                    i6 += 2;
                }
                i6 = i3;
            }
        }
        return new String(cArr, 0, i6);
    }

    public static String aW(byte[] bArr, int i, int i2) throws tpz {
        int i3;
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = bArr[i];
            if (!sla.r(b)) {
                break;
            }
            i++;
            sla.o(b, cArr, i5);
            i5++;
        }
        int i6 = i5;
        while (i < i4) {
            int i7 = i + 1;
            byte b2 = bArr[i];
            if (sla.r(b2)) {
                sla.o(b2, cArr, i6);
                i6++;
                i = i7;
                while (i < i4) {
                    byte b3 = bArr[i];
                    if (sla.r(b3)) {
                        i++;
                        sla.o(b3, cArr, i6);
                        i6++;
                    }
                }
            } else {
                if (sla.t(b2)) {
                    if (i7 >= i4) {
                        throw new tpz("Protocol message had invalid UTF-8.");
                    }
                    i3 = i6 + 1;
                    i += 2;
                    sla.q(b2, bArr[i7], cArr, i6);
                } else if (sla.s(b2)) {
                    if (i7 >= i4 - 1) {
                        throw new tpz("Protocol message had invalid UTF-8.");
                    }
                    i3 = i6 + 1;
                    int i8 = i + 2;
                    i += 3;
                    sla.p(b2, bArr[i7], bArr[i8], cArr, i6);
                } else {
                    if (i7 >= i4 - 2) {
                        throw new tpz("Protocol message had invalid UTF-8.");
                    }
                    byte b4 = bArr[i7];
                    int i9 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    sla.n(b2, b4, b5, bArr[i9], cArr, i6);
                    i6 += 2;
                }
                i6 = i3;
            }
        }
        return new String(cArr, 0, i6);
    }

    public static tql aX(Object obj) {
        return (tql) ((rtl) obj).a;
    }

    public static boolean aY(Object obj) {
        return !((tqm) obj).b;
    }

    public static Object aZ(Object obj, Object obj2) {
        tqm tqmVarA = (tqm) obj;
        tqm tqmVar = (tqm) obj2;
        if (!tqmVar.isEmpty()) {
            if (!tqmVarA.b) {
                tqmVarA = tqmVarA.a();
            }
            tqmVarA.b();
            if (!tqmVar.isEmpty()) {
                tqmVarA.putAll(tqmVar);
            }
        }
        return tqmVarA;
    }

    public static void aa(StringBuilder sb, Iterator it, String str) throws IOException {
        try {
            if (it.hasNext()) {
                sb.append(Y(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    sb.append(Y(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static void ab(StringBuilder sb, Iterable iterable, String str) throws IOException {
        aa(sb, iterable.iterator(), str);
    }

    public static boolean ad(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        int length = objArr.length;
        if (length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!ad((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else {
                    if ((obj instanceof ufa) && (obj2 instanceof ufa)) {
                        throw null;
                    }
                    if ((obj instanceof ufe) && (obj2 instanceof ufe)) {
                        throw null;
                    }
                    if ((obj instanceof ufb) && (obj2 instanceof ufb)) {
                        throw null;
                    }
                    if ((obj instanceof ufc) && (obj2 instanceof ufc)) {
                        throw null;
                    }
                    if (!a.ao(obj, obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static List ae(Object[] objArr) {
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static void af(Object[] objArr, Object obj, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void ag(int[] iArr) {
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static Object[] ah(Object[] objArr, int i, int i2) {
        objArr.getClass();
        int length = objArr.length;
        if (i2 > length) {
            throw new IndexOutOfBoundsException(a.bD(length, i2, "toIndex (", ") is greater than size (", ")."));
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static int ai(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static int aj(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static int ak(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (a.ao(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static long al(long[] jArr) {
        return jArr[ai(jArr)];
    }

    public static Object an(Object[] objArr, int i) {
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static List ao(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List ap(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? aq(objArr) : ske.bj(objArr[0]) : ufw.a;
    }

    public static List aq(Object[] objArr) {
        return new ArrayList(new uft(objArr, false));
    }

    public static Set ar(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return ufy.a;
        }
        if (length == 1) {
            return ske.aV(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(ske.aZ(length));
        aI(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static boolean as(int[] iArr, int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= iArr.length) {
                break;
            }
            if (i != iArr[i2]) {
                i2++;
            } else if (i2 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean at(Object[] objArr, Object obj) {
        return ak(objArr, obj) >= 0;
    }

    public static void au(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        bArr.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void av(float[] fArr, float[] fArr2, int i) {
        fArr.getClass();
        fArr2.getClass();
        System.arraycopy(fArr, 0, fArr2, 0, i);
    }

    public static void aw(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void ax(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void ay(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static int b(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Object ba() {
        return tqm.a.a();
    }

    public static tpw bb(Object obj, long j) {
        return (tpw) trv.g(obj, j);
    }

    public static List bc(Object obj, long j) {
        tpw tpwVarBb = bb(obj, j);
        if (tpwVarBb.c()) {
            return tpwVarBb;
        }
        int size = tpwVarBb.size();
        tpw tpwVarE = tpwVarBb.e(size == 0 ? 10 : size + size);
        trv.s(obj, j, tpwVarE);
        return tpwVarE;
    }

    public static toy bd(Object obj) {
        return ((tpf) obj).r;
    }

    public static toy be(Object obj) {
        return ((tpf) obj).c();
    }

    public static void bf(too tooVar, Object obj, tow towVar, toy toyVar) {
        tql tqlVar = (tql) obj;
        toyVar.l((tpg) tqlVar.c, tooVar.t(tqlVar.a.getClass(), towVar));
    }

    public static void bg(Object obj) {
        bd(obj).e();
    }

    public static Pair bh(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(bArr.length).order(ByteOrder.nativeOrder());
        byteBufferOrder.put(bArr);
        return new Pair(byteBufferOrder, Long.valueOf(BufferUtils.a(byteBufferOrder)));
    }

    public static void bi(byte[] bArr, HalAfMetadata halAfMetadata) {
        GcamModuleJNI.HalAfMetadata_SetFaceDeblurInfoFromBytes(halAfMetadata.a, halAfMetadata, tcx.a(new tcx(((Long) bh(bArr).second).longValue())), ((ByteBuffer) r8.first).capacity());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public static tzw bj(ocq ocqVar) {
        return new tzw(ocqVar.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public static tzv bk(ocq ocqVar) {
        return new tzv(ocqVar.a);
    }

    public static void bl(ocq ocqVar, Map.Entry entry) {
        tpg tpgVar = (tpg) entry.getKey();
        Ctry ctry = Ctry.DOUBLE;
        switch (tpgVar.b.ordinal()) {
            case 0:
                ocqVar.B(tpgVar.a, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                ocqVar.F(tpgVar.a, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                ocqVar.I(tpgVar.a, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                ocqVar.R(tpgVar.a, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ocqVar.H(tpgVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                ocqVar.E(tpgVar.a, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                ocqVar.D(tpgVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                ocqVar.z(tpgVar.a, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                ocqVar.P(tpgVar.a, (String) entry.getValue());
                break;
            case 9:
                ocqVar.G(tpgVar.a, entry.getValue(), tra.a.a(entry.getValue().getClass()));
                break;
            case 10:
                ocqVar.J(tpgVar.a, entry.getValue(), tra.a.a(entry.getValue().getClass()));
                break;
            case 11:
                ocqVar.A(tpgVar.a, (toj) entry.getValue());
                break;
            case 12:
                ocqVar.Q(tpgVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                ocqVar.H(tpgVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ocqVar.L(tpgVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                ocqVar.M(tpgVar.a, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                ocqVar.N(tpgVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                ocqVar.O(tpgVar.a, ((Long) entry.getValue()).longValue());
                break;
        }
    }

    private static String bm(int i, int i2, String str) {
        if (i < 0) {
            return z("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return z("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(a.bv(i2, "negative size: "));
    }

    public static int c(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    public static ColorStateList d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = clu.b(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListB;
    }

    public static Drawable e(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableBJ;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableBJ = byi.bJ(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableBJ;
    }

    public static int f(Context context, int i, int i2) {
        TypedValue typedValueG = g(context, i);
        return (typedValueG == null || typedValueG.type != 16) ? i2 : typedValueG.data;
    }

    public static TypedValue g(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue h(Context context, int i, String str) {
        TypedValue typedValueG = g(context, i);
        if (typedValueG != null) {
            return typedValueG;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static boolean i(Context context, int i, boolean z) {
        TypedValue typedValueG = g(context, i);
        return (typedValueG == null || typedValueG.type != 18) ? z : typedValueG.data != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [rso] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static rsf j(String str, rsi rsiVar, boolean z) {
        boolean z2;
        ?? r0;
        rso rsoVarG;
        rsn rsnVarA = rsa.a();
        Object obj = rsnVarA.b;
        if (obj == rse.a) {
            r0 = 0;
            rsa.c(rsnVarA, null);
            z2 = true;
        } else {
            z2 = false;
            r0 = obj;
        }
        boolean z3 = z2;
        if (r0 == 0) {
            UUID uuidB = rsb.a.b();
            String strFv = rrq.fv(uuidB);
            rrr rrrVar = rsc.a;
            scn scnVarD = rsa.d();
            if (!scnVarD.isEmpty()) {
                Iterable$EL.forEach(scnVarD, new lig(13));
            }
            rsoVarG = new rsd(uuidB, strFv, str, rsiVar, rrrVar, z, rsnVarA);
        } else {
            rsoVarG = r0 instanceof rrt ? ((rrt) r0).g(str, rsiVar, z, rsnVarA) : r0.k(str, rsiVar, rsnVarA);
        }
        rsa.c(rsnVarA, rsoVarG);
        return new rsf(rsoVarG, z3);
    }

    public static rsf k(String str) {
        return j(str, rsh.a, true);
    }

    public static RectF l(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.w || !(view instanceof rpp)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        rpp rppVar = (rpp) view;
        View[] viewArr = {rppVar.a, rppVar.b, null};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view2 = viewArr[i];
            if (view2 != null && view2.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view2.getLeft()) : view2.getLeft();
                iMax = z ? Math.max(iMax, view2.getRight()) : view2.getRight();
                z = true;
            }
        }
        int i2 = iMax - iMin;
        View[] viewArr2 = {rppVar.a, rppVar.b, null};
        int iMax2 = 0;
        int iMin2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view3 = viewArr2[i3];
            if (view3 != null && view3.getVisibility() == 0) {
                iMin2 = z2 ? Math.min(iMin2, view3.getTop()) : view3.getTop();
                iMax2 = z2 ? Math.max(iMax2, view3.getBottom()) : view3.getBottom();
                z2 = true;
            }
        }
        int i4 = iMax2 - iMin2;
        int iH = (int) qpt.H(rppVar.getContext(), 24);
        if (i2 < iH) {
            i2 = iH;
        }
        int left = (rppVar.getLeft() + rppVar.getRight()) / 2;
        int top = (rppVar.getTop() + rppVar.getBottom()) / 2;
        int i5 = i2 / 2;
        return new RectF(left - i5, top - (i4 / 2), left + i5, (left / 2) + top);
    }

    public static void n(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof rnx) {
            ((rnx) background).l(f);
        }
    }

    public static void o(View view) {
        Drawable background = view.getBackground();
        if (background instanceof rnx) {
            p(view, (rnx) background);
        }
    }

    public static void p(View view, rnx rnxVar) {
        rkg rkgVar = rnxVar.a.c;
        if (rkgVar == null || !rkgVar.a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        rnv rnvVar = rnxVar.a;
        if (rnvVar.o != elevation) {
            rnvVar.o = elevation;
            rnxVar.t();
        }
    }

    public static rnt q(int i) {
        return i != 1 ? new roa() : new rns();
    }

    public static int r(boolean z) {
        return z ? 2 : 1;
    }

    public static void s(boolean z) {
        if (!z) {
            throw new rxd();
        }
    }

    public static void t(boolean z, String str, Object obj) {
        if (!z) {
            throw new rxd(z(str, obj));
        }
    }

    public static void u(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new rxd(z(str, objArr));
        }
    }

    public static void v(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new rxd(z(str, obj, obj2));
        }
    }

    public static void w(Object obj, String str, Object... objArr) {
        if (obj == null) {
            throw new rxd(z(str, objArr));
        }
    }

    public static void x(Object obj) {
        w(obj, "expected a non-null reference", new Object[0]);
    }

    public static rww y(rww rwwVar) {
        return ((rwwVar instanceof rwy) || (rwwVar instanceof rwx)) ? rwwVar : rwwVar instanceof Serializable ? new rwx(rwwVar) : new rwy(rwwVar);
    }

    public static String z(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    string = "<" + str2 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public void a(rok rokVar, float f, float f2) {
    }

    public void m(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFL = l(tabLayout, view);
        RectF rectFL2 = l(tabLayout, view2);
        drawable.setBounds(rhn.b((int) rectFL.left, (int) rectFL2.left, f), drawable.getBounds().top, rhn.b((int) rectFL.right, (int) rectFL2.right, f), drawable.getBounds().bottom);
    }

    public rnt(byte[] bArr) {
    }

    public static String ac(Object obj, Object obj2, Object... objArr) {
        return Z(new rvy(objArr, obj, obj2), LmJPKwPBa.VRJPjN);
    }

    public static Object am(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException(PNlJufQ.ipZcCSJdimamlsW);
    }
}
