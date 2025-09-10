package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class omb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = ojl.X(parcel);
        WorkSource workSource = new WorkSource();
        olo oloVar = null;
        boolean zAj = false;
        int iV = 0;
        int iV2 = 0;
        boolean zAj2 = false;
        long jY = -1;
        float f = 0.0f;
        int iV3 = Integer.MAX_VALUE;
        long jY2 = Long.MAX_VALUE;
        long jY3 = Long.MAX_VALUE;
        long jY4 = 0;
        long jY5 = 600000;
        long jY6 = 3600000;
        int iV4 = 102;
        while (parcel.dataPosition() < iX) {
            int i = parcel.readInt();
            switch (ojl.T(i)) {
                case 1:
                    iV4 = ojl.V(parcel, i);
                    break;
                case 2:
                    jY6 = ojl.Y(parcel, i);
                    break;
                case 3:
                    jY5 = ojl.Y(parcel, i);
                    break;
                case 4:
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                default:
                    ojl.ai(parcel, i);
                    break;
                case 5:
                    jY2 = ojl.Y(parcel, i);
                    break;
                case 6:
                    iV3 = ojl.V(parcel, i);
                    break;
                case 7:
                    ojl.ah(parcel, i, 4);
                    f = parcel.readFloat();
                    break;
                case 8:
                    jY4 = ojl.Y(parcel, i);
                    break;
                case 9:
                    zAj = ojl.aj(parcel, i);
                    break;
                case 10:
                    jY3 = ojl.Y(parcel, i);
                    break;
                case 11:
                    jY = ojl.Y(parcel, i);
                    break;
                case 12:
                    iV = ojl.V(parcel, i);
                    break;
                case 13:
                    iV2 = ojl.V(parcel, i);
                    break;
                case 15:
                    zAj2 = ojl.aj(parcel, i);
                    break;
                case 16:
                    workSource = (WorkSource) ojl.ab(parcel, i, WorkSource.CREATOR);
                    break;
                case 17:
                    oloVar = (olo) ojl.ab(parcel, i, olo.CREATOR);
                    break;
            }
        }
        ojl.ag(parcel, iX);
        return new LocationRequest(iV4, jY6, jY5, jY4, jY2, jY3, iV3, f, zAj, jY, iV, iV2, zAj2, workSource, oloVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
