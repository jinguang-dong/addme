package defpackage;

import android.media.MediaFormat;
import androidx.wear.ambient.AmbientMode;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jqb implements hpb {
    public static final sgv a = sgv.g("jqb");
    private final mwq C;
    private final ejt D;
    public final Executor b;
    public final hws c;
    public final hpa d;
    public final pas e;
    public final MediaFormat f;
    public volatile qfc o;
    public final hbp p;
    private final lob r;
    private final rwc s;
    private final rwc t;
    private final jpw u;
    public final AtomicLong g = new AtomicLong(-1);
    public final AtomicLong h = new AtomicLong(-1);
    public final AtomicLong i = new AtomicLong(-1);
    public final AtomicLong j = new AtomicLong(-1);
    private final AtomicLong v = new AtomicLong(-1);
    private final AtomicLong w = new AtomicLong(-1);
    public final AtomicLong k = new AtomicLong(0);
    public final AtomicLong l = new AtomicLong(0);
    public final AtomicLong m = new AtomicLong(0);
    private final AtomicLong x = new AtomicLong(0);
    private final AtomicLong y = new AtomicLong(0);
    private final AtomicLong z = new AtomicLong(0);
    private final AtomicLong A = new AtomicLong(0);
    public final jsu n = new jsu();
    public AmbientMode.AmbientController q = null;
    private lnl B = null;

    public jqb(hws hwsVar, hbp hbpVar, hpa hpaVar, rwc rwcVar, rwc rwcVar2, Executor executor, pas pasVar, lob lobVar, mwq mwqVar, jpw jpwVar, ejt ejtVar, MediaFormat mediaFormat) {
        this.c = hwsVar;
        this.p = hbpVar;
        this.s = rwcVar;
        this.t = rwcVar2;
        this.b = executor;
        this.r = lobVar;
        this.C = mwqVar;
        this.d = hpaVar;
        this.e = pasVar;
        this.u = jpwVar;
        this.D = ejtVar;
        this.f = mediaFormat;
        gzi gziVar = gzz.a;
    }

    public final void b(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z || jCurrentTimeMillis - this.z.get() > 1000) {
            this.i.get();
            this.h.get();
            this.k.get();
            this.l.get();
            this.g.get();
            this.x.get();
            this.j.get();
            this.m.get();
            this.A.get();
            this.y.get();
            this.v.get();
            this.w.get();
            this.n.a();
            this.z.set(jCurrentTimeMillis);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:21|(2:107|23)(2:24|(2:108|26)(2:110|109))|27|(1:29)|(1:31)|32|(1:38)(1:37)|39|(4:42|(4:114|(1:45)(1:46)|47|117)(3:113|48|116)|115|40)|112|49|103|50|(5:53|119|(2:55|120)|121|51)|118|56|(1:58)|59|(1:61)|62|(1:64)|65|(1:67)|68|(1:70)|71|(1:73)(1:74)|75|(1:77)|78|(3:80|(1:82)|83)(3:84|(1:86)|87)|88|(1:90)(1:91)|95|111|109) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0236, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0237, code lost:
    
        ((defpackage.sgt) ((defpackage.sgt) defpackage.jqb.a.b().i(r0)).M(3022)).s("Cannot serialize gyro data.");
     */
    /* JADX WARN: Type inference failed for: r1v16, types: [sgt, shi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqb.c():void");
    }

    @Override // defpackage.hpb
    public final void ey(lnl lnlVar) {
        if (this.B == null) {
            this.B = lnlVar;
        }
        AtomicLong atomicLong = this.g;
        long j = lnlVar.c;
        atomicLong.set(j);
        this.x.incrementAndGet();
        b(false);
        long jConvert = TimeUnit.MICROSECONDS.convert(j, TimeUnit.NANOSECONDS);
        jsu jsuVar = this.n;
        if (jsuVar.a() > 0) {
            jsuVar.b(jConvert, new jqa(lnlVar, 1));
        }
        Iterator it = jsuVar.a.n().iterator();
        while (it.hasNext()) {
            jpz jpzVar = ((jpy) it.next()).a;
            if (j <= jpzVar.b) {
                break;
            } else if (!jpzVar.g) {
                jpzVar.g = true;
            }
        }
        this.b.execute(new jmr(this, 15));
    }
}
