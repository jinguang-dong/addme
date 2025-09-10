package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mfq {
    public static final sgv a = sgv.g("mfq");
    public final LruCache b = new mfp();

    public final Bitmap a(ltd ltdVar) {
        tym tymVar = (tym) this.b.get(ltdVar);
        if (tymVar != null) {
            return (Bitmap) tymVar.c;
        }
        return null;
    }

    public final Integer b(ltd ltdVar) {
        tym tymVar = (tym) this.b.get(ltdVar);
        if (tymVar != null) {
            return Integer.valueOf(tymVar.a);
        }
        return null;
    }
}
