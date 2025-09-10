package defpackage;

import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kwr {
    public static final sgv a = sgv.g("kwr");
    public final pbn b;
    public final pfu c;
    private final boolean d;
    private final Executor e;
    private final hbj f;

    public kwr(pfu pfuVar, hbj hbjVar, pbn pbnVar, Executor executor) {
        this.c = pfuVar;
        this.b = pbnVar;
        this.e = executor;
        this.f = hbjVar;
        this.d = ((Boolean) hbjVar.a(gzs.a).map(new jkv(18)).orElse(false)).booleanValue();
    }

    public static void c(pfz pfzVar, lss lssVar) {
        int i = lssVar.l().a;
        pfzVar.m(new sfm(new pej(nvj.g, 2)), new kwq(lssVar));
    }

    private final boolean d() {
        return this.d && nvj.g != null;
    }

    private final boolean e() {
        return this.f.p(gzo.al) && nvo.a != null;
    }

    public final void a(lss lssVar) {
        if (!d() || e()) {
            return;
        }
        this.e.execute(new kee(this, lssVar, 11));
    }

    public final void b(pfz pfzVar, lss lssVar) {
        if (d() && !e()) {
            this.b.f(INRGuObcrHjSQz.LydVOkx);
            try {
                try {
                    c(pfzVar, lssVar);
                } catch (pco e) {
                    ((sgt) ((sgt) a.b().i(e)).M(3554)).s("Error submitting 3A debug metadata request.");
                }
            } finally {
                this.b.g();
            }
        }
    }
}
