package j$.desugar.sun.nio.fs;

import j$.nio.file.C0008b;
import j$.nio.file.C0009c;
import j$.nio.file.LinkOption;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.FileAttribute;
import j$.nio.file.attribute.u;
import j$.nio.file.attribute.y;
import j$.time.ZoneOffset;
import j$.time.chrono.A;
import j$.time.chrono.AbstractC0017a;
import j$.time.chrono.AbstractC0024h;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.G;
import j$.time.chrono.InterfaceC0018b;
import j$.time.chrono.InterfaceC0025i;
import j$.time.chrono.s;
import j$.time.chrono.v;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.util.C;
import j$.util.C0127w;
import j$.util.C0128x;
import j$.util.C0129y;
import j$.util.I;
import j$.util.InterfaceC0126v;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.g0;
import java.nio.file.CopyOption;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public abstract class g {
    public static u A(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        long millis = fileTime.toMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return new u(millis);
    }

    public static FileTime B(u uVar) {
        long nano;
        if (uVar == null) {
            return null;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit != null) {
            nano = timeUnit.toMillis(uVar.a);
        } else {
            long epochSecond = uVar.b.getEpochSecond();
            long j = epochSecond * 1000;
            nano = (((Math.abs(epochSecond) | 1000) >>> 31) == 0 || j / 1000 == epochSecond) ? (uVar.b.getNano() / 1000000) + j : epochSecond < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return FileTime.fromMillis(nano);
    }

    public static void C(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC0126v) {
            ((InterfaceC0126v) it).forEachRemaining(consumer);
            return;
        }
        consumer.getClass();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static j$.time.chrono.l D(TemporalAccessor temporalAccessor) {
        Objects.a(temporalAccessor, "temporal");
        return (j$.time.chrono.l) Objects.requireNonNullElse((j$.time.chrono.l) temporalAccessor.N(j$.time.temporal.m.b), s.c);
    }

    public static boolean E(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return false;
        }
        Object next = set.iterator().next();
        return (next instanceof y) || j$.adapter.b.t(next);
    }

    public static /* synthetic */ long F(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ String G(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "/");
            }
        }
        return sb.toString();
    }

    public static List H(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Set I(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static FileAttribute[] J(java.nio.file.attribute.FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        FileAttribute[] fileAttributeArr2 = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            java.nio.file.attribute.FileAttribute fileAttribute = fileAttributeArr[i];
            fileAttributeArr2[i] = fileAttribute == null ? null : E(fileAttribute.value()) ? new h(2, fileAttribute) : fileAttribute instanceof j$.nio.file.attribute.k ? ((j$.nio.file.attribute.k) fileAttribute).a : new j$.nio.file.attribute.j(fileAttribute);
        }
        return fileAttributeArr2;
    }

    public static /* synthetic */ CopyOption[] K(j$.nio.file.CopyOption[] copyOptionArr) {
        CopyOption c0009c;
        if (copyOptionArr == null) {
            return null;
        }
        int length = copyOptionArr.length;
        CopyOption[] copyOptionArr2 = new CopyOption[length];
        for (int i = 0; i < length; i++) {
            j$.nio.file.CopyOption copyOption = copyOptionArr[i];
            if (copyOption == null) {
                c0009c = null;
            } else if (copyOption instanceof C0008b) {
                c0009c = ((C0008b) copyOption).a;
            } else if (copyOption instanceof LinkOption) {
                c0009c = java.nio.file.LinkOption.NOFOLLOW_LINKS;
            } else if (copyOption instanceof StandardCopyOption) {
                StandardCopyOption standardCopyOption = (StandardCopyOption) copyOption;
                c0009c = standardCopyOption == StandardCopyOption.REPLACE_EXISTING ? java.nio.file.StandardCopyOption.REPLACE_EXISTING : standardCopyOption == StandardCopyOption.COPY_ATTRIBUTES ? java.nio.file.StandardCopyOption.COPY_ATTRIBUTES : java.nio.file.StandardCopyOption.ATOMIC_MOVE;
            } else {
                c0009c = new C0009c(copyOption);
            }
            copyOptionArr2[i] = c0009c;
        }
        return copyOptionArr2;
    }

    public static java.nio.file.attribute.FileAttribute[] L(FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        java.nio.file.attribute.FileAttribute[] fileAttributeArr2 = new java.nio.file.attribute.FileAttribute[length];
        for (int i = 0; i < length; i++) {
            FileAttribute fileAttribute = fileAttributeArr[i];
            fileAttributeArr2[i] = fileAttribute == null ? null : E(fileAttribute.value()) ? new j$.nio.file.attribute.l(fileAttribute) : fileAttribute instanceof j$.nio.file.attribute.j ? ((j$.nio.file.attribute.j) fileAttribute).a : new j$.nio.file.attribute.k(fileAttribute);
        }
        return fileAttributeArr2;
    }

    public static /* synthetic */ long M(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long N(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long O(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j >= 0) | (j2 != Long.MIN_VALUE)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long P(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static String Q(Object obj, Object obj2) {
        String string;
        String string2;
        String str = "null";
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static char R(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    public static j$.time.chrono.l S(String str) {
        ConcurrentHashMap concurrentHashMap = AbstractC0017a.a;
        Objects.a(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = AbstractC0017a.a;
            j$.time.chrono.l lVar = (j$.time.chrono.l) concurrentHashMap2.get(str);
            if (lVar == null) {
                lVar = (j$.time.chrono.l) AbstractC0017a.b.get(str);
            }
            if (lVar != null) {
                return lVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                Iterator it = ServiceLoader.load(j$.time.chrono.l.class).iterator();
                while (it.hasNext()) {
                    j$.time.chrono.l lVar2 = (j$.time.chrono.l) it.next();
                    if (str.equals(lVar2.f()) || str.equals(lVar2.o())) {
                        return lVar2;
                    }
                }
                throw new j$.time.b("Unknown chronology: ".concat(str));
            }
            j$.time.chrono.o oVar = j$.time.chrono.o.l;
            oVar.getClass();
            AbstractC0017a.h(oVar, "Hijrah-umalqura");
            v vVar = v.c;
            vVar.getClass();
            AbstractC0017a.h(vVar, "Japanese");
            A a = A.c;
            a.getClass();
            AbstractC0017a.h(a, "Minguo");
            G g = G.c;
            g.getClass();
            AbstractC0017a.h(g, "ThaiBuddhist");
            try {
                for (AbstractC0017a abstractC0017a : Arrays.asList(new AbstractC0017a[0])) {
                    if (!abstractC0017a.f().equals("ISO")) {
                        AbstractC0017a.h(abstractC0017a, abstractC0017a.f());
                    }
                }
                s sVar = s.c;
                sVar.getClass();
                AbstractC0017a.h(sVar, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static Temporal a(InterfaceC0018b interfaceC0018b, Temporal temporal) {
        return temporal.a(interfaceC0018b.E(), j$.time.temporal.a.EPOCH_DAY);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.c] */
    public static j$.util.function.c b(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        doubleConsumer2.getClass();
        return new DoubleConsumer() { // from class: j$.util.function.c
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                doubleConsumer.accept(d);
                doubleConsumer2.accept(d);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.i] */
    public static j$.util.function.i c(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        longConsumer2.getClass();
        return new LongConsumer() { // from class: j$.util.function.i
            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                longConsumer.accept(j);
                longConsumer2.accept(j);
            }

            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.desugar.sun.nio.fs.g.c(this, longConsumer3);
            }
        };
    }

    public static int d(InterfaceC0018b interfaceC0018b, InterfaceC0018b interfaceC0018b2) {
        int iCompare = Long.compare(interfaceC0018b.E(), interfaceC0018b2.E());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC0017a) interfaceC0018b.getChronology()).f().compareTo(interfaceC0018b2.getChronology().f());
    }

    public static int e(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
        int iL = chronoLocalDateTime.toLocalDate().L(chronoLocalDateTime2.toLocalDate());
        return (iL == 0 && (iL = chronoLocalDateTime.toLocalTime().compareTo(chronoLocalDateTime2.toLocalTime())) == 0) ? ((AbstractC0017a) chronoLocalDateTime.getChronology()).f().compareTo(chronoLocalDateTime2.getChronology().f()) : iL;
    }

    public static int f(InterfaceC0025i interfaceC0025i, InterfaceC0025i interfaceC0025i2) {
        int iCompare = Long.compare(interfaceC0025i.toEpochSecond(), interfaceC0025i2.toEpochSecond());
        return (iCompare == 0 && (iCompare = interfaceC0025i.toLocalTime().d - interfaceC0025i2.toLocalTime().d) == 0 && (iCompare = interfaceC0025i.toLocalDateTime().I(interfaceC0025i2.toLocalDateTime())) == 0 && (iCompare = interfaceC0025i.getZone().f().compareTo(interfaceC0025i2.getZone().f())) == 0) ? ((AbstractC0017a) interfaceC0025i.getChronology()).f().compareTo(interfaceC0025i2.getChronology().f()) : iCompare;
    }

    public static void g(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        biConsumer.getClass();
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static void h(C c, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            c.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (g0.a) {
                g0.a(c.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            c.forEachRemaining((DoubleConsumer) new C0127w(consumer, 0));
        }
    }

    public static void i(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            ofInt.forEachRemaining((IntConsumer) consumer);
        } else {
            if (g0.a) {
                g0.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            ofInt.forEachRemaining((IntConsumer) new C0128x(consumer, 0));
        }
    }

    public static void j(I i, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            i.forEachRemaining((LongConsumer) consumer);
        } else {
            if (g0.a) {
                g0.a(i.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            i.forEachRemaining((LongConsumer) new C0129y(consumer, 0));
        }
    }

    public static int k(InterfaceC0025i interfaceC0025i, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.m.a(interfaceC0025i, lVar);
        }
        int i = AbstractC0024h.a[((j$.time.temporal.a) lVar).ordinal()];
        if (i != 1) {
            return i != 2 ? interfaceC0025i.toLocalDateTime().h(lVar) : interfaceC0025i.getOffset().b;
        }
        throw new j$.time.temporal.n("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int l(j$.time.chrono.m mVar, j$.time.temporal.l lVar) {
        return lVar == j$.time.temporal.a.ERA ? mVar.getValue() : j$.time.temporal.m.a(mVar, lVar);
    }

    public static long m(j$.time.chrono.m mVar, j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.ERA) {
            return mVar.getValue();
        }
        if (lVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
        }
        return lVar.l(mVar);
    }

    public static boolean n(InterfaceC0018b interfaceC0018b, j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) lVar).isDateBased() : lVar != null && lVar.h(interfaceC0018b);
    }

    public static boolean o(j$.time.chrono.m mVar, j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.ERA : lVar != null && lVar.h(mVar);
    }

    public static Object p(InterfaceC0018b interfaceC0018b, n nVar) {
        if (nVar == j$.time.temporal.m.a || nVar == j$.time.temporal.m.e || nVar == j$.time.temporal.m.d || nVar == j$.time.temporal.m.g) {
            return null;
        }
        return nVar == j$.time.temporal.m.b ? interfaceC0018b.getChronology() : nVar == j$.time.temporal.m.c ? ChronoUnit.DAYS : nVar.a(interfaceC0018b);
    }

    public static Object q(ChronoLocalDateTime chronoLocalDateTime, n nVar) {
        if (nVar == j$.time.temporal.m.a || nVar == j$.time.temporal.m.e || nVar == j$.time.temporal.m.d) {
            return null;
        }
        return nVar == j$.time.temporal.m.g ? chronoLocalDateTime.toLocalTime() : nVar == j$.time.temporal.m.b ? chronoLocalDateTime.getChronology() : nVar == j$.time.temporal.m.c ? ChronoUnit.NANOS : nVar.a(chronoLocalDateTime);
    }

    public static Object r(InterfaceC0025i interfaceC0025i, n nVar) {
        return (nVar == j$.time.temporal.m.e || nVar == j$.time.temporal.m.a) ? interfaceC0025i.getZone() : nVar == j$.time.temporal.m.d ? interfaceC0025i.getOffset() : nVar == j$.time.temporal.m.g ? interfaceC0025i.toLocalTime() : nVar == j$.time.temporal.m.b ? interfaceC0025i.getChronology() : nVar == j$.time.temporal.m.c ? ChronoUnit.NANOS : nVar.a(interfaceC0025i);
    }

    public static Object s(j$.time.chrono.m mVar, n nVar) {
        return nVar == j$.time.temporal.m.c ? ChronoUnit.ERAS : j$.time.temporal.m.c(mVar, nVar);
    }

    public static long t(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        return ((chronoLocalDateTime.toLocalDate().E() * 86400) + chronoLocalDateTime.toLocalTime().a0()) - zoneOffset.b;
    }

    public static long u(InterfaceC0025i interfaceC0025i) {
        return ((interfaceC0025i.toLocalDate().E() * 86400) + interfaceC0025i.toLocalTime().a0()) - interfaceC0025i.getOffset().b;
    }

    public static boolean v(C c, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return c.tryAdvance((DoubleConsumer) consumer);
        }
        if (g0.a) {
            g0.a(c.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return c.tryAdvance((DoubleConsumer) new C0127w(consumer, 0));
    }

    public static boolean w(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return ofInt.tryAdvance((IntConsumer) consumer);
        }
        if (g0.a) {
            g0.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return ofInt.tryAdvance((IntConsumer) new C0128x(consumer, 0));
    }

    public static boolean x(I i, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return i.tryAdvance((LongConsumer) consumer);
        }
        if (g0.a) {
            g0.a(i.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return i.tryAdvance((LongConsumer) new C0129y(consumer, 0));
    }

    public static String y(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static String z(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
