package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import java.util.LinkedList;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class geh implements paq {
    public static final sgv a = sgv.g("geh");
    private final jid A;
    public final pbn b;
    public final uem c;
    public final rwc d;
    public final syw e;
    public final uem f;
    public final gdi g;
    public final gno h;
    public final oyg i;
    public final gfg j;
    public final gfa k;
    public final gfc l;
    public final Object m = new Object();
    public rwc n = rvk.a;
    public boolean o = true;
    public gcc p;
    public gcc q;
    public gdv r;
    public final fyy s;
    public ges t;
    public final hbj u;
    public final gfa v;
    public final got w;
    public final gtm x;
    public final cxb y;
    private final ScheduledExecutorService z;

    public geh(uem uemVar, fyy fyyVar, rwc rwcVar, gdi gdiVar, syw sywVar, ScheduledExecutorService scheduledExecutorService, gtm gtmVar, pbn pbnVar, uem uemVar2, jid jidVar, cxb cxbVar, gno gnoVar, oyg oygVar, got gotVar, hbj hbjVar, gfg gfgVar, gfa gfaVar, gfc gfcVar, gfa gfaVar2) {
        this.b = pbnVar;
        this.e = sywVar;
        this.z = scheduledExecutorService;
        this.x = gtmVar;
        this.f = uemVar2;
        this.g = gdiVar;
        this.c = uemVar;
        this.s = fyyVar;
        this.d = rwcVar;
        this.A = jidVar;
        this.y = cxbVar;
        this.h = gnoVar;
        this.i = oygVar;
        this.w = gotVar;
        this.u = hbjVar;
        this.j = gfgVar;
        this.k = gfaVar;
        this.l = gfcVar;
        this.v = gfaVar2;
    }

    public final void a(oyo oyoVar, ngw ngwVar, gaw gawVar, gau gauVar) {
        Surface surfaceA;
        synchronized (this.m) {
            oxp oxpVar = gawVar.g;
            ges gesVar = this.t;
            gesVar.getClass();
            oyoVar.q(gesVar);
            oyoVar.o(oxpVar);
            oyoVar.b((oxm) gawVar.i.f());
            oyoVar.h(((Long) gawVar.l.e(Long.MAX_VALUE)).longValue());
            int i = 2;
            if (!this.u.p(gym.H) || !gawVar.d.e() || !gawVar.c.equals(oxh.FPS_60)) {
                ges gesVar2 = this.t;
                gesVar2.getClass();
                owq owqVar = gesVar2.a.a;
                if (!((ltu) owqVar.dL()).equals(ltu.EXT_BLUETOOTH)) {
                    i = (((ltu) owqVar.dL()).equals(ltu.PHONE) && gesVar2.b.isTouchExplorationEnabled()) ? 8 : 6;
                }
            }
            oyoVar.p(i);
            Object obj = ngwVar.j;
            pas pasVarC = gawVar.d.c();
            synchronized (((gkf) obj).a) {
                surfaceA = ((gkf) obj).a(pasVarC);
                if (surfaceA == null) {
                    surfaceA = MediaCodec.createPersistentInputSurface();
                    LinkedList linkedList = ((gkf) obj).c;
                    surfaceA.getClass();
                    linkedList.add(new gke(pasVarC, surfaceA));
                }
            }
            oyoVar.e(surfaceA);
            oyoVar.l(((Integer) ((ovx) gauVar.s).d).intValue());
            if (gawVar.m) {
                oyoVar.g(this.A.a().c(this.z));
            }
            oyoVar.i(this.x.m().longValue());
            rwc rwcVar = gawVar.j;
            if (rwcVar.h()) {
                ParcelFileDescriptor parcelFileDescriptor = rbu.b((Context) ngwVar.f, (Uri) rwcVar.c(), "rw").getParcelFileDescriptor();
                gno gnoVar = this.h;
                parcelFileDescriptor.getClass();
                this.p = gnoVar.a(parcelFileDescriptor);
            } else {
                ppo ppoVar = gawVar.g.a.f;
                if (gawVar.T == nkw.VIDEO_NIGHT_SIGHT) {
                    this.p = this.h.d(ppoVar);
                } else if (gawVar.L) {
                    this.p = this.h.f(ppoVar);
                } else {
                    this.p = this.h.e(ppoVar);
                }
            }
            gcc gccVar = this.p;
            gccVar.getClass();
            oyoVar.m(gccVar.d());
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, ozp] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.m) {
            this.o = true;
            ges gesVar = this.t;
            if (gesVar != null) {
                gesVar.close();
                this.t = null;
            }
            if (this.n.h()) {
                this.n.c().e();
                this.n = rvk.a;
            }
        }
    }
}
