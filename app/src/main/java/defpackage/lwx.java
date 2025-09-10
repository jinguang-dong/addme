package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwx implements lxa {
    public static final Duration a = Duration.ofSeconds(4);
    private final owf b;
    private final owf c;
    private final owf d;
    private final juv e;
    private final owf f;
    private final kuj g;
    private final tdy h;

    public lwx(owf owfVar, owf owfVar2, owf owfVar3, juv juvVar, tdy tdyVar, owf owfVar4, kuj kujVar) {
        this.b = owfVar;
        this.c = owfVar2;
        this.d = owfVar3;
        this.e = juvVar;
        this.h = tdyVar;
        this.f = owfVar4;
        this.g = kujVar;
    }

    @Override // defpackage.lxa
    public final float a() {
        return ((Float) this.c.dL()).floatValue();
    }

    @Override // defpackage.lxa
    public final float b() {
        return ((Float) this.d.dL()).floatValue();
    }

    @Override // defpackage.lxa
    public final boolean c() {
        return !((ixq) this.b.dL()).equals(ixq.INACTIVE);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, uem] */
    @Override // defpackage.lxa
    public final boolean d() throws InterruptedException {
        Optional optional = this.e.i;
        if (optional.isEmpty()) {
            return false;
        }
        owf owfVar = this.f;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = ((ick) owfVar.dL()).a;
        long j = ((ick) owfVar.dL()).b;
        Duration duration = a;
        long nanos = j + duration.toNanos();
        shl shlVar = shx.a;
        duration.toSeconds();
        if (!z || jElapsedRealtimeNanos >= nanos) {
            return false;
        }
        tdy tdyVar = this.h;
        CaptureResult.Key key = (CaptureResult.Key) optional.get();
        owq owqVar = (owq) tdyVar.a.a();
        owqVar.getClass();
        nmt nmtVar = (nmt) tdyVar.c.a();
        nmtVar.getClass();
        kuj kujVar = (kuj) tdyVar.b.a();
        kujVar.getClass();
        lws lwsVar = new lws(owqVar, nmtVar, kujVar, key, nanos);
        lwr lwrVar = new lwr(lwsVar);
        this.g.o(lwrVar);
        try {
            szh szhVar = lwsVar.b;
            szhVar.c(new lsn(lwsVar, lwrVar, 5, null), sxo.a);
            return ((Boolean) szhVar.s()).booleanValue();
        } catch (ExecutionException e) {
            throw new InterruptedException("Failed to wait for proposed value to arrive. ".concat(String.valueOf(String.valueOf(e.getCause()))));
        }
    }

    @Override // defpackage.lxa
    public final void e(pfz pfzVar, Optional optional, obv obvVar) {
        if (optional.isPresent()) {
            pfg pfgVarE = pfzVar.e();
            juv juvVar = this.e;
            pfgVarE.f(scn.H(new pej((CaptureRequest.Key) juvVar.j.get(), (Float) optional.get()), new pej((CaptureRequest.Key) juvVar.k.get(), Long.valueOf(obvVar.a))));
            pfzVar.h(pfgVarE.b());
            shl shlVar = shx.a;
            optional.get();
            long j = obvVar.a;
        }
    }
}
