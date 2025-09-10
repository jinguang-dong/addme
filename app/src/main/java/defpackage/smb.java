package defpackage;

import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class smb {
    public static final smb f;
    public static final smb g;

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract void b(Appendable appendable, byte[] bArr, int i);

    public abstract int c(int i);

    public abstract int d(int i);

    public CharSequence e(CharSequence charSequence) {
        throw null;
    }

    public final String g(byte[] bArr) {
        int length = bArr.length;
        rnt.K(0, length, length);
        StringBuilder sb = new StringBuilder(d(length));
        try {
            b(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] h(CharSequence charSequence) {
        try {
            CharSequence charSequenceE = e(charSequence);
            int iC = c(charSequenceE.length());
            byte[] bArr = new byte[iC];
            int iA = a(bArr, charSequenceE);
            if (iA == iC) {
                return bArr;
            }
            byte[] bArr2 = new byte[iA];
            System.arraycopy(bArr, 0, bArr2, 0, iA);
            return bArr2;
        } catch (sly e) {
            throw new IllegalArgumentException(e);
        }
    }

    static {
        new slx("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        f = new slx("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new sma("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new sma(GdpuLBytnYW.eGzgn, "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        g = new slw(new slv(OPuAVreQM.RVPvfKpSeAx, nWEkBGOQPWQp.CiMST.toCharArray()));
    }
}
