package defpackage;

import android.graphics.Rect;
import android.os.Trace;
import com.google.android.apps.camera.jni.aesthetic.AestheticScorerNima;
import com.google.android.apps.camera.jni.aesthetic.AestheticScorerNimaV2;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnp implements paq {
    private final float[] a;
    private final log b;
    private boolean c = false;
    private float d = -1.0f;
    private inq e;

    public lnp(boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = null;
        if (z) {
            inq aestheticScorerNimaV2 = z3 ? new AestheticScorerNimaV2() : new AestheticScorerNima();
            this.e = aestheticScorerNimaV2;
            aestheticScorerNimaV2.c(z4);
        }
        this.a = new float[z2 ? z3 ? 288 : 256 : 0];
        this.b = log.b();
    }

    public final synchronized float a(poj pojVar, lnl lnlVar) {
        if (this.e != null && lnlVar.r.length <= 0) {
            boolean z = this.d > 0.0f && !this.b.a(lnlVar.c);
            this.c = z;
            if (!z) {
                Trace.beginSection("AestheticFrameQualityScorer.getFrameScore");
                Rect rect = lnlVar.p;
                Rect rect2 = lnlVar.v;
                float fWidth = 0.5f;
                if (rect != null && rect2 != null && rect.width() > 0 && rect.height() > 0 && rect2.width() > 0 && rect2.height() > 0) {
                    fWidth = 0.5f * (((rect2.width() * 0.5f) / rect.width()) + ((rect2.height() * 0.5f) / rect.height()));
                }
                List listG = pojVar.g();
                poi poiVar = (poi) listG.get(0);
                poi poiVar2 = (poi) listG.get(1);
                poi poiVar3 = (poi) listG.get(2);
                inq inqVar = this.e;
                if (inqVar != null) {
                    this.d = inqVar.a(pojVar.c(), pojVar.b(), fWidth, poiVar.getBuffer(), poiVar.getPixelStride(), poiVar.getRowStride(), poiVar2.getBuffer(), poiVar2.getPixelStride(), poiVar2.getRowStride(), poiVar3.getBuffer(), poiVar3.getPixelStride(), poiVar3.getRowStride(), this.a);
                } else {
                    Arrays.fill(this.a, 0.0f);
                    this.d = 0.0f;
                }
                Trace.endSection();
            }
            return this.d;
        }
        Arrays.fill(this.a, 0.0f);
        this.d = 0.0f;
        return 0.0f;
    }

    public final synchronized rwc b() {
        float[] fArr = this.a;
        if (fArr.length == 0) {
            return rvk.a;
        }
        float fAbs = 0.0f;
        for (float f : fArr) {
            fAbs += Math.abs(f);
        }
        return ((double) fAbs) < 1.0E-6d ? rvk.a : rwc.j((float[]) fArr.clone());
    }

    public final synchronized boolean c() {
        return this.c;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        inq inqVar = this.e;
        if (inqVar != null) {
            inqVar.b();
            this.e = null;
        }
    }
}
