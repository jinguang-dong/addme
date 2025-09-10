package defpackage;

import com.google.geo.lightfield.processing.ProgressCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ijf implements ProgressCallback {
    final /* synthetic */ ijg a;

    public ijf(ijg ijgVar) {
        this.a = ijgVar;
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final void setProgress(float f) {
        this.a.a.c(par.b(f));
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final boolean wasCancelled() {
        return false;
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final void setRange(float f, float f2) {
    }
}
