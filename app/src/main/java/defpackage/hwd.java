package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwd implements hwh {
    public static final Duration a = Duration.ofMillis(100);
    public final jub b;
    public final owq c;
    public final owq d;
    public final mes e;
    public final out f;
    private final hvy h;
    private paq i;
    public Optional g = Optional.empty();
    private boolean j = false;

    public hwd(owq owqVar, jub jubVar, hvy hvyVar, owq owqVar2, mes mesVar, out outVar) {
        this.c = owqVar;
        this.b = jubVar;
        this.h = hvyVar;
        this.d = owqVar2;
        this.f = outVar;
        this.e = mesVar;
        gzi gziVar = gzq.a;
    }

    @Override // defpackage.hwh
    public final void a() {
        b();
    }

    @Override // defpackage.hwh
    public final void b() {
        this.h.k();
        paq paqVar = this.i;
        if (paqVar != null) {
            paqVar.close();
            this.i = null;
        }
        this.g = Optional.empty();
        this.j = false;
    }

    @Override // defpackage.hwh
    public final boolean c() {
        if (this.j) {
            return true;
        }
        this.h.l();
        return false;
    }

    @Override // defpackage.hwh
    public final /* synthetic */ int d(ltf ltfVar) {
        return ezh.T(this, ltfVar);
    }

    @Override // defpackage.hwh
    public final void e(final jth jthVar, final boolean z, final Runnable runnable) {
        this.h.a();
        this.j = true;
        this.i = this.d.dK(new pau() { // from class: hwc
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Set] */
            /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.Set] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Set] */
            @Override // defpackage.pau
            public final void a(Object obj) {
                hwd hwdVar = this.a;
                if (((Boolean) hwdVar.c.dL()).booleanValue()) {
                    if (!hwdVar.g.isEmpty()) {
                        hwdVar.g.get().size();
                    }
                    owq owqVar = hwdVar.d;
                    ((Set) owqVar.dL()).size();
                    if (hwdVar.g.isEmpty()) {
                        hwdVar.g = Optional.of(new HashSet((Collection) owqVar.dL()));
                        return;
                    }
                    if (hwdVar.g.get().containsAll((Collection) owqVar.dL())) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    boolean z2 = z;
                    jth jthVar2 = jthVar;
                    kfn kfnVar = new kfn();
                    meu meuVar = (meu) hwdVar.e.a();
                    Duration duration = hwd.a;
                    meuVar.f(duration);
                    meuVar.h(duration);
                    hwdVar.b.e(jthVar2, jthVar2.b, kfnVar, jthVar2.c, z2, false, 2, meuVar, Optional.empty()).c(runnable2, hwdVar.f);
                    hwdVar.g.get().addAll((Collection) owqVar.dL());
                }
            }
        }, this.f);
    }
}
