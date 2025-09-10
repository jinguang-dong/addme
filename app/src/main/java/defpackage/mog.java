package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mog {
    public static final Bitmap a = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
    public final Bitmap b;
    public final int c;

    public mog(Bitmap bitmap, int i) {
        this.b = bitmap;
        this.c = i;
    }

    public final boolean a() {
        return this.b == null;
    }

    public final boolean b() {
        return this.b == a;
    }
}
