package defpackage;

import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ija {
    private static final sgv p = sgv.g("ija");
    public final pbn a;
    public final pbc b;
    public final ikm c;
    public final ikp d;
    public final out e;
    public final ffq g;
    public Surface h;
    public peo i;
    public pdn j;
    public pdm k;
    public final pfw m;
    public pfu n;
    public ijo o;
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final ovx f = new ovx(false);

    public ija(pfw pfwVar, pbc pbcVar, pbn pbnVar, ikm ikmVar, ikp ikpVar, out outVar, ffq ffqVar) {
        this.m = pfwVar;
        this.a = pbnVar;
        this.c = ikmVar;
        this.d = ikpVar;
        this.e = outVar;
        this.b = pbcVar.a("ImaxFrameServer");
        this.g = ffqVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r3v5, types: [sgt, shi] */
    public final void a(boolean z) {
        if (z) {
            try {
                pfu pfuVar = this.n;
                pfuVar.getClass();
                pfuVar.w();
                return;
            } catch (Exception e) {
                ((sgt) ((sgt) p.b().i(e)).M((char) 2065)).s("Panorama failed to lock 3A.");
                return;
            }
        }
        try {
            pfu pfuVar2 = this.n;
            pfuVar2.getClass();
            pfuVar2.q(true, true, true);
        } catch (Exception e2) {
            ((sgt) ((sgt) p.b().i(e2)).M((char) 2063)).s("Panorama failed to unlock 3A.");
        }
    }

    public final boolean b() {
        return ((Boolean) this.f.d).booleanValue();
    }
}
