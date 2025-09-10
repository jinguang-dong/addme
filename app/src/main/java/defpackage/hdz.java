package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hdz {
    public final long a;
    public final lte b;
    public final ltf c;
    public final Optional d;
    public Instant g;
    final /* synthetic */ heb h;
    private final Instant i;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public boolean f = false;
    private Instant j = Instant.MIN;
    private int k = 0;
    private pbp l = pbp.a;
    private pbr m = pbr.a;

    public hdz(heb hebVar, lte lteVar, Instant instant, Optional optional) {
        this.h = hebVar;
        this.a = lteVar.b;
        this.b = lteVar;
        this.i = instant;
        this.c = lteVar.d;
        this.g = instant;
        this.d = optional;
    }

    public syu a() {
        syu syuVarA;
        heb hebVar = this.h;
        Instant instant = hebVar.f.instant();
        this.l.a();
        this.l = pbp.a;
        if (this.e.compareAndSet(false, true)) {
            syuVarA = hebVar.h.a(this.a, instant);
        } else {
            e("persisted");
            syuVarA = syq.a;
        }
        d(instant, "PERSISTED");
        return syuVarA;
    }

    public void b() {
        AtomicBoolean atomicBoolean = this.e;
        heb hebVar = this.h;
        Instant instant = hebVar.f.instant();
        if (atomicBoolean.compareAndSet(false, true)) {
            hebVar.h.d(this.a, instant);
        } else {
            e("deleted");
        }
        d(instant, "DELETED");
    }

    public void c(String str) {
        d(this.h.f.instant(), str);
    }

    public void d(Instant instant, String str) {
        this.g = instant;
        if (this.e.get()) {
            f(str);
            return;
        }
        heb hebVar = this.h;
        hebVar.h.e(this.a, instant, str);
    }

    protected final void e(String str) {
        this.h.d.h(ojl.bI("%s() on shot %d (%s), but it was already finished.", str, Long.valueOf(this.a), this.b));
    }

    protected final void f(String str) {
        this.h.d.g(ojl.bI("On shot %d (%s) tried to log '%s', but shot was already finished.", Long.valueOf(this.a), this.b, str));
    }

    public void g(Integer num) {
        this.k++;
        heb hebVar = this.h;
        Instant instant = hebVar.f.instant();
        this.g = instant;
        if (num != null) {
            this.m.c(num.intValue());
        }
        if (instant.isAfter(this.j)) {
            hebVar.d.b("onShotProgress " + String.valueOf(this.b) + " (" + this.k + ")");
            this.j = instant.plus(heb.b);
            if (this.e.get()) {
                e("makingProgress");
            } else {
                hebVar.h.f(this.a, instant);
            }
        }
    }

    public void h(Instant instant) {
        if (this.e.get()) {
            e("markStuck");
            return;
        }
        this.f = true;
        heb hebVar = this.h;
        hebVar.h.h(this.a, instant);
    }

    public void i() {
        if (this.e.get()) {
            e("started");
            return;
        }
        heb hebVar = this.h;
        hebVar.h.i(this.b, this.i, this.c);
        long j = this.a;
        pbn pbnVar = hebVar.e;
        this.l = pbnVar.a(mn.h(j, "Shot #"));
        this.m = pbnVar.b(mn.h(j, "ShotProgress #"));
    }

    public void j() {
        AtomicBoolean atomicBoolean = this.e;
        heb hebVar = this.h;
        Instant instant = hebVar.f.instant();
        if (atomicBoolean.compareAndSet(false, true)) {
            hebVar.h.c(this.a, instant);
        } else {
            e("canceled");
        }
        d(instant, "CANCELED");
    }
}
