package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oks implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public oks(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        int iV5 = 0;
        int iV6 = 0;
        int iV7 = 0;
        int iV8 = 0;
        int iV9 = 0;
        boolean zAj = false;
        int iV10 = 0;
        byte bS = 0;
        String strAc = null;
        ArrayList arrayListAf = null;
        byte[] bArrAk = null;
        Uri uri = null;
        String strAc2 = null;
        String strAc3 = null;
        String strAc4 = null;
        String strAc5 = null;
        ArrayList arrayListAe = null;
        ArrayList arrayListAf2 = null;
        switch (this.a) {
            case 0:
                int iX = ojl.X(parcel);
                int iV11 = 0;
                boolean zAj2 = false;
                String strAc6 = null;
                String strAc7 = null;
                String[] strArrAn = null;
                while (parcel.dataPosition() < iX) {
                    int i = parcel.readInt();
                    int iT = ojl.T(i);
                    if (iT == 2) {
                        strAc6 = ojl.ac(parcel, i);
                    } else if (iT == 3) {
                        strArrAn = ojl.an(parcel, i);
                    } else if (iT == 4) {
                        iV11 = ojl.V(parcel, i);
                    } else if (iT == 5) {
                        zAj2 = ojl.aj(parcel, i);
                    } else if (iT != 6) {
                        ojl.ai(parcel, i);
                    } else {
                        strAc7 = ojl.ac(parcel, i);
                    }
                }
                ojl.ag(parcel, iX);
                return new okr(strAc6, strAc7, strArrAn, iV11, zAj2);
            case 1:
                int iX2 = ojl.X(parcel);
                while (parcel.dataPosition() < iX2) {
                    int i2 = parcel.readInt();
                    if (ojl.T(i2) != 2) {
                        ojl.ai(parcel, i2);
                    } else {
                        iV = ojl.V(parcel, i2);
                    }
                }
                ojl.ag(parcel, iX2);
                return new oqp(iV);
            case 2:
                int iX3 = ojl.X(parcel);
                byte bS2 = 0;
                while (parcel.dataPosition() < iX3) {
                    int i3 = parcel.readInt();
                    int iT2 = ojl.T(i3);
                    if (iT2 == 2) {
                        bS = ojl.S(parcel, i3);
                    } else if (iT2 == 3) {
                        bS2 = ojl.S(parcel, i3);
                    } else if (iT2 != 4) {
                        ojl.ai(parcel, i3);
                    } else {
                        strAc = ojl.ac(parcel, i3);
                    }
                }
                ojl.ag(parcel, iX3);
                return new oqq(bS, bS2, strAc);
            case 3:
                int iX4 = ojl.X(parcel);
                int iV12 = 0;
                byte bS3 = 0;
                byte bS4 = 0;
                byte bS5 = 0;
                byte bS6 = 0;
                String strAc8 = null;
                String strAc9 = null;
                String strAc10 = null;
                String strAc11 = null;
                String strAc12 = null;
                String strAc13 = null;
                String strAc14 = null;
                while (parcel.dataPosition() < iX4) {
                    int i4 = parcel.readInt();
                    switch (ojl.T(i4)) {
                        case 2:
                            iV12 = ojl.V(parcel, i4);
                            break;
                        case 3:
                            strAc8 = ojl.ac(parcel, i4);
                            break;
                        case 4:
                            strAc9 = ojl.ac(parcel, i4);
                            break;
                        case 5:
                            strAc10 = ojl.ac(parcel, i4);
                            break;
                        case 6:
                            strAc11 = ojl.ac(parcel, i4);
                            break;
                        case 7:
                            strAc12 = ojl.ac(parcel, i4);
                            break;
                        case 8:
                            strAc13 = ojl.ac(parcel, i4);
                            break;
                        case 9:
                            bS3 = ojl.S(parcel, i4);
                            break;
                        case 10:
                            bS4 = ojl.S(parcel, i4);
                            break;
                        case 11:
                            bS5 = ojl.S(parcel, i4);
                            break;
                        case 12:
                            bS6 = ojl.S(parcel, i4);
                            break;
                        case 13:
                            strAc14 = ojl.ac(parcel, i4);
                            break;
                        default:
                            ojl.ai(parcel, i4);
                            break;
                    }
                }
                ojl.ag(parcel, iX4);
                return new oqr(iV12, strAc8, strAc9, strAc10, strAc11, strAc12, strAc13, bS3, bS4, bS5, bS6, strAc14);
            case 4:
                int iX5 = ojl.X(parcel);
                String strAc15 = null;
                String strAc16 = null;
                ott ottVar = null;
                String strAc17 = null;
                String strAc18 = null;
                Float fValueOf = null;
                oqu oquVar = null;
                while (parcel.dataPosition() < iX5) {
                    int i5 = parcel.readInt();
                    switch (ojl.T(i5)) {
                        case 1:
                            strAc15 = ojl.ac(parcel, i5);
                            break;
                        case 2:
                            strAc16 = ojl.ac(parcel, i5);
                            break;
                        case 3:
                            ottVar = (ott) ojl.ab(parcel, i5, ott.CREATOR);
                            break;
                        case 4:
                            strAc17 = ojl.ac(parcel, i5);
                            break;
                        case 5:
                            strAc18 = ojl.ac(parcel, i5);
                            break;
                        case 6:
                            int iW = ojl.W(parcel, i5);
                            if (iW != 0) {
                                ojl.ap(parcel, iW, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                                break;
                            } else {
                                fValueOf = null;
                                break;
                            }
                        case 7:
                            oquVar = (oqu) ojl.ab(parcel, i5, oqu.CREATOR);
                            break;
                        default:
                            ojl.ai(parcel, i5);
                            break;
                    }
                }
                ojl.ag(parcel, iX5);
                return new oqs(strAc15, strAc16, ottVar, strAc17, strAc18, fValueOf, oquVar);
            case 5:
                int iX6 = ojl.X(parcel);
                ott ottVar2 = null;
                while (parcel.dataPosition() < iX6) {
                    int i6 = parcel.readInt();
                    int iT3 = ojl.T(i6);
                    if (iT3 == 1) {
                        iV10 = ojl.V(parcel, i6);
                    } else if (iT3 == 2) {
                        arrayListAf2 = ojl.af(parcel, i6, oqs.CREATOR);
                    } else if (iT3 != 3) {
                        ojl.ai(parcel, i6);
                    } else {
                        ottVar2 = (ott) ojl.ab(parcel, i6, ott.CREATOR);
                    }
                }
                ojl.ag(parcel, iX6);
                return new oqt(iV10, arrayListAf2, ottVar2);
            case 6:
                int iX7 = ojl.X(parcel);
                while (parcel.dataPosition() < iX7) {
                    int i7 = parcel.readInt();
                    int iT4 = ojl.T(i7);
                    if (iT4 == 1) {
                        zAj = ojl.aj(parcel, i7);
                    } else if (iT4 != 2) {
                        ojl.ai(parcel, i7);
                    } else {
                        arrayListAe = ojl.ae(parcel, i7);
                    }
                }
                ojl.ag(parcel, iX7);
                return new oqu(zAj, arrayListAe);
            case 7:
                int iX8 = ojl.X(parcel);
                boolean zAj3 = false;
                while (parcel.dataPosition() < iX8) {
                    int i8 = parcel.readInt();
                    int iT5 = ojl.T(i8);
                    if (iT5 == 1) {
                        iV9 = ojl.V(parcel, i8);
                    } else if (iT5 != 2) {
                        ojl.ai(parcel, i8);
                    } else {
                        zAj3 = ojl.aj(parcel, i8);
                    }
                }
                ojl.ag(parcel, iX8);
                return new oqw(iV9, zAj3);
            case 8:
                int iX9 = ojl.X(parcel);
                ArrayList arrayListAf3 = null;
                while (parcel.dataPosition() < iX9) {
                    int i9 = parcel.readInt();
                    int iT6 = ojl.T(i9);
                    if (iT6 == 2) {
                        strAc5 = ojl.ac(parcel, i9);
                    } else if (iT6 != 3) {
                        ojl.ai(parcel, i9);
                    } else {
                        arrayListAf3 = ojl.af(parcel, i9, ota.CREATOR);
                    }
                }
                ojl.ag(parcel, iX9);
                return new ora(strAc5, arrayListAf3);
            case 9:
                int iX10 = ojl.X(parcel);
                int iV13 = 0;
                ord ordVar = null;
                int iV14 = 0;
                while (parcel.dataPosition() < iX10) {
                    int i10 = parcel.readInt();
                    int iT7 = ojl.T(i10);
                    if (iT7 == 2) {
                        ordVar = (ord) ojl.ab(parcel, i10, ord.CREATOR);
                    } else if (iT7 == 3) {
                        iV8 = ojl.V(parcel, i10);
                    } else if (iT7 == 4) {
                        iV13 = ojl.V(parcel, i10);
                    } else if (iT7 != 5) {
                        ojl.ai(parcel, i10);
                    } else {
                        iV14 = ojl.V(parcel, i10);
                    }
                }
                ojl.ag(parcel, iX10);
                return new orc(ordVar, iV8, iV13, iV14);
            case 10:
                int iX11 = ojl.X(parcel);
                String strAc19 = null;
                String strAc20 = null;
                while (parcel.dataPosition() < iX11) {
                    int i11 = parcel.readInt();
                    int iT8 = ojl.T(i11);
                    if (iT8 == 2) {
                        strAc4 = ojl.ac(parcel, i11);
                    } else if (iT8 == 3) {
                        strAc19 = ojl.ac(parcel, i11);
                    } else if (iT8 != 4) {
                        ojl.ai(parcel, i11);
                    } else {
                        strAc20 = ojl.ac(parcel, i11);
                    }
                }
                ojl.ag(parcel, iX11);
                return new ord(strAc4, strAc19, strAc20);
            case 11:
                int iX12 = ojl.X(parcel);
                while (parcel.dataPosition() < iX12) {
                    int i12 = parcel.readInt();
                    if (ojl.T(i12) != 2) {
                        ojl.ai(parcel, i12);
                    } else {
                        iV7 = ojl.V(parcel, i12);
                    }
                }
                ojl.ag(parcel, iX12);
                return new ore(iV7);
            case 12:
                int iX13 = ojl.X(parcel);
                while (parcel.dataPosition() < iX13) {
                    int i13 = parcel.readInt();
                    if (ojl.T(i13) != 2) {
                        ojl.ai(parcel, i13);
                    } else {
                        iV6 = ojl.V(parcel, i13);
                    }
                }
                ojl.ag(parcel, iX13);
                return new orf(iV6);
            case 13:
                int iX14 = ojl.X(parcel);
                while (parcel.dataPosition() < iX14) {
                    int i14 = parcel.readInt();
                    if (ojl.T(i14) != 2) {
                        ojl.ai(parcel, i14);
                    } else {
                        iV5 = ojl.V(parcel, i14);
                    }
                }
                ojl.ag(parcel, iX14);
                return new org(iV5);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int iX15 = ojl.X(parcel);
                while (parcel.dataPosition() < iX15) {
                    int i15 = parcel.readInt();
                    int iT9 = ojl.T(i15);
                    if (iT9 == 1) {
                        iV4 = ojl.V(parcel, i15);
                    } else if (iT9 != 2) {
                        ojl.ai(parcel, i15);
                    } else {
                        strAc3 = ojl.ac(parcel, i15);
                    }
                }
                ojl.ag(parcel, iX15);
                return new orh(iV4, strAc3);
            case 15:
                int iX16 = ojl.X(parcel);
                int iV15 = 0;
                boolean zAj4 = false;
                boolean zAj5 = false;
                boolean zAj6 = false;
                boolean zAj7 = false;
                ArrayList arrayListAf4 = null;
                String strAc21 = null;
                Long lValueOf = null;
                while (parcel.dataPosition() < iX16) {
                    int i16 = parcel.readInt();
                    switch (ojl.T(i16)) {
                        case 1:
                            iV15 = ojl.V(parcel, i16);
                            break;
                        case 2:
                            zAj4 = ojl.aj(parcel, i16);
                            break;
                        case 3:
                            zAj5 = ojl.aj(parcel, i16);
                            break;
                        case 4:
                            zAj6 = ojl.aj(parcel, i16);
                            break;
                        case 5:
                            zAj7 = ojl.aj(parcel, i16);
                            break;
                        case 6:
                            arrayListAf4 = ojl.af(parcel, i16, oqn.CREATOR);
                            break;
                        case 7:
                            strAc21 = ojl.ac(parcel, i16);
                            break;
                        case 8:
                            int iW2 = ojl.W(parcel, i16);
                            if (iW2 != 0) {
                                ojl.ap(parcel, iW2, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                                break;
                            } else {
                                lValueOf = null;
                                break;
                            }
                        default:
                            ojl.ai(parcel, i16);
                            break;
                    }
                }
                ojl.ag(parcel, iX16);
                return new ori(iV15, zAj4, zAj5, zAj6, zAj7, arrayListAf4, strAc21, lValueOf);
            case 16:
                int iX17 = ojl.X(parcel);
                String strAc22 = null;
                while (parcel.dataPosition() < iX17) {
                    int i17 = parcel.readInt();
                    int iT10 = ojl.T(i17);
                    if (iT10 == 2) {
                        strAc2 = ojl.ac(parcel, i17);
                    } else if (iT10 != 3) {
                        ojl.ai(parcel, i17);
                    } else {
                        strAc22 = ojl.ac(parcel, i17);
                    }
                }
                ojl.ag(parcel, iX17);
                return new DataItemAssetParcelable(strAc2, strAc22);
            case 17:
                int iX18 = ojl.X(parcel);
                Bundle bundleZ = null;
                byte[] bArrAk2 = null;
                while (parcel.dataPosition() < iX18) {
                    int i18 = parcel.readInt();
                    int iT11 = ojl.T(i18);
                    if (iT11 == 2) {
                        uri = (Uri) ojl.ab(parcel, i18, Uri.CREATOR);
                    } else if (iT11 == 4) {
                        bundleZ = ojl.Z(parcel, i18);
                    } else if (iT11 != 5) {
                        ojl.ai(parcel, i18);
                    } else {
                        bArrAk2 = ojl.ak(parcel, i18);
                    }
                }
                ojl.ag(parcel, iX18);
                return new ork(uri, bundleZ, bArrAk2);
            case 18:
                int iX19 = ojl.X(parcel);
                int iV16 = 0;
                while (parcel.dataPosition() < iX19) {
                    int i19 = parcel.readInt();
                    int iT12 = ojl.T(i19);
                    if (iT12 == 2) {
                        iV3 = ojl.V(parcel, i19);
                    } else if (iT12 != 3) {
                        ojl.ai(parcel, i19);
                    } else {
                        iV16 = ojl.V(parcel, i19);
                    }
                }
                ojl.ag(parcel, iX19);
                return new orm(iV3, iV16);
            case 19:
                int iX20 = ojl.X(parcel);
                while (parcel.dataPosition() < iX20) {
                    int i20 = parcel.readInt();
                    if (ojl.T(i20) != 1) {
                        ojl.ai(parcel, i20);
                    } else {
                        bArrAk = ojl.ak(parcel, i20);
                    }
                }
                ojl.ag(parcel, iX20);
                return new orn(bArrAk);
            default:
                int iX21 = ojl.X(parcel);
                while (parcel.dataPosition() < iX21) {
                    int i21 = parcel.readInt();
                    int iT13 = ojl.T(i21);
                    if (iT13 == 2) {
                        iV2 = ojl.V(parcel, i21);
                    } else if (iT13 != 3) {
                        ojl.ai(parcel, i21);
                    } else {
                        arrayListAf = ojl.af(parcel, i21, ora.CREATOR);
                    }
                }
                ojl.ag(parcel, iX21);
                return new oro(iV2, arrayListAf);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new okr[i];
            case 1:
                return new oqp[i];
            case 2:
                return new oqq[i];
            case 3:
                return new oqr[i];
            case 4:
                return new oqs[i];
            case 5:
                return new oqt[i];
            case 6:
                return new oqu[i];
            case 7:
                return new oqw[i];
            case 8:
                return new ora[i];
            case 9:
                return new orc[i];
            case 10:
                return new ord[i];
            case 11:
                return new ore[i];
            case 12:
                return new orf[i];
            case 13:
                return new org[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new orh[i];
            case 15:
                return new ori[i];
            case 16:
                return new DataItemAssetParcelable[i];
            case 17:
                return new ork[i];
            case 18:
                return new orm[i];
            case 19:
                return new orn[i];
            default:
                return new oro[i];
        }
    }
}
