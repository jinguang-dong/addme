package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjd {
    public final long a;
    public final byte[] b;
    public final ExifInterface c;
    public final pas d;

    private kjd(long j, byte[] bArr, pas pasVar, ExifInterface exifInterface) {
        this.a = j;
        this.b = bArr;
        this.d = pasVar;
        this.c = exifInterface;
    }

    public static kjd a(long j, byte[] bArr, pas pasVar, ExifInterface exifInterface, ocq ocqVar) {
        if (ocqVar != null) {
            ocqVar.q(exifInterface);
        }
        return new kjd(j, bArr, pasVar, exifInterface);
    }
}
