package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.Term;
import com.google.android.libraries.barhopper.Barcode;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oss implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public oss(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long jY = 0;
        int iV = 0;
        String strAc = null;
        ArrayList arrayListAf = null;
        byte[] bArrAk = null;
        String strAc2 = null;
        IBinder iBinderAa = null;
        ork orkVar = null;
        String strAc3 = null;
        String strAc4 = null;
        ord ordVar = null;
        String strAc5 = null;
        String strAc6 = null;
        String strAc7 = null;
        ArrayList arrayListAf2 = null;
        switch (this.a) {
            case 0:
                int iX = ojl.X(parcel);
                int iV2 = 0;
                while (parcel.dataPosition() < iX) {
                    int i = parcel.readInt();
                    int iT = ojl.T(i);
                    if (iT == 1) {
                        strAc = ojl.ac(parcel, i);
                    } else if (iT == 2) {
                        iV = ojl.V(parcel, i);
                    } else if (iT != 3) {
                        ojl.ai(parcel, i);
                    } else {
                        iV2 = ojl.V(parcel, i);
                    }
                }
                ojl.ag(parcel, iX);
                return new ott(strAc, iV, iV2);
            case 1:
                int iX2 = ojl.X(parcel);
                while (parcel.dataPosition() < iX2) {
                    int i2 = parcel.readInt();
                    int iT2 = ojl.T(i2);
                    if (iT2 == 1) {
                        iV = ojl.V(parcel, i2);
                    } else if (iT2 != 2) {
                        ojl.ai(parcel, i2);
                    } else {
                        arrayListAf2 = ojl.af(parcel, i2, Term.CREATOR);
                    }
                }
                ojl.ag(parcel, iX2);
                return new osl(iV, arrayListAf2);
            case 2:
                int iX3 = ojl.X(parcel);
                byte[] bArrAk2 = null;
                String strAc8 = null;
                while (parcel.dataPosition() < iX3) {
                    int i3 = parcel.readInt();
                    int iT3 = ojl.T(i3);
                    if (iT3 == 2) {
                        iV = ojl.V(parcel, i3);
                    } else if (iT3 == 3) {
                        strAc7 = ojl.ac(parcel, i3);
                    } else if (iT3 == 4) {
                        bArrAk2 = ojl.ak(parcel, i3);
                    } else if (iT3 != 5) {
                        ojl.ai(parcel, i3);
                    } else {
                        strAc8 = ojl.ac(parcel, i3);
                    }
                }
                ojl.ag(parcel, iX3);
                return new osy(iV, strAc7, bArrAk2, strAc8);
            case 3:
                int iX4 = ojl.X(parcel);
                DataHolder dataHolder = null;
                while (parcel.dataPosition() < iX4) {
                    int i4 = parcel.readInt();
                    int iT4 = ojl.T(i4);
                    if (iT4 == 1) {
                        strAc6 = ojl.ac(parcel, i4);
                    } else if (iT4 != 2) {
                        ojl.ai(parcel, i4);
                    } else {
                        dataHolder = (DataHolder) ojl.ab(parcel, i4, DataHolder.CREATOR);
                    }
                }
                ojl.ag(parcel, iX4);
                return new osz(strAc6, dataHolder);
            case 4:
                int iX5 = ojl.X(parcel);
                boolean zAj = false;
                String strAc9 = null;
                while (parcel.dataPosition() < iX5) {
                    int i5 = parcel.readInt();
                    int iT5 = ojl.T(i5);
                    if (iT5 == 2) {
                        strAc5 = ojl.ac(parcel, i5);
                    } else if (iT5 == 3) {
                        strAc9 = ojl.ac(parcel, i5);
                    } else if (iT5 == 4) {
                        iV = ojl.V(parcel, i5);
                    } else if (iT5 != 5) {
                        ojl.ai(parcel, i5);
                    } else {
                        zAj = ojl.aj(parcel, i5);
                    }
                }
                ojl.ag(parcel, iX5);
                return new ota(strAc5, strAc9, iV, zAj);
            case 5:
                int iX6 = ojl.X(parcel);
                while (parcel.dataPosition() < iX6) {
                    int i6 = parcel.readInt();
                    int iT6 = ojl.T(i6);
                    if (iT6 == 2) {
                        iV = ojl.V(parcel, i6);
                    } else if (iT6 != 3) {
                        ojl.ai(parcel, i6);
                    } else {
                        ordVar = (ord) ojl.ab(parcel, i6, ord.CREATOR);
                    }
                }
                ojl.ag(parcel, iX6);
                return new otb(iV, ordVar);
            case 6:
                int iX7 = ojl.X(parcel);
                String strAc10 = null;
                while (parcel.dataPosition() < iX7) {
                    int i7 = parcel.readInt();
                    int iT7 = ojl.T(i7);
                    if (iT7 == 2) {
                        strAc4 = ojl.ac(parcel, i7);
                    } else if (iT7 == 3) {
                        strAc10 = ojl.ac(parcel, i7);
                    } else if (iT7 != 4) {
                        ojl.ai(parcel, i7);
                    } else {
                        jY = ojl.Y(parcel, i7);
                    }
                }
                ojl.ag(parcel, iX7);
                return new otc(strAc4, strAc10, jY);
            case 7:
                int iX8 = ojl.X(parcel);
                while (parcel.dataPosition() < iX8) {
                    int i8 = parcel.readInt();
                    int iT8 = ojl.T(i8);
                    if (iT8 == 2) {
                        iV = ojl.V(parcel, i8);
                    } else if (iT8 != 3) {
                        ojl.ai(parcel, i8);
                    } else {
                        strAc3 = ojl.ac(parcel, i8);
                    }
                }
                ojl.ag(parcel, iX8);
                return new otd(iV, strAc3);
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
                        orkVar = (ork) ojl.ab(parcel, i9, ork.CREATOR);
                    }
                }
                ojl.ag(parcel, iX9);
                return new ote(iV, orkVar);
            case 9:
                int iX10 = ojl.X(parcel);
                while (parcel.dataPosition() < iX10) {
                    int i10 = parcel.readInt();
                    int iT10 = ojl.T(i10);
                    if (iT10 == 1) {
                        iV = ojl.V(parcel, i10);
                    } else if (iT10 != 2) {
                        ojl.ai(parcel, i10);
                    } else {
                        iBinderAa = ojl.aa(parcel, i10);
                    }
                }
                ojl.ag(parcel, iX10);
                return new otf(iV, iBinderAa);
            case 10:
                int iX11 = ojl.X(parcel);
                while (parcel.dataPosition() < iX11) {
                    int i11 = parcel.readInt();
                    if (ojl.T(i11) != 2) {
                        ojl.ai(parcel, i11);
                    } else {
                        iV = ojl.V(parcel, i11);
                    }
                }
                ojl.ag(parcel, iX11);
                return new otg(iV);
            case 11:
                int iX12 = ojl.X(parcel);
                while (parcel.dataPosition() < iX12) {
                    int i12 = parcel.readInt();
                    if (ojl.T(i12) != 1) {
                        ojl.ai(parcel, i12);
                    } else {
                        strAc2 = ojl.ac(parcel, i12);
                    }
                }
                ojl.ag(parcel, iX12);
                return new oth(strAc2);
            case 12:
                int iX13 = ojl.X(parcel);
                int iV3 = 0;
                while (parcel.dataPosition() < iX13) {
                    int i13 = parcel.readInt();
                    int iT11 = ojl.T(i13);
                    if (iT11 == 1) {
                        iV = ojl.V(parcel, i13);
                    } else if (iT11 == 2) {
                        iV3 = ojl.V(parcel, i13);
                    } else if (iT11 != 3) {
                        ojl.ai(parcel, i13);
                    } else {
                        bArrAk = ojl.ak(parcel, i13);
                    }
                }
                ojl.ag(parcel, iX13);
                return new oti(iV, iV3, bArrAk);
            case 13:
                int iX14 = ojl.X(parcel);
                int iV4 = 0;
                while (parcel.dataPosition() < iX14) {
                    int i14 = parcel.readInt();
                    int iT12 = ojl.T(i14);
                    if (iT12 == 2) {
                        iV = ojl.V(parcel, i14);
                    } else if (iT12 != 3) {
                        ojl.ai(parcel, i14);
                    } else {
                        iV4 = ojl.V(parcel, i14);
                    }
                }
                ojl.ag(parcel, iX14);
                return new otj(iV, iV4);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int iX15 = ojl.X(parcel);
                while (parcel.dataPosition() < iX15) {
                    int i15 = parcel.readInt();
                    int iT13 = ojl.T(i15);
                    if (iT13 == 2) {
                        iV = ojl.V(parcel, i15);
                    } else if (iT13 == 3) {
                        jY = ojl.Y(parcel, i15);
                    } else if (iT13 != 4) {
                        ojl.ai(parcel, i15);
                    } else {
                        arrayListAf = ojl.af(parcel, i15, otc.CREATOR);
                    }
                }
                ojl.ag(parcel, iX15);
                return new otk(iV, jY, arrayListAf);
            case 15:
                return new Barcode(parcel);
            case 16:
                return new Barcode.Address(parcel);
            case 17:
                return new Barcode.BoardingPass(parcel);
            case 18:
                return new Barcode.CalendarDateTime(parcel);
            case 19:
                return new Barcode.CalendarEvent(parcel);
            default:
                return new Barcode.ContactInfo(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ott[i];
            case 1:
                return new osl[i];
            case 2:
                return new osy[i];
            case 3:
                return new osz[i];
            case 4:
                return new ota[i];
            case 5:
                return new otb[i];
            case 6:
                return new otc[i];
            case 7:
                return new otd[i];
            case 8:
                return new ote[i];
            case 9:
                return new otf[i];
            case 10:
                return new otg[i];
            case 11:
                return new oth[i];
            case 12:
                return new oti[i];
            case 13:
                return new otj[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new otk[i];
            case 15:
                return new Barcode[i];
            case 16:
                return new Barcode.Address[i];
            case 17:
                return new Barcode.BoardingPass[i];
            case 18:
                return new Barcode.CalendarDateTime[i];
            case 19:
                return new Barcode.CalendarEvent[i];
            default:
                return new Barcode.ContactInfo[i];
        }
    }
}
