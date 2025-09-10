package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class opx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = ojl.X(parcel);
        int iV = 0;
        int iV2 = 0;
        boolean zAj = false;
        boolean zAj2 = false;
        boolean zAj3 = false;
        int iV3 = 0;
        boolean zAj4 = false;
        int iV4 = 0;
        int iV5 = 0;
        String strAc = null;
        String strAc2 = null;
        String strAc3 = null;
        String strAc4 = null;
        String strAc5 = null;
        ArrayList arrayListAe = null;
        opz opzVar = null;
        opy opyVar = null;
        boolean zAj5 = true;
        boolean zAj6 = true;
        while (parcel.dataPosition() < iX) {
            int i = parcel.readInt();
            switch (ojl.T(i)) {
                case 2:
                    strAc = ojl.ac(parcel, i);
                    break;
                case 3:
                    strAc2 = ojl.ac(parcel, i);
                    break;
                case 4:
                    iV = ojl.V(parcel, i);
                    break;
                case 5:
                    iV2 = ojl.V(parcel, i);
                    break;
                case 6:
                    zAj = ojl.aj(parcel, i);
                    break;
                case 7:
                    zAj2 = ojl.aj(parcel, i);
                    break;
                case 8:
                    strAc3 = ojl.ac(parcel, i);
                    break;
                case 9:
                    zAj3 = ojl.aj(parcel, i);
                    break;
                case 10:
                    strAc4 = ojl.ac(parcel, i);
                    break;
                case 11:
                    strAc5 = ojl.ac(parcel, i);
                    break;
                case 12:
                    iV3 = ojl.V(parcel, i);
                    break;
                case 13:
                    arrayListAe = ojl.ae(parcel, i);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    zAj4 = ojl.aj(parcel, i);
                    break;
                case 15:
                    zAj5 = ojl.aj(parcel, i);
                    break;
                case 16:
                    opzVar = (opz) ojl.ab(parcel, i, opz.CREATOR);
                    break;
                case 17:
                    zAj6 = ojl.aj(parcel, i);
                    break;
                case 18:
                    opyVar = (opy) ojl.ab(parcel, i, opy.CREATOR);
                    break;
                case 19:
                    iV4 = ojl.V(parcel, i);
                    break;
                case 20:
                    iV5 = ojl.V(parcel, i);
                    break;
                default:
                    ojl.ai(parcel, i);
                    break;
            }
        }
        ojl.ag(parcel, iX);
        return new ConnectionConfiguration(strAc, strAc2, iV, iV2, zAj, zAj2, strAc3, zAj3, strAc4, strAc5, iV3, arrayListAe, zAj4, zAj5, opzVar, zAj6, opyVar, iV4, iV5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }
}
