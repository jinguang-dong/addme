package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.googlehelp.trails.TrailsInteraction;
import com.google.ar.core.ImageFormat;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = ojl.X(parcel);
        String strAc = null;
        Account account = null;
        Bundle bundleZ = null;
        String strAc2 = null;
        String strAc3 = null;
        Bitmap bitmap = null;
        ArrayList arrayListAe = null;
        Bundle bundleZ2 = null;
        Bitmap bitmap2 = null;
        byte[] bArrAk = null;
        String strAc4 = null;
        Uri uri = null;
        ArrayList arrayListAf = null;
        okt oktVar = null;
        ArrayList arrayListAf2 = null;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        PendingIntent pendingIntent = null;
        String strAc5 = null;
        String strAc6 = null;
        ND4CSettings nD4CSettings = null;
        ArrayList arrayListAf3 = null;
        String strAc7 = null;
        ArrayList arrayListAf4 = null;
        String strAc8 = null;
        Intent intent = null;
        ArrayList arrayListAe2 = null;
        int iV = 0;
        boolean zAj = false;
        boolean zAj2 = false;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        boolean zAj3 = false;
        int iV5 = 0;
        int iV6 = 0;
        boolean zAj4 = false;
        boolean zAj5 = false;
        int iV7 = 0;
        boolean zAj6 = false;
        boolean zAj7 = false;
        boolean zAj8 = false;
        int iV8 = 0;
        int iV9 = 0;
        while (parcel.dataPosition() < iX) {
            int i = parcel.readInt();
            switch (ojl.T(i)) {
                case 1:
                    iV = ojl.V(parcel, i);
                    break;
                case 2:
                    strAc = ojl.ac(parcel, i);
                    break;
                case 3:
                    account = (Account) ojl.ab(parcel, i, Account.CREATOR);
                    break;
                case 4:
                    bundleZ = ojl.Z(parcel, i);
                    break;
                case 5:
                    zAj = ojl.aj(parcel, i);
                    break;
                case 6:
                    zAj2 = ojl.aj(parcel, i);
                    break;
                case 7:
                    arrayListAe = ojl.ae(parcel, i);
                    break;
                case 8:
                case 9:
                case 12:
                case 13:
                case 24:
                case 26:
                case 27:
                case 29:
                case 30:
                default:
                    ojl.ai(parcel, i);
                    break;
                case 10:
                    bundleZ2 = ojl.Z(parcel, i);
                    break;
                case 11:
                    bitmap2 = (Bitmap) ojl.ab(parcel, i, Bitmap.CREATOR);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    strAc4 = ojl.ac(parcel, i);
                    break;
                case 15:
                    uri = (Uri) ojl.ab(parcel, i, Uri.CREATOR);
                    break;
                case 16:
                    arrayListAf = ojl.af(parcel, i, oli.CREATOR);
                    break;
                case 17:
                    iV4 = ojl.V(parcel, i);
                    break;
                case 18:
                    arrayListAf2 = ojl.af(parcel, i, olb.CREATOR);
                    break;
                case 19:
                    bArrAk = ojl.ak(parcel, i);
                    break;
                case 20:
                    iV2 = ojl.V(parcel, i);
                    break;
                case 21:
                    iV3 = ojl.V(parcel, i);
                    break;
                case ImageFormat.RGBA_FP16 /* 22 */:
                    zAj3 = ojl.aj(parcel, i);
                    break;
                case 23:
                    errorReport = (ErrorReport) ojl.ab(parcel, i, ErrorReport.CREATOR);
                    break;
                case 25:
                    oktVar = (okt) ojl.ab(parcel, i, okt.CREATOR);
                    break;
                case 28:
                    strAc2 = ojl.ac(parcel, i);
                    break;
                case 31:
                    togglingData = (TogglingData) ojl.ab(parcel, i, TogglingData.CREATOR);
                    break;
                case 32:
                    iV5 = ojl.V(parcel, i);
                    break;
                case 33:
                    pendingIntent = (PendingIntent) ojl.ab(parcel, i, PendingIntent.CREATOR);
                    break;
                case 34:
                    strAc3 = ojl.ac(parcel, i);
                    break;
                case ImageFormat.YUV_420_888 /* 35 */:
                    bitmap = (Bitmap) ojl.ab(parcel, i, Bitmap.CREATOR);
                    break;
                case 36:
                    iV6 = ojl.V(parcel, i);
                    break;
                case 37:
                    zAj4 = ojl.aj(parcel, i);
                    break;
                case 38:
                    zAj5 = ojl.aj(parcel, i);
                    break;
                case 39:
                    iV7 = ojl.V(parcel, i);
                    break;
                case 40:
                    strAc5 = ojl.ac(parcel, i);
                    break;
                case 41:
                    zAj6 = ojl.aj(parcel, i);
                    break;
                case 42:
                    strAc6 = ojl.ac(parcel, i);
                    break;
                case 43:
                    zAj7 = ojl.aj(parcel, i);
                    break;
                case 44:
                    nD4CSettings = (ND4CSettings) ojl.ab(parcel, i, ND4CSettings.CREATOR);
                    break;
                case 45:
                    zAj8 = ojl.aj(parcel, i);
                    break;
                case 46:
                    arrayListAf3 = ojl.af(parcel, i, FRDProductSpecificDataEntry.CREATOR);
                    break;
                case 47:
                    strAc7 = ojl.ac(parcel, i);
                    break;
                case 48:
                    iV8 = ojl.V(parcel, i);
                    break;
                case 49:
                    iV9 = ojl.V(parcel, i);
                    break;
                case 50:
                    arrayListAf4 = ojl.af(parcel, i, TrailsInteraction.CREATOR);
                    break;
                case 51:
                    strAc8 = ojl.ac(parcel, i);
                    break;
                case 52:
                    intent = (Intent) ojl.ab(parcel, i, Intent.CREATOR);
                    break;
                case 53:
                    arrayListAe2 = ojl.ae(parcel, i);
                    break;
            }
        }
        ojl.ag(parcel, iX);
        return new GoogleHelp(iV, strAc, account, bundleZ, strAc2, strAc3, bitmap, zAj, zAj2, arrayListAe, bundleZ2, bitmap2, bArrAk, iV2, iV3, strAc4, uri, arrayListAf, iV4, oktVar, arrayListAf2, zAj3, errorReport, togglingData, iV5, pendingIntent, iV6, zAj4, zAj5, iV7, strAc5, zAj6, strAc6, zAj7, nD4CSettings, zAj8, arrayListAf3, strAc7, iV8, iV9, arrayListAf4, strAc8, intent, arrayListAe2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}
