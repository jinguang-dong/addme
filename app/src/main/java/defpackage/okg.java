package defpackage;

import android.app.ApplicationErrorReport;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.googlehelp.trails.TrailsInteraction;
import com.google.android.gms.location.LocationRequest;
import com.google.ar.core.ImageFormat;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okg implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public okg(int i) {
        this.a = i;
    }

    public static final ErrorReport a(Parcel parcel) {
        int iX = ojl.X(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String strAc = null;
        String strAc2 = null;
        String strAc3 = null;
        String strAc4 = null;
        String strAc5 = null;
        String strAc6 = null;
        String strAc7 = null;
        String strAc8 = null;
        String strAc9 = null;
        String strAc10 = null;
        String strAc11 = null;
        String strAc12 = null;
        String strAc13 = null;
        String[] strArrAn = null;
        String[] strArrAn2 = null;
        String[] strArrAn3 = null;
        String strAc14 = null;
        String strAc15 = null;
        byte[] bArrAk = null;
        String strAc16 = null;
        String strAc17 = null;
        String strAc18 = null;
        Bundle bundleZ = null;
        String strAc19 = null;
        String strAc20 = null;
        String strAc21 = null;
        String strAc22 = null;
        String strAc23 = null;
        String strAc24 = null;
        String strAc25 = null;
        String strAc26 = null;
        String strAc27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strAc28 = null;
        okn[] oknVarArr = null;
        String[] strArrAn4 = null;
        String strAc29 = null;
        okt oktVar = null;
        oko okoVar = null;
        String strAc30 = null;
        Bundle bundleZ2 = null;
        ArrayList arrayListAf = null;
        Bitmap bitmap = null;
        String strAc31 = null;
        ArrayList arrayListAe = null;
        String[] strArrAn5 = null;
        String[] strArrAn6 = null;
        String[] strArrAn7 = null;
        String strAc32 = null;
        okf okfVar = null;
        okp[] okpVarArr = null;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        int iV5 = 0;
        int iV6 = 0;
        boolean zAj = false;
        int iV7 = 0;
        int iV8 = 0;
        boolean zAj2 = false;
        int iV9 = 0;
        boolean zAj3 = false;
        boolean zAj4 = false;
        boolean zAj5 = false;
        int iV10 = 0;
        int iV11 = 0;
        boolean zAj6 = false;
        boolean zAj7 = false;
        while (parcel.dataPosition() < iX) {
            int iU = ojl.U(parcel);
            switch (ojl.T(iU)) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) ojl.ab(parcel, iU, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    strAc = ojl.ac(parcel, iU);
                    break;
                case 4:
                    iV = ojl.V(parcel, iU);
                    break;
                case 5:
                    strAc2 = ojl.ac(parcel, iU);
                    break;
                case 6:
                    strAc3 = ojl.ac(parcel, iU);
                    break;
                case 7:
                    strAc4 = ojl.ac(parcel, iU);
                    break;
                case 8:
                    strAc5 = ojl.ac(parcel, iU);
                    break;
                case 9:
                    strAc6 = ojl.ac(parcel, iU);
                    break;
                case 10:
                    strAc7 = ojl.ac(parcel, iU);
                    break;
                case 11:
                    strAc8 = ojl.ac(parcel, iU);
                    break;
                case 12:
                    iV2 = ojl.V(parcel, iU);
                    break;
                case 13:
                    strAc9 = ojl.ac(parcel, iU);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    strAc10 = ojl.ac(parcel, iU);
                    break;
                case 15:
                    strAc11 = ojl.ac(parcel, iU);
                    break;
                case 16:
                    strAc12 = ojl.ac(parcel, iU);
                    break;
                case 17:
                    strAc13 = ojl.ac(parcel, iU);
                    break;
                case 18:
                    strArrAn = ojl.an(parcel, iU);
                    break;
                case 19:
                    strArrAn2 = ojl.an(parcel, iU);
                    break;
                case 20:
                    strArrAn3 = ojl.an(parcel, iU);
                    break;
                case 21:
                    strAc14 = ojl.ac(parcel, iU);
                    break;
                case ImageFormat.RGBA_FP16 /* 22 */:
                    strAc15 = ojl.ac(parcel, iU);
                    break;
                case 23:
                    bArrAk = ojl.ak(parcel, iU);
                    break;
                case 24:
                    iV3 = ojl.V(parcel, iU);
                    break;
                case 25:
                    iV4 = ojl.V(parcel, iU);
                    break;
                case 26:
                    iV5 = ojl.V(parcel, iU);
                    break;
                case 27:
                    iV6 = ojl.V(parcel, iU);
                    break;
                case 28:
                    strAc16 = ojl.ac(parcel, iU);
                    break;
                case 29:
                    strAc17 = ojl.ac(parcel, iU);
                    break;
                case 30:
                    strAc18 = ojl.ac(parcel, iU);
                    break;
                case 31:
                    bundleZ = ojl.Z(parcel, iU);
                    break;
                case 32:
                    zAj = ojl.aj(parcel, iU);
                    break;
                case 33:
                    iV7 = ojl.V(parcel, iU);
                    break;
                case 34:
                    iV8 = ojl.V(parcel, iU);
                    break;
                case ImageFormat.YUV_420_888 /* 35 */:
                    zAj2 = ojl.aj(parcel, iU);
                    break;
                case 36:
                    strAc19 = ojl.ac(parcel, iU);
                    break;
                case 37:
                    strAc20 = ojl.ac(parcel, iU);
                    break;
                case 38:
                    iV9 = ojl.V(parcel, iU);
                    break;
                case 39:
                    strAc21 = ojl.ac(parcel, iU);
                    break;
                case 40:
                    strAc22 = ojl.ac(parcel, iU);
                    break;
                case 41:
                    strAc23 = ojl.ac(parcel, iU);
                    break;
                case 42:
                    strAc24 = ojl.ac(parcel, iU);
                    break;
                case 43:
                    strAc25 = ojl.ac(parcel, iU);
                    break;
                case 44:
                    strAc26 = ojl.ac(parcel, iU);
                    break;
                case 45:
                    strAc27 = ojl.ac(parcel, iU);
                    break;
                case 46:
                    bitmapTeleporter = (BitmapTeleporter) ojl.ab(parcel, iU, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    strAc28 = ojl.ac(parcel, iU);
                    break;
                case 48:
                    oknVarArr = (okn[]) ojl.am(parcel, iU, okn.CREATOR);
                    break;
                case 49:
                    strArrAn4 = ojl.an(parcel, iU);
                    break;
                case 50:
                    zAj3 = ojl.aj(parcel, iU);
                    break;
                case 51:
                    strAc29 = ojl.ac(parcel, iU);
                    break;
                case 52:
                    oktVar = (okt) ojl.ab(parcel, iU, okt.CREATOR);
                    break;
                case 53:
                    okoVar = (oko) ojl.ab(parcel, iU, oko.CREATOR);
                    break;
                case 54:
                    strAc30 = ojl.ac(parcel, iU);
                    break;
                case 55:
                    zAj4 = ojl.aj(parcel, iU);
                    break;
                case 56:
                    bundleZ2 = ojl.Z(parcel, iU);
                    break;
                case 57:
                    arrayListAf = ojl.af(parcel, iU, RectF.CREATOR);
                    break;
                case 58:
                    zAj5 = ojl.aj(parcel, iU);
                    break;
                case 59:
                    bitmap = (Bitmap) ojl.ab(parcel, iU, Bitmap.CREATOR);
                    break;
                case 60:
                    strAc31 = ojl.ac(parcel, iU);
                    break;
                case 61:
                    arrayListAe = ojl.ae(parcel, iU);
                    break;
                case 62:
                    iV10 = ojl.V(parcel, iU);
                    break;
                case 63:
                    iV11 = ojl.V(parcel, iU);
                    break;
                case 64:
                    strArrAn5 = ojl.an(parcel, iU);
                    break;
                case 65:
                    strArrAn6 = ojl.an(parcel, iU);
                    break;
                case 66:
                    strArrAn7 = ojl.an(parcel, iU);
                    break;
                case 67:
                    zAj6 = ojl.aj(parcel, iU);
                    break;
                case 68:
                    zAj7 = ojl.aj(parcel, iU);
                    break;
                case 69:
                    strAc32 = ojl.ac(parcel, iU);
                    break;
                case 70:
                    okfVar = (okf) ojl.ab(parcel, iU, okf.CREATOR);
                    break;
                case 71:
                    okpVarArr = (okp[]) ojl.am(parcel, iU, okp.CREATOR);
                    break;
                default:
                    ojl.ai(parcel, iU);
                    break;
            }
        }
        ojl.ag(parcel, iX);
        return new ErrorReport(applicationErrorReport, strAc, iV, strAc2, strAc3, strAc4, strAc5, strAc6, strAc7, strAc8, iV2, strAc9, strAc10, strAc11, strAc12, strAc13, strArrAn, strArrAn2, strArrAn3, strAc14, strAc15, bArrAk, iV3, iV4, iV5, iV6, strAc16, strAc17, strAc18, bundleZ, zAj, iV7, iV8, zAj2, strAc19, strAc20, iV9, strAc21, strAc22, strAc23, strAc24, strAc25, strAc26, strAc27, bitmapTeleporter, strAc28, oknVarArr, strArrAn4, zAj3, strAc29, oktVar, okoVar, strAc30, zAj4, bundleZ2, arrayListAf, zAj5, bitmap, strAc31, arrayListAe, iV10, iV11, strArrAn5, strArrAn6, strArrAn7, zAj6, zAj7, strAc32, okfVar, okpVarArr);
    }

    public static void b(ola olaVar, Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.I(parcel, 1, olaVar.a, i);
        ojl.J(parcel, 2, olaVar.b);
        ojl.J(parcel, 3, olaVar.c);
        ojl.A(parcel, 4, olaVar.d);
        ojl.J(parcel, 5, olaVar.e);
        ojl.A(parcel, 6, olaVar.f);
        ojl.J(parcel, 7, olaVar.g);
        ojl.w(parcel, iU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long jY = 0;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        boolean zAj = false;
        int iV4 = 0;
        ArrayList arrayListAf = null;
        ond[] ondVarArr = null;
        Status status = null;
        String strAc = null;
        String strAc2 = null;
        String strAc3 = null;
        String strAc4 = null;
        String strAc5 = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        switch (this.a) {
            case 0:
                int iX = ojl.X(parcel);
                String strAc6 = null;
                String strAc7 = null;
                String strAc8 = null;
                String strAc9 = null;
                String strAc10 = null;
                Bundle bundleZ = null;
                while (parcel.dataPosition() < iX) {
                    int i = parcel.readInt();
                    switch (ojl.T(i)) {
                        case 2:
                            strAc6 = ojl.ac(parcel, i);
                            break;
                        case 3:
                            strAc7 = ojl.ac(parcel, i);
                            break;
                        case 4:
                            strAc8 = ojl.ac(parcel, i);
                            break;
                        case 5:
                            strAc9 = ojl.ac(parcel, i);
                            break;
                        case 6:
                            strAc10 = ojl.ac(parcel, i);
                            break;
                        case 7:
                            bundleZ = ojl.Z(parcel, i);
                            break;
                        default:
                            ojl.ai(parcel, i);
                            break;
                    }
                }
                ojl.ag(parcel, iX);
                return new okf(strAc6, strAc7, strAc8, strAc9, strAc10, bundleZ);
            case 1:
                int iX2 = ojl.X(parcel);
                while (parcel.dataPosition() < iX2) {
                    int i2 = parcel.readInt();
                    int iT = ojl.T(i2);
                    if (iT == 1) {
                        iV = ojl.V(parcel, i2);
                    } else if (iT != 2) {
                        ojl.ai(parcel, i2);
                    } else {
                        arrayListAf = ojl.af(parcel, i2, oil.CREATOR);
                    }
                }
                ojl.ag(parcel, iX2);
                return new oiv(iV, arrayListAf);
            case 2:
                return a(parcel);
            case 3:
                int iX3 = ojl.X(parcel);
                String strAc11 = null;
                String strAc12 = null;
                while (parcel.dataPosition() < iX3) {
                    int i3 = parcel.readInt();
                    int iT2 = ojl.T(i3);
                    if (iT2 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) ojl.ab(parcel, i3, ParcelFileDescriptor.CREATOR);
                    } else if (iT2 == 3) {
                        strAc11 = ojl.ac(parcel, i3);
                    } else if (iT2 != 4) {
                        ojl.ai(parcel, i3);
                    } else {
                        strAc12 = ojl.ac(parcel, i3);
                    }
                }
                ojl.ag(parcel, iX3);
                return new okn(parcelFileDescriptor, strAc11, strAc12);
            case 4:
                int iX4 = ojl.X(parcel);
                boolean zAj2 = false;
                boolean zAj3 = false;
                boolean zAj4 = false;
                boolean zAj5 = false;
                String strAc13 = null;
                okr[] okrVarArr = null;
                while (parcel.dataPosition() < iX4) {
                    int i4 = parcel.readInt();
                    switch (ojl.T(i4)) {
                        case 2:
                            strAc13 = ojl.ac(parcel, i4);
                            break;
                        case 3:
                            zAj2 = ojl.aj(parcel, i4);
                            break;
                        case 4:
                            zAj3 = ojl.aj(parcel, i4);
                            break;
                        case 5:
                            zAj4 = ojl.aj(parcel, i4);
                            break;
                        case 6:
                            zAj5 = ojl.aj(parcel, i4);
                            break;
                        case 7:
                            okrVarArr = (okr[]) ojl.am(parcel, i4, okr.CREATOR);
                            break;
                        default:
                            ojl.ai(parcel, i4);
                            break;
                    }
                }
                ojl.ag(parcel, iX4);
                return new oko(strAc13, zAj2, zAj3, zAj4, zAj5, okrVarArr);
            case 5:
                int iX5 = ojl.X(parcel);
                int iV5 = 0;
                while (parcel.dataPosition() < iX5) {
                    int i5 = parcel.readInt();
                    int iT3 = ojl.T(i5);
                    if (iT3 == 2) {
                        iV4 = ojl.V(parcel, i5);
                    } else if (iT3 != 3) {
                        ojl.ai(parcel, i5);
                    } else {
                        iV5 = ojl.V(parcel, i5);
                    }
                }
                ojl.ag(parcel, iX5);
                return new okt(iV4, iV5);
            case 6:
                int iX6 = ojl.X(parcel);
                int iV6 = 0;
                int iV7 = 0;
                Boolean boolValueOf = null;
                ArrayList arrayListAe = null;
                ArrayList arrayListAd = null;
                ArrayList arrayListAe2 = null;
                ArrayList arrayListAd2 = null;
                byte[][] bArrAo = null;
                while (parcel.dataPosition() < iX6) {
                    int i6 = parcel.readInt();
                    switch (ojl.T(i6)) {
                        case 2:
                            iV6 = ojl.V(parcel, i6);
                            break;
                        case 3:
                            iV7 = ojl.V(parcel, i6);
                            break;
                        case 4:
                            arrayListAe = ojl.ae(parcel, i6);
                            break;
                        case 5:
                            arrayListAd = ojl.ad(parcel, i6);
                            break;
                        case 6:
                            arrayListAe2 = ojl.ae(parcel, i6);
                            break;
                        case 7:
                            arrayListAd2 = ojl.ad(parcel, i6);
                            break;
                        case 8:
                            bArrAo = ojl.ao(parcel, i6);
                            break;
                        case 9:
                            int iW = ojl.W(parcel, i6);
                            if (iW != 0) {
                                ojl.ap(parcel, iW, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            } else {
                                boolValueOf = null;
                                break;
                            }
                        default:
                            ojl.ai(parcel, i6);
                            break;
                    }
                }
                ojl.ag(parcel, iX6);
                return new FRDProductSpecificDataEntry(iV6, iV7, arrayListAe, arrayListAd, arrayListAe2, arrayListAd2, bArrAo, boolValueOf.booleanValue());
            case 7:
                int iX7 = ojl.X(parcel);
                int iV8 = 0;
                int iV9 = 0;
                GoogleHelp googleHelp = null;
                String strAc14 = null;
                String strAc15 = null;
                String strAc16 = null;
                String strAc17 = null;
                while (parcel.dataPosition() < iX7) {
                    int i7 = parcel.readInt();
                    switch (ojl.T(i7)) {
                        case 1:
                            googleHelp = (GoogleHelp) ojl.ab(parcel, i7, GoogleHelp.CREATOR);
                            break;
                        case 2:
                            strAc14 = ojl.ac(parcel, i7);
                            break;
                        case 3:
                            strAc15 = ojl.ac(parcel, i7);
                            break;
                        case 4:
                            iV8 = ojl.V(parcel, i7);
                            break;
                        case 5:
                            strAc16 = ojl.ac(parcel, i7);
                            break;
                        case 6:
                            iV9 = ojl.V(parcel, i7);
                            break;
                        case 7:
                            strAc17 = ojl.ac(parcel, i7);
                            break;
                        default:
                            ojl.ai(parcel, i7);
                            break;
                    }
                }
                ojl.ag(parcel, iX7);
                return new ola(googleHelp, strAc14, strAc15, iV8, strAc16, iV9, strAc17);
            case 8:
                int iX8 = ojl.X(parcel);
                while (parcel.dataPosition() < iX8) {
                    int i8 = parcel.readInt();
                    int iT4 = ojl.T(i8);
                    if (iT4 == 2) {
                        zAj = ojl.aj(parcel, i8);
                    } else if (iT4 != 3) {
                        ojl.ai(parcel, i8);
                    } else {
                        strAc5 = ojl.ac(parcel, i8);
                    }
                }
                ojl.ag(parcel, iX8);
                return new ND4CSettings(zAj, strAc5);
            case 9:
                int iX9 = ojl.X(parcel);
                String strAc18 = null;
                String strAc19 = null;
                String strAc20 = null;
                while (parcel.dataPosition() < iX9) {
                    int i9 = parcel.readInt();
                    int iT5 = ojl.T(i9);
                    if (iT5 == 2) {
                        strAc4 = ojl.ac(parcel, i9);
                    } else if (iT5 == 3) {
                        strAc18 = ojl.ac(parcel, i9);
                    } else if (iT5 == 4) {
                        strAc20 = ojl.ac(parcel, i9);
                    } else if (iT5 != 5) {
                        ojl.ai(parcel, i9);
                    } else {
                        strAc19 = ojl.ac(parcel, i9);
                    }
                }
                ojl.ag(parcel, iX9);
                return new olb(strAc4, strAc18, strAc19, strAc20);
            case 10:
                int iX10 = ojl.X(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iX10) {
                    int i10 = parcel.readInt();
                    int iT6 = ojl.T(i10);
                    if (iT6 == 2) {
                        iV3 = ojl.V(parcel, i10);
                    } else if (iT6 == 3) {
                        strAc3 = ojl.ac(parcel, i10);
                    } else if (iT6 != 4) {
                        ojl.ai(parcel, i10);
                    } else {
                        intent = (Intent) ojl.ab(parcel, i10, Intent.CREATOR);
                    }
                }
                ojl.ag(parcel, iX10);
                return new oli(iV3, strAc3, intent);
            case 11:
                int iX11 = ojl.X(parcel);
                String strAc21 = null;
                String strAc22 = null;
                while (parcel.dataPosition() < iX11) {
                    int i11 = parcel.readInt();
                    int iT7 = ojl.T(i11);
                    if (iT7 == 2) {
                        strAc2 = ojl.ac(parcel, i11);
                    } else if (iT7 == 3) {
                        strAc21 = ojl.ac(parcel, i11);
                    } else if (iT7 != 4) {
                        ojl.ai(parcel, i11);
                    } else {
                        strAc22 = ojl.ac(parcel, i11);
                    }
                }
                ojl.ag(parcel, iX11);
                return new TogglingData(strAc2, strAc21, strAc22);
            case 12:
                int iX12 = ojl.X(parcel);
                String strAc23 = "";
                while (parcel.dataPosition() < iX12) {
                    int i12 = parcel.readInt();
                    int iT8 = ojl.T(i12);
                    if (iT8 == 1) {
                        strAc = ojl.ac(parcel, i12);
                    } else if (iT8 == 2) {
                        jY = ojl.Y(parcel, i12);
                    } else if (iT8 != 3) {
                        ojl.ai(parcel, i12);
                    } else {
                        strAc23 = ojl.ac(parcel, i12);
                    }
                }
                ojl.ag(parcel, iX12);
                return new TrailsInteraction(strAc, jY, strAc23);
            case 13:
                int iX13 = ojl.X(parcel);
                int iV10 = 0;
                String strAc24 = null;
                String strAc25 = null;
                String strAc26 = null;
                ArrayList arrayListAf2 = null;
                olo oloVar = null;
                while (parcel.dataPosition() < iX13) {
                    int i13 = parcel.readInt();
                    int iT9 = ojl.T(i13);
                    if (iT9 == 1) {
                        iV10 = ojl.V(parcel, i13);
                    } else if (iT9 == 3) {
                        strAc24 = ojl.ac(parcel, i13);
                    } else if (iT9 == 4) {
                        strAc25 = ojl.ac(parcel, i13);
                    } else if (iT9 == 6) {
                        strAc26 = ojl.ac(parcel, i13);
                    } else if (iT9 == 7) {
                        oloVar = (olo) ojl.ab(parcel, i13, olo.CREATOR);
                    } else if (iT9 != 8) {
                        ojl.ai(parcel, i13);
                    } else {
                        arrayListAf2 = ojl.af(parcel, i13, odl.CREATOR);
                    }
                }
                ojl.ag(parcel, iX13);
                strAc24.getClass();
                return new olo(iV10, strAc24, strAc25, strAc26, arrayListAf2, oloVar);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int iX14 = ojl.X(parcel);
                long jY2 = Long.MAX_VALUE;
                int iV11 = 0;
                boolean zAj6 = false;
                olo oloVar2 = null;
                while (parcel.dataPosition() < iX14) {
                    int i14 = parcel.readInt();
                    int iT10 = ojl.T(i14);
                    if (iT10 == 1) {
                        jY2 = ojl.Y(parcel, i14);
                    } else if (iT10 == 2) {
                        iV11 = ojl.V(parcel, i14);
                    } else if (iT10 == 3) {
                        zAj6 = ojl.aj(parcel, i14);
                    } else if (iT10 != 5) {
                        ojl.ai(parcel, i14);
                    } else {
                        oloVar2 = (olo) ojl.ab(parcel, i14, olo.CREATOR);
                    }
                }
                ojl.ag(parcel, iX14);
                return new oly(jY2, iV11, zAj6, oloVar2);
            case 15:
                int iX15 = ojl.X(parcel);
                while (parcel.dataPosition() < iX15) {
                    int i15 = parcel.readInt();
                    if (ojl.T(i15) != 1) {
                        ojl.ai(parcel, i15);
                    } else {
                        status = (Status) ojl.ab(parcel, i15, Status.CREATOR);
                    }
                }
                ojl.ag(parcel, iX15);
                return new omc(status);
            case 16:
                int iX16 = ojl.X(parcel);
                int iV12 = 0;
                IBinder iBinderAa = null;
                IBinder iBinderAa2 = null;
                PendingIntent pendingIntent = null;
                String strAc27 = null;
                while (parcel.dataPosition() < iX16) {
                    int i16 = parcel.readInt();
                    int iT11 = ojl.T(i16);
                    if (iT11 == 1) {
                        iV12 = ojl.V(parcel, i16);
                    } else if (iT11 == 2) {
                        iBinderAa = ojl.aa(parcel, i16);
                    } else if (iT11 == 3) {
                        iBinderAa2 = ojl.aa(parcel, i16);
                    } else if (iT11 == 4) {
                        pendingIntent = (PendingIntent) ojl.ab(parcel, i16, PendingIntent.CREATOR);
                    } else if (iT11 != 6) {
                        ojl.ai(parcel, i16);
                    } else {
                        strAc27 = ojl.ac(parcel, i16);
                    }
                }
                ojl.ag(parcel, iX16);
                return new omp(iV12, iBinderAa, iBinderAa2, pendingIntent, strAc27);
            case 17:
                int iX17 = ojl.X(parcel);
                long jY3 = Long.MAX_VALUE;
                boolean zAj7 = false;
                boolean zAj8 = false;
                boolean zAj9 = false;
                boolean zAj10 = false;
                LocationRequest locationRequest = null;
                ArrayList arrayListAf3 = null;
                while (parcel.dataPosition() < iX17) {
                    int i17 = parcel.readInt();
                    int iT12 = ojl.T(i17);
                    if (iT12 == 1) {
                        locationRequest = (LocationRequest) ojl.ab(parcel, i17, LocationRequest.CREATOR);
                    } else if (iT12 == 5) {
                        arrayListAf3 = ojl.af(parcel, i17, ohn.CREATOR);
                    } else if (iT12 == 8) {
                        zAj7 = ojl.aj(parcel, i17);
                    } else if (iT12 != 9) {
                        switch (iT12) {
                            case 11:
                                zAj9 = ojl.aj(parcel, i17);
                                break;
                            case 12:
                                zAj10 = ojl.aj(parcel, i17);
                                break;
                            case 13:
                                ojl.ac(parcel, i17);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                jY3 = ojl.Y(parcel, i17);
                                break;
                            default:
                                ojl.ai(parcel, i17);
                                break;
                        }
                    } else {
                        zAj8 = ojl.aj(parcel, i17);
                    }
                }
                ojl.ag(parcel, iX17);
                return new omq(locationRequest, arrayListAf3, zAj7, zAj8, zAj9, zAj10, jY3);
            case 18:
                int iX18 = ojl.X(parcel);
                int iV13 = 1;
                omq omqVar = null;
                IBinder iBinderAa3 = null;
                IBinder iBinderAa4 = null;
                PendingIntent pendingIntent2 = null;
                IBinder iBinderAa5 = null;
                String strAc28 = null;
                while (parcel.dataPosition() < iX18) {
                    int i18 = parcel.readInt();
                    switch (ojl.T(i18)) {
                        case 1:
                            iV13 = ojl.V(parcel, i18);
                            break;
                        case 2:
                            omqVar = (omq) ojl.ab(parcel, i18, omq.CREATOR);
                            break;
                        case 3:
                            iBinderAa3 = ojl.aa(parcel, i18);
                            break;
                        case 4:
                            pendingIntent2 = (PendingIntent) ojl.ab(parcel, i18, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinderAa4 = ojl.aa(parcel, i18);
                            break;
                        case 6:
                            iBinderAa5 = ojl.aa(parcel, i18);
                            break;
                        case 7:
                        default:
                            ojl.ai(parcel, i18);
                            break;
                        case 8:
                            strAc28 = ojl.ac(parcel, i18);
                            break;
                    }
                }
                ojl.ag(parcel, iX18);
                return new omr(iV13, omqVar, iBinderAa3, iBinderAa4, pendingIntent2, iBinderAa5, strAc28);
            case 19:
                int iX19 = ojl.X(parcel);
                String[] strArrAn = null;
                while (parcel.dataPosition() < iX19) {
                    int i19 = parcel.readInt();
                    int iT13 = ojl.T(i19);
                    if (iT13 == 2) {
                        iV2 = ojl.V(parcel, i19);
                    } else if (iT13 == 3) {
                        ondVarArr = (ond[]) ojl.am(parcel, i19, ond.CREATOR);
                    } else if (iT13 != 4) {
                        ojl.ai(parcel, i19);
                    } else {
                        strArrAn = ojl.an(parcel, i19);
                    }
                }
                ojl.ag(parcel, iX19);
                return new omw(iV2, ondVarArr, strArrAn);
            default:
                int iX20 = ojl.X(parcel);
                long jY4 = 0;
                boolean zAj11 = false;
                String strAc29 = null;
                String strAc30 = null;
                omw[] omwVarArr = null;
                byte[] bArrAk = null;
                while (parcel.dataPosition() < iX20) {
                    int i20 = parcel.readInt();
                    switch (ojl.T(i20)) {
                        case 2:
                            strAc29 = ojl.ac(parcel, i20);
                            break;
                        case 3:
                            strAc30 = ojl.ac(parcel, i20);
                            break;
                        case 4:
                            omwVarArr = (omw[]) ojl.am(parcel, i20, omw.CREATOR);
                            break;
                        case 5:
                            zAj11 = ojl.aj(parcel, i20);
                            break;
                        case 6:
                            bArrAk = ojl.ak(parcel, i20);
                            break;
                        case 7:
                            jY4 = ojl.Y(parcel, i20);
                            break;
                        default:
                            ojl.ai(parcel, i20);
                            break;
                    }
                }
                ojl.ag(parcel, iX20);
                return new omx(strAc29, strAc30, omwVarArr, zAj11, bArrAk, jY4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new okf[i];
            case 1:
                return new oiv[i];
            case 2:
                return new ErrorReport[i];
            case 3:
                return new okn[i];
            case 4:
                return new oko[i];
            case 5:
                return new okt[i];
            case 6:
                return new FRDProductSpecificDataEntry[i];
            case 7:
                return new ola[i];
            case 8:
                return new ND4CSettings[i];
            case 9:
                return new olb[i];
            case 10:
                return new oli[i];
            case 11:
                return new TogglingData[i];
            case 12:
                return new TrailsInteraction[i];
            case 13:
                return new olo[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new oly[i];
            case 15:
                return new omc[i];
            case 16:
                return new omp[i];
            case 17:
                return new omq[i];
            case 18:
                return new omr[i];
            case 19:
                return new omw[i];
            default:
                return new omx[i];
        }
    }
}
