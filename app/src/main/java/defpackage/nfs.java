package defpackage;

import android.view.Choreographer;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nfs implements Choreographer.FrameCallback {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nfs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.b == 0) {
            sgv sgvVar = nfw.a;
            this.a.run();
            return;
        }
        Object obj = this.a;
        fqy fqyVar = (fqy) obj;
        fqyVar.x.l(mej.ACTIVITY_FIRST_PREVIEW_FRAME_RENDERED, CameraActivityTiming.a);
        fqyVar.y.accept(fsq.e);
    }
}
