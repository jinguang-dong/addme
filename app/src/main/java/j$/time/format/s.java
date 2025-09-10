package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class s {
    public static final j$.desugar.sun.nio.fs.n h = new j$.desugar.sun.nio.fs.n(1);
    public static final HashMap i;
    public s a;
    public final s b;
    public final ArrayList c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    static {
        HashMap map = new HashMap();
        i = map;
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.f fVar = j$.time.temporal.h.a;
        map.put('Q', fVar);
        map.put('q', fVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.j.a);
    }

    public s() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        d dVar = dateTimeFormatter.a;
        if (dVar.b) {
            dVar = new d(dVar.a, false);
        }
        b(dVar);
    }

    public final int b(e eVar) {
        Objects.a(eVar, "pp");
        s sVar = this.a;
        int i2 = sVar.e;
        if (i2 > 0) {
            l lVar = new l(eVar, i2, sVar.f);
            sVar.e = 0;
            sVar.f = (char) 0;
            eVar = lVar;
        }
        sVar.c.add(eVar);
        this.a.g = -1;
        return r5.c.size() - 1;
    }

    public final void c(char c) {
        b(new c(c));
    }

    public final void d(String str) {
        Objects.a(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            b(new c(str.charAt(0)));
        } else {
            b(new h(1, str));
        }
    }

    public final void e(B b) {
        Objects.a(b, "style");
        if (b != B.FULL && b != B.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        b(new h(0, b));
    }

    public final void f(String str, String str2) {
        b(new k(str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0474 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.s.g(java.lang.String):void");
    }

    public final void h(j$.time.temporal.a aVar, HashMap map) {
        Objects.a(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        B b = B.FULL;
        b(new o(aVar, b, new C0027a(new w(Collections.singletonMap(b, linkedHashMap)))));
    }

    public final void i(j$.time.temporal.l lVar, B b) {
        Objects.a(b, "textStyle");
        b(new o(lVar, b, x.c));
    }

    public final void j(j jVar) {
        j jVarB;
        s sVar = this.a;
        int i2 = sVar.g;
        if (i2 < 0) {
            sVar.g = b(jVar);
            return;
        }
        j jVar2 = (j) sVar.c.get(i2);
        int i3 = jVar.b;
        int i4 = jVar.c;
        if (i3 == i4 && jVar.d == A.NOT_NEGATIVE) {
            jVarB = jVar2.c(i4);
            b(jVar.b());
            this.a.g = i2;
        } else {
            jVarB = jVar2.b();
            this.a.g = b(jVar);
        }
        this.a.c.set(i2, jVarB);
    }

    public final void k(j$.time.temporal.l lVar) {
        j(new j(lVar, 1, 19, A.NORMAL));
    }

    public final void l(j$.time.temporal.l lVar, int i2) {
        Objects.a(lVar, "field");
        if (i2 >= 1 && i2 <= 19) {
            j(new j(lVar, i2, i2, A.NOT_NEGATIVE));
        } else {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
    }

    public final void m(j$.time.temporal.l lVar, int i2, int i3, A a) {
        if (i2 == i3 && a == A.NOT_NEGATIVE) {
            l(lVar, i3);
            return;
        }
        Objects.a(lVar, "field");
        Objects.a(a, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i3 >= i2) {
            j(new j(lVar, i2, i3, a));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public final void n() {
        s sVar = this.a;
        if (sVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (sVar.c.size() <= 0) {
            this.a = this.a.b;
            return;
        }
        s sVar2 = this.a;
        d dVar = new d(sVar2.c, sVar2.d);
        this.a = this.a.b;
        b(dVar);
    }

    public final void o() {
        s sVar = this.a;
        sVar.g = -1;
        this.a = new s(sVar);
    }

    public final DateTimeFormatter p(z zVar, j$.time.chrono.l lVar) {
        return q(Locale.getDefault(), zVar, lVar);
    }

    public final DateTimeFormatter q(Locale locale, z zVar, j$.time.chrono.l lVar) {
        Objects.a(locale, "locale");
        while (this.a.b != null) {
            n();
        }
        return new DateTimeFormatter(new d(this.c, false), locale, y.a, zVar, lVar, null);
    }

    public s(s sVar) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = sVar;
        this.d = true;
    }
}
