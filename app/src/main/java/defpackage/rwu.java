package defpackage;

import j$.time.Duration;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rwu {
    public boolean a;
    private final rxc b;
    private long c;
    private long d;

    rwu() {
        this.b = rxc.a;
    }

    public static rwu b(rxc rxcVar) {
        rwu rwuVar = new rwu(rxcVar);
        rwuVar.e();
        return rwuVar;
    }

    private final long g() {
        return this.a ? (this.b.a() - this.d) + this.c : this.c;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(g(), TimeUnit.NANOSECONDS);
    }

    public final Duration c() {
        return Duration.ofNanos(g());
    }

    public final void d() {
        this.c = 0L;
        this.a = false;
    }

    public final void e() {
        rnt.M(!this.a, "This stopwatch is already running.");
        this.a = true;
        this.d = this.b.a();
    }

    public final void f() {
        long jA = this.b.a();
        rnt.M(this.a, "This stopwatch is already stopped.");
        this.a = false;
        this.c += jA - this.d;
    }

    public final String toString() {
        String str;
        long jG = g();
        TimeUnit timeUnit = TimeUnit.DAYS.convert(jG, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.DAYS : TimeUnit.HOURS.convert(jG, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.HOURS : TimeUnit.MINUTES.convert(jG, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MINUTES : TimeUnit.SECONDS.convert(jG, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.SECONDS : TimeUnit.MILLISECONDS.convert(jG, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MILLISECONDS : TimeUnit.MICROSECONDS.convert(jG, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jG / TimeUnit.NANOSECONDS.convert(1L, timeUnit)));
        switch (rwt.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return str2 + " " + str;
    }

    public rwu(rxc rxcVar) {
        rxcVar.getClass();
        this.b = rxcVar;
    }
}
