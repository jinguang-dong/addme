package defpackage;

import android.media.MediaCodecList;
import android.os.Process;
import android.os.Trace;
import com.google.android.apps.camera.jni.gxp.GxpUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class iyy implements Runnable {
    private final /* synthetic */ int a;

    public /* synthetic */ iyy(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        int i = this.a;
        if (i == 0) {
            int i2 = izb.a;
            Trace.beginSection("preloadMediaCodecList");
            new MediaCodecList(0);
            Trace.endSection();
            return;
        }
        if (i == 1) {
            zo zoVar = bxv.F;
            synchronized (zoVar) {
                Object[] objArr = zoVar.a;
                int i3 = zoVar.b;
                for (int i4 = 0; i4 < i3; i4++) {
                    bxv bxvVar = (bxv) objArr[i4];
                    bxvVar.u(bxvVar.j);
                }
            }
            return;
        }
        if (i == 2) {
            int i5 = izb.a;
            Trace.beginSection("loadJniLibraries");
            paw.a((Class) ioo.a.get(0), null);
            GxpUtils.b();
            ins.b();
            Trace.endSection();
            return;
        }
        if (i == 3) {
            out.a();
            return;
        }
        if (i == 5) {
            int i6 = ndn.i;
        } else if (i == 6) {
            Process.setThreadPriority(-4);
        } else {
            if (i != 8) {
                return;
            }
            qxt.e();
        }
    }
}
