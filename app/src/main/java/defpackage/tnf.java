package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tnf {
    public final Uri a;
    public final Bitmap b;
    public final Long c;
    public final tmy d;
    public final Integer e;
    private final byte[] f;

    public tnf() {
        throw null;
    }

    public final Bundle a(nuz nuzVar) {
        Bundle bundle = new Bundle();
        Uri uri = this.a;
        if (uri != null) {
            bundle.putParcelable("uri", uri);
        }
        Bitmap bitmapCreateBitmap = this.b;
        if (bitmapCreateBitmap != null) {
            int i = (nuzVar.b & 4) != 0 ? nuzVar.e : 33554432;
            if (bitmapCreateBitmap.getByteCount() > i) {
                Log.w("LensMetadata", String.format("Input bitmap is %d bytes, which is larger than our maximum of %d bytes. Downsampling...", Integer.valueOf(bitmapCreateBitmap.getByteCount()), Integer.valueOf(i)));
                float fSqrt = (float) Math.sqrt(i / bitmapCreateBitmap.getByteCount());
                Matrix matrix = new Matrix();
                matrix.setScale(fSqrt, fSqrt);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
            }
            bundle.putParcelable("bitmap", bitmapCreateBitmap);
        }
        bundle.putInt("lens_transition_type", 0);
        return bundle;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        Long l = this.c;
        if (l != null) {
            bundle.putLong("activity_launch_timestamp_nanos", l.longValue());
        }
        tmy tmyVar = this.d;
        if (tmyVar != null) {
            bundle.putByteArray("lens_initial_parameters", tmyVar.h());
        }
        Integer num = this.e;
        if (num != null) {
            num.intValue();
            bundle.putInt("lens_intent_type", 5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        Long l;
        tmy tmyVar;
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tnf) {
            tnf tnfVar = (tnf) obj;
            Uri uri = this.a;
            if (uri != null ? uri.equals(tnfVar.a) : tnfVar.a == null) {
                Bitmap bitmap = this.b;
                if (bitmap != null ? bitmap.equals(tnfVar.b) : tnfVar.b == null) {
                    if (tnfVar instanceof tnf) {
                        byte[] bArr = tnfVar.f;
                    }
                    if (Arrays.equals((byte[]) null, (byte[]) null) && ((l = this.c) != null ? l.equals(tnfVar.c) : tnfVar.c == null) && ((tmyVar = this.d) != null ? tmyVar.equals(tnfVar.d) : tnfVar.d == null) && ((num = this.e) != null ? num.equals(tnfVar.e) : tnfVar.e == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        Uri uri = this.a;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        Bitmap bitmap = this.b;
        int iHashCode2 = ((((iHashCode ^ 1000003) * 1000003) ^ (bitmap == null ? 0 : bitmap.hashCode())) * (-429739981)) ^ Arrays.hashCode((byte[]) null);
        Long l = this.c;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        int i = iHashCode2 * 1000003;
        tmy tmyVar = this.d;
        if (tmyVar == null) {
            iJ = 0;
        } else if (tmyVar.C()) {
            iJ = tmyVar.j();
        } else {
            int iJ2 = tmyVar.aT;
            if (iJ2 == 0) {
                iJ2 = tmyVar.j();
                tmyVar.aT = iJ2;
            }
            iJ = iJ2;
        }
        int i2 = i ^ iHashCode3;
        Integer num = this.e;
        return ((((i2 * 583896283) ^ iJ) * (-721379959)) ^ (num != null ? num.hashCode() : 0)) * 583896283;
    }

    public final String toString() {
        tmy tmyVar = this.d;
        Bitmap bitmap = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(bitmap) + ", null, null, null, null, " + Arrays.toString((byte[]) null) + ", " + this.c + ", null, null, " + String.valueOf(tmyVar) + ", null, " + this.e + ", null, null, null}";
    }

    public tnf(Uri uri, Bitmap bitmap, Long l, tmy tmyVar, Integer num) {
        this.a = uri;
        this.b = bitmap;
        this.f = null;
        this.c = l;
        this.d = tmyVar;
        this.e = num;
    }
}
