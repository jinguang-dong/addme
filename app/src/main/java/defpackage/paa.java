package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class paa {
    public static final int[] a = new int[0];

    public static final pka a(sm smVar) {
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Integer num = (Integer) smVar.a(key);
        if (num != null) {
            int iIntValue = num.intValue();
            return iIntValue != 0 ? iIntValue != 1 ? pka.EXTERNAL : pka.BACK : pka.FRONT;
        }
        CameraCharacteristics.Key key2 = CameraCharacteristics.LENS_FACING;
        Objects.toString(key2);
        throw new pad("CameraMetadata missing value for key-".concat(String.valueOf(key2)));
    }
}
