package defpackage;

import com.google.googlex.gcam.CroppedGrayMap;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.PixelRect;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ske {
    public static syw A(ExecutorService executorService) {
        return executorService instanceof syw ? (syw) executorService : executorService instanceof ScheduledExecutorService ? new szc((ScheduledExecutorService) executorService) : new syz(executorService);
    }

    public static syx B(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof syx ? (syx) scheduledExecutorService : new szc(scheduledExecutorService);
    }

    public static Executor C(final Executor executor, final swn swnVar) {
        executor.getClass();
        return executor == sxo.a ? executor : new Executor() { // from class: syy
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                ske.D(executor, swnVar, runnable);
            }
        };
    }

    public static /* synthetic */ void D(Executor executor, swn swnVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            swnVar.a(e);
        }
    }

    public static syj E(Iterable iterable) {
        return new syj(false, sbp.i(iterable));
    }

    @SafeVarargs
    public static syj F(syu... syuVarArr) {
        return new syj(false, sbp.k(syuVarArr));
    }

    public static syj G(Iterable iterable) {
        return new syj(true, sbp.i(iterable));
    }

    @SafeVarargs
    public static syj H(syu... syuVarArr) {
        return new syj(true, sbp.k(syuVarArr));
    }

    public static syu I(Iterable iterable) {
        return new sxj(sbp.i(iterable), true);
    }

    @SafeVarargs
    public static syu J(syu... syuVarArr) {
        return new sxj(sbp.k(syuVarArr), true);
    }

    public static syu K() {
        syo syoVar = syo.a;
        return syoVar != null ? syoVar : new syo();
    }

    public static syu L(Throwable th) {
        th.getClass();
        return new syp(th);
    }

    public static syu M(Object obj) {
        return obj == null ? syq.a : new syq(obj);
    }

    public static syu N(syu syuVar) {
        if (syuVar.isDone()) {
            return syuVar;
        }
        sym symVar = new sym(syuVar);
        syuVar.c(symVar, sxo.a);
        return symVar;
    }

    public static syu O(sxh sxhVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        szo szoVar = new szo(sxhVar);
        szoVar.c(new smv(scheduledExecutorService.schedule(szoVar, j, timeUnit), 2), sxo.a);
        return szoVar;
    }

    public static syu P(Runnable runnable, Executor executor) {
        szo szoVarG = szo.g(runnable, null);
        executor.execute(szoVarG);
        return szoVarG;
    }

    public static syu Q(Callable callable, Executor executor) {
        szo szoVar = new szo(callable);
        executor.execute(szoVar);
        return szoVar;
    }

    public static syu R(sxh sxhVar, Executor executor) {
        szo szoVar = new szo(sxhVar);
        executor.execute(szoVar);
        return szoVar;
    }

    public static syu S(Iterable iterable) {
        return new sxj(sbp.i(iterable), false);
    }

    public static syu T(syu syuVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (syuVar.isDone()) {
            return syuVar;
        }
        szl szlVar = new szl(syuVar);
        szj szjVar = new szj(szlVar);
        szlVar.b = scheduledExecutorService.schedule(szjVar, j, timeUnit);
        syuVar.c(szjVar, sxo.a);
        return szlVar;
    }

    public static Object U(Future future) {
        rnt.O(future.isDone(), "Future was expected to be done: %s", future);
        return a.H(future);
    }

    public static Object V(Future future) {
        future.getClass();
        try {
            return a.H(future);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new sxq((Error) e.getCause());
            }
            throw new szp(e.getCause());
        }
    }

    public static void W(syu syuVar, syf syfVar, Executor executor) {
        syfVar.getClass();
        syuVar.c(new syg(syuVar, syfVar), executor);
    }

    public static void X(syu syuVar, Future future) {
        if (syuVar instanceof swn) {
            ((swn) syuVar).p(future);
        } else {
            if (syuVar == null || !syuVar.isCancelled() || future == null) {
                return;
            }
            future.cancel(false);
        }
    }

    public static int Y(long j) {
        int i = (int) j;
        rnt.E(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int Z(int i, int i2, int i3) {
        rnt.G(i2 <= i3, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    public static int aA(int i, int i2, int i3) {
        return cb(cb(i, i3) - cb(i2, i3), i3);
    }

    public static uhu aB(Enum[] enumArr) {
        enumArr.getClass();
        return new uhv(enumArr);
    }

    public static Object aC(uiu uiuVar, Object obj, uhb uhbVar) {
        uiuVar.getClass();
        uhf uhfVarQ = uhbVar.q();
        Object uhlVar = uhfVarQ == uhg.a ? new uhl(uhbVar) : new uhm(uhbVar, uhfVarQ);
        ukc.e(uiuVar, 2);
        return uiuVar.a(obj, uhlVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static uhb aD(uiu uiuVar, Object obj, uhb uhbVar) {
        uiuVar.getClass();
        if (uiuVar instanceof uhn) {
            return ((uhn) uiuVar).c(obj, uhbVar);
        }
        uhf uhfVarQ = uhbVar.q();
        return uhfVarQ == uhg.a ? new uhj(uhbVar, uiuVar, obj) : new uhk(uhbVar, uhfVarQ, uiuVar, obj);
    }

    public static uhb aE(uhb uhbVar) {
        uhbVar.getClass();
        uhp uhpVar = uhbVar instanceof uhp ? (uhp) uhbVar : null;
        if (uhpVar != null && (uhbVar = uhpVar.n) == null) {
            uhc uhcVar = (uhc) uhpVar.q().get(uhc.k);
            uhbVar = uhcVar != null ? uhcVar.fJ(uhpVar) : uhpVar;
            uhpVar.n = uhbVar;
        }
        return uhbVar;
    }

    public static Object aF(uhd uhdVar, Object obj, uiu uiuVar) {
        uiuVar.getClass();
        return uiuVar.a(obj, uhdVar);
    }

    public static uhd aG(uhd uhdVar, uhe uheVar) {
        uheVar.getClass();
        if (a.ao(uhdVar.getKey(), uheVar)) {
            return uhdVar;
        }
        return null;
    }

    public static uhf aH(uhd uhdVar, uhe uheVar) {
        uheVar.getClass();
        return a.ao(uhdVar.getKey(), uheVar) ? uhg.a : uhdVar;
    }

    public static uhf aI(uhd uhdVar, uhf uhfVar) {
        uhfVar.getClass();
        return aJ(uhdVar, uhfVar);
    }

    public static uhf aJ(uhf uhfVar, uhf uhfVar2) {
        uhfVar2.getClass();
        return uhfVar2 == uhg.a ? uhfVar : (uhf) uhfVar2.fold(uhfVar, new ane(9));
    }

    public static int aK(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int aL(int i) {
        return Integer.highestOneBit(ukc.n(i, 1) * 3);
    }

    public static int aM(int i) {
        return Integer.numberOfLeadingZeros(i) + 1;
    }

    public static int aN(Object[] objArr, int i, int i2) {
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i + i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public static String aO(Object[] objArr, int i, int i2, Collection collection) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void aP(Object[] objArr, int i) {
        objArr.getClass();
        objArr[i] = null;
    }

    public static void aQ(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            aP(objArr, i);
            i++;
        }
    }

    public static boolean aR(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!a.ao(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static Object[] aS(int i) {
        if (i >= 0) {
            return new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static Object[] aT(Object[] objArr, int i) {
        objArr.getClass();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i);
        objArrCopyOf.getClass();
        return objArrCopyOf;
    }

    public static Set aU(Set set) {
        ((ugw) set).b.e();
        return ((ufr) set).a() > 0 ? set : ugw.a;
    }

    public static Set aV(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    public static Set aW(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(aZ(1));
        rnt.aI(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Set aX(Object obj) {
        return obj != null ? aV(obj) : ufy.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set aY(Set set, Iterable iterable) {
        if (iterable.isEmpty()) {
            return bQ(set);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (!iterable.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static int aZ(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i >= 1073741824) {
            return Integer.MAX_VALUE;
        }
        return (int) ((i / 0.75f) + 1.0f);
    }

    public static int aa(byte[] bArr) {
        int length = bArr.length;
        rnt.G(length >= 4, "array too small: %s < %s", length, 4);
        return ab(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int ab(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int ac(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int ad(int... iArr) {
        a.I(true);
        int i = iArr[0];
        for (int i2 = 1; i2 < 4; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public static int ae(int... iArr) {
        a.I(true);
        int i = iArr[0];
        for (int i2 = 1; i2 < 4; i2++) {
            int i3 = iArr[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public static int af(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static List ag(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new svy(iArr, 0, length);
    }

    public static byte[] ah(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static int[] ai(Collection collection) {
        if (collection instanceof svy) {
            svy svyVar = (svy) collection;
            return Arrays.copyOfRange(svyVar.a, svyVar.b, svyVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static float aj(float f, float f2, float f3) {
        if (f2 <= f3) {
            return Math.min(Math.max(f, f2), f3);
        }
        throw new IllegalArgumentException(rnt.z("min (%s) must be less than or equal to max (%s)", Float.valueOf(f2), Float.valueOf(f3)));
    }

    public static int ak(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static List al(float... fArr) {
        int length = fArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new svw(fArr, 0, length);
    }

    public static float[] am(Collection collection) {
        if (collection instanceof svw) {
            svw svwVar = (svw) collection;
            return Arrays.copyOfRange(svwVar.a, svwVar.b, svwVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            fArr[i] = ((Number) obj).floatValue();
        }
        return fArr;
    }

    public static void an(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j + ", " + j2 + ")");
    }

    public static void ao(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void ap(String str, long j) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static int aq(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (svt.a[roundingMode.ordinal()]) {
            case 1:
                ao(false);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i3 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i3;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }

    public static int ar(int i, RoundingMode roundingMode) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.bE(i, "x (", ") must be > 0"));
        }
        switch (svt.a[roundingMode.ordinal()]) {
            case 1:
                ao(((i + (-1)) & i) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static int as(int i, int i2) {
        return af(i + i2);
    }

    public static /* synthetic */ ocq at(tpc tpcVar) {
        tpcVar.getClass();
        return new ocq(tpcVar);
    }

    public static Iterator au(Object[] objArr) {
        objArr.getClass();
        return new uje(objArr);
    }

    public static Class av(ukx ukxVar) {
        ukxVar.getClass();
        return ((ujh) ukxVar).a();
    }

    public static ukx ax(Class cls) {
        cls.getClass();
        int i = ukb.a;
        return new uji(cls);
    }

    public static void ay(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                ujk.f(th, th2);
            }
        }
    }

    public static Object bA(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return bB((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object bB(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object bC(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object bD(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object bE(List list, int i) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static Object bF(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(bk(list));
    }

    public static Object bG(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Object bH(List list) {
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List bI(Iterable iterable) {
        iterable.getClass();
        return bN(new LinkedHashSet((Collection) iterable));
    }

    public static List bJ(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            bT(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List bK(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List bL(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listBO = bO(iterable);
            br(listBO);
            return listBO;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return bN(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return rnt.ae(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List bM(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        if (iterable.size() <= 1) {
            return bN(iterable);
        }
        Object[] array = iterable.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return rnt.ae(array);
    }

    public static List bN(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listBO = bO(iterable);
            int size = listBO.size();
            return size != 0 ? size != 1 ? listBO : bj(listBO.get(0)) : ufw.a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return ufw.a;
        }
        if (size2 != 1) {
            return bP(collection);
        }
        return bj(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static List bO(Iterable iterable) {
        if (iterable instanceof Collection) {
            return bP((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        bY(iterable, arrayList);
        return arrayList;
    }

    public static List bP(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static Set bQ(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            bY(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : aV(linkedHashSet.iterator().next()) : ufy.a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return ufy.a;
        }
        if (size2 == 1) {
            return aV(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(aZ(collection.size()));
        bY(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static boolean bR(Iterable iterable, Object obj) {
        int iIndexOf;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    bp();
                }
                if (a.ao(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
        }
        iIndexOf = ((List) iterable).indexOf(obj);
        return iIndexOf >= 0;
    }

    public static float[] bS(Collection collection) {
        collection.getClass();
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static void bT(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static /* synthetic */ int bU(List list, Comparable comparable) {
        int size = list.size();
        bW(list.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iAK = aK((Comparable) list.get(i3), comparable);
            if (iAK < 0) {
                i2 = i3 + 1;
            } else {
                if (iAK <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static void bV(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, uiq uiqVar) throws IOException {
        appendable.append(charSequence2);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > 0) {
                i = 0;
                break;
            }
            a.F(appendable, next, uiqVar);
        }
        if (i >= 0 && i2 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static void bW(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(a.bE(i2, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i2 > i) {
            throw new IndexOutOfBoundsException(a.bD(i, i2, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static void bX(int i, Object[] objArr) {
        if (i < objArr.length) {
            objArr[i] = null;
        }
    }

    public static void bY(Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static Map ba(uev uevVar) {
        uevVar.getClass();
        Map mapSingletonMap = Collections.singletonMap(uevVar.a, uevVar.b);
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static Object bb(Map map, Object obj) {
        map.getClass();
        if (map instanceof uge) {
            return ((uge) map).a();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException(a.bz(obj, "Key ", " is missing in the map."));
    }

    public static Map bc(uev... uevVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(aZ(uevVarArr.length));
        for (uev uevVar : uevVarArr) {
            linkedHashMap.put(uevVar.a, uevVar.b);
        }
        return linkedHashMap;
    }

    public static Map bd(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map be(Map map, uev uevVar) {
        if (map.isEmpty()) {
            return ba(uevVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(uevVar.a, uevVar.b);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map bf(Iterable iterable) {
        int size = iterable.size();
        if (size == 0) {
            return ufx.a;
        }
        if (size == 1) {
            return ba((uev) iterable.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(aZ(iterable.size()));
        bh(linkedHashMap, iterable);
        return linkedHashMap;
    }

    public static Map bg(Map map) {
        int size = map.size();
        if (size == 0) {
            return ufx.a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static void bh(Map map, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            uev uevVar = (uev) it.next();
            map.put(uevVar.a, uevVar.b);
        }
    }

    public static List bi(List list) {
        ugl uglVar = (ugl) list;
        uglVar.h();
        uglVar.d = true;
        return uglVar.c > 0 ? list : ugl.a;
    }

    public static List bj(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static int bk(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static ArrayList bl(Object... objArr) {
        return new ArrayList(new uft(objArr, true));
    }

    public static List bm(Object obj) {
        return obj != null ? bj(obj) : ufw.a;
    }

    public static List bn(Object... objArr) {
        return new ArrayList(new uft(objArr, true));
    }

    public static ukv bo(Collection collection) {
        return new ukv(0, collection.size() - 1);
    }

    public static void bp() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static int bq(Iterable iterable, int i) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static void br(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void bs(List list, Comparator comparator) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static Object bt(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(bk(list));
    }

    public static int bu(List list, int i) {
        return bk(list) - i;
    }

    public static List bv(List list) {
        list.getClass();
        return new ugg(list);
    }

    public static float bw(Iterable iterable) {
        Iterator it = iterable.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += ((Number) it.next()).floatValue();
        }
        return fFloatValue;
    }

    public static int bx(List list, Object obj) {
        list.getClass();
        return list.indexOf(obj);
    }

    public static Float by(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Float bz(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static /* synthetic */ String ca(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, uiq uiqVar, int i) throws IOException {
        iterable.getClass();
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        CharSequence charSequence4 = charSequence;
        charSequence4.getClass();
        CharSequence charSequence5 = (i & 2) != 0 ? "" : charSequence2;
        charSequence5.getClass();
        CharSequence charSequence6 = (i & 4) != 0 ? "" : charSequence3;
        charSequence6.getClass();
        CharSequence charSequence7 = (i & 16) != 0 ? "..." : null;
        charSequence7.getClass();
        StringBuilder sb = new StringBuilder();
        bV(iterable, sb, charSequence4, charSequence5, charSequence6, (i & 8) != 0 ? -1 : 0, charSequence7, (i & 32) != 0 ? null : uiqVar);
        return sb.toString();
    }

    private static int cb(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    public static String d(String str, String str2, boolean z) {
        if (str.length() + str2.length() > 23) {
            int i = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char cCharAt = str2.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str2 = str2.substring(i + 1);
        }
        String strConcat = str.concat(String.valueOf(str2));
        return !z ? strConcat : strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    public static int e(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static void f(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void g(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static boolean h(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public static int i(int i) {
        return a.ah(i);
    }

    public static int j(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        switch (i) {
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 15;
            case 15:
                return 16;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int k(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 15;
            case 15:
                return 16;
            default:
                return 0;
        }
    }

    public static /* synthetic */ boolean l(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Stream m() {
        return IntStream.CC.iterate(0, new sna(0)).boxed();
    }

    public static int n(tcd tcdVar) {
        return GcamModuleJNI.ImageRotationToDegrees(tcdVar.j);
    }

    public static tcd o(int i) {
        return tcd.a(GcamModuleJNI.DegreesToImageRotation(i));
    }

    public static void p(byte[] bArr, FrameMetadata frameMetadata) {
        GcamModuleJNI.AddPortraitMapMetadata(bArr, FrameMetadata.c(frameMetadata), frameMetadata);
    }

    public static void q(PixelRect pixelRect, FrameMetadata frameMetadata) {
        GcamModuleJNI.ApplySensorCropping(PixelRect.g(pixelRect), pixelRect, FrameMetadata.c(frameMetadata), frameMetadata);
    }

    public static void r(ShotMetadata shotMetadata, tcb tcbVar) {
        GcamModuleJNI.SetThermalState(ShotMetadata.a(shotMetadata), shotMetadata, tcbVar.j);
    }

    public static boolean s(tcq tcqVar) {
        return GcamModuleJNI.IsRgb8(tcqVar.k);
    }

    public static boolean t(tcx tcxVar, long j, CroppedGrayMap croppedGrayMap) {
        return GcamModuleJNI.SaliencyMapFromVendorTagBytes(tcx.a(tcxVar), j, CroppedGrayMap.a(croppedGrayMap), croppedGrayMap);
    }

    public static void u(FrameMetadata frameMetadata) {
        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.c(frameMetadata), frameMetadata);
    }

    public static void v(ShotMetadata shotMetadata) {
        GcamModuleJNI.FlipHdrGainMapHorizontal(ShotMetadata.a(shotMetadata), shotMetadata);
    }

    public static void w(ShotMetadata shotMetadata, int i) {
        GcamModuleJNI.RotateShotMetadata__SWIG_1(ShotMetadata.a(shotMetadata), shotMetadata, i);
    }

    public static void x() {
        Thread.currentThread().interrupt();
    }

    public static void y(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static void z(Throwable th) {
        if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
            throw ((Error) th);
        }
    }

    public sij a() {
        return sii.a;
    }

    public skl b() {
        return skl.b;
    }

    public void c(String str, Level level, boolean z) {
    }

    public static Class aw(ukx ukxVar) {
        String name;
        ukxVar.getClass();
        Class clsA = ((ujh) ukxVar).a();
        if (clsA.isPrimitive() && (name = clsA.getName()) != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    return clsA;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    return clsA;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    return clsA;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    return clsA;
                case 3327612:
                    if (name.equals(pAAtrB.geUz)) {
                        return Long.class;
                    }
                    return clsA;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    return clsA;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    return clsA;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    return clsA;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    return clsA;
                default:
                    return clsA;
            }
        }
        return clsA;
    }
}
