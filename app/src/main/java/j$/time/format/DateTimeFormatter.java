package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter g;
    public final d a;
    public final Locale b;
    public final y c;
    public final z d;
    public final j$.time.chrono.l e;
    public final ZoneId f;

    static {
        s sVar = new s();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        A a = A.EXCEEDS_PAD;
        sVar.m(aVar, 4, 10, a);
        sVar.c('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        sVar.l(aVar2, 2);
        sVar.c('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        sVar.l(aVar3, 2);
        z zVar = z.STRICT;
        j$.time.chrono.s sVar2 = j$.time.chrono.s.c;
        DateTimeFormatter dateTimeFormatterP = sVar.p(zVar, sVar2);
        s sVar3 = new s();
        n nVar = n.INSENSITIVE;
        sVar3.b(nVar);
        sVar3.a(dateTimeFormatterP);
        k kVar = k.e;
        sVar3.b(kVar);
        sVar3.p(zVar, sVar2);
        s sVar4 = new s();
        sVar4.b(nVar);
        sVar4.a(dateTimeFormatterP);
        sVar4.o();
        sVar4.b(kVar);
        sVar4.p(zVar, sVar2);
        s sVar5 = new s();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        sVar5.l(aVar4, 2);
        sVar5.c(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        sVar5.l(aVar5, 2);
        sVar5.o();
        sVar5.c(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        sVar5.l(aVar6, 2);
        sVar5.o();
        sVar5.b(new f(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true));
        DateTimeFormatter dateTimeFormatterP2 = sVar5.p(zVar, null);
        s sVar6 = new s();
        sVar6.b(nVar);
        sVar6.a(dateTimeFormatterP2);
        sVar6.b(kVar);
        sVar6.p(zVar, null);
        s sVar7 = new s();
        sVar7.b(nVar);
        sVar7.a(dateTimeFormatterP2);
        sVar7.o();
        sVar7.b(kVar);
        sVar7.p(zVar, null);
        s sVar8 = new s();
        sVar8.b(nVar);
        sVar8.a(dateTimeFormatterP);
        sVar8.c('T');
        sVar8.a(dateTimeFormatterP2);
        DateTimeFormatter dateTimeFormatterP3 = sVar8.p(zVar, sVar2);
        s sVar9 = new s();
        sVar9.b(nVar);
        sVar9.a(dateTimeFormatterP3);
        n nVar2 = n.LENIENT;
        sVar9.b(nVar2);
        sVar9.b(kVar);
        n nVar3 = n.STRICT;
        sVar9.b(nVar3);
        DateTimeFormatter dateTimeFormatterP4 = sVar9.p(zVar, sVar2);
        s sVar10 = new s();
        sVar10.a(dateTimeFormatterP4);
        sVar10.o();
        sVar10.c('[');
        n nVar4 = n.SENSITIVE;
        sVar10.b(nVar4);
        j$.desugar.sun.nio.fs.n nVar5 = s.h;
        sVar10.b(new q(nVar5, "ZoneRegionId()"));
        sVar10.c(']');
        sVar10.p(zVar, sVar2);
        s sVar11 = new s();
        sVar11.a(dateTimeFormatterP3);
        sVar11.o();
        sVar11.b(kVar);
        sVar11.o();
        sVar11.c('[');
        sVar11.b(nVar4);
        sVar11.b(new q(nVar5, "ZoneRegionId()"));
        sVar11.c(']');
        sVar11.p(zVar, sVar2);
        s sVar12 = new s();
        sVar12.b(nVar);
        sVar12.m(aVar, 4, 10, a);
        sVar12.c('-');
        sVar12.l(j$.time.temporal.a.DAY_OF_YEAR, 3);
        sVar12.o();
        sVar12.b(kVar);
        sVar12.p(zVar, sVar2);
        s sVar13 = new s();
        sVar13.b(nVar);
        sVar13.m(j$.time.temporal.h.c, 4, 10, a);
        sVar13.d("-W");
        sVar13.l(j$.time.temporal.h.b, 2);
        sVar13.c('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        sVar13.l(aVar7, 1);
        sVar13.o();
        sVar13.b(kVar);
        sVar13.p(zVar, sVar2);
        s sVar14 = new s();
        sVar14.b(nVar);
        sVar14.b(new g());
        g = sVar14.p(zVar, null);
        s sVar15 = new s();
        sVar15.b(nVar);
        sVar15.l(aVar, 4);
        sVar15.l(aVar2, 2);
        sVar15.l(aVar3, 2);
        sVar15.o();
        sVar15.b(nVar2);
        sVar15.f("+HHMMss", "Z");
        sVar15.b(nVar3);
        sVar15.p(zVar, sVar2);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        s sVar16 = new s();
        sVar16.b(nVar);
        sVar16.b(nVar2);
        sVar16.o();
        sVar16.h(aVar7, map);
        sVar16.d(", ");
        sVar16.n();
        sVar16.m(aVar3, 1, 2, A.NOT_NEGATIVE);
        sVar16.c(' ');
        sVar16.h(aVar2, map2);
        sVar16.c(' ');
        sVar16.l(aVar, 4);
        sVar16.c(' ');
        sVar16.l(aVar4, 2);
        sVar16.c(':');
        sVar16.l(aVar5, 2);
        sVar16.o();
        sVar16.c(':');
        sVar16.l(aVar6, 2);
        sVar16.n();
        sVar16.c(' ');
        sVar16.f("+HHMM", "GMT");
        sVar16.p(z.SMART, sVar2);
    }

    public DateTimeFormatter(d dVar, Locale locale, y yVar, z zVar, j$.time.chrono.l lVar, ZoneId zoneId) {
        Objects.a(dVar, "printerParser");
        this.a = dVar;
        Objects.a(locale, "locale");
        this.b = locale;
        Objects.a(yVar, "decimalStyle");
        this.c = yVar;
        Objects.a(zVar, "resolverStyle");
        this.d = zVar;
        this.e = lVar;
        this.f = zoneId;
    }

    public static DateTimeFormatter ofLocalizedDateTime(FormatStyle formatStyle) {
        Objects.a(formatStyle, "dateTimeStyle");
        s sVar = new s();
        sVar.b(new i(formatStyle, formatStyle));
        return sVar.p(z.SMART, j$.time.chrono.s.c);
    }

    public static DateTimeFormatter ofPattern(String str) {
        s sVar = new s();
        sVar.g(str);
        return sVar.q(Locale.getDefault(), z.SMART, null);
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        d dVar = this.a;
        Objects.a(temporalAccessor, "temporal");
        try {
            dVar.h(new u(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new j$.time.b(e.getMessage(), e);
        }
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        if (Objects.equals(this.f, zoneId)) {
            return this;
        }
        return new DateTimeFormatter(this.a, this.b, this.c, this.d, this.e, zoneId);
    }
}
