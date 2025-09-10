package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class etm implements ete {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final etn b;
    private final Set c;
    private final long d;
    private long e;
    private int f;
    private int g;
    private int h;
    private int i;

    public etm(long j) {
        ets etsVar = new ets();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        this.d = j;
        this.b = etsVar;
        this.c = setUnmodifiableSet;
    }

    private static Bitmap f(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007d A[Catch: all -> 0x00d4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:8:0x000b, B:10:0x0024, B:24:0x004a, B:26:0x004e, B:28:0x0063, B:30:0x006b, B:35:0x0076, B:38:0x007d, B:39:0x0089, B:40:0x008c, B:42:0x0099, B:44:0x00a9, B:45:0x00af, B:11:0x0027, B:19:0x003a, B:20:0x003f, B:21:0x0042, B:22:0x0045, B:23:0x0048, B:48:0x00c6, B:49:0x00d3), top: B:53:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized android.graphics.Bitmap g(int r13, int r14, android.graphics.Bitmap.Config r15) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etm.g(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    private final synchronized void h(long j) {
        while (this.e > j) {
            etn etnVar = this.b;
            Bitmap bitmap = (Bitmap) ((ets) etnVar).g.b();
            if (bitmap != null) {
                ((ets) etnVar).c(Integer.valueOf(fax.a(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    etnVar.toString();
                }
                this.e = 0L;
                return;
            }
            this.e -= fax.a(bitmap);
            this.i++;
            bitmap.recycle();
        }
    }

    @Override // defpackage.ete
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapG = g(i, i2, config);
        if (bitmapG == null) {
            return f(i, i2, config);
        }
        bitmapG.eraseColor(0);
        return bitmapG;
    }

    @Override // defpackage.ete
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapG = g(i, i2, config);
        return bitmapG == null ? f(i, i2, config) : bitmapG;
    }

    @Override // defpackage.ete
    public final void c() {
        h(0L);
    }

    @Override // defpackage.ete
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                etn etnVar = this.b;
                long jA = fax.a(bitmap);
                long j = this.d;
                if (jA <= j && this.c.contains(bitmap.getConfig())) {
                    int iA = fax.a(bitmap);
                    etq etqVarD = ((ets) etnVar).f.d(fax.a(bitmap), bitmap.getConfig());
                    ((ets) etnVar).g.c(etqVarD, bitmap);
                    NavigableMap navigableMapB = ((ets) etnVar).b(bitmap.getConfig());
                    Integer num = (Integer) navigableMapB.get(Integer.valueOf(etqVarD.a));
                    navigableMapB.put(Integer.valueOf(etqVarD.a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                    this.h++;
                    this.e += iA;
                    h(j);
                    return;
                }
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ete
    public final void e(int i) {
        if (i >= 40 || i >= 20) {
            c();
        } else if (i == 15) {
            h(this.d >> 1);
        }
    }
}
