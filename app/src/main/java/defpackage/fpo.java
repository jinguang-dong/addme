package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fpo implements Consumer {
    public static final Duration a = Duration.ofSeconds(2);
    public final owq b;
    public final fpr c;
    public final fpr d;
    public final swb e;
    public final Duration f;
    public final Duration g;
    public final AtomicReference h = new AtomicReference(fpa.UNKNOWN);
    public Instant i;

    public fpo(owq owqVar, fpr fprVar, fpr fprVar2, swb swbVar, hbj hbjVar) {
        this.i = Instant.MIN;
        this.b = owqVar;
        this.c = fprVar;
        this.d = fprVar2;
        this.e = swbVar;
        this.i = swbVar.a();
        this.f = Duration.ofMillis(((Integer) hbjVar.a(gyi.d).orElse(1500)).intValue());
        this.g = Duration.ofMillis(((Integer) hbjVar.a(gyi.e).orElse(15000)).intValue());
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        this.b.a((fpa) DesugarAtomicReference.updateAndGet(this.h, new fpn(this, (fon) obj, 0)));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
