package defpackage;

import android.content.res.Resources;
import android.os.VibrationEffect;
import com.google.android.apps.camera.bottombar.ThumbnailView;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fje implements fjm, fji {
    public static final VibrationEffect a = VibrationEffect.startComposition().addPrimitive(1, 1.0f, 0).addPrimitive(1, 1.0f, 52).compose();
    private final imi A;
    public final flg b;
    public final fvu c;
    public final out d;
    public final fjz e;
    public final boolean f;
    public final fif g;
    public final fjc h;
    public final hcl i;
    public paq j;
    public volatile boolean k;
    public final mbj l;
    public final hbw m;
    public final syj n;
    public final ocq o;
    private final owf p;
    private final owf q;
    private final owf r;
    private final owf s;
    private final owf t;
    private final owf u;
    private final fke v;
    private final uem w;
    private final uem x;
    private int y = 0;
    private final fja z;

    public fje(fja fjaVar, flg flgVar, fvu fvuVar, imi imiVar, ocq ocqVar, out outVar, fjz fjzVar, hbj hbjVar, fif fifVar, fjc fjcVar, owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, mbj mbjVar, syj syjVar, owf owfVar5, owf owfVar6, fke fkeVar, hbw hbwVar, hcl hclVar, uem uemVar, uem uemVar2) {
        this.l = mbjVar;
        this.n = syjVar;
        this.z = fjaVar;
        this.b = flgVar;
        this.c = fvuVar;
        this.A = imiVar;
        this.d = outVar;
        this.o = ocqVar;
        this.e = fjzVar;
        this.f = hbjVar.o(gyi.l);
        this.g = fifVar;
        this.h = fjcVar;
        this.p = owfVar;
        this.q = owfVar2;
        this.s = owfVar4;
        this.t = owfVar5;
        this.u = owfVar6;
        this.v = fkeVar;
        this.r = owfVar3;
        this.m = hbwVar;
        this.i = hclVar;
        this.w = uemVar;
        this.x = uemVar2;
    }

    private final void f() {
        this.y = 0;
        this.b.d();
    }

    @Override // defpackage.fjm
    public final paq a() {
        this.y = 0;
        this.b.a();
        fjd fjdVar = new fjd(this);
        this.c.A(fjdVar);
        jsv.J(this.h.a != null, this.w);
        fif fifVar = this.g;
        jsv.J(fifVar.a != null, this.x);
        our ourVar = new our();
        owf owfVarA = owb.a(owl.h(owl.a(this.p, this.s), new fhy(2)));
        fbt fbtVar = new fbt(this, 11);
        out outVar = this.d;
        ourVar.d(owfVarA.dK(fbtVar, outVar));
        ourVar.d(new fid(this, fjdVar, 3, null));
        ourVar.d(this.q.dK(new fbt(this, 12), outVar));
        ourVar.d(this.r.dK(new fbt(this, 13), outVar));
        return ourVar;
    }

    @Override // defpackage.fjm
    public final Optional b() {
        if (this.y <= 0) {
            if (!this.z.m(this)) {
                return Optional.empty();
            }
            this.b.f();
        }
        int i = this.y;
        if (i < 2) {
            this.y = i + 1;
        }
        fja fjaVar = this.z;
        synchronized (fjaVar) {
            Map map = fjaVar.b;
            fip fipVar = (fip) map.get(Integer.valueOf(fjaVar.l));
            if (fipVar == null) {
                ((sgt) fja.a.c().M(225)).y("startShot failed, current groupId: %s does have an active session in map %s", fjaVar.l, map.keySet().toArray());
                return Optional.empty();
            }
            synchronized (fipVar) {
                if (!fipVar.t && !fipVar.u && !fipVar.v) {
                    fipVar.z.incrementAndGet();
                    synchronized (fipVar) {
                        int i2 = fipVar.p + 1;
                        fipVar.p = i2;
                        if (i2 >= 2) {
                            fipVar.g(null);
                        }
                    }
                    return Optional.of(fipVar.m);
                }
                ((sgt) fip.a.c().M(190)).H("Ignoring startShot: groupId=%s, isCaptureDone=%s, isProcessingDone=%s, sessionClosed=%s", Integer.valueOf(fipVar.c), Boolean.valueOf(fipVar.t), Boolean.valueOf(fipVar.u), Boolean.valueOf(fipVar.v));
                return Optional.empty();
            }
        }
    }

    @Override // defpackage.fjm
    public final void c(fjl fjlVar) {
        fja fjaVar = this.z;
        synchronized (fjaVar) {
            int i = fjaVar.l;
            Map map = fjaVar.b;
            Integer numValueOf = Integer.valueOf(i);
            fip fipVar = (fip) map.get(numValueOf);
            if (fipVar == null) {
                ((sgt) fja.a.c().M(210)).G("Cancelling capture due to %s for groupId: %s failed, no active session in map %s", fjlVar, numValueOf, map.keySet().toArray());
            } else {
                fipVar.e(fjlVar);
            }
        }
        int iOrdinal = fjlVar.ordinal();
        if (iOrdinal == 0) {
            f();
            return;
        }
        if (iOrdinal == 1) {
            e(fkf.DISTANCE);
        } else if (iOrdinal == 2) {
            e(fkf.UNKNOWN);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            e(fkf.UNSUPPORTED_SCENE);
        }
    }

    @Override // defpackage.fjm
    public final void d() throws Resources.NotFoundException {
        int iOrdinal;
        if (this.y == 2) {
            f();
            if (this.k || this.o.ai("thumbnail_tooltip_shown") >= 3) {
                return;
            }
            ThumbnailView thumbnailView = this.c.a.o;
            nfh nfhVar = new nfh(thumbnailView.getResources().getString(R.string.thumbnail_tooltip));
            Resources resources = thumbnailView.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.cottage_tooltip_offset);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.cottage_tooltip_margin);
            int i = 1;
            if (((mxj) this.t.dL()).equals(mxj.TABLET_LAYOUT) || (iOrdinal = ((mxm) this.u.dL()).ordinal()) == 1) {
                nfhVar.i(thumbnailView, dimensionPixelSize);
                nfhVar.h();
            } else if (iOrdinal != 2) {
                nfhVar.c(thumbnailView, dimensionPixelSize);
                nfhVar.b = 1;
            } else {
                nfhVar.g(thumbnailView, dimensionPixelSize);
                nfhVar.h();
            }
            nfhVar.j();
            nfhVar.h = Optional.of(Integer.valueOf(dimensionPixelSize2));
            nfhVar.k();
            nfhVar.l();
            nfhVar.c = 300;
            nfhVar.d = 6000;
            nfhVar.d(new fog(this, i));
            nfhVar.f(new fem(this, 14), this.d);
            nfhVar.l = this.A;
            nfhVar.k = 4;
            nfhVar.e = false;
            this.j = nfhVar.a();
        }
    }

    public final void e(fkf fkfVar) {
        this.y = 0;
        this.v.b(fkfVar);
        this.b.c();
    }
}
