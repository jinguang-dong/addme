package defpackage;

import android.media.ImageWriter;
import com.google.android.apps.camera.backup.cNHl.ibINv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xk implements ImageWriter.OnImageReleasedListener, AutoCloseable, ri {
    public static final /* synthetic */ int b = 0;
    public final ImageWriter a;
    private final int c;
    private final umb d = new umb(null, umc.a);

    public xk(ImageWriter imageWriter, int i) {
        this.a = imageWriter;
        this.c = i;
        imageWriter.getMaxImages();
        imageWriter.getFormat();
    }

    @Override // defpackage.ri
    public final Object c(ukx ukxVar) {
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(ImageWriter imageWriter) {
        xp xpVar = (xp) this.d.a;
        if (xpVar != null) {
            xpVar.a();
        }
    }

    public final String toString() {
        return ibINv.FbjHBuHRLO + rf.a(this.a.getFormat()) + '-' + ((Object) ql.a(this.c));
    }
}
