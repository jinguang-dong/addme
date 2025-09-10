package defpackage;

import android.graphics.SurfaceTexture;
import com.google.vr.cardboard.ExternalSurfaceManager;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class twg implements twm {
    public final /* synthetic */ ExternalSurfaceManager a;
    private final /* synthetic */ int b;

    public /* synthetic */ twg(ExternalSurfaceManager externalSurfaceManager, int i) {
        this.b = i;
        this.a = externalSurfaceManager;
    }

    @Override // defpackage.twm
    public final void a(twk twkVar) {
        if (this.b == 0) {
            if (twkVar.i && twkVar.d.getAndSet(0) > 0) {
                ExternalSurfaceManager externalSurfaceManager = this.a;
                twkVar.g.updateTexImage();
                SurfaceTexture surfaceTexture = twkVar.g;
                float[] fArr = twkVar.c;
                surfaceTexture.getTransformMatrix(fArr);
                long timestamp = twkVar.g.getTimestamp();
                externalSurfaceManager.a.a(twkVar.a, twkVar.f[0], timestamp, fArr);
                return;
            }
            return;
        }
        if (twkVar.i) {
            AtomicInteger atomicInteger = twkVar.d;
            if (atomicInteger.get() > 0) {
                ExternalSurfaceManager externalSurfaceManager2 = this.a;
                atomicInteger.decrementAndGet();
                twkVar.g.updateTexImage();
                SurfaceTexture surfaceTexture2 = twkVar.g;
                float[] fArr2 = twkVar.c;
                surfaceTexture2.getTransformMatrix(fArr2);
                long timestamp2 = twkVar.g.getTimestamp();
                externalSurfaceManager2.a.a(twkVar.a, twkVar.f[0], timestamp2, fArr2);
            }
        }
    }
}
