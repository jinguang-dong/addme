package defpackage;

import android.os.Handler;
import android.os.Looper;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvp implements hwh {
    public static final Duration a = Duration.ofMillis(1250);
    public static final Duration b = Duration.ofMillis(100);
    public final jub c;
    public final owq d;
    public final out f;
    public final mes g;
    private final hvy i;
    public Optional h = Optional.empty();
    public final Handler e = new Handler(Looper.getMainLooper());

    public hvp(owq owqVar, jub jubVar, hvy hvyVar, mes mesVar, out outVar) {
        this.c = jubVar;
        this.d = owqVar;
        this.f = outVar;
        this.i = hvyVar;
        this.g = mesVar;
        gzi gziVar = gzq.a;
    }

    @Override // defpackage.hwh
    public final void a() {
        b();
    }

    @Override // defpackage.hwh
    public final void b() {
        this.i.k();
        this.h.ifPresent(new fio(this.e, 20));
        this.h = Optional.empty();
    }

    @Override // defpackage.hwh
    public final boolean c() {
        this.i.l();
        return false;
    }

    @Override // defpackage.hwh
    public final /* synthetic */ int d(ltf ltfVar) {
        return ezh.T(this, ltfVar);
    }

    @Override // defpackage.hwh
    public final void e(jth jthVar, boolean z, Runnable runnable) {
        this.i.a();
        mhc mhcVar = new mhc(this, jthVar, z, runnable, 1);
        this.h = Optional.of(mhcVar);
        this.e.postDelayed(mhcVar, a.toMillis());
    }
}
