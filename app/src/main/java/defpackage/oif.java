package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class oif extends fbi implements oig {
    private int a;

    protected oif(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        a.I(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] c(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.oig
    public final int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        ojr ojrVarF;
        if (obj != null && (obj instanceof oig)) {
            try {
                oig oigVar = (oig) obj;
                if (oigVar.e() == this.a && (ojrVarF = oigVar.f()) != null) {
                    return Arrays.equals(x(), (byte[]) ojq.b(ojrVarF));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    @Override // defpackage.oig
    public final ojr f() {
        return new ojq(x());
    }

    public final int hashCode() {
        return this.a;
    }

    public abstract byte[] x();

    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ojr ojrVarF = f();
            parcel2.writeNoException();
            fbj.d(parcel2, ojrVarF);
        } else {
            if (i != 2) {
                return false;
            }
            int i2 = this.a;
            parcel2.writeNoException();
            parcel2.writeInt(i2);
        }
        return true;
    }

    public oif() {
        super("com.google.android.gms.common.internal.ICertData");
    }
}
