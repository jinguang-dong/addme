package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.Term;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okq implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public okq(int i) {
        this.a = i;
    }

    public static boolean a(int i) {
        return i == 0;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean zAj = false;
        boolean zAj2 = false;
        int iV = 0;
        boolean zAj3 = false;
        boolean zAj4 = false;
        boolean zAj5 = false;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        int iV5 = 0;
        okr okrVar = null;
        IBinder iBinderAa = null;
        String strAc = null;
        Uri uri = null;
        ArrayList arrayListAf = null;
        ArrayList arrayListAf2 = null;
        ArrayList arrayListAf3 = null;
        odj odjVar = null;
        oiq oiqVar = null;
        ArrayList arrayListAe = null;
        Intent intent = null;
        ArrayList arrayListAf4 = null;
        String strAc2 = null;
        byte[] bArrAk = null;
        switch (this.a) {
            case 0:
                int iX = ojl.X(parcel);
                byte[] bArrAk2 = null;
                while (parcel.dataPosition() < iX) {
                    int i = parcel.readInt();
                    int iT = ojl.T(i);
                    if (iT == 2) {
                        okrVar = (okr) ojl.ab(parcel, i, okr.CREATOR);
                    } else if (iT != 3) {
                        ojl.ai(parcel, i);
                    } else {
                        bArrAk2 = ojl.ak(parcel, i);
                    }
                }
                ojl.ag(parcel, iX);
                return new okp(okrVar, bArrAk2);
            case 1:
                int iX2 = ojl.X(parcel);
                while (parcel.dataPosition() < iX2) {
                    int i2 = parcel.readInt();
                    if (ojl.T(i2) != 2) {
                        ojl.ai(parcel, i2);
                    } else {
                        bArrAk = ojl.ak(parcel, i2);
                    }
                }
                ojl.ag(parcel, iX2);
                return new omy(bArrAk);
            case 2:
                int iX3 = ojl.X(parcel);
                double d = 0.0d;
                long jY = 0;
                boolean zAj6 = false;
                int iV6 = 0;
                int iV7 = 0;
                int iV8 = 0;
                String strAc3 = null;
                String strAc4 = null;
                byte[] bArrAk3 = null;
                while (parcel.dataPosition() < iX3) {
                    int i3 = parcel.readInt();
                    switch (ojl.T(i3)) {
                        case 2:
                            strAc3 = ojl.ac(parcel, i3);
                            break;
                        case 3:
                            jY = ojl.Y(parcel, i3);
                            break;
                        case 4:
                            zAj6 = ojl.aj(parcel, i3);
                            break;
                        case 5:
                            ojl.ah(parcel, i3, 8);
                            d = parcel.readDouble();
                            break;
                        case 6:
                            strAc4 = ojl.ac(parcel, i3);
                            break;
                        case 7:
                            bArrAk3 = ojl.ak(parcel, i3);
                            break;
                        case 8:
                            iV6 = ojl.V(parcel, i3);
                            break;
                        case 9:
                            iV7 = ojl.V(parcel, i3);
                            break;
                        case 10:
                            iV8 = ojl.V(parcel, i3);
                            break;
                        default:
                            ojl.ai(parcel, i3);
                            break;
                    }
                }
                ojl.ag(parcel, iX3);
                return new ond(strAc3, jY, zAj6, d, strAc4, bArrAk3, iV6, iV7, iV8);
            case 3:
                int iX4 = ojl.X(parcel);
                String strAc5 = null;
                ond ondVar = null;
                while (parcel.dataPosition() < iX4) {
                    int i4 = parcel.readInt();
                    int iT2 = ojl.T(i4);
                    if (iT2 == 2) {
                        strAc2 = ojl.ac(parcel, i4);
                    } else if (iT2 == 3) {
                        strAc5 = ojl.ac(parcel, i4);
                    } else if (iT2 == 4) {
                        ondVar = (ond) ojl.ab(parcel, i4, ond.CREATOR);
                    } else if (iT2 != 5) {
                        ojl.ai(parcel, i4);
                    } else {
                        zAj = ojl.aj(parcel, i4);
                    }
                }
                ojl.ag(parcel, iX4);
                return new one(strAc2, strAc5, ondVar, zAj);
            case 4:
                int iX5 = ojl.X(parcel);
                while (parcel.dataPosition() < iX5) {
                    int i5 = parcel.readInt();
                    if (ojl.T(i5) != 2) {
                        ojl.ai(parcel, i5);
                    } else {
                        arrayListAf4 = ojl.af(parcel, i5, one.CREATOR);
                    }
                }
                ojl.ag(parcel, iX5);
                return new onf(arrayListAf4);
            case 5:
                int iX6 = ojl.X(parcel);
                int iV9 = 0;
                while (parcel.dataPosition() < iX6) {
                    int i6 = parcel.readInt();
                    int iT3 = ojl.T(i6);
                    if (iT3 == 1) {
                        iV5 = ojl.V(parcel, i6);
                    } else if (iT3 != 2) {
                        ojl.ai(parcel, i6);
                    } else {
                        iV9 = ojl.V(parcel, i6);
                    }
                }
                ojl.ag(parcel, iX6);
                return new ong(iV5, iV9);
            case 6:
                int iX7 = ojl.X(parcel);
                int iV10 = 0;
                while (parcel.dataPosition() < iX7) {
                    int i7 = parcel.readInt();
                    int iT4 = ojl.T(i7);
                    if (iT4 == 1) {
                        iV4 = ojl.V(parcel, i7);
                    } else if (iT4 == 2) {
                        iV10 = ojl.V(parcel, i7);
                    } else if (iT4 != 3) {
                        ojl.ai(parcel, i7);
                    } else {
                        intent = (Intent) ojl.ab(parcel, i7, Intent.CREATOR);
                    }
                }
                ojl.ag(parcel, iX7);
                return new onv(iV4, iV10, intent);
            case 7:
                int iX8 = ojl.X(parcel);
                String strAc6 = null;
                while (parcel.dataPosition() < iX8) {
                    int i8 = parcel.readInt();
                    int iT5 = ojl.T(i8);
                    if (iT5 == 1) {
                        arrayListAe = ojl.ae(parcel, i8);
                    } else if (iT5 != 2) {
                        ojl.ai(parcel, i8);
                    } else {
                        strAc6 = ojl.ac(parcel, i8);
                    }
                }
                ojl.ag(parcel, iX8);
                return new ony(arrayListAe, strAc6);
            case 8:
                int iX9 = ojl.X(parcel);
                while (parcel.dataPosition() < iX9) {
                    int i9 = parcel.readInt();
                    int iT6 = ojl.T(i9);
                    if (iT6 == 1) {
                        iV3 = ojl.V(parcel, i9);
                    } else if (iT6 != 2) {
                        ojl.ai(parcel, i9);
                    } else {
                        oiqVar = (oiq) ojl.ab(parcel, i9, oiq.CREATOR);
                    }
                }
                ojl.ag(parcel, iX9);
                return new ooa(iV3, oiqVar);
            case 9:
                int iX10 = ojl.X(parcel);
                oir oirVar = null;
                while (parcel.dataPosition() < iX10) {
                    int i10 = parcel.readInt();
                    int iT7 = ojl.T(i10);
                    if (iT7 == 1) {
                        iV2 = ojl.V(parcel, i10);
                    } else if (iT7 == 2) {
                        odjVar = (odj) ojl.ab(parcel, i10, odj.CREATOR);
                    } else if (iT7 != 3) {
                        ojl.ai(parcel, i10);
                    } else {
                        oirVar = (oir) ojl.ab(parcel, i10, oir.CREATOR);
                    }
                }
                ojl.ag(parcel, iX10);
                return new oob(iV2, odjVar, oirVar);
            case 10:
                int iX11 = ojl.X(parcel);
                String strAc7 = null;
                byte[] bArrAk4 = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < iX11) {
                    int i11 = parcel.readInt();
                    int iT8 = ojl.T(i11);
                    if (iT8 == 1) {
                        strAc7 = ojl.ac(parcel, i11);
                    } else if (iT8 == 2) {
                        bArrAk4 = ojl.ak(parcel, i11);
                    } else if (iT8 != 3) {
                        ojl.ai(parcel, i11);
                    } else {
                        int iW = ojl.W(parcel, i11);
                        int iDataPosition = parcel.dataPosition();
                        if (iW == 0) {
                            arrayList = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            int i12 = parcel.readInt();
                            for (int i13 = 0; i13 < i12; i13++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition + iW);
                            arrayList = arrayList2;
                        }
                    }
                }
                ojl.ag(parcel, iX11);
                return new ooy(strAc7, bArrAk4, arrayList);
            case 11:
                int iX12 = ojl.X(parcel);
                boolean zAj7 = false;
                while (parcel.dataPosition() < iX12) {
                    int i14 = parcel.readInt();
                    int iT9 = ojl.T(i14);
                    if (iT9 == 1) {
                        arrayListAf3 = ojl.af(parcel, i14, ooy.CREATOR);
                    } else if (iT9 == 2) {
                        zAj5 = ojl.aj(parcel, i14);
                    } else if (iT9 != 3) {
                        ojl.ai(parcel, i14);
                    } else {
                        zAj7 = ojl.aj(parcel, i14);
                    }
                }
                ojl.ag(parcel, iX12);
                return new ooz(arrayListAf3, zAj5, zAj7);
            case 12:
                int iX13 = ojl.X(parcel);
                int iV11 = 0;
                while (parcel.dataPosition() < iX13) {
                    int i15 = parcel.readInt();
                    int iT10 = ojl.T(i15);
                    if (iT10 == 2) {
                        zAj4 = ojl.aj(parcel, i15);
                    } else if (iT10 != 3) {
                        ojl.ai(parcel, i15);
                    } else {
                        iV11 = ojl.V(parcel, i15);
                    }
                }
                ojl.ag(parcel, iX13);
                return new opa(zAj4, iV11);
            case 13:
                int iX14 = ojl.X(parcel);
                boolean zAj8 = false;
                int iV12 = 0;
                while (parcel.dataPosition() < iX14) {
                    int i16 = parcel.readInt();
                    int iT11 = ojl.T(i16);
                    if (iT11 == 2) {
                        zAj3 = ojl.aj(parcel, i16);
                    } else if (iT11 == 3) {
                        zAj8 = ojl.aj(parcel, i16);
                    } else if (iT11 != 4) {
                        ojl.ai(parcel, i16);
                    } else {
                        iV12 = ojl.V(parcel, i16);
                    }
                }
                ojl.ag(parcel, iX14);
                return new opg(zAj3, zAj8, iV12);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int iX15 = ojl.X(parcel);
                int iV13 = 0;
                int iV14 = 0;
                int iV15 = 0;
                int iV16 = 0;
                int iV17 = 0;
                while (parcel.dataPosition() < iX15) {
                    int i17 = parcel.readInt();
                    int iT12 = ojl.T(i17);
                    if (iT12 == 1) {
                        iV13 = ojl.V(parcel, i17);
                    } else if (iT12 == 2) {
                        iV14 = ojl.V(parcel, i17);
                    } else if (iT12 == 3) {
                        iV15 = ojl.V(parcel, i17);
                    } else if (iT12 == 4) {
                        iV16 = ojl.V(parcel, i17);
                    } else if (iT12 != 5) {
                        ojl.ai(parcel, i17);
                    } else {
                        iV17 = ojl.V(parcel, i17);
                    }
                }
                ojl.ag(parcel, iX15);
                return new AppTheme(iV13, iV14, iV15, iV16, iV17);
            case 15:
                int iX16 = ojl.X(parcel);
                while (parcel.dataPosition() < iX16) {
                    int i18 = parcel.readInt();
                    if (ojl.T(i18) != 1) {
                        ojl.ai(parcel, i18);
                    } else {
                        arrayListAf2 = ojl.af(parcel, i18, oqc.CREATOR);
                    }
                }
                ojl.ag(parcel, iX16);
                return new opy(arrayListAf2);
            case 16:
                int iX17 = ojl.X(parcel);
                ArrayList arrayListAe2 = null;
                ArrayList arrayListAe3 = null;
                while (parcel.dataPosition() < iX17) {
                    int i19 = parcel.readInt();
                    int iT13 = ojl.T(i19);
                    if (iT13 == 1) {
                        arrayListAf = ojl.af(parcel, i19, oqc.CREATOR);
                    } else if (iT13 == 2) {
                        arrayListAe2 = ojl.ae(parcel, i19);
                    } else if (iT13 != 3) {
                        ojl.ai(parcel, i19);
                    } else {
                        arrayListAe3 = ojl.ae(parcel, i19);
                    }
                }
                ojl.ag(parcel, iX17);
                return new opz(arrayListAf, arrayListAe2, arrayListAe3);
            case 17:
                int iX18 = ojl.X(parcel);
                while (parcel.dataPosition() < iX18) {
                    int i20 = parcel.readInt();
                    int iT14 = ojl.T(i20);
                    if (iT14 == 1) {
                        uri = (Uri) ojl.ab(parcel, i20, Uri.CREATOR);
                    } else if (iT14 != 2) {
                        ojl.ai(parcel, i20);
                    } else {
                        iV = ojl.V(parcel, i20);
                    }
                }
                ojl.ag(parcel, iX18);
                return new oqc(uri, iV);
            case 18:
                int iX19 = ojl.X(parcel);
                int iV18 = 0;
                boolean zAj9 = false;
                int iV19 = 0;
                String strAc8 = null;
                String strAc9 = null;
                String strAc10 = null;
                while (parcel.dataPosition() < iX19) {
                    int i21 = parcel.readInt();
                    switch (ojl.T(i21)) {
                        case 1:
                            iV18 = ojl.V(parcel, i21);
                            break;
                        case 2:
                            strAc8 = ojl.ac(parcel, i21);
                            break;
                        case 3:
                            zAj9 = ojl.aj(parcel, i21);
                            break;
                        case 4:
                            strAc9 = ojl.ac(parcel, i21);
                            break;
                        case 5:
                            strAc10 = ojl.ac(parcel, i21);
                            break;
                        case 6:
                            iV19 = ojl.V(parcel, i21);
                            break;
                        default:
                            ojl.ai(parcel, i21);
                            break;
                    }
                }
                ojl.ag(parcel, iX19);
                return new Term(iV18, strAc8, zAj9, strAc9, strAc10, iV19);
            case 19:
                int iX20 = ojl.X(parcel);
                while (parcel.dataPosition() < iX20) {
                    int i22 = parcel.readInt();
                    int iT15 = ojl.T(i22);
                    if (iT15 == 1) {
                        strAc = ojl.ac(parcel, i22);
                    } else if (iT15 != 2) {
                        ojl.ai(parcel, i22);
                    } else {
                        zAj2 = ojl.aj(parcel, i22);
                    }
                }
                ojl.ag(parcel, iX20);
                return new oqn(strAc, zAj2);
            default:
                int iX21 = ojl.X(parcel);
                IntentFilter[] intentFilterArr = null;
                String strAc11 = null;
                String strAc12 = null;
                while (parcel.dataPosition() < iX21) {
                    int i23 = parcel.readInt();
                    int iT16 = ojl.T(i23);
                    if (iT16 == 2) {
                        iBinderAa = ojl.aa(parcel, i23);
                    } else if (iT16 == 3) {
                        intentFilterArr = (IntentFilter[]) ojl.am(parcel, i23, IntentFilter.CREATOR);
                    } else if (iT16 == 4) {
                        strAc11 = ojl.ac(parcel, i23);
                    } else if (iT16 != 5) {
                        ojl.ai(parcel, i23);
                    } else {
                        strAc12 = ojl.ac(parcel, i23);
                    }
                }
                ojl.ag(parcel, iX21);
                return new oqo(iBinderAa, intentFilterArr, strAc11, strAc12);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new okp[i];
            case 1:
                return new omy[i];
            case 2:
                return new ond[i];
            case 3:
                return new one[i];
            case 4:
                return new onf[i];
            case 5:
                return new ong[i];
            case 6:
                return new onv[i];
            case 7:
                return new ony[i];
            case 8:
                return new ooa[i];
            case 9:
                return new oob[i];
            case 10:
                return new ooy[i];
            case 11:
                return new ooz[i];
            case 12:
                return new opa[i];
            case 13:
                return new opg[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new AppTheme[i];
            case 15:
                return new opy[i];
            case 16:
                return new opz[i];
            case 17:
                return new oqc[i];
            case 18:
                return new Term[i];
            case 19:
                return new oqn[i];
            default:
                return new oqo[i];
        }
    }
}
