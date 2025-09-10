package defpackage;

import android.media.ImageWriter;
import android.os.Handler;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sr {
    public final sz a;
    public final Map b;
    public final rg c;
    public final boolean d;
    public boolean f;
    public sq g;
    public final xk h;
    private final qrh j;
    private final int i = ss.a.b();
    public final Object e = new Object();

    public sr(sz szVar, qrh qrhVar, Map map, rg rgVar, boolean z) {
        this.a = szVar;
        this.j = qrhVar;
        this.b = map;
        this.c = rgVar;
        this.d = z;
        xk xkVar = null;
        if (!((wq) rgVar).i.isEmpty()) {
            cbd cbdVar = (cbd) ske.bB(((wq) rgVar).i);
            Surface surfaceA = szVar.a();
            if (surfaceA == null) {
                throw new IllegalStateException("inputSurface is required to create instance of imageWriter.");
            }
            try {
                int i = xk.b;
                int i2 = cbdVar.a;
                rf rfVar = new rf(cbdVar.b);
                Handler handlerL = qrhVar.l();
                handlerL.getClass();
                ImageWriter imageWriterNewInstance = ImageWriter.newInstance(surfaceA, 20, rfVar.a);
                imageWriterNewInstance.getClass();
                xk xkVar2 = new xk(imageWriterNewInstance, i2);
                imageWriterNewInstance.setOnImageReleasedListener(xkVar2, handlerL);
                xkVar = xkVar2;
            } catch (RuntimeException e) {
                sz szVar2 = this.a;
                Objects.toString(szVar2);
                Log.w("CXCP", "Failed to create ImageWriter for session ".concat(szVar2.toString()), e);
            }
            if (xkVar != null) {
                Objects.toString(xkVar);
                Objects.toString(this.a);
            }
        }
        this.h = xkVar;
    }

    public final String toString() {
        return cdVQ.XRYC + this.i;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, uhf] */
    public final void a() {
        sq sqVar;
        toString();
        try {
            Trace.beginSection(toString().concat("#disconnect"));
            synchronized (this.e) {
                if (!this.f) {
                    this.f = true;
                    xk xkVar = this.h;
                    if (xkVar != null) {
                        xkVar.close();
                    }
                    Surface surfaceA = this.a.a();
                    if (surfaceA != null) {
                        surfaceA.release();
                    }
                    sqVar = this.g;
                } else {
                    sqVar = null;
                }
            }
            if (this.d && sqVar != null) {
                Objects.toString(sqVar);
                und undVar = vh.a;
                qrh qrhVar = this.j;
                if (((ufg) vh.a(qrhVar.g, (una) qrhVar.f, 2000L, new acr(sqVar, (uhb) null, 1))) == null) {
                    Log.e(CGlJpiVWrCQOq.OCTdioEQho, this + "#close: awaitStarted on last repeating request timed out, lastSingleRepeatingRequestSequence = " + sqVar);
                }
            }
        } finally {
            Trace.endSection();
        }
    }
}
