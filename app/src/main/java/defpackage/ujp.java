package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ujp {
    private ujp() {
    }

    public static /* synthetic */ List A(CharSequence charSequence, String[] strArr) {
        charSequence.getClass();
        int length = 0;
        String str = strArr[0];
        if (str.length() == 0) {
            ulm<ukv> ulmVar = new ulm(new ulq(charSequence, new aqh(rnt.ae(strArr), 5), 0), 0);
            ArrayList arrayList = new ArrayList(ske.bq(ulmVar, 10));
            for (ukv ukvVar : ulmVar) {
                ukvVar.getClass();
                arrayList.add(charSequence.subSequence(ukvVar.d().intValue(), ukvVar.c().intValue() + 1).toString());
            }
            return arrayList;
        }
        int iF = F(charSequence, str, 0);
        if (iF == -1) {
            return ske.bj(charSequence);
        }
        ArrayList arrayList2 = new ArrayList(10);
        do {
            arrayList2.add(charSequence.subSequence(length, iF).toString());
            length = str.length() + iF;
            iF = F(charSequence, str, length);
        } while (iF != -1);
        arrayList2.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList2;
    }

    public static /* synthetic */ boolean B(String str, String str2) {
        str.getClass();
        return str.startsWith(str2);
    }

    public static /* synthetic */ String C(String str) {
        str.getClass();
        str.getClass();
        int iV = v(str);
        if (iV == -1) {
            return str;
        }
        String strSubstring = str.substring(iV + 1, str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static String D(String str) {
        str.getClass();
        String strSubstring = str.substring(0, ukc.o(127, str.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public static /* synthetic */ String E(String str) throws IOException {
        String str2;
        if (r("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listQ = q(str);
        listQ.size();
        uiq uiqVarBr = br();
        int iBk = ske.bk(listQ);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listQ) {
            int i2 = i + 1;
            if (i < 0) {
                ske.bp();
            }
            String str3 = (String) obj;
            String strSubstring = null;
            if ((i == 0 || i == iBk) && r(str3)) {
                str3 = null;
            } else {
                int length = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (!I(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    str3.getClass();
                    if (str3.startsWith("|", i3)) {
                        str3.getClass();
                        strSubstring = str3.substring(i3 + 1);
                        strSubstring.getClass();
                    }
                }
                if (strSubstring != null && (str2 = (String) uiqVarBr.a(strSubstring)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(str.length());
        ske.bV(arrayList, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    public static int F(CharSequence charSequence, String str, int i) {
        str.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(str, i);
        }
        ukv ukvVar = new ukv(ukc.n(i, 0), ukc.o(charSequence.length(), charSequence.length()));
        int i2 = ukvVar.a;
        int i3 = ukvVar.b;
        int i4 = ukvVar.c;
        if ((i4 <= 0 || i2 > i3) && (i4 >= 0 || i3 > i2)) {
            return -1;
        }
        while (!H(str, 0, charSequence, i2, str.length())) {
            if (i2 == i3) {
                return -1;
            }
            i2 += i4;
        }
        return i2;
    }

    public static /* synthetic */ int G(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return F(charSequence, str, i);
    }

    public static boolean H(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        charSequence.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!J(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean I(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static boolean J(char c, char c2) {
        return c == c2;
    }

    public static final Iterator K(uiu uiuVar) {
        ulj uljVar = new ulj();
        uljVar.a = ske.aD(uiuVar, uljVar, uljVar);
        return uljVar;
    }

    public static uli L(uli uliVar) {
        return uliVar instanceof ule ? uliVar : new ule(uliVar);
    }

    public static List M(uli uliVar) {
        Iterator itA = uliVar.a();
        if (!itA.hasNext()) {
            return ufw.a;
        }
        Object next = itA.next();
        if (!itA.hasNext()) {
            return ske.bj(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (itA.hasNext()) {
            arrayList.add(itA.next());
        }
        return arrayList;
    }

    public static /* synthetic */ String N(int i) {
        return i != 1 ? i != 2 ? "null" : "DROP_OLDEST" : "SUSPEND";
    }

    public static final Object O(uhb uhbVar) {
        Object obj;
        uhf uhfVarQ = uhbVar.q();
        T(uhfVarQ);
        uhb uhbVarAE = ske.aE(uhbVar);
        uvg uvgVar = uhbVarAE instanceof uvg ? (uvg) uhbVarAE : null;
        if (uvgVar == null) {
            obj = ufg.a;
        } else {
            if (uvh.c(uvgVar.a, uhfVarQ)) {
                uvgVar.c(uhfVarQ, ufg.a);
            } else {
                ups upsVar = new ups();
                uhf uhfVarPlus = uhfVarQ.plus(upsVar);
                ufg ufgVar = ufg.a;
                uvgVar.c(uhfVarPlus, ufgVar);
                if (upsVar.a) {
                    boolean z = unf.a;
                    ThreadLocal threadLocal = upk.a;
                    unw unwVarA = upk.a();
                    if (unwVarA.q()) {
                        obj = ufg.a;
                    } else {
                        if (unwVarA.p()) {
                            uvgVar.c = ufgVar;
                            uvgVar.e = 1;
                            unwVarA.n(uvgVar);
                            obj = uhi.a;
                        } else {
                            unwVarA.o(true);
                            try {
                                uvgVar.run();
                                do {
                                } while (unwVarA.r());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            obj = ufg.a;
                        }
                    }
                }
            }
            obj = uhi.a;
        }
        uhi uhiVar = uhi.a;
        if (obj == uhiVar) {
            uhbVar.getClass();
        }
        return obj == uhiVar ? obj : ufg.a;
    }

    public static final Object P(uiu uiuVar, uhb uhbVar) {
        uph uphVar = new uph(uhbVar.q(), uhbVar);
        return ukc.V(uphVar, uphVar, uiuVar);
    }

    public static final unt Q(uol uolVar, boolean z, uoo uooVar) {
        return uolVar instanceof uov ? ((uov) uolVar).G(z, uooVar) : uolVar.p(uooVar.b(), z, new nrr(uooVar, 2, (char[]) null));
    }

    public static final uol R(uhf uhfVar) {
        uol uolVar = (uol) uhfVar.get(uol.c);
        if (uolVar != null) {
            return uolVar;
        }
        Objects.toString(uhfVar);
        throw new IllegalStateException("Current context doesn't contain Job in it: ".concat(String.valueOf(uhfVar)));
    }

    public static final void S(uhf uhfVar, CancellationException cancellationException) {
        uol uolVar = (uol) uhfVar.get(uol.c);
        if (uolVar != null) {
            uolVar.s(cancellationException);
        }
    }

    public static final void T(uhf uhfVar) {
        uol uolVar = (uol) uhfVar.get(uol.c);
        if (uolVar != null) {
            U(uolVar);
        }
    }

    public static final void U(uol uolVar) {
        if (!uolVar.t()) {
            throw uolVar.n();
        }
    }

    public static final boolean V(uhf uhfVar) {
        uol uolVar = (uol) uhfVar.get(uol.c);
        if (uolVar != null) {
            return uolVar.t();
        }
        return true;
    }

    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    public static boolean aA(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static ArrayList aB(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? new ArrayList((Collection) iterable) : aC(iterable.iterator());
    }

    public static ArrayList aC(Iterator it) {
        ArrayList arrayList = new ArrayList();
        aM(arrayList, it);
        return arrayList;
    }

    @SafeVarargs
    public static ArrayList aD(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        bq(length, "arraySize");
        ArrayList arrayList = new ArrayList(ske.af(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static ArrayList aE(int i) {
        bq(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List aF(List list) {
        return list instanceof sbp ? ((sbp) list).fB() : list instanceof sdl ? ((sdl) list).a : list instanceof RandomAccess ? new sdj(list) : new sdl(list);
    }

    public static List aG(List list, rvu rvuVar) {
        return list instanceof RandomAccess ? new sdn(list, rvuVar) : new sdp(list, rvuVar);
    }

    public static boolean aH(List list, Object obj) {
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!a.K(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it2.hasNext() || !a.K(it.next(), it2.next())) {
                    break;
                }
            } else if (!it2.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public static int aI(Iterator it, int i) {
        it.getClass();
        int i2 = 0;
        rnt.B(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static sgj aJ(Iterator it) {
        it.getClass();
        return it instanceof sgj ? (sgj) it : new sdc(it);
    }

    public static Iterator aK(Iterator it, rvu rvuVar) {
        rvuVar.getClass();
        return new sde(it, rvuVar);
    }

    public static void aL(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean aM(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static Object aN(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static rwc aO(Iterable iterable, rwe rweVar) {
        Iterator it = iterable.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (rweVar.a(next)) {
                return rwc.j(next);
            }
        }
        return rvk.a;
    }

    public static Iterable aP(Iterable iterable, rwe rweVar) {
        iterable.getClass();
        return new scy(iterable, rweVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object aQ(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            if (iterable.isEmpty()) {
                throw new NoSuchElementException();
            }
            return aR(iterable);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object aR(List list) {
        return list.get(list.size() - 1);
    }

    public static Object aS(Iterable iterable) {
        Iterator it = iterable.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean aT(Collection collection, Iterable iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : aM(collection, iterable.iterator());
    }

    public static Object[] aU(Iterable iterable) {
        return bs(iterable).toArray();
    }

    public static Object[] aV(Iterable iterable, Class cls) {
        return bs(iterable).toArray((Object[]) Array.newInstance((Class<?>) cls, 0));
    }

    public static void aW(Iterable iterable, rwe rweVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            bu((List) iterable, rweVar);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (rweVar.a(it.next())) {
                it.remove();
            }
        }
    }

    public static Object aX(Iterable iterable) {
        return aN(iterable.iterator());
    }

    public static final /* synthetic */ sbp aY(Collection collection) {
        collection.getClass();
        sbp sbpVarJ = sbp.j(collection);
        sbpVarJ.getClass();
        return sbpVarJ;
    }

    public static final /* synthetic */ scn aZ(Collection collection) {
        scn scnVarF = scn.F(collection);
        scnVarF.getClass();
        return scnVarF;
    }

    public static final una aa(Executor executor) {
        if ((executor instanceof unq ? (unq) executor : null) == null) {
            return new uoe(executor);
        }
        throw null;
    }

    public static final void ab(unp unpVar, uhb uhbVar, boolean z) {
        Object objL = unpVar.l();
        Throwable thO = unpVar.o(objL);
        Object objAM = thO != null ? rnt.aM(thO) : unpVar.k(objL);
        if (!z) {
            uhbVar.fW(objAM);
            return;
        }
        uvg uvgVar = (uvg) uhbVar;
        uhb uhbVar2 = uvgVar.b;
        Object obj = uvgVar.d;
        uhf uhfVarQ = uhbVar2.q();
        Object objB = uwe.b(uhfVarQ, obj);
        upp uppVarC = objB != uwe.a ? umy.c(uhbVar2, uhfVarQ, objB) : null;
        try {
            uhbVar2.fW(objAM);
            if (uppVarC == null || uppVarC.V()) {
                uwe.c(uhfVarQ, objB);
            }
        } catch (Throwable th) {
            if (uppVarC == null || uppVarC.V()) {
                uwe.c(uhfVarQ, objB);
            }
            throw th;
        }
    }

    public static final boolean ac(int i) {
        return i == 1 || i == 2;
    }

    public static /* synthetic */ boolean ad(int i, shd shdVar, StringBuilder sb) {
        if (i - 1 != 0 || shdVar == shd.a) {
            return false;
        }
        sb.append(shdVar.b());
        sb.append('.');
        sb.append(shdVar.d());
        sb.append(':');
        sb.append(shdVar.a());
        return true;
    }

    public static int ae(int i, sgg sggVar) {
        if (i - 1 != 0) {
            return 1;
        }
        return sggVar.b;
    }

    public static long af(int i, sgg sggVar) {
        if (i - 1 != 0) {
            if (sggVar == null) {
                return 0L;
            }
            return sggVar.c;
        }
        if (sggVar != null) {
            return sggVar.d;
        }
        return 0L;
    }

    public static Map.Entry ag(Map.Entry entry, Object obj) {
        if (entry == null) {
            return null;
        }
        return new sfs(entry, obj);
    }

    public static int ah(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static HashSet ai(int i) {
        return new HashSet(au(i));
    }

    public static NavigableSet aj(NavigableSet navigableSet) {
        return ((navigableSet instanceof sbe) || (navigableSet instanceof sfl)) ? navigableSet : new sfl(navigableSet);
    }

    public static Set ak() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static boolean al(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean am(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof sed) {
            collection = ((sed) collection).f();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return an(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean an(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static Object[] ao(Object[] objArr, int i) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i);
    }

    public static Object[] ap(Collection collection, Object[] objArr) {
        int size = collection.size();
        if (objArr.length < size) {
            objArr = ao(objArr, size);
        }
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    public static void aq(Object obj, int i) {
        if (obj == null) {
            throw new NullPointerException(a.bv(i, "at index "));
        }
    }

    public static void ar(Object... objArr) {
        as(objArr, objArr.length);
    }

    public static void as(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            aq(objArr[i2], i2);
        }
    }

    public static Iterator at(sed sedVar) {
        return new sej(sedVar, sedVar.g().iterator());
    }

    public static int au(int i) {
        if (i < 3) {
            bq(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static sbv av(Map map) {
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return sfc.a;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Enum r1 = (Enum) entry.getKey();
        Object value = entry.getValue();
        bo(r1, value);
        EnumMap enumMap = new EnumMap(Collections.singletonMap(r1, value));
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Enum r12 = (Enum) entry2.getKey();
            Object value2 = entry2.getValue();
            bo(r12, value2);
            enumMap.put((EnumMap) r12, (Enum) value2);
        }
        int size = enumMap.size();
        if (size == 0) {
            return sfc.a;
        }
        if (size != 1) {
            return new sbh(enumMap);
        }
        Map.Entry entry3 = (Map.Entry) aS(enumMap.entrySet());
        return sbv.n((Enum) entry3.getKey(), entry3.getValue());
    }

    public static sbv aw(Iterator it, rvu rvuVar, sbr sbrVar) {
        while (it.hasNext()) {
            Object next = it.next();
            sbrVar.f(rvuVar.apply(next), next);
        }
        try {
            return sbrVar.b();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    public static Object ax(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static Object ay(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static Map.Entry az(Map.Entry entry) {
        entry.getClass();
        return new sds(entry);
    }

    public static int b(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j != j2 ? 1 : 0;
    }

    public static int ba(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int bb(Object obj) {
        return ba(obj == null ? 0 : obj.hashCode());
    }

    public static int bc(int i) {
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= iHighestOneBit) {
            return iHighestOneBit;
        }
        int i2 = iHighestOneBit + iHighestOneBit;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    public static int bd(int i, int i2) {
        return i & (~i2);
    }

    public static int be(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static int bf(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    public static int bg(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int iBb = bb(obj);
        int i4 = iBb & i;
        int iBh = bh(obj3, i4);
        if (iBh == 0) {
            return -1;
        }
        int iBd = bd(iBb, i);
        int i5 = -1;
        while (true) {
            i2 = iBh - 1;
            int i6 = iArr[i2];
            i3 = i6 & i;
            if (bd(i6, i) == iBd && a.K(obj, objArr[i2]) && (objArr2 == null || a.K(obj2, objArr2[i2]))) {
                break;
            }
            if (i3 == 0) {
                return -1;
            }
            i5 = i2;
            iBh = i3;
        }
        if (i5 == -1) {
            bl(obj3, i4, i3);
            return i2;
        }
        iArr[i5] = be(iArr[i5], i3, i);
        return i2;
    }

    public static int bh(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static int bi(int i) {
        return Math.max(4, bc(i + 1));
    }

    public static Object bj(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(a.bv(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static void bk(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static void bl(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static StringBuilder bm(int i) {
        bq(i, "size");
        return new StringBuilder((int) Math.min(i * 8, 1073741824L));
    }

    public static boolean bn(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static void bo(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(String.valueOf(obj2))));
        }
        if (obj2 == null) {
            throw new NullPointerException(a.bx(obj, "null value in entry: ", "=null"));
        }
    }

    public static void bp(boolean z) {
        rnt.M(z, "no calls to next() since the last call to remove()");
    }

    public static void bq(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    private static uiq br() {
        return "".length() == 0 ? new nsc(4) : new ndd(17, (byte[]) null);
    }

    private static Collection bs(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : aC(iterable.iterator());
    }

    private static void bt(List list, rwe rweVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (rweVar.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    private static void bu(List list, rwe rweVar) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!rweVar.a(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        bt(list, rweVar, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        bt(list, rweVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    public static void c(String str) {
        uff uffVar = new uff(a.bw(str, "lateinit property ", " has not been initialized"));
        e(uffVar, ujp.class.getName());
        throw uffVar;
    }

    public static boolean d(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    static void e(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (true == str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static final String f(ujm ujmVar) {
        String string = ujmVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public static final long g(long j) {
        long j2 = uls.a;
        int i = ult.a;
        return j + j + 1;
    }

    public static final long h(long j) {
        return j * 1000000;
    }

    public static final long i(long j) {
        return j / 1000000;
    }

    public static final long j(int i, ulu uluVar) {
        uluVar.getClass();
        long j = i;
        if (uluVar.compareTo(ulu.d) > 0) {
            return k(j, uluVar);
        }
        long jE = ukc.E(j, uluVar, ulu.a);
        long j2 = uls.a;
        int i2 = ult.a;
        return jE + jE;
    }

    public static final long k(long j, ulu uluVar) {
        uluVar.getClass();
        ulu uluVar2 = ulu.a;
        long jE = ukc.E(4611686018426999999L, uluVar2, uluVar);
        if ((-jE) > j || j > jE) {
            return g(ukc.s(ukc.D(j, uluVar, ulu.c), -4611686018427387903L, 4611686018427387903L));
        }
        long jE2 = ukc.E(j, uluVar, uluVar2);
        long j2 = uls.a;
        int i = ult.a;
        return jE2 + jE2;
    }

    public static String l(String str) throws IOException {
        int length;
        Comparable comparable;
        List listQ = q(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (!r((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ske.bq(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!I(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listQ.size();
        uiq uiqVarBr = br();
        int iBk = ske.bk(listQ);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listQ) {
            int i = length + 1;
            if (length < 0) {
                ske.bp();
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iBk) && r(str3)) {
                str3 = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(a.bE(iIntValue, "Requested character count ", " is less than zero."));
                }
                String strSubstring = str3.substring(ukc.o(iIntValue, str3.length()));
                strSubstring.getClass();
                String str4 = (String) uiqVarBr.a(strSubstring);
                if (str4 != null) {
                    str3 = str4;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        ske.bV(arrayList3, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    public static int m(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static CharSequence n(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zI = I(charSequence.charAt(true != z ? i : length));
            if (z) {
                if (!zI) {
                    break;
                }
                length--;
            } else if (zI) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String o(String str, String str2, String str3) {
        int iG = G(str, str2, 0, 6);
        if (iG == -1) {
            return str3;
        }
        String strSubstring = str.substring(iG + str2.length(), str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static String p(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (str.charAt(i) != cArr[0]) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        return charSequenceSubSequence.toString();
    }

    public static List q(CharSequence charSequence) {
        return M(new coq(charSequence, 3));
    }

    public static boolean r(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!I(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char s(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(m(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static /* synthetic */ boolean t(CharSequence charSequence, CharSequence charSequence2) {
        return G(charSequence, (String) charSequence2, 0, 2) >= 0;
    }

    public static /* synthetic */ int u(CharSequence charSequence, char c, int i, int i2) {
        charSequence.getClass();
        boolean z = charSequence instanceof String;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if (z) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        int iN = ukc.n(i, 0);
        int iM = m(charSequence);
        if (iN > iM) {
            return -1;
        }
        while (!J(cArr[0], charSequence.charAt(iN))) {
            if (iN == iM) {
                return -1;
            }
            iN++;
        }
        return iN;
    }

    public static /* synthetic */ int v(CharSequence charSequence) {
        return ((String) charSequence).lastIndexOf(46, m(charSequence));
    }

    public static String w(String str, int i) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            if (length > 0) {
                int i2 = 1;
                while (true) {
                    sb.append(' ');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String x(String str, int i) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            if (length > 0) {
                int i2 = 1;
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ String y(String str) throws IOException {
        ulq ulqVar = new ulq(new coq(str, 3), new ndd(16), 1);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        uln ulnVar = new uln(ulqVar);
        int i = 0;
        while (ulnVar.hasNext()) {
            Object next = ulnVar.next();
            i++;
            if (i > 1) {
                sb.append((CharSequence) "\n");
            }
            a.F(sb, next, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static /* synthetic */ String z(String str, String str2, String str3) {
        str.getClass();
        int i = 0;
        int iF = F(str, str2, 0);
        if (iF < 0) {
            return str;
        }
        int length = str2.length();
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, iF);
            sb.append(str3);
            i = iF + length;
            if (iF >= str.length()) {
                break;
            }
            iF = F(str, str2, iF + ukc.n(length, 1));
        } while (iF > 0);
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }
}
