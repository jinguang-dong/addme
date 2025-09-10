package defpackage;

import android.os.Looper;
import android.util.Log;
import com.google.geo.lightfield.processing.ProgressCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbe implements ProgressCallback {
    public static boolean a = false;
    public final ProgressCallback b;
    public tbd c;
    public Looper d;
    private float e = 0.0f;
    private float f = 1.0f;

    public tbe(ProgressCallback progressCallback) {
        this.b = progressCallback;
    }

    public final void a() throws InterruptedException {
        tbd tbdVar;
        if (!a || (tbdVar = this.c) == null) {
            return;
        }
        a = false;
        tbdVar.sendMessage(tbdVar.obtainMessage(2));
        try {
            this.d.getThread().join();
        } catch (InterruptedException e) {
            Log.e("ProgressInterpolator", e.getMessage());
        }
        this.c = null;
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final void setProgress(float f) throws InterruptedException {
        tbd tbdVar = this.c;
        if (tbdVar == null) {
            return;
        }
        float f2 = (f * this.f) + this.e;
        tbdVar.b = f2;
        ProgressCallback progressCallback = (ProgressCallback) tbdVar.a.get();
        if (progressCallback != null) {
            progressCallback.setProgress(tbdVar.c);
        }
        if (f2 == 1.0f) {
            a();
        }
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final void setRange(float f, float f2) {
        this.e = f;
        this.f = f2 - f;
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final boolean wasCancelled() {
        return false;
    }
}
