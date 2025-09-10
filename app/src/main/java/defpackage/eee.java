package defpackage;

import androidx.wear.ambient.AmbientLifecycleObserverKt;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eee implements Comparable {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public TimeZone g;
    public int h;

    public eee() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = DesugarTimeZone.getTimeZone("UTC");
    }

    public final Calendar a() {
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(this.g);
        gregorianCalendar.set(1, this.a);
        gregorianCalendar.set(2, this.b - 1);
        gregorianCalendar.set(5, this.c);
        gregorianCalendar.set(11, this.d);
        gregorianCalendar.set(12, this.e);
        gregorianCalendar.set(13, this.f);
        gregorianCalendar.set(14, this.h / 1000000);
        return gregorianCalendar;
    }

    public final void b(int i) {
        if (i <= 0) {
            this.c = 1;
        } else if (i > 31) {
            this.c = 31;
        } else {
            this.c = i;
        }
    }

    public final void c(int i) {
        this.d = Math.min(Math.abs(i), 23);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long timeInMillis = a().getTimeInMillis() - ((eee) obj).a().getTimeInMillis();
        return timeInMillis != 0 ? (int) (timeInMillis % 2) : (int) ((this.h - r6.h) % 2);
    }

    public final void d(int i) {
        this.e = Math.min(Math.abs(i), 59);
    }

    public final void e(int i) {
        if (i <= 0) {
            this.b = 1;
        } else if (i > 12) {
            this.b = 12;
        } else {
            this.b = i;
        }
    }

    public final void f(int i) {
        this.f = Math.min(Math.abs(i), 59);
    }

    public final void g(int i) {
        this.a = Math.min(Math.abs(i), 9999);
    }

    public final String toString() {
        return AmbientLifecycleObserverKt.D(this);
    }

    public eee(Calendar calendar) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = DesugarTimeZone.getTimeZone("UTC");
        Date time = calendar.getTime();
        TimeZone timeZone = calendar.getTimeZone();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(timeZone);
        gregorianCalendar.setTime(time);
        this.a = gregorianCalendar.get(1);
        this.b = gregorianCalendar.get(2) + 1;
        this.c = gregorianCalendar.get(5);
        this.d = gregorianCalendar.get(11);
        this.e = gregorianCalendar.get(12);
        this.f = gregorianCalendar.get(13);
        this.h = gregorianCalendar.get(14) * 1000000;
        this.g = gregorianCalendar.getTimeZone();
    }

    public eee(Date date, TimeZone timeZone) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = DesugarTimeZone.getTimeZone("UTC");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setTime(date);
        this.a = gregorianCalendar.get(1);
        this.b = gregorianCalendar.get(2) + 1;
        this.c = gregorianCalendar.get(5);
        this.d = gregorianCalendar.get(11);
        this.e = gregorianCalendar.get(12);
        this.f = gregorianCalendar.get(13);
        this.h = gregorianCalendar.get(14) * 1000000;
        this.g = timeZone;
    }
}
