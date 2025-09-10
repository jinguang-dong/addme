package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mfp extends LruCache {
    public mfp() {
        super(20971520);
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        ltd ltdVar = (ltd) obj;
        super.entryRemoved(z, ltdVar, (tym) obj2, (tym) obj3);
        ((sgt) mfq.a.c().M(4746)).F("Thumbnail holder removed: key=%s evicted=%b", ltdVar, z);
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        Object obj3 = ((tym) obj2).c;
        if (obj3 != null) {
            return ((Bitmap) obj3).getAllocationByteCount();
        }
        return 1;
    }
}
