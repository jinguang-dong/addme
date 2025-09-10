package defpackage;

import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewx {
    public static final eql a = new eql("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", epz.c, eql.a);
    public static final eql b = new eql("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, eql.a);
    public static final eql c;
    public static final eql d;
    public static final eww e;
    private static final Queue h;
    public final List f;
    public final etl g;
    private final ete i;
    private final DisplayMetrics j;
    private final exd k = exd.a();

    static {
        ewu ewuVar = ewu.b;
        c = new eql("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false, eql.a);
        d = new eql("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false, eql.a);
        DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        e = new ewv();
        DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = fax.a;
        h = new ArrayDeque(0);
    }

    public ewx(List list, DisplayMetrics displayMetrics, ete eteVar, etl etlVar) {
        this.f = list;
        eoz.k(displayMetrics);
        this.j = displayMetrics;
        eoz.k(eteVar);
        this.i = eteVar;
        eoz.k(etlVar);
        this.g = etlVar;
    }

    private static int b(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int c(double d2) {
        return (int) (d2 + 0.5d);
    }

    private static synchronized BitmapFactory.Options e() {
        BitmapFactory.Options options;
        Queue queue = h;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options != null) {
            return options;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        g(options2);
        return options2;
    }

    private static void f(BitmapFactory.Options options) {
        g(options);
        Queue queue = h;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static boolean h(int i) {
        return i == 90 || i == 270;
    }

    private static boolean i(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static int[] j(exf exfVar, BitmapFactory.Options options, eww ewwVar, ete eteVar) {
        options.inJustDecodeBounds = true;
        d(exfVar, options, ewwVar, eteVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025a A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:23:0x009b, B:32:0x00b4, B:36:0x00bd, B:91:0x0218, B:93:0x0224, B:105:0x0251, B:117:0x028d, B:120:0x0296, B:122:0x029a, B:123:0x029c, B:125:0x02a4, B:127:0x02aa, B:129:0x02ae, B:131:0x02b6, B:133:0x02bb, B:132:0x02b9, B:134:0x02c1, B:136:0x02cc, B:150:0x0327, B:152:0x032d, B:154:0x0332, B:139:0x02db, B:140:0x02e8, B:149:0x0318, B:142:0x02ec, B:143:0x02f0, B:144:0x02f9, B:145:0x02fd, B:146:0x0306, B:147:0x030f, B:148:0x0313, B:110:0x025a, B:112:0x0260, B:114:0x026a, B:94:0x022c, B:97:0x0232, B:99:0x023c, B:101:0x0241, B:103:0x0249, B:104:0x024d, B:100:0x023f), top: B:163:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0260 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:23:0x009b, B:32:0x00b4, B:36:0x00bd, B:91:0x0218, B:93:0x0224, B:105:0x0251, B:117:0x028d, B:120:0x0296, B:122:0x029a, B:123:0x029c, B:125:0x02a4, B:127:0x02aa, B:129:0x02ae, B:131:0x02b6, B:133:0x02bb, B:132:0x02b9, B:134:0x02c1, B:136:0x02cc, B:150:0x0327, B:152:0x032d, B:154:0x0332, B:139:0x02db, B:140:0x02e8, B:149:0x0318, B:142:0x02ec, B:143:0x02f0, B:144:0x02f9, B:145:0x02fd, B:146:0x0306, B:147:0x030f, B:148:0x0313, B:110:0x025a, B:112:0x0260, B:114:0x026a, B:94:0x022c, B:97:0x0232, B:99:0x023c, B:101:0x0241, B:103:0x0249, B:104:0x024d, B:100:0x023f), top: B:163:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0296 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:23:0x009b, B:32:0x00b4, B:36:0x00bd, B:91:0x0218, B:93:0x0224, B:105:0x0251, B:117:0x028d, B:120:0x0296, B:122:0x029a, B:123:0x029c, B:125:0x02a4, B:127:0x02aa, B:129:0x02ae, B:131:0x02b6, B:133:0x02bb, B:132:0x02b9, B:134:0x02c1, B:136:0x02cc, B:150:0x0327, B:152:0x032d, B:154:0x0332, B:139:0x02db, B:140:0x02e8, B:149:0x0318, B:142:0x02ec, B:143:0x02f0, B:144:0x02f9, B:145:0x02fd, B:146:0x0306, B:147:0x030f, B:148:0x0313, B:110:0x025a, B:112:0x0260, B:114:0x026a, B:94:0x022c, B:97:0x0232, B:99:0x023c, B:101:0x0241, B:103:0x0249, B:104:0x024d, B:100:0x023f), top: B:163:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a4 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:23:0x009b, B:32:0x00b4, B:36:0x00bd, B:91:0x0218, B:93:0x0224, B:105:0x0251, B:117:0x028d, B:120:0x0296, B:122:0x029a, B:123:0x029c, B:125:0x02a4, B:127:0x02aa, B:129:0x02ae, B:131:0x02b6, B:133:0x02bb, B:132:0x02b9, B:134:0x02c1, B:136:0x02cc, B:150:0x0327, B:152:0x032d, B:154:0x0332, B:139:0x02db, B:140:0x02e8, B:149:0x0318, B:142:0x02ec, B:143:0x02f0, B:144:0x02f9, B:145:0x02fd, B:146:0x0306, B:147:0x030f, B:148:0x0313, B:110:0x025a, B:112:0x0260, B:114:0x026a, B:94:0x022c, B:97:0x0232, B:99:0x023c, B:101:0x0241, B:103:0x0249, B:104:0x024d, B:100:0x023f), top: B:163:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02cc A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:23:0x009b, B:32:0x00b4, B:36:0x00bd, B:91:0x0218, B:93:0x0224, B:105:0x0251, B:117:0x028d, B:120:0x0296, B:122:0x029a, B:123:0x029c, B:125:0x02a4, B:127:0x02aa, B:129:0x02ae, B:131:0x02b6, B:133:0x02bb, B:132:0x02b9, B:134:0x02c1, B:136:0x02cc, B:150:0x0327, B:152:0x032d, B:154:0x0332, B:139:0x02db, B:140:0x02e8, B:149:0x0318, B:142:0x02ec, B:143:0x02f0, B:144:0x02f9, B:145:0x02fd, B:146:0x0306, B:147:0x030f, B:148:0x0313, B:110:0x025a, B:112:0x0260, B:114:0x026a, B:94:0x022c, B:97:0x0232, B:99:0x023c, B:101:0x0241, B:103:0x0249, B:104:0x024d, B:100:0x023f), top: B:163:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:23:0x009b, B:32:0x00b4, B:36:0x00bd, B:91:0x0218, B:93:0x0224, B:105:0x0251, B:117:0x028d, B:120:0x0296, B:122:0x029a, B:123:0x029c, B:125:0x02a4, B:127:0x02aa, B:129:0x02ae, B:131:0x02b6, B:133:0x02bb, B:132:0x02b9, B:134:0x02c1, B:136:0x02cc, B:150:0x0327, B:152:0x032d, B:154:0x0332, B:139:0x02db, B:140:0x02e8, B:149:0x0318, B:142:0x02ec, B:143:0x02f0, B:144:0x02f9, B:145:0x02fd, B:146:0x0306, B:147:0x030f, B:148:0x0313, B:110:0x025a, B:112:0x0260, B:114:0x026a, B:94:0x022c, B:97:0x0232, B:99:0x023c, B:101:0x0241, B:103:0x0249, B:104:0x024d, B:100:0x023f), top: B:163:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0224 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:23:0x009b, B:32:0x00b4, B:36:0x00bd, B:91:0x0218, B:93:0x0224, B:105:0x0251, B:117:0x028d, B:120:0x0296, B:122:0x029a, B:123:0x029c, B:125:0x02a4, B:127:0x02aa, B:129:0x02ae, B:131:0x02b6, B:133:0x02bb, B:132:0x02b9, B:134:0x02c1, B:136:0x02cc, B:150:0x0327, B:152:0x032d, B:154:0x0332, B:139:0x02db, B:140:0x02e8, B:149:0x0318, B:142:0x02ec, B:143:0x02f0, B:144:0x02f9, B:145:0x02fd, B:146:0x0306, B:147:0x030f, B:148:0x0313, B:110:0x025a, B:112:0x0260, B:114:0x026a, B:94:0x022c, B:97:0x0232, B:99:0x023c, B:101:0x0241, B:103:0x0249, B:104:0x024d, B:100:0x023f), top: B:163:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022c A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #1 {all -> 0x00a9, blocks: (B:23:0x009b, B:32:0x00b4, B:36:0x00bd, B:91:0x0218, B:93:0x0224, B:105:0x0251, B:117:0x028d, B:120:0x0296, B:122:0x029a, B:123:0x029c, B:125:0x02a4, B:127:0x02aa, B:129:0x02ae, B:131:0x02b6, B:133:0x02bb, B:132:0x02b9, B:134:0x02c1, B:136:0x02cc, B:150:0x0327, B:152:0x032d, B:154:0x0332, B:139:0x02db, B:140:0x02e8, B:149:0x0318, B:142:0x02ec, B:143:0x02f0, B:144:0x02f9, B:145:0x02fd, B:146:0x0306, B:147:0x030f, B:148:0x0313, B:110:0x025a, B:112:0x0260, B:114:0x026a, B:94:0x022c, B:97:0x0232, B:99:0x023c, B:101:0x0241, B:103:0x0249, B:104:0x024d, B:100:0x023f), top: B:163:0x009b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.esw a(defpackage.exf r27, int r28, int r29, defpackage.eqm r30, defpackage.eww r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 878
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewx.a(exf, int, int, eqm, eww):esw");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        throw r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap d(defpackage.exf r13, android.graphics.BitmapFactory.Options r14, defpackage.eww r15, defpackage.ete r16) {
        /*
            java.lang.String r1 = "["
            java.lang.String r2 = "Exception decoding bitmap, outWidth: "
            r3 = 0
            java.lang.String r3 = com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy.UgFUB
            boolean r0 = r14.inJustDecodeBounds
            if (r0 != 0) goto L11
            r15.b()
            r13.d()
        L11:
            int r4 = r14.outWidth
            int r5 = r14.outHeight
            java.lang.String r6 = r14.outMimeType
            java.util.concurrent.locks.Lock r0 = defpackage.exm.b
            r0.lock()
            android.graphics.Bitmap r13 = r13.b(r14)     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.Throwable -> Lb0
            goto La8
        L22:
            r0 = move-exception
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> Lb0
            android.graphics.Bitmap r8 = r14.inBitmap     // Catch: java.lang.Throwable -> Lb0
            r9 = 0
            if (r8 != 0) goto L2c
            r1 = r9
            goto L70
        L2c:
            int r10 = r8.getAllocationByteCount()     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r11.<init>(r3)     // Catch: java.lang.Throwable -> Lb0
            r11.append(r10)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r3 = ")"
            r11.append(r3)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r3 = r11.toString()     // Catch: java.lang.Throwable -> Lb0
            int r10 = r8.getWidth()     // Catch: java.lang.Throwable -> Lb0
            int r11 = r8.getHeight()     // Catch: java.lang.Throwable -> Lb0
            android.graphics.Bitmap$Config r8 = r8.getConfig()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r12.<init>(r1)     // Catch: java.lang.Throwable -> Lb0
            r12.append(r10)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "x"
            r12.append(r1)     // Catch: java.lang.Throwable -> Lb0
            r12.append(r11)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "] "
            r12.append(r1)     // Catch: java.lang.Throwable -> Lb0
            r12.append(r8)     // Catch: java.lang.Throwable -> Lb0
            r12.append(r3)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = r12.toString()     // Catch: java.lang.Throwable -> Lb0
        L70:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lb0
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r2 = ", outHeight: "
            r3.append(r2)     // Catch: java.lang.Throwable -> Lb0
            r3.append(r5)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r2 = ", outMimeType: "
            r3.append(r2)     // Catch: java.lang.Throwable -> Lb0
            r3.append(r6)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r2 = ", inBitmap: "
            r3.append(r2)     // Catch: java.lang.Throwable -> Lb0
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lb0
            r7.<init>(r1, r0)     // Catch: java.lang.Throwable -> Lb0
            android.graphics.Bitmap r0 = r14.inBitmap     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto Laf
            android.graphics.Bitmap r0 = r14.inBitmap     // Catch: java.io.IOException -> Lae java.lang.Throwable -> Lb0
            r1 = r16
            r1.d(r0)     // Catch: java.io.IOException -> Lae java.lang.Throwable -> Lb0
            r14.inBitmap = r9     // Catch: java.io.IOException -> Lae java.lang.Throwable -> Lb0
            android.graphics.Bitmap r13 = d(r13, r14, r15, r16)     // Catch: java.io.IOException -> Lae java.lang.Throwable -> Lb0
        La8:
            java.util.concurrent.locks.Lock r14 = defpackage.exm.b
            r14.unlock()
            return r13
        Lae:
            throw r7     // Catch: java.lang.Throwable -> Lb0
        Laf:
            throw r7     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r0 = move-exception
            r13 = r0
            java.util.concurrent.locks.Lock r14 = defpackage.exm.b
            r14.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewx.d(exf, android.graphics.BitmapFactory$Options, eww, ete):android.graphics.Bitmap");
    }
}
