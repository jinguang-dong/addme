package defpackage;

import android.opengl.GLES20;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fij implements Runnable {
    private final /* synthetic */ int a;

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            sgv sgvVar = fip.a;
            return;
        }
        if (i == 7) {
            DynamicDepthUtils.savePdCacheImpl();
            return;
        }
        if (i == 10) {
            nmt nmtVar = ibo.b;
            return;
        }
        if (i == 15) {
            int i2 = ipz.h;
            return;
        }
        if (i == 2) {
            sgv sgvVar2 = fip.a;
        } else if (i == 3) {
            GLES20.glFinish();
        } else {
            if (i != 4) {
                return;
            }
            sgv sgvVar3 = fqy.a;
        }
    }
}
