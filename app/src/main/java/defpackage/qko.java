package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qko extends qiu {
    public qko(qin qinVar, qgf qgfVar) {
        super(qinVar, qgfVar);
    }

    public static qko c(qin qinVar, qhv qhvVar) {
        return new qko(qinVar, qiu.f(qinVar, new qkm(qinVar, qhvVar, 1)));
    }

    public static qko d(qin qinVar, Bitmap bitmap, int i) {
        return new qko(qinVar, qiu.f(qinVar, new qkn(qinVar, new qhx(new qfq(bitmap.getWidth(), bitmap.getHeight())), i, bitmap)));
    }

    public final qhv b() {
        return ((qkj) i()).g;
    }

    public final String toString() {
        return getClass().getSimpleName() + "@" + hashCode() + "[layout=" + String.valueOf(b()) + "]";
    }
}
