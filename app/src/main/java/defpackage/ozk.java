package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozk implements oyn {
    public final oyj b;
    public final oyx c;
    public final syu f;
    public final ExecutorService g;
    public plx h;
    public int i;
    public final ozh j;
    public final oys k;
    public ges l;
    private final syw m;
    private final int n;
    private final boolean o;
    private final boolean p;
    private boolean q;
    public final Map d = new HashMap();
    public oyk e = null;
    public final Object a = new Object();

    /* JADX WARN: Removed duplicated region for block: B:39:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ozk(defpackage.ozl r33) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozk.<init>(ozl):void");
    }

    private final syu s(boolean z) {
        syu syuVarN;
        synchronized (this.a) {
            long jUptimeMillis = SystemClock.uptimeMillis() * 1000;
            this.c.close();
            syw sywVar = this.m;
            syuVarN = ske.N(ske.F(sywVar.submit(new gdy(this, z, jUptimeMillis, 3)), sywVar.submit(new gdy(this, z, jUptimeMillis, 4)), sywVar.submit(new gdz(this, jUptimeMillis, 2))).b(new gea(this, 5), sywVar));
        }
        return syuVarN;
    }

    @Override // defpackage.oyn
    public final int a() {
        return this.n;
    }

    @Override // defpackage.oyn
    public final rwc b() {
        synchronized (this.a) {
            rnt.L(this.i != 4);
            ozh ozhVar = this.j;
            Surface surface = ozhVar != null ? ozhVar.d : null;
            if (surface == null) {
                return rvk.a;
            }
            return rwc.j(surface);
        }
    }

    @Override // defpackage.oyn
    public final rwc c() {
        try {
            return (rwc) this.f.get();
        } catch (InterruptedException | ExecutionException unused) {
            Log.w("VideoRecorderImpl", "Failed to retrieve the location. Ignoring");
            return rvk.a;
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        try {
            h().get();
        } catch (InterruptedException | ExecutionException unused) {
            Log.e("VideoRecorderImpl", "Failed to stop the video recorder at close");
        }
    }

    @Override // defpackage.oyn
    public final rwc d(String str) {
        return rwc.i((oyi) this.d.get(str));
    }

    @Override // defpackage.oyn
    public final rwc e() {
        ozh ozhVar = this.j;
        if (ozhVar != null) {
            return ozhVar.a();
        }
        Log.w("VideoRecorderImpl", "Cannot get recording time.");
        return rvk.a;
    }

    @Override // defpackage.oyn
    public final syu f() {
        return s(true);
    }

    @Override // defpackage.oyn
    public final syu h() {
        return s(false);
    }

    @Override // defpackage.oyn
    public final void i(long j) {
        if (!this.o) {
            Log.w("VideoRecorderImpl", "Should handle encoder internally.");
            return;
        }
        ozh ozhVar = this.j;
        if (ozhVar == null) {
            Log.w("VideoRecorderImpl", "Failed to notify close images before presentation timestamp.");
        } else {
            if (!ozhVar.j) {
                throw new IllegalStateException("Should handle encoder internally.");
            }
            ozhVar.b(j);
        }
    }

    @Override // defpackage.oyn
    public final void j(int i) {
        if (!this.o) {
            Log.w("VideoRecorderImpl", "Should handle encoder internally.");
            return;
        }
        ozh ozhVar = this.j;
        if (ozhVar == null) {
            Log.w("VideoRecorderImpl", "Failed to notify input buffer available event.");
        } else {
            if (!ozhVar.j) {
                throw new IllegalStateException("Should handle encoder internally.");
            }
            ozhVar.d(i);
        }
    }

    @Override // defpackage.oyn
    public final void k(MediaFormat mediaFormat) {
        if (!this.o) {
            Log.w("VideoRecorderImpl", "Should handle encoder internally.");
            return;
        }
        ozh ozhVar = this.j;
        if (ozhVar == null) {
            Log.w("VideoRecorderImpl", "Failed to notify output media format changed event.");
        } else {
            if (!ozhVar.j) {
                throw new IllegalStateException("Should handle encoder internally.");
            }
            ozhVar.e(mediaFormat);
        }
    }

    @Override // defpackage.oyn
    public final void l(FileDescriptor fileDescriptor) {
        synchronized (this.a) {
            int i = this.i;
            if (i == 2) {
                this.b.i(fileDescriptor);
                return;
            }
            Log.w("VideoRecorderImpl", "STARTED is expected but we got " + prh.Q(i));
        }
    }

    @Override // defpackage.oyn
    public final void m(int i, MediaCodec.BufferInfo bufferInfo) {
        if (!this.o) {
            Log.w("VideoRecorderImpl", "Should handle encoder internally.");
            return;
        }
        ozh ozhVar = this.j;
        if (ozhVar == null) {
            Log.w("VideoRecorderImpl", "Failed to write video date due to not video encoder.");
        } else {
            if (!ozhVar.j) {
                throw new IllegalStateException("Should handle encoder internally.");
            }
            ozhVar.k(i, bufferInfo);
        }
    }

    @Override // defpackage.oyn
    public final void n(poj pojVar, long j, boolean z) {
        ozh ozhVar = this.j;
        if (ozhVar == null) {
            pojVar.close();
            return;
        }
        synchronized (this.a) {
            rnt.L(this.i != 4);
            ozhVar.c(pojVar, j, z);
        }
    }

    @Override // defpackage.oyn
    public final void o(Object obj) {
        synchronized (this.a) {
            int i = this.i;
            if (i == 2 || i == 3) {
                this.b.q(obj);
                return;
            }
            Log.e("VideoRecorderImpl", "Trying to add metadata but state is " + prh.Q(i));
        }
    }

    @Override // defpackage.oyn
    public final void p() {
        synchronized (this.a) {
            int i = this.i;
            if (i != 2) {
                Log.e("VideoRecorderImpl", "STARTED is expected but we got " + prh.Q(i));
                ske.M(null);
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() * 1000;
            this.c.b(jUptimeMillis);
            ozh ozhVar = this.j;
            if (ozhVar != null) {
                ozhVar.f(jUptimeMillis);
            }
            oys oysVar = this.k;
            if (oysVar != null) {
                oysVar.b(jUptimeMillis);
            }
            Iterator it = this.d.values().iterator();
            while (it.hasNext()) {
                ((oyi) it.next()).i(jUptimeMillis);
            }
            this.i = 3;
            ske.M(null);
        }
    }

    @Override // defpackage.oyn
    public final void r(float f) {
        synchronized (this.a) {
            if (this.i == 4) {
                return;
            }
            ozh ozhVar = this.j;
            if (ozhVar == null) {
                Log.w("VideoRecorderImpl", "video encoder is not enabled here, so ignored.");
                return;
            }
            synchronized (ozhVar.b) {
                int i = ozhVar.l;
                if (i != 2) {
                    Log.e(ozhVar.a, "illegal state as " + prh.R(i));
                } else {
                    int iIntValue = ((Integer) ozhVar.g.clamp(Integer.valueOf((int) (f * ozhVar.f)))).intValue();
                    Bundle bundle = new Bundle();
                    bundle.putInt("video-bitrate", iIntValue);
                    ozhVar.c.setParameters(bundle);
                }
            }
        }
    }

    @Override // defpackage.oyn
    public final syu g(oyk oykVar) {
        String str = OPuAVreQM.LBVyHgsoAIrOyyV;
        synchronized (this.a) {
            int i = this.i;
            if (i != 1) {
                return ske.L(new IllegalStateException(str + prh.Q(i)));
            }
            this.e = oykVar;
            try {
                this.b.d(oykVar);
                this.c.d(this.e);
                SystemClock.elapsedRealtime();
                syw sywVar = this.m;
                return ske.F(sywVar.submit(new dyo(this, 20)), sywVar.submit(new ozi(this, 1)), sywVar.submit(new ozi(this, 0))).b(new gea(this, 4), sywVar);
            } catch (IllegalStateException e) {
                return ske.L(e);
            }
        }
    }

    @Override // defpackage.oyn
    public final void q() {
        synchronized (this.a) {
            int i = this.i;
            if (i != 3) {
                Log.e(YyLACfm.FwtgyojW, "PAUSED is expected but we got " + prh.Q(i));
                ske.M(null);
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() * 1000;
            ozh ozhVar = this.j;
            if (ozhVar != null) {
                ozhVar.g(jUptimeMillis);
            }
            oys oysVar = this.k;
            if (oysVar != null) {
                oysVar.d(jUptimeMillis);
            }
            Iterator it = this.d.values().iterator();
            while (it.hasNext()) {
                ((oyi) it.next()).k(jUptimeMillis);
            }
            this.c.c(jUptimeMillis);
            this.i = 2;
            ske.M(null);
        }
    }
}
