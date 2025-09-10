package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import com.google.ar.core.ImageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class odj extends oix {
    final int b;
    public final int c;
    public final PendingIntent d;
    public final String e;
    public static final odj a = new odj(0);
    public static final Parcelable.Creator CREATOR = new azu(4);

    public odj(int i, int i2, PendingIntent pendingIntent, String str) {
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
    }

    public final boolean b() {
        return (this.c == 0 || this.d == null) ? false : true;
    }

    public final boolean c() {
        return this.c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof odj)) {
            return false;
        }
        odj odjVar = (odj) obj;
        return this.c == odjVar.c && a.K(this.d, odjVar.d) && a.K(this.e, odjVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.b);
        ojl.A(parcel, 2, this.c);
        ojl.I(parcel, 3, this.d, i);
        ojl.J(parcel, 4, this.e);
        ojl.w(parcel, iU);
    }

    public odj(int i) {
        this(i, null, null);
    }

    public static String a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case ImageFormat.RGBA_FP16 /* 22 */:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return a.bE(i, "UNKNOWN_ERROR_CODE(", mNLbzhCxd.oXpXxgnsDbgoEs);
                }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ojl.aC("statusCode", a(this.c), arrayList);
        ojl.aC(LmJPKwPBa.rPRaideqBAh, this.d, arrayList);
        ojl.aC("message", this.e, arrayList);
        return ojl.aB(arrayList, this);
    }

    public odj(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public odj(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
