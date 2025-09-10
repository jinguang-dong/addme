package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class nmo {
    private static final sgv a = sgv.g("nmo");
    private static final scn b = scn.J(pcu.TOP_RIGHT, pcu.BOTTOM_LEFT, pcu.LEFT_TOP, pcu.RIGHT_BOTTOM);

    /* JADX WARN: Type inference failed for: r1v1, types: [sgt, shi] */
    public static Bitmap a(byte[] bArr) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (!options.mCancel && options.outWidth != -1 && options.outHeight != -1) {
                int iCeil = (int) Math.ceil(Math.sqrt((options.outWidth * options.outHeight) / 51200.0d));
                if (iCeil <= 8) {
                    while (i < iCeil) {
                        i += i;
                    }
                } else {
                    i = ((iCeil + 7) / 8) * 8;
                }
                options.inSampleSize = i;
                options.inJustDecodeBounds = false;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                pcu pcuVar = pcu.TOP_LEFT;
                pcu pcuVarC = pcu.c(pdb.a(bArr));
                if (pcuVarC != null && pcuVarC != pcu.TOP_LEFT) {
                    return b(bitmapDecodeByteArray, pcu.a(pcuVarC).e, b.contains(pcuVarC));
                }
                return bitmapDecodeByteArray;
            }
            return null;
        } catch (OutOfMemoryError e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 5441)).s("Got oom exception ");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap b(android.graphics.Bitmap r7, int r8, boolean r9) {
        /*
            if (r8 != 0) goto L5
            if (r9 == 0) goto L71
            r9 = 1
        L5:
            if (r7 == 0) goto L71
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            if (r9 == 0) goto L47
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.postScale(r9, r0)
            int r8 = r8 + 360
            int r8 = r8 % 360
            r9 = 0
            if (r8 == 0) goto L3f
            r0 = 180(0xb4, float:2.52E-43)
            if (r8 != r0) goto L21
            goto L3f
        L21:
            r0 = 90
            if (r8 == r0) goto L36
            r0 = 270(0x10e, float:3.78E-43)
            if (r8 != r0) goto L2a
            goto L36
        L2a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Invalid degrees="
            java.lang.String r8 = defpackage.a.bv(r8, r9)
            r7.<init>(r8)
            throw r7
        L36:
            int r0 = r7.getHeight()
            float r0 = (float) r0
            r5.postTranslate(r0, r9)
            goto L47
        L3f:
            int r0 = r7.getWidth()
            float r0 = (float) r0
            r5.postTranslate(r0, r9)
        L47:
            if (r8 == 0) goto L5b
            int r9 = r7.getWidth()
            float r9 = (float) r9
            int r0 = r7.getHeight()
            float r0 = (float) r0
            float r8 = (float) r8
            r1 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r1
            float r0 = r0 / r1
            r5.postRotate(r8, r9, r0)
        L5b:
            int r3 = r7.getWidth()     // Catch: java.lang.OutOfMemoryError -> L71
            int r4 = r7.getHeight()     // Catch: java.lang.OutOfMemoryError -> L71
            r6 = 1
            r1 = 0
            r2 = 0
            r0 = r7
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.OutOfMemoryError -> L72
            if (r0 == r7) goto L72
            r0.recycle()     // Catch: java.lang.OutOfMemoryError -> L72
            return r7
        L71:
            r0 = r7
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmo.b(android.graphics.Bitmap, int, boolean):android.graphics.Bitmap");
    }
}
