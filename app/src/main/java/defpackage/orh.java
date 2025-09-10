package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.camera.backup.cNHl.ibINv;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class orh extends oix {
    public static final Parcelable.Creator CREATOR = new oks(14);
    public final int a;
    public final String b;

    public orh(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orh)) {
            return false;
        }
        orh orhVar = (orh) obj;
        return this.a == orhVar.a && Objects.equals(this.b, orhVar.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, i2);
        ojl.J(parcel, 2, this.b);
        ojl.w(parcel, iU);
    }

    public final String toString() {
        String strBv;
        int i = this.a;
        switch (i) {
            case -9:
                strBv = ibINv.laWeBLNwVgREXD;
                break;
            case -8:
                strBv = "Another migration is already in progress";
                break;
            case -7:
                strBv = "Connect message malformed";
                break;
            case -6:
                strBv = "Migration status mismatch between watch and phone";
                break;
            case -5:
                strBv = "Phone switching feature disabled";
                break;
            case -4:
                strBv = "Did not receive connect msg";
                break;
            case -3:
                strBv = "No bluetooth connection";
                break;
            case -2:
                strBv = "Accounts mismatch";
                break;
            case -1:
                strBv = "Unknown failure";
                break;
            case 0:
                strBv = "Connected";
                break;
            case 1:
                strBv = "Connection handshake in progress";
                break;
            case 2:
                strBv = "Connection handshake complete";
                break;
            case 3:
                strBv = "Sync with old node suspended";
                break;
            case 4:
                strBv = "Control plane transport connected";
                break;
            case 5:
                strBv = "Accounts Matched";
                break;
            case 6:
                strBv = "Association to watch terminated";
                break;
            default:
                strBv = a.bv(i, "Unrecognized state value: ");
                break;
        }
        return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, strBv);
    }
}
