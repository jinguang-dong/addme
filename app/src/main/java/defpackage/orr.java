package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class orr implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public orr(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        AppTheme appTheme = null;
        byte[] bArrAk = null;
        String strAc = null;
        ota otaVar = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        ArrayList arrayListAf = null;
        orn ornVar = null;
        String strAc2 = null;
        ork orkVar = null;
        ArrayList arrayListAf2 = null;
        ConnectionConfiguration[] connectionConfigurationArr = null;
        ConnectionConfiguration connectionConfiguration = null;
        String strAc3 = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        ParcelFileDescriptor parcelFileDescriptor3 = null;
        ora oraVar = null;
        int iV = 0;
        switch (this.a) {
            case 0:
                int iX = ojl.X(parcel);
                boolean zAj = false;
                while (parcel.dataPosition() < iX) {
                    int i = parcel.readInt();
                    int iT = ojl.T(i);
                    if (iT == 1) {
                        iV = ojl.V(parcel, i);
                    } else if (iT != 2) {
                        ojl.ai(parcel, i);
                    } else {
                        zAj = ojl.aj(parcel, i);
                    }
                }
                ojl.ag(parcel, iX);
                return new orq(iV, zAj);
            case 1:
                int iX2 = ojl.X(parcel);
                while (parcel.dataPosition() < iX2) {
                    int i2 = parcel.readInt();
                    int iT2 = ojl.T(i2);
                    if (iT2 == 2) {
                        iV = ojl.V(parcel, i2);
                    } else if (iT2 != 3) {
                        ojl.ai(parcel, i2);
                    } else {
                        appTheme = (AppTheme) ojl.ab(parcel, i2, AppTheme.CREATOR);
                    }
                }
                ojl.ag(parcel, iX2);
                return new orp(iV, appTheme);
            case 2:
                int iX3 = ojl.X(parcel);
                while (parcel.dataPosition() < iX3) {
                    int i3 = parcel.readInt();
                    int iT3 = ojl.T(i3);
                    if (iT3 == 2) {
                        iV = ojl.V(parcel, i3);
                    } else if (iT3 != 3) {
                        ojl.ai(parcel, i3);
                    } else {
                        oraVar = (ora) ojl.ab(parcel, i3, ora.CREATOR);
                    }
                }
                ojl.ag(parcel, iX3);
                return new ors(iV, oraVar);
            case 3:
                int iX4 = ojl.X(parcel);
                while (parcel.dataPosition() < iX4) {
                    int i4 = parcel.readInt();
                    int iT4 = ojl.T(i4);
                    if (iT4 == 2) {
                        iV = ojl.V(parcel, i4);
                    } else if (iT4 != 3) {
                        ojl.ai(parcel, i4);
                    } else {
                        parcelFileDescriptor3 = (ParcelFileDescriptor) ojl.ab(parcel, i4, ParcelFileDescriptor.CREATOR);
                    }
                }
                ojl.ag(parcel, iX4);
                return new ort(iV, parcelFileDescriptor3);
            case 4:
                int iX5 = ojl.X(parcel);
                while (parcel.dataPosition() < iX5) {
                    int i5 = parcel.readInt();
                    int iT5 = ojl.T(i5);
                    if (iT5 == 2) {
                        iV = ojl.V(parcel, i5);
                    } else if (iT5 != 3) {
                        ojl.ai(parcel, i5);
                    } else {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) ojl.ab(parcel, i5, ParcelFileDescriptor.CREATOR);
                    }
                }
                ojl.ag(parcel, iX5);
                return new oru(iV, parcelFileDescriptor2);
            case 5:
                int iX6 = ojl.X(parcel);
                boolean zAj2 = false;
                while (parcel.dataPosition() < iX6) {
                    int i6 = parcel.readInt();
                    int iT6 = ojl.T(i6);
                    if (iT6 == 2) {
                        iV = ojl.V(parcel, i6);
                    } else if (iT6 != 3) {
                        ojl.ai(parcel, i6);
                    } else {
                        zAj2 = ojl.aj(parcel, i6);
                    }
                }
                ojl.ag(parcel, iX6);
                return new orv(iV, zAj2);
            case 6:
                int iX7 = ojl.X(parcel);
                boolean zAj3 = false;
                boolean zAj4 = false;
                while (parcel.dataPosition() < iX7) {
                    int i7 = parcel.readInt();
                    int iT7 = ojl.T(i7);
                    if (iT7 == 2) {
                        iV = ojl.V(parcel, i7);
                    } else if (iT7 == 3) {
                        zAj3 = ojl.aj(parcel, i7);
                    } else if (iT7 != 4) {
                        ojl.ai(parcel, i7);
                    } else {
                        zAj4 = ojl.aj(parcel, i7);
                    }
                }
                ojl.ag(parcel, iX7);
                return new orw(iV, zAj3, zAj4);
            case 7:
                int iX8 = ojl.X(parcel);
                boolean zAj5 = false;
                while (parcel.dataPosition() < iX8) {
                    int i8 = parcel.readInt();
                    int iT8 = ojl.T(i8);
                    if (iT8 == 2) {
                        iV = ojl.V(parcel, i8);
                    } else if (iT8 != 3) {
                        ojl.ai(parcel, i8);
                    } else {
                        zAj5 = ojl.aj(parcel, i8);
                    }
                }
                ojl.ag(parcel, iX8);
                return new orx(iV, zAj5);
            case 8:
                int iX9 = ojl.X(parcel);
                while (parcel.dataPosition() < iX9) {
                    int i9 = parcel.readInt();
                    int iT9 = ojl.T(i9);
                    if (iT9 == 2) {
                        iV = ojl.V(parcel, i9);
                    } else if (iT9 != 3) {
                        ojl.ai(parcel, i9);
                    } else {
                        strAc3 = ojl.ac(parcel, i9);
                    }
                }
                ojl.ag(parcel, iX9);
                return new ory(iV, strAc3);
            case 9:
                int iX10 = ojl.X(parcel);
                while (parcel.dataPosition() < iX10) {
                    int i10 = parcel.readInt();
                    int iT10 = ojl.T(i10);
                    if (iT10 == 2) {
                        iV = ojl.V(parcel, i10);
                    } else if (iT10 != 3) {
                        ojl.ai(parcel, i10);
                    } else {
                        connectionConfiguration = (ConnectionConfiguration) ojl.ab(parcel, i10, ConnectionConfiguration.CREATOR);
                    }
                }
                ojl.ag(parcel, iX10);
                return new orz(iV, connectionConfiguration);
            case 10:
                int iX11 = ojl.X(parcel);
                while (parcel.dataPosition() < iX11) {
                    int i11 = parcel.readInt();
                    int iT11 = ojl.T(i11);
                    if (iT11 == 2) {
                        iV = ojl.V(parcel, i11);
                    } else if (iT11 != 3) {
                        ojl.ai(parcel, i11);
                    } else {
                        connectionConfigurationArr = (ConnectionConfiguration[]) ojl.am(parcel, i11, ConnectionConfiguration.CREATOR);
                    }
                }
                ojl.ag(parcel, iX11);
                return new osa(iV, connectionConfigurationArr);
            case 11:
                int iX12 = ojl.X(parcel);
                while (parcel.dataPosition() < iX12) {
                    int i12 = parcel.readInt();
                    int iT12 = ojl.T(i12);
                    if (iT12 == 2) {
                        iV = ojl.V(parcel, i12);
                    } else if (iT12 != 3) {
                        ojl.ai(parcel, i12);
                    } else {
                        arrayListAf2 = ojl.af(parcel, i12, ota.CREATOR);
                    }
                }
                ojl.ag(parcel, iX12);
                return new osb(iV, arrayListAf2);
            case 12:
                int iX13 = ojl.X(parcel);
                while (parcel.dataPosition() < iX13) {
                    int i13 = parcel.readInt();
                    int iT13 = ojl.T(i13);
                    if (iT13 == 2) {
                        iV = ojl.V(parcel, i13);
                    } else if (iT13 != 3) {
                        ojl.ai(parcel, i13);
                    } else {
                        orkVar = (ork) ojl.ab(parcel, i13, ork.CREATOR);
                    }
                }
                ojl.ag(parcel, iX13);
                return new osc(iV, orkVar);
            case 13:
                int iX14 = ojl.X(parcel);
                while (parcel.dataPosition() < iX14) {
                    int i14 = parcel.readInt();
                    int iT14 = ojl.T(i14);
                    if (iT14 == 2) {
                        iV = ojl.V(parcel, i14);
                    } else if (iT14 != 3) {
                        ojl.ai(parcel, i14);
                    } else {
                        strAc2 = ojl.ac(parcel, i14);
                    }
                }
                ojl.ag(parcel, iX14);
                return new osd(iV, strAc2);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int iX15 = ojl.X(parcel);
                while (parcel.dataPosition() < iX15) {
                    int i15 = parcel.readInt();
                    int iT15 = ojl.T(i15);
                    if (iT15 == 1) {
                        iV = ojl.V(parcel, i15);
                    } else if (iT15 != 2) {
                        ojl.ai(parcel, i15);
                    } else {
                        ornVar = (orn) ojl.ab(parcel, i15, orn.CREATOR);
                    }
                }
                ojl.ag(parcel, iX15);
                return new ose(iV, ornVar);
            case 15:
                int iX16 = ojl.X(parcel);
                while (parcel.dataPosition() < iX16) {
                    int i16 = parcel.readInt();
                    int iT16 = ojl.T(i16);
                    if (iT16 == 1) {
                        iV = ojl.V(parcel, i16);
                    } else if (iT16 != 2) {
                        ojl.ai(parcel, i16);
                    } else {
                        arrayListAf = ojl.af(parcel, i16, orn.CREATOR);
                    }
                }
                ojl.ag(parcel, iX16);
                return new osf(iV, arrayListAf);
            case 16:
                int iX17 = ojl.X(parcel);
                while (parcel.dataPosition() < iX17) {
                    int i17 = parcel.readInt();
                    int iT17 = ojl.T(i17);
                    if (iT17 == 2) {
                        iV = ojl.V(parcel, i17);
                    } else if (iT17 != 3) {
                        ojl.ai(parcel, i17);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) ojl.ab(parcel, i17, ParcelFileDescriptor.CREATOR);
                    }
                }
                ojl.ag(parcel, iX17);
                return new osg(iV, parcelFileDescriptor);
            case 17:
                int iX18 = ojl.X(parcel);
                while (parcel.dataPosition() < iX18) {
                    int i18 = parcel.readInt();
                    int iT18 = ojl.T(i18);
                    if (iT18 == 2) {
                        iV = ojl.V(parcel, i18);
                    } else if (iT18 != 3) {
                        ojl.ai(parcel, i18);
                    } else {
                        otaVar = (ota) ojl.ab(parcel, i18, ota.CREATOR);
                    }
                }
                ojl.ag(parcel, iX18);
                return new osh(iV, otaVar);
            case 18:
                int iX19 = ojl.X(parcel);
                while (parcel.dataPosition() < iX19) {
                    int i19 = parcel.readInt();
                    int iT19 = ojl.T(i19);
                    if (iT19 == 2) {
                        iV = ojl.V(parcel, i19);
                    } else if (iT19 != 3) {
                        ojl.ai(parcel, i19);
                    } else {
                        strAc = ojl.ac(parcel, i19);
                    }
                }
                ojl.ag(parcel, iX19);
                return new osi(iV, strAc);
            case 19:
                int iX20 = ojl.X(parcel);
                int iV2 = 0;
                while (parcel.dataPosition() < iX20) {
                    int i20 = parcel.readInt();
                    int iT20 = ojl.T(i20);
                    if (iT20 == 1) {
                        iV = ojl.V(parcel, i20);
                    } else if (iT20 == 2) {
                        iV2 = ojl.V(parcel, i20);
                    } else if (iT20 != 3) {
                        ojl.ai(parcel, i20);
                    } else {
                        bArrAk = ojl.ak(parcel, i20);
                    }
                }
                ojl.ag(parcel, iX20);
                return new osj(iV, iV2, bArrAk);
            default:
                int iX21 = ojl.X(parcel);
                boolean zAj6 = false;
                while (parcel.dataPosition() < iX21) {
                    int i21 = parcel.readInt();
                    int iT21 = ojl.T(i21);
                    if (iT21 == 1) {
                        iV = ojl.V(parcel, i21);
                    } else if (iT21 != 2) {
                        ojl.ai(parcel, i21);
                    } else {
                        zAj6 = ojl.aj(parcel, i21);
                    }
                }
                ojl.ag(parcel, iX21);
                return new osk(iV, zAj6);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new orq[i];
            case 1:
                return new orp[i];
            case 2:
                return new ors[i];
            case 3:
                return new ort[i];
            case 4:
                return new oru[i];
            case 5:
                return new orv[i];
            case 6:
                return new orw[i];
            case 7:
                return new orx[i];
            case 8:
                return new ory[i];
            case 9:
                return new orz[i];
            case 10:
                return new osa[i];
            case 11:
                return new osb[i];
            case 12:
                return new osc[i];
            case 13:
                return new osd[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new ose[i];
            case 15:
                return new osf[i];
            case 16:
                return new osg[i];
            case 17:
                return new osh[i];
            case 18:
                return new osi[i];
            case 19:
                return new osj[i];
            default:
                return new osk[i];
        }
    }
}
