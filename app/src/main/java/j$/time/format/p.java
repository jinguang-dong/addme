package j$.time.format;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class p extends j {
    public final char g;
    public final int h;

    public p(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, A.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    @Override // j$.time.format.j
    public final j b() {
        if (this.e == -1) {
            return this;
        }
        return new p(this.g, this.h, this.b, this.c, -1);
    }

    @Override // j$.time.format.j
    public final j c(int i) {
        return new p(this.g, this.h, this.b, this.c, this.e + i);
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final boolean h(u uVar, StringBuilder sb) {
        j$.time.temporal.p pVar;
        e jVar;
        Locale locale = uVar.b.b;
        ConcurrentHashMap concurrentHashMap = j$.time.temporal.q.g;
        Objects.a(locale, "locale");
        j$.time.temporal.q qVarA = j$.time.temporal.q.a(j$.time.c.a[((((int) ((r0.getFirstDayOfWeek() - 1) % 7)) + 7) + j$.time.c.SUNDAY.ordinal()) % 7], Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry())).getMinimalDaysInFirstWeek());
        char c = this.g;
        if (c == 'W') {
            pVar = qVarA.d;
        } else {
            if (c == 'Y') {
                j$.time.temporal.p pVar2 = qVarA.f;
                int i = this.h;
                if (i == 2) {
                    jVar = new m(pVar2, 2, 2, m.h, this.e);
                } else {
                    jVar = new j(pVar2, i, 19, i < 4 ? A.NORMAL : A.EXCEEDS_PAD, this.e);
                }
                return jVar.h(uVar, sb);
            }
            if (c == 'c' || c == 'e') {
                pVar = qVarA.c;
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                pVar = qVarA.e;
            }
        }
        jVar = new j(pVar, this.b, this.c, A.NOT_NEGATIVE, this.e);
        return jVar.h(uVar, sb);
    }

    @Override // j$.time.format.j
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c != 'Y') {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i);
        } else if (i == 1) {
            sb.append("WeekBasedYear");
        } else if (i == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i);
            sb.append(",19,");
            sb.append(i < 4 ? A.NORMAL : A.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }
}
