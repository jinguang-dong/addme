package defpackage;

import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum kta implements krt {
    RAW_CAPTURE_ENABLED(R.drawable.quantum_gm_ic_raw_on_white_24, R.string.raw_output_on_desc, "RawPhoto", krs.RAW_OUTPUT),
    FLASH_ON(R.drawable.quantum_gm_ic_flash_on_white_24, R.string.flash_on_desc, "BackPhotoFlash", krs.BACK_PHOTO_FLASH);

    public final int c;
    public final int d;
    public final String e;
    public final krs f;

    kta(int i, int i2, String str, krs krsVar) {
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = krsVar;
    }
}
