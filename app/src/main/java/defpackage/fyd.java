package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.camera.ui.elapsedtimeui.ElapsedTimerView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyd implements oyv {
    private final gnt A;
    private final ndj B;
    private final gav C;
    private final owq D;
    private nkw E;
    private final nca F;
    private final hbj G;
    private final gtm H;
    public final moc a;
    public final String b;
    public final gjj c;
    public final mua d;
    public final gbb e;
    public final fwr f;
    public final ghr g;
    public final owf h;
    public final owf i;
    public final glu j;
    public final out k;
    public final mmk l;
    public final owq m;
    public final owq n;
    public final owq o;
    public final lhm p;
    public gjw q;
    public gaw r;
    public final gli s;
    public final fzb t;
    public fqy u;
    private final ElapsedTimerView v;
    private final fvu w;
    private final mzz x;
    private final naw y;
    private final gfq z;

    public fyd(moc mocVar, mwq mwqVar, Resources resources, gtm gtmVar, gjj gjjVar, fvu fvuVar, mua muaVar, mzz mzzVar, naw nawVar, gfq gfqVar, gbb gbbVar, gnt gntVar, fwr fwrVar, ndj ndjVar, gli gliVar, ghr ghrVar, gav gavVar, fzb fzbVar, glu gluVar, out outVar, hbj hbjVar, owq owqVar, owq owqVar2, owq owqVar3, owq owqVar4, mmk mmkVar, lhm lhmVar, nca ncaVar) {
        this.a = mocVar;
        this.H = gtmVar;
        this.c = gjjVar;
        this.w = fvuVar;
        this.d = muaVar;
        this.x = mzzVar;
        this.y = nawVar;
        this.z = gfqVar;
        this.e = gbbVar;
        this.A = gntVar;
        this.f = fwrVar;
        this.B = ndjVar;
        this.s = gliVar;
        this.g = ghrVar;
        this.C = gavVar;
        this.t = fzbVar;
        this.j = gluVar;
        this.k = outVar;
        this.G = hbjVar;
        this.m = owqVar;
        this.n = owqVar2;
        this.o = owqVar3;
        this.D = owqVar4;
        this.l = mmkVar;
        this.p = lhmVar;
        this.F = ncaVar;
        this.v = (ElapsedTimerView) ((ocq) mwqVar.b).c(R.id.elapsed_timer_view);
        this.b = resources.getString(R.string.video_accessibility_peek);
        this.h = owl.c(owl.h(gavVar.a().A.a, new fhy(7)), gavVar.a().A.b);
        this.i = owl.c(owl.h(gavVar.a().A.a, new fhy(8)), gavVar.a().A.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List a(java.util.List r3) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r3.next()
            oxh r1 = (defpackage.oxh) r1
            oxh r2 = defpackage.oxh.FPS_AUTO
            int r1 = r1.ordinal()
            if (r1 == 0) goto L44
            r2 = 1
            if (r1 == r2) goto L3d
            r2 = 2
            if (r1 == r2) goto L36
            r2 = 3
            if (r1 == r2) goto L2f
            r2 = 4
            if (r1 == r2) goto L3d
            r2 = 5
            if (r1 == r2) goto L36
            rvk r1 = defpackage.rvk.a
            goto L4a
        L2f:
            ltt r1 = defpackage.ltt.FPS_60
            rwc r1 = defpackage.rwc.j(r1)
            goto L4a
        L36:
            ltt r1 = defpackage.ltt.FPS_30
            rwc r1 = defpackage.rwc.j(r1)
            goto L4a
        L3d:
            ltt r1 = defpackage.ltt.FPS_24
            rwc r1 = defpackage.rwc.j(r1)
            goto L4a
        L44:
            ltt r1 = defpackage.ltt.FPS_AUTO
            rwc r1 = defpackage.rwc.j(r1)
        L4a:
            boolean r2 = r1.h()
            if (r2 == 0) goto L9
            java.lang.Object r1 = r1.c()
            r0.add(r1)
            goto L9
        L58:
            java.util.Collections.sort(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyd.a(java.util.List):java.util.List");
    }

    public final void b() {
        this.y.b();
        this.p.b();
    }

    @Override // defpackage.oyv
    public final void c(oyu oyuVar) {
        nau nauVar;
        naw nawVar = this.y;
        if (oyuVar == oyu.CONSECUTIVE_MISSED_METADATA) {
            hgc hgcVar = nawVar.d;
            Context context = nawVar.c;
            context.getString(R.string.better_bug_notification_title);
            context.getString(R.string.better_bug_notification_description);
            return;
        }
        switch (oyuVar) {
            case VIDEO_BUFFER_DELAY:
                nauVar = nau.VIDEO_MISSING_DURING_RECORDING;
                break;
            case AUDIO_BUFFER_DELAY:
            case AUDIO_TRACK_FAIL_TO_START:
                nauVar = nau.AUDIO_MISSING_DURING_RECORDING;
                break;
            case VIDEO_TRACK_FAIL_TO_START:
            case FILE_LOST:
                nauVar = nau.NO_VIDEO_AFTER_RECORDING;
                break;
            case METADATA_DELAY:
            case MUXER_STOP_ERROR:
            case MEDIA_CODEC_ERROR_AUDIO:
            case MEDIA_CODEC_ERROR_VIDEO:
            case OTHER:
                nauVar = nau.PARTIAL_VIDEO_MISSING_AFTER_RECORDING;
                break;
            case METADATA_NOT_FOUND:
            case CONSECUTIVE_MISSED_METADATA:
                nauVar = nau.NONE;
                break;
            case AUDIO_RECORD_ERROR:
                nauVar = nau.MIC_BROKEN;
                break;
            default:
                throw new RuntimeException(null, null);
        }
        nawVar.c(nauVar);
    }

    public final void d() {
        ojl.ce().execute(new fxs(this, 6));
    }

    public final void e() {
        this.p.d();
        if (((gas) ((ovx) this.C.a().g).d).equals(gas.RECORDING_SESSION_ACTIVE)) {
            nca ncaVar = this.F;
            ncaVar.g();
            ncaVar.a();
        }
    }

    public final void f() {
        ojl.ce().execute(new fxs(this, 3));
    }

    public final void g() {
        gfq gfqVar = this.z;
        if (gfqVar.b().h()) {
            owq owqVar = this.C.a().B;
            gnt gntVar = this.A;
            owqVar.a(Boolean.valueOf(!gntVar.a().equals(gfqVar.b().c())));
            gntVar.f((pka) gfqVar.b().c());
        }
    }

    public final void h() {
        this.o.a(rvk.a);
        gbb gbbVar = this.e;
        gbbVar.c.execute(new fxs(gbbVar, 19));
        this.u.n();
        ElapsedTimerView elapsedTimerView = this.v;
        if (elapsedTimerView.getVisibility() != 8) {
            elapsedTimerView.setVisibility(8);
        }
    }

    public final void i(boolean z) {
        if (((Boolean) this.D.dL()).booleanValue()) {
            this.B.O(z);
        } else {
            this.B.O(false);
        }
    }

    public final void j(boolean z) {
        this.w.q(z);
    }

    public final void k(boolean z) {
        if (this.z.p()) {
            this.x.m(true);
        }
        this.a.g(false);
        this.d.b(z);
        this.l.d(false);
        nkw nkwVar = this.E;
        gli gliVar = this.s;
        if (gliVar.k(nkwVar) && !this.G.p(gzo.by) && this.g.f.equals(gho.DEFAULT)) {
            gliVar.h(z);
        }
        gliVar.g(true);
    }

    public final void l(fqy fqyVar, nkw nkwVar) {
        this.u = fqyVar;
        this.E = nkwVar;
        this.q = this.H.j(nkwVar);
        this.z.a = this.E;
        this.e.e = fqyVar;
    }

    public final void m() {
        ojl.ce().execute(new fxs(this, 5));
    }

    public final int n() {
        return this.q.e();
    }
}
