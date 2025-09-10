package defpackage;

import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum grk {
    MATTER(Integer.valueOf(R.drawable.home_iot_device), Integer.valueOf(R.string.matter_qr)),
    UPI(Integer.valueOf(R.drawable.currency_rupee), Integer.valueOf(R.string.upi_qr)),
    LPA(null, Integer.valueOf(R.string.esim_qr)),
    d(Integer.valueOf(R.drawable.passkey_icon), Integer.valueOf(R.string.fido_qr)),
    SHC(null, Integer.valueOf(R.string.shc_qr)),
    BLUETOOTH(Integer.valueOf(R.drawable.bluetooth_audio_sharing), null),
    MFG_SP(Integer.valueOf(R.drawable.pf_icon), null),
    VIEW_INTENT(null, null);

    public final Integer i;
    public final Integer j;

    grk(Integer num, Integer num2) {
        this.i = num;
        this.j = num2;
    }
}
