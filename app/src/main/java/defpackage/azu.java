package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageOptions;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azu implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public azu(int i) {
        this.a = i;
    }

    public static void a(ohw ohwVar, Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, ohwVar.c);
        ojl.A(parcel, 2, ohwVar.d);
        ojl.A(parcel, 3, ohwVar.e);
        ojl.J(parcel, 4, ohwVar.f);
        ojl.F(parcel, 5, ohwVar.g);
        ojl.M(parcel, 6, ohwVar.h, i);
        ojl.C(parcel, 7, ohwVar.i);
        ojl.I(parcel, 8, ohwVar.j, i);
        ojl.M(parcel, 10, ohwVar.k, i);
        ojl.M(parcel, 11, ohwVar.l, i);
        ojl.x(parcel, 12, ohwVar.m);
        ojl.A(parcel, 13, ohwVar.n);
        ojl.x(parcel, 14, ohwVar.o);
        ojl.J(parcel, 15, ohwVar.p);
        ojl.w(parcel, iU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = 0;
        String strAc = null;
        Bundle bundleZ = null;
        String strAc2 = null;
        switch (this.a) {
            case 0:
                return new azv(parcel.readFloat());
            case 1:
                return new anr(parcel.readInt());
            case 2:
                return new azw(parcel.readInt());
            case 3:
                return new azx(parcel.readLong());
            case 4:
                int iX = ojl.X(parcel);
                PendingIntent pendingIntent = null;
                String strAc3 = null;
                int iV2 = 0;
                while (parcel.dataPosition() < iX) {
                    int i = parcel.readInt();
                    int iT = ojl.T(i);
                    if (iT == 1) {
                        iV = ojl.V(parcel, i);
                    } else if (iT == 2) {
                        iV2 = ojl.V(parcel, i);
                    } else if (iT == 3) {
                        pendingIntent = (PendingIntent) ojl.ab(parcel, i, PendingIntent.CREATOR);
                    } else if (iT != 4) {
                        ojl.ai(parcel, i);
                    } else {
                        strAc3 = ojl.ac(parcel, i);
                    }
                }
                ojl.ag(parcel, iX);
                return new odj(iV, iV2, pendingIntent, strAc3);
            case 5:
                int iX2 = ojl.X(parcel);
                long jY = -1;
                while (parcel.dataPosition() < iX2) {
                    int i2 = parcel.readInt();
                    int iT2 = ojl.T(i2);
                    if (iT2 == 1) {
                        strAc = ojl.ac(parcel, i2);
                    } else if (iT2 == 2) {
                        iV = ojl.V(parcel, i2);
                    } else if (iT2 != 3) {
                        ojl.ai(parcel, i2);
                    } else {
                        jY = ojl.Y(parcel, i2);
                    }
                }
                ojl.ag(parcel, iX2);
                return new odl(strAc, iV, jY);
            case 6:
                int iX3 = ojl.X(parcel);
                PendingIntent pendingIntent2 = null;
                odj odjVar = null;
                while (parcel.dataPosition() < iX3) {
                    int i3 = parcel.readInt();
                    int iT3 = ojl.T(i3);
                    if (iT3 == 1) {
                        iV = ojl.V(parcel, i3);
                    } else if (iT3 == 2) {
                        strAc2 = ojl.ac(parcel, i3);
                    } else if (iT3 == 3) {
                        pendingIntent2 = (PendingIntent) ojl.ab(parcel, i3, PendingIntent.CREATOR);
                    } else if (iT3 != 4) {
                        ojl.ai(parcel, i3);
                    } else {
                        odjVar = (odj) ojl.ab(parcel, i3, odj.CREATOR);
                    }
                }
                ojl.ag(parcel, iX3);
                return new Status(iV, strAc2, pendingIntent2, odjVar);
            case 7:
                int iX4 = ojl.X(parcel);
                odl[] odlVarArr = null;
                ohs ohsVar = null;
                while (parcel.dataPosition() < iX4) {
                    int i4 = parcel.readInt();
                    int iT4 = ojl.T(i4);
                    if (iT4 == 1) {
                        bundleZ = ojl.Z(parcel, i4);
                    } else if (iT4 == 2) {
                        odlVarArr = (odl[]) ojl.am(parcel, i4, odl.CREATOR);
                    } else if (iT4 == 3) {
                        iV = ojl.V(parcel, i4);
                    } else if (iT4 != 4) {
                        ojl.ai(parcel, i4);
                    } else {
                        ohsVar = (ohs) ojl.ab(parcel, i4, ohs.CREATOR);
                    }
                }
                ojl.ag(parcel, iX4);
                return new ohr(bundleZ, odlVarArr, iV, ohsVar);
            case 8:
                int iX5 = ojl.X(parcel);
                Scope[] scopeArr = ohw.a;
                Bundle bundle = new Bundle();
                odl[] odlVarArr2 = ohw.b;
                odl[] odlVarArr3 = odlVarArr2;
                int iV3 = 0;
                int iV4 = 0;
                int iV5 = 0;
                boolean zAj = false;
                int iV6 = 0;
                boolean zAj2 = false;
                String strAc4 = null;
                IBinder iBinderAa = null;
                Account account = null;
                String strAc5 = null;
                while (parcel.dataPosition() < iX5) {
                    int i5 = parcel.readInt();
                    switch (ojl.T(i5)) {
                        case 1:
                            iV3 = ojl.V(parcel, i5);
                            break;
                        case 2:
                            iV4 = ojl.V(parcel, i5);
                            break;
                        case 3:
                            iV5 = ojl.V(parcel, i5);
                            break;
                        case 4:
                            strAc4 = ojl.ac(parcel, i5);
                            break;
                        case 5:
                            iBinderAa = ojl.aa(parcel, i5);
                            break;
                        case 6:
                            scopeArr = (Scope[]) ojl.am(parcel, i5, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = ojl.Z(parcel, i5);
                            break;
                        case 8:
                            account = (Account) ojl.ab(parcel, i5, Account.CREATOR);
                            break;
                        case 9:
                        default:
                            ojl.ai(parcel, i5);
                            break;
                        case 10:
                            odlVarArr2 = (odl[]) ojl.am(parcel, i5, odl.CREATOR);
                            break;
                        case 11:
                            odlVarArr3 = (odl[]) ojl.am(parcel, i5, odl.CREATOR);
                            break;
                        case 12:
                            zAj = ojl.aj(parcel, i5);
                            break;
                        case 13:
                            iV6 = ojl.V(parcel, i5);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            zAj2 = ojl.aj(parcel, i5);
                            break;
                        case 15:
                            strAc5 = ojl.ac(parcel, i5);
                            break;
                    }
                }
                ojl.ag(parcel, iX5);
                return new ohw(iV3, iV4, iV5, strAc4, iBinderAa, scopeArr, bundle, account, odlVarArr2, odlVarArr3, zAj, iV6, zAj2, strAc5);
            case 9:
                int iX6 = ojl.X(parcel);
                int iV7 = 0;
                boolean zAj3 = false;
                boolean zAj4 = false;
                int iV8 = 0;
                int iV9 = 0;
                while (parcel.dataPosition() < iX6) {
                    int i6 = parcel.readInt();
                    int iT5 = ojl.T(i6);
                    if (iT5 == 1) {
                        iV7 = ojl.V(parcel, i6);
                    } else if (iT5 == 2) {
                        zAj3 = ojl.aj(parcel, i6);
                    } else if (iT5 == 3) {
                        zAj4 = ojl.aj(parcel, i6);
                    } else if (iT5 == 4) {
                        iV8 = ojl.V(parcel, i6);
                    } else if (iT5 != 5) {
                        ojl.ai(parcel, i6);
                    } else {
                        iV9 = ojl.V(parcel, i6);
                    }
                }
                ojl.ag(parcel, iX6);
                return new oit(iV7, zAj3, zAj4, iV8, iV9);
            case 10:
                int iX7 = ojl.X(parcel);
                String strAc6 = null;
                byte[] bArrAk = null;
                byte[][] bArrAo = null;
                byte[][] bArrAo2 = null;
                byte[][] bArrAo3 = null;
                byte[][] bArrAo4 = null;
                int[] iArrAl = null;
                byte[][] bArrAo5 = null;
                int[] iArrAl2 = null;
                byte[][] bArrAo6 = null;
                while (parcel.dataPosition() < iX7) {
                    int i7 = parcel.readInt();
                    switch (ojl.T(i7)) {
                        case 2:
                            strAc6 = ojl.ac(parcel, i7);
                            break;
                        case 3:
                            bArrAk = ojl.ak(parcel, i7);
                            break;
                        case 4:
                            bArrAo = ojl.ao(parcel, i7);
                            break;
                        case 5:
                            bArrAo2 = ojl.ao(parcel, i7);
                            break;
                        case 6:
                            bArrAo3 = ojl.ao(parcel, i7);
                            break;
                        case 7:
                            bArrAo4 = ojl.ao(parcel, i7);
                            break;
                        case 8:
                            iArrAl = ojl.al(parcel, i7);
                            break;
                        case 9:
                            bArrAo5 = ojl.ao(parcel, i7);
                            break;
                        case 10:
                            iArrAl2 = ojl.al(parcel, i7);
                            break;
                        case 11:
                            bArrAo6 = ojl.ao(parcel, i7);
                            break;
                        default:
                            ojl.ai(parcel, i7);
                            break;
                    }
                }
                ojl.ag(parcel, iX7);
                return new onb(strAc6, bArrAk, bArrAo, bArrAo2, bArrAo3, bArrAo4, iArrAl, bArrAo5, iArrAl2, bArrAo6);
            case 11:
                int iX8 = ojl.X(parcel);
                int iV10 = 0;
                boolean zAj5 = false;
                int iV11 = 0;
                boolean zAj6 = false;
                ArrayList arrayListAe = null;
                String strAc7 = null;
                while (parcel.dataPosition() < iX8) {
                    int i8 = parcel.readInt();
                    switch (ojl.T(i8)) {
                        case 2:
                            iV10 = ojl.V(parcel, i8);
                            break;
                        case 3:
                            zAj5 = ojl.aj(parcel, i8);
                            break;
                        case 4:
                            arrayListAe = ojl.ae(parcel, i8);
                            break;
                        case 5:
                            iV11 = ojl.V(parcel, i8);
                            break;
                        case 6:
                            strAc7 = ojl.ac(parcel, i8);
                            break;
                        case 7:
                            zAj6 = ojl.aj(parcel, i8);
                            break;
                        default:
                            ojl.ai(parcel, i8);
                            break;
                    }
                }
                ojl.ag(parcel, iX8);
                return new opm(iV10, zAj5, arrayListAe, iV11, strAc7, zAj6);
            default:
                int iX9 = ojl.X(parcel);
                while (parcel.dataPosition() < iX9) {
                    int i9 = parcel.readInt();
                    if (ojl.T(i9) != 2) {
                        ojl.ai(parcel, i9);
                    } else {
                        iV = ojl.V(parcel, i9);
                    }
                }
                ojl.ag(parcel, iX9);
                return new MessageOptions(iV);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new azv[i];
            case 1:
                return new anr[i];
            case 2:
                return new azw[i];
            case 3:
                return new azx[i];
            case 4:
                return new odj[i];
            case 5:
                return new odl[i];
            case 6:
                return new Status[i];
            case 7:
                return new ohr[i];
            case 8:
                return new ohw[i];
            case 9:
                return new oit[i];
            case 10:
                return new onb[i];
            case 11:
                return new opm[i];
            default:
                return new MessageOptions[i];
        }
    }
}
