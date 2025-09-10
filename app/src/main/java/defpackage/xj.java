package defpackage;

import android.media.Image;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xj implements xo {
    public final Image a;
    private final int b;
    private final int c;
    private final int d;
    private final long e;

    public xj(Image image) {
        this.a = image;
        this.b = image.getFormat();
        this.c = image.getWidth();
        this.d = image.getHeight();
        this.e = image.getTimestamp();
    }

    @Override // defpackage.ri
    public final Object c(ukx ukxVar) {
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final String toString() {
        return "Image-" + rf.a(this.b) + "-w" + this.c + 'h' + this.d + '-' + this.e;
    }
}
