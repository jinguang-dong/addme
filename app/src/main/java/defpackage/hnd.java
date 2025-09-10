package defpackage;

import android.app.SharedElementCallback;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hnd extends SharedElementCallback {
    final /* synthetic */ Bitmap a;

    public hnd(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // android.app.SharedElementCallback
    public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        return this.a;
    }
}
