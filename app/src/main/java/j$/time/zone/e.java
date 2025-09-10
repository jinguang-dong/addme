package j$.time.zone;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class e implements Serializable {
    public static final long[] i = new long[0];
    public static final d[] j = new d[0];
    public static final LocalDateTime[] k = new LocalDateTime[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final ZoneOffset[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final d[] f;
    public final TimeZone g;
    public final transient ConcurrentHashMap h = new ConcurrentHashMap();

    public e(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, d[] dVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = dVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                ZoneOffset zoneOffset = zoneOffsetArr2[i2];
                int i3 = i2 + 1;
                ZoneOffset zoneOffset2 = zoneOffsetArr2[i3];
                LocalDateTime localDateTimeS = LocalDateTime.S(jArr2[i2], 0, zoneOffset);
                int i4 = zoneOffset.b;
                if (zoneOffset2.b > i4) {
                    arrayList.add(localDateTimeS);
                    arrayList.add(localDateTimeS.U(zoneOffset2.b - i4));
                } else {
                    arrayList.add(localDateTimeS.U(r3 - i4));
                    arrayList.add(localDateTimeS);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(j$.time.LocalDateTime r6, j$.time.zone.b r7) {
        /*
            j$.time.LocalDateTime r0 = r7.b
            j$.time.LocalDateTime r1 = r7.b
            j$.time.ZoneOffset r2 = r7.d
            j$.time.ZoneOffset r3 = r7.c
            int r4 = r2.b
            int r5 = r3.b
            if (r4 <= r5) goto L26
            boolean r0 = r6.Q(r0)
            if (r0 == 0) goto L15
            goto L3d
        L15:
            int r0 = r2.b
            int r3 = r3.b
            int r0 = r0 - r3
            long r3 = (long) r0
            j$.time.LocalDateTime r0 = r1.U(r3)
            boolean r6 = r6.Q(r0)
            if (r6 == 0) goto L2c
            goto L3e
        L26:
            boolean r0 = r6.Q(r0)
            if (r0 != 0) goto L2d
        L2c:
            return r2
        L2d:
            int r0 = r2.b
            int r2 = r3.b
            int r0 = r0 - r2
            long r4 = (long) r0
            j$.time.LocalDateTime r0 = r1.U(r4)
            boolean r6 = r6.Q(r0)
            if (r6 == 0) goto L3e
        L3d:
            return r3
        L3e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.e.a(j$.time.LocalDateTime, j$.time.zone.b):java.lang.Object");
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return j$.time.h.a0(j$.desugar.sun.nio.fs.g.F(j2 + zoneOffset.b, 86400)).a;
    }

    public static ZoneOffset i(int i2) {
        return ZoneOffset.X(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.zone.b[] b(int r25) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.e.b(int):j$.time.zone.b[]");
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.e;
        if (length <= 0 || epochSecond <= jArr[jArr.length - 1]) {
            int iBinarySearch = Arrays.binarySearch(jArr, epochSecond);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return zoneOffsetArr[iBinarySearch + 1];
        }
        b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
        b bVar = null;
        for (int i2 = 0; i2 < bVarArrB.length; i2++) {
            bVar = bVarArrB[i2];
            if (epochSecond < bVar.a) {
                return bVar.c;
            }
        }
        return bVar.d;
    }

    public final Object e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.b;
        int i2 = 0;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] bVarArrB = b(localDateTime.a.a);
            if (bVarArrB.length == 0) {
                return i(timeZone.getOffset(j$.desugar.sun.nio.fs.g.t(localDateTime, zoneOffsetArr[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i2 < length) {
                b bVar = bVarArrB[i2];
                Object objA = a(localDateTime, bVar);
                if ((objA instanceof b) || objA.equals(bVar.c)) {
                    return objA;
                }
                i2++;
                obj = objA;
            }
            return obj;
        }
        if (this.c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f.length;
        LocalDateTime[] localDateTimeArr = this.d;
        if (length2 > 0 && localDateTime.isAfter(localDateTimeArr[localDateTimeArr.length - 1])) {
            b[] bVarArrB2 = b(localDateTime.a.a);
            int length3 = bVarArrB2.length;
            while (i2 < length3) {
                b bVar2 = bVarArrB2[i2];
                Object objA2 = a(localDateTime, bVar2);
                if ((objA2 instanceof b) || objA2.equals(bVar2.c)) {
                    return objA2;
                }
                i2++;
                obj = objA2;
            }
            return obj;
        }
        int iBinarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
        ZoneOffset[] zoneOffsetArr2 = this.e;
        if (iBinarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else if (iBinarySearch < localDateTimeArr.length - 1) {
            int i3 = iBinarySearch + 1;
            if (localDateTimeArr[iBinarySearch].equals(localDateTimeArr[i3])) {
                iBinarySearch = i3;
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return zoneOffsetArr2[(iBinarySearch / 2) + 1];
        }
        LocalDateTime localDateTime2 = localDateTimeArr[iBinarySearch];
        LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch + 1];
        int i4 = iBinarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr2[i4];
        ZoneOffset zoneOffset2 = zoneOffsetArr2[i4 + 1];
        return zoneOffset2.b > zoneOffset.b ? new b(localDateTime2, zoneOffset, zoneOffset2) : new b(localDateTime3, zoneOffset, zoneOffset2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (Objects.equals(this.g, eVar.g) && Arrays.equals(this.a, eVar.a) && Arrays.equals(this.b, eVar.b) && Arrays.equals(this.c, eVar.c) && Arrays.equals(this.e, eVar.e) && Arrays.equals(this.f, eVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        ZoneOffset zoneOffset = bVar.d;
        int i2 = zoneOffset.b;
        ZoneOffset zoneOffset2 = bVar.c;
        return i2 > zoneOffset2.b ? Collections.EMPTY_LIST : j$.desugar.sun.nio.fs.g.H(new Object[]{zoneOffset2, zoneOffset});
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffsetI;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffsetI = i(timeZone.getRawOffset());
        } else {
            int length = this.c.length;
            ZoneOffset[] zoneOffsetArr = this.b;
            if (length == 0) {
                zoneOffsetI = zoneOffsetArr[0];
            } else {
                int iBinarySearch = Arrays.binarySearch(this.a, instant.getEpochSecond());
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 2;
                }
                zoneOffsetI = zoneOffsetArr[iBinarySearch + 1];
            }
        }
        return !zoneOffsetI.equals(d(instant));
    }

    public final boolean h() {
        b bVar;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || timeZone.getDSTSavings() != 0) {
                return false;
            }
            Instant instantNow = Instant.now();
            long epochSecond = instantNow.getEpochSecond();
            if (instantNow.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                epochSecond++;
            }
            int iC = c(epochSecond, d(instantNow));
            b[] bVarArrB = b(iC);
            int length = bVarArrB.length - 1;
            while (true) {
                if (length >= 0) {
                    bVar = bVarArrB[length];
                    if (epochSecond > bVar.a) {
                        break;
                    }
                    length--;
                } else {
                    bVar = null;
                    if (iC > 1800) {
                        b[] bVarArrB2 = b(iC - 1);
                        int length2 = bVarArrB2.length - 1;
                        while (true) {
                            if (length2 >= 0) {
                                b bVar2 = bVarArrB2[length2];
                                if (epochSecond > bVar2.a) {
                                    bVar = bVar2;
                                    break;
                                }
                                length2--;
                            } else {
                                long jMin = Math.min(epochSecond - 31104000, (Clock.systemUTC().a() / 1000) + 31968000);
                                int offset = timeZone.getOffset((epochSecond - 1) * 1000);
                                long jE = j$.time.h.Z(1800, 1, 1).E() * 86400;
                                while (true) {
                                    if (jE > jMin) {
                                        break;
                                    }
                                    int offset2 = timeZone.getOffset(jMin * 1000);
                                    if (offset != offset2) {
                                        int iC2 = c(jMin, i(offset2));
                                        b[] bVarArrB3 = b(iC2 + 1);
                                        int length3 = bVarArrB3.length - 1;
                                        while (true) {
                                            if (length3 < 0) {
                                                b[] bVarArrB4 = b(iC2);
                                                bVar = bVarArrB4[bVarArrB4.length - 1];
                                                break;
                                            }
                                            bVar = bVarArrB3[length3];
                                            if (epochSecond > bVar.a) {
                                                break;
                                            }
                                            length3--;
                                        }
                                    } else {
                                        jMin -= 7776000;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (bVar != null) {
                return false;
            }
        } else if (this.c.length != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + String.valueOf(this.b[r1.length - 1]) + "]";
    }

    public e(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public e(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {i(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }
}
