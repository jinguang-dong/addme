package defpackage;

import android.util.Log;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum pcu {
    TOP_LEFT(1),
    TOP_RIGHT(2),
    BOTTOM_RIGHT(3),
    BOTTOM_LEFT(4),
    LEFT_TOP(5),
    RIGHT_TOP(6),
    RIGHT_BOTTOM(7),
    LEFT_BOTTOM(8);

    private static final sbv j;
    public final short i;

    static {
        List listAsList = Arrays.asList(values());
        iop iopVar = new iop(6);
        j = listAsList instanceof Collection ? ujp.aw(listAsList.iterator(), iopVar, sbv.j(listAsList.size())) : ujp.aw(listAsList.iterator(), iopVar, new sbr());
    }

    pcu(short s) {
        this.i = s;
    }

    public static pao a(pcu pcuVar) {
        if (pcuVar == null) {
            Log.w("CAM_ExifOrientation", "Computing rotation for an null exif orientation, returning 0");
            return pao.CLOCKWISE_0;
        }
        int iOrdinal = pcuVar.ordinal();
        if (iOrdinal == 0) {
            return pao.CLOCKWISE_0;
        }
        if (iOrdinal == 2) {
            return pao.c;
        }
        if (iOrdinal == 5) {
            return pao.CLOCKWISE_90;
        }
        if (iOrdinal == 7) {
            return pao.CLOCKWISE_270;
        }
        Log.w("CAM_ExifOrientation", "Computing rotation for an invalid orientation: ".concat(pcuVar.toString()));
        return pao.CLOCKWISE_0;
    }

    public static pcu b(pao paoVar) {
        paoVar.getClass();
        int iOrdinal = paoVar.ordinal();
        if (iOrdinal == 0) {
            return TOP_LEFT;
        }
        if (iOrdinal == 1) {
            return RIGHT_TOP;
        }
        if (iOrdinal == 2) {
            return BOTTOM_RIGHT;
        }
        if (iOrdinal == 3) {
            return LEFT_BOTTOM;
        }
        throw new IllegalArgumentException("Orientation must be one of 4 defined values!");
    }

    public static pcu c(ExifInterface exifInterface) {
        Integer numB;
        if (exifInterface == null || (numB = exifInterface.b(ExifInterface.j)) == null) {
            return null;
        }
        return (pcu) j.get(Short.valueOf(numB.shortValue()));
    }
}
