package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.camera.ui.widget.ReviewImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyb implements fyu {
    public ReviewImageView a;
    public final mwq b;
    private final out c;

    public fyb(ngw ngwVar, out outVar, mwq mwqVar) {
        this.c = outVar;
        this.b = mwqVar;
        outVar.c(new fjw(this, ngwVar, 15));
    }

    @Override // defpackage.fyu
    public final void a() {
        this.c.c(new fxs(this, 2));
    }

    @Override // defpackage.fyu
    public final void b(Bitmap bitmap) {
        this.c.c(new fjw(this, bitmap, 14, null));
    }
}
