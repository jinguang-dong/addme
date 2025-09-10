package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import j$.util.Collection;
import java.io.FileDescriptor;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ged implements oyn {
    private static final sgv o = sgv.g("ged");
    public final oyj a;
    public final oyj b;
    public final oyx c;
    public final oyx d;
    public final rwc e;
    public final sbv f;
    public final sbv g;
    public final plx i;
    public gec k;
    public final ozh l;
    public final ozh m;
    public final ges n;
    private final syw p;
    private final int q;
    private final syu r;
    public oyk h = null;
    public final Object j = new Object();

    public ged(gee geeVar) {
        ozl ozlVar = geeVar.a;
        this.q = ozlVar.l;
        this.r = ozlVar.s;
        this.p = ozlVar.a;
        this.n = ozlVar.x;
        this.i = geeVar.j;
        ozh ozhVar = geeVar.m;
        ozhVar.getClass();
        this.l = ozhVar;
        ozh ozhVar2 = geeVar.n;
        ozhVar2.getClass();
        this.m = ozhVar2;
        oyx oyxVar = geeVar.e;
        oyxVar.getClass();
        this.c = oyxVar;
        oyx oyxVar2 = geeVar.f;
        oyxVar2.getClass();
        this.d = oyxVar2;
        rwc rwcVar = geeVar.g;
        rwcVar.getClass();
        this.e = rwcVar;
        oyj oyjVar = geeVar.c;
        oyjVar.getClass();
        this.a = oyjVar;
        oyj oyjVar2 = geeVar.d;
        oyjVar2.getClass();
        this.b = oyjVar2;
        this.f = sbv.m(geeVar.h);
        this.g = sbv.m(geeVar.i);
        this.k = gec.READY;
    }

    private final syu s(boolean z) {
        syu syuVarN;
        synchronized (this.j) {
            long jUptimeMillis = SystemClock.uptimeMillis() * 1000;
            this.c.close();
            this.d.close();
            syw sywVar = this.p;
            syuVarN = ske.N(ske.H(sywVar.submit(new gdy(this, z, jUptimeMillis, 1)), sywVar.submit(new gdy(this, z, jUptimeMillis, 0)), sywVar.submit(new gdy(this, z, jUptimeMillis, 2)), sywVar.submit(new gdz(this, jUptimeMillis, 1)), sywVar.submit(new gdz(this, jUptimeMillis, 0))).b(new gea(this, 0), sywVar));
        }
        return syuVarN;
    }

    @Override // defpackage.oyn
    public final int a() {
        return this.q;
    }

    @Override // defpackage.oyn
    public final rwc b() {
        rwc rwcVarI;
        synchronized (this.j) {
            rnt.L(this.k != gec.CLOSED);
            rwcVarI = rwc.i(this.m.d);
        }
        return rwcVarI;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    @Override // defpackage.oyn
    public final rwc c() {
        try {
            return (rwc) this.r.get();
        } catch (InterruptedException | ExecutionException e) {
            ((sgt) ((sgt) o.c().i(e)).M((char) 786)).s("Failed to retrieve the location. Ignore.");
            return rvk.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        try {
            h().get();
        } catch (InterruptedException | ExecutionException e) {
            ((sgt) ((sgt) o.b().i(e)).M((char) 785)).s("Failed to stop the video recorder at close");
        }
    }

    @Override // defpackage.oyn
    public final rwc d(String str) {
        return rwc.i((oyi) this.g.get(str));
    }

    @Override // defpackage.oyn
    public final rwc e() {
        return this.l.a();
    }

    @Override // defpackage.oyn
    public final syu f() {
        return s(true);
    }

    @Override // defpackage.oyn
    public final syu g(oyk oykVar) {
        synchronized (this.j) {
            gec gecVar = this.k;
            if (gecVar != gec.READY) {
                return ske.L(new IllegalStateException(eld.b(gecVar, "Trying to start with state: ")));
            }
            this.h = oykVar;
            try {
                this.b.d(oykVar);
                this.d.d(oykVar);
                syw sywVar = this.p;
                return ske.H(sywVar.submit(new dyo(this, 6)), sywVar.submit(new dyo(this, 7)), sywVar.submit(new dyo(this, 8)), sywVar.submit(new dyo(this, 9)), sywVar.submit(new dyo(this, 10))).b(new gea(this, 2), sywVar);
            } catch (IllegalStateException e) {
                return ske.L(e);
            }
        }
    }

    @Override // defpackage.oyn
    public final syu h() {
        return s(false);
    }

    @Override // defpackage.oyn
    public final void i(long j) {
        throw new UnsupportedOperationException("notifyCloseImagesBeforePts is not supported.");
    }

    @Override // defpackage.oyn
    public final void k(MediaFormat mediaFormat) {
        throw new UnsupportedOperationException("notifyMediaFormatChanged is not supported.");
    }

    @Override // defpackage.oyn
    public final void l(FileDescriptor fileDescriptor) {
        synchronized (this.j) {
            if (this.k != gec.STARTED) {
                ((sgt) o.c().M(791)).v("STARTED is expected but we got %s", this.k);
            } else {
                this.a.i(fileDescriptor);
            }
        }
    }

    @Override // defpackage.oyn
    public final void m(int i, MediaCodec.BufferInfo bufferInfo) {
        throw new UnsupportedOperationException("writeEncodedVideoData is not supported.");
    }

    @Override // defpackage.oyn
    public final void n(poj pojVar, long j, boolean z) {
        synchronized (this.j) {
            if (this.k == gec.STARTED) {
                this.l.c(pojVar, j, z);
            } else {
                ((sgt) o.c().M(792)).v("STARTED is expected but we got %s", this.k);
                pojVar.close();
            }
        }
    }

    @Override // defpackage.oyn
    public final void o(Object obj) {
        synchronized (this.j) {
            gec gecVar = this.k;
            if (gecVar != gec.STARTED && gecVar != gec.PAUSED) {
                ((sgt) o.c().M(784)).v("Trying to add metadata but state is %s", this.k);
            } else {
                this.b.q(obj);
                this.a.q(obj);
            }
        }
    }

    @Override // defpackage.oyn
    public final void p() {
        synchronized (this.j) {
            if (this.k != gec.STARTED) {
                ske.M(null);
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() * 1000;
            this.c.b(jUptimeMillis);
            this.d.b(jUptimeMillis);
            this.l.f(jUptimeMillis);
            this.m.f(jUptimeMillis);
            rwc rwcVar = this.e;
            if (rwcVar.h()) {
                ((oys) rwcVar.c()).b(jUptimeMillis);
            }
            Collection.EL.stream(this.f.values()).forEach(new geb(jUptimeMillis, 0));
            Collection.EL.stream(this.g.values()).forEach(new geb(jUptimeMillis, 2));
            this.k = gec.PAUSED;
            ske.M(null);
        }
    }

    @Override // defpackage.oyn
    public final void q() {
        synchronized (this.j) {
            if (this.k != gec.PAUSED) {
                ske.M(null);
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() * 1000;
            this.l.g(jUptimeMillis);
            this.m.g(jUptimeMillis);
            rwc rwcVar = this.e;
            if (rwcVar.h()) {
                ((oys) rwcVar.c()).d(jUptimeMillis);
            }
            Collection.EL.stream(this.f.values()).forEach(new geb(jUptimeMillis, 4));
            Collection.EL.stream(this.g.values()).forEach(new geb(jUptimeMillis, 5));
            this.c.c(jUptimeMillis);
            this.d.c(jUptimeMillis);
            this.k = gec.STARTED;
            ske.M(null);
        }
    }

    @Override // defpackage.oyn
    public final void r(float f) {
        throw new UnsupportedOperationException("changeBitrate not supported.");
    }

    @Override // defpackage.oyn
    public final void j(int i) {
        throw new UnsupportedOperationException(KsvNaXS.koNwnJ);
    }
}
