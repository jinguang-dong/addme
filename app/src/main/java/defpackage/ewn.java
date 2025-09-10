package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewn implements eqc {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] b;

    static {
        "MPF".getBytes(Charset.forName("UTF-8"));
        b = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x006c, code lost:
    
        r9 = (java.nio.ByteBuffer) java.nio.ByteBuffer.wrap(r1).order(java.nio.ByteOrder.BIG_ENDIAN).limit(r2);
        r2 = defpackage.eoy.l(6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        if (r2 == 18761) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
    
        if (r2 == 19789) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        r2 = java.nio.ByteOrder.BIG_ENDIAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        r2 = java.nio.ByteOrder.BIG_ENDIAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        r2 = java.nio.ByteOrder.LITTLE_ENDIAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        r9.order(r2);
        r2 = defpackage.eoy.k(10, r9);
        r4 = defpackage.eoy.l(r2 + 6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
    
        if (r3 >= r4) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        r5 = (r2 + 8) + (r3 * 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a9, code lost:
    
        if (defpackage.eoy.l(r5, r9) == 274) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ac, code lost:
    
        r6 = defpackage.eoy.l(r5 + 2, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b2, code lost:
    
        if (r6 <= 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:
    
        if (r6 > 12) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
    
        r7 = defpackage.eoy.k(r5 + 4, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00be, code lost:
    
        if (r7 < 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c0, code lost:
    
        r7 = r7 + defpackage.ewn.b[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c6, code lost:
    
        if (r7 > 4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c8, code lost:
    
        r5 = r5 + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ca, code lost:
    
        if (r5 < 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d0, code lost:
    
        if (r5 > r9.remaining()) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d2, code lost:
    
        if (r7 < 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d9, code lost:
    
        if ((r7 + r5) > r9.remaining()) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00db, code lost:
    
        r9 = defpackage.eoy.l(r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e0, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int e(defpackage.ewl r9, defpackage.etl r10) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewn.e(ewl, etl):int");
    }

    private static final ImageHeaderParser$ImageType f(ewl ewlVar) {
        try {
            int iA = ewlVar.a();
            if (iA == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iD = (iA << 8) | ewlVar.d();
            if (iD == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iD2 = (iD << 8) | ewlVar.d();
            if (iD2 == -1991225785) {
                ewlVar.c(21L);
                try {
                    return ewlVar.d() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (ewk unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iD2 == 1380533830) {
                ewlVar.c(4L);
                if (((ewlVar.a() << 16) | ewlVar.a()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iA2 = (ewlVar.a() << 16) | ewlVar.a();
                if ((iA2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iA2 & 255;
                if (i == 88) {
                    ewlVar.c(4L);
                    short sD = ewlVar.d();
                    return (sD & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sD & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                ewlVar.c(4L);
                return (ewlVar.d() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((ewlVar.a() << 16) | ewlVar.a()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iA3 = (ewlVar.a() << 16) | ewlVar.a();
            if (iA3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            boolean z = iA3 == 1635150182;
            ewlVar.c(4L);
            int i2 = iD2 - 16;
            if (i2 % 4 == 0) {
                for (int i3 = 0; i3 < 5 && i2 > 0; i3++) {
                    int iA4 = (ewlVar.a() << 16) | ewlVar.a();
                    if (iA4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    z |= !(iA4 != 1635150182);
                    i2 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (ewk unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    @Override // defpackage.eqc
    public final ImageHeaderParser$ImageType a(InputStream inputStream) {
        eoz.k(inputStream);
        return f(new ewm(inputStream, 0));
    }

    @Override // defpackage.eqc
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        eoz.k(byteBuffer);
        return f(new ewm(byteBuffer, 1));
    }

    @Override // defpackage.eqc
    public final int c(InputStream inputStream, etl etlVar) {
        eoz.k(inputStream);
        ewm ewmVar = new ewm(inputStream, 0);
        eoz.k(etlVar);
        return e(ewmVar, etlVar);
    }

    @Override // defpackage.eqc
    public final int d(ByteBuffer byteBuffer, etl etlVar) {
        eoz.k(byteBuffer);
        ewm ewmVar = new ewm(byteBuffer, 1);
        eoz.k(etlVar);
        return e(ewmVar, etlVar);
    }
}
