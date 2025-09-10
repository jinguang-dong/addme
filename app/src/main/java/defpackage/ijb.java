package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijb extends GLSurfaceView {
    public iko a;

    public ijb(Context context) {
        super(context);
        this.a = null;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        surfaceChanged(getHolder(), 3, getWidth(), getHeight());
        iko ikoVar = this.a;
        if (ikoVar != null) {
            ikoVar.b();
        }
    }
}
