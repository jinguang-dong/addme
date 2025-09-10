package defpackage;

import android.database.sqlite.SQLiteException;
import com.google.android.apps.camera.debug.shottracker.db.ShotDatabase;
import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;
import j$.time.Clock;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hep implements hel {
    static final Duration a = Duration.ofMinutes(2);
    static final Duration b = Duration.ofHours(6);
    public static final Duration c = Duration.ofHours(36);
    public final pbc d;
    public final Clock e;
    public ShotDatabase f;
    public her g;
    public hfa h;
    private final syx i;
    private final syw j;
    private long k = a.toSeconds();

    public hep(syx syxVar, ExecutorService executorService, Clock clock, pbc pbcVar, uem uemVar) {
        this.d = pbcVar.a("ShotTracker");
        this.i = syxVar;
        syw sywVarA = ske.A(executorService);
        this.j = sywVarA;
        this.e = clock;
        sywVarA.execute(new gts((Object) this, (Object) pbcVar, uemVar, 2));
    }

    public static hfd j(long j, Instant instant, String str) {
        hfd hfdVar = new hfd();
        hfdVar.b = j;
        hfdVar.a = 0;
        hfdVar.c = instant.toEpochMilli();
        hfdVar.d = str;
        return hfdVar;
    }

    public static String k(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hfd hfdVar = (hfd) it.next();
            sb.append(hfdVar.b);
            sb.append(' ');
            sb.append(Instant.ofEpochMilli(hfdVar.c));
            sb.append(": ");
            sb.append(hfdVar.d);
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override // defpackage.hel
    public final syu a(final long j, final Instant instant) {
        return this.j.submit(new Callable() { // from class: heo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                hep hepVar = this.a;
                long j2 = j;
                Instant instant2 = instant;
                try {
                    hez hezVarB = hepVar.g.b(j2);
                    if (hezVarB != null) {
                        long epochMilli = instant2.toEpochMilli();
                        hezVarB.d = epochMilli;
                        hezVarB.g = epochMilli;
                        hepVar.g.c(hezVarB);
                        hepVar.d.b(ojl.bI("Persisted shot: %d", Long.valueOf(j2)));
                    } else {
                        hepVar.d.b(ojl.bI("Attempted to persist shot: %d but couldn't find it", Long.valueOf(j2)));
                    }
                    return null;
                } catch (SQLiteException e) {
                    hepVar.d.e(ojl.bI(pAAtrB.eKHmCnTAB, Long.valueOf(j2), instant2), e);
                    return null;
                }
            }
        });
    }

    @Override // defpackage.hel
    public final syu b() {
        return this.i.submit(new dyo(this, 11));
    }

    @Override // defpackage.hel
    public final void c(final long j, final Instant instant) {
        this.j.execute(new Runnable() { // from class: hen
            @Override // java.lang.Runnable
            public final void run() {
                hep hepVar = this.a;
                long j2 = j;
                Instant instant2 = instant;
                try {
                    hez hezVarB = hepVar.g.b(j2);
                    if (hezVarB != null) {
                        long epochMilli = instant2.toEpochMilli();
                        hezVarB.e = epochMilli;
                        hezVarB.g = epochMilli;
                        hepVar.g.c(hezVarB);
                    }
                } catch (SQLiteException e) {
                    hepVar.d.e(ojl.bI("SQLite error in canceledImpl for id=%d time=%s", Long.valueOf(j2), instant2), e);
                }
            }
        });
    }

    @Override // defpackage.hel
    public final void d(long j, Instant instant) {
        this.j.execute(new gon(this, j, instant, 5));
    }

    @Override // defpackage.hel
    public final void e(long j, Instant instant, String str) {
        this.j.execute(new jzz(this, j, instant, str, 1));
    }

    @Override // defpackage.hel
    public final void f(long j, Instant instant) {
        this.j.execute(new gon(this, j, instant, 2));
    }

    @Override // defpackage.hel
    public final void g(long j, Instant instant) {
        this.j.execute(new gon(this, j, instant, 4));
    }

    @Override // defpackage.hel
    public final void h(long j, Instant instant) {
        this.j.execute(new gon(this, j, instant, 3));
    }

    @Override // defpackage.hel
    public final void i(lte lteVar, Instant instant, ltf ltfVar) {
        lteVar.getClass();
        this.j.execute(new dwq(this, lteVar, instant, ltfVar, 5));
    }

    public final void l(long j, Instant instant, String str) {
        try {
            int iA = this.g.a(j, instant.toEpochMilli());
            if (iA == 1) {
                this.h.b(j(j, instant, str));
            } else {
                this.d.d(ojl.bI("logImpl updated %d rows for id=%d with time=%s (expected 1)", Integer.valueOf(iA), Long.valueOf(j), instant));
            }
        } catch (SQLiteException e) {
            this.d.e(ojl.bI("SQLite error in logImpl for id=%d time=%s msg='%s'", Long.valueOf(j), instant, str), e);
        }
    }

    public final void m() {
        this.i.d(new hbv(this, 3), this.k, TimeUnit.SECONDS);
        this.k = b.toSeconds();
    }
}
