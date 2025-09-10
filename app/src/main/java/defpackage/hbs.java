package defpackage;

import android.accounts.Account;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import j$.time.Instant;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hbs implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public hbs(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        int iV5 = 0;
        boolean zAj = false;
        boolean zAj2 = false;
        int iV6 = 0;
        ArrayList arrayListAf = null;
        Account account = null;
        String strAc = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String strAc2 = null;
        String strAc3 = null;
        String strAc4 = null;
        switch (this.a) {
            case 0:
                return new hbt(parcel.readLong(), (ltd) parcel.readParcelable(hce.class.getClassLoader()), sbp.j(parcel.readArrayList(Long.class.getClassLoader())), parcel.readString(), parcel.readString(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), (Uri) parcel.readParcelable(hce.class.getClassLoader()), parcel.readInt() == 1, (pas) parcel.readSerializable(), parcel.readInt());
            case 1:
                return new eol(parcel);
            case 2:
                return new ltc(parcel.readInt());
            case 3:
                int iX = ojl.X(parcel);
                long jY = 0;
                String strAc5 = null;
                String strAc6 = null;
                String strAc7 = null;
                String strAc8 = null;
                Uri uri = null;
                String strAc9 = null;
                String strAc10 = null;
                ArrayList arrayListAf2 = null;
                String strAc11 = null;
                String strAc12 = null;
                while (parcel.dataPosition() < iX) {
                    int i = parcel.readInt();
                    switch (ojl.T(i)) {
                        case 2:
                            strAc5 = ojl.ac(parcel, i);
                            break;
                        case 3:
                            strAc6 = ojl.ac(parcel, i);
                            break;
                        case 4:
                            strAc7 = ojl.ac(parcel, i);
                            break;
                        case 5:
                            strAc8 = ojl.ac(parcel, i);
                            break;
                        case 6:
                            uri = (Uri) ojl.ab(parcel, i, Uri.CREATOR);
                            break;
                        case 7:
                            strAc9 = ojl.ac(parcel, i);
                            break;
                        case 8:
                            jY = ojl.Y(parcel, i);
                            break;
                        case 9:
                            strAc10 = ojl.ac(parcel, i);
                            break;
                        case 10:
                            arrayListAf2 = ojl.af(parcel, i, Scope.CREATOR);
                            break;
                        case 11:
                            strAc11 = ojl.ac(parcel, i);
                            break;
                        case 12:
                            strAc12 = ojl.ac(parcel, i);
                            break;
                        default:
                            ojl.ai(parcel, i);
                            break;
                    }
                }
                ojl.ag(parcel, iX);
                return new GoogleSignInAccount(strAc5, strAc6, strAc7, strAc8, uri, strAc9, jY, strAc10, arrayListAf2, strAc11, strAc12);
            case 4:
                int iX2 = ojl.X(parcel);
                boolean zAj3 = true;
                int iV7 = 0;
                odh odhVar = null;
                byte[] bArrAk = null;
                int[] iArrAl = null;
                String[] strArrAn = null;
                int[] iArrAl2 = null;
                byte[][] bArrAo = null;
                onb[] onbVarArr = null;
                odg odgVar = null;
                String[] strArrAn2 = null;
                ocy ocyVar = null;
                while (parcel.dataPosition() < iX2) {
                    int i2 = parcel.readInt();
                    switch (ojl.T(i2)) {
                        case 2:
                            odhVar = (odh) ojl.ab(parcel, i2, odh.CREATOR);
                            break;
                        case 3:
                            bArrAk = ojl.ak(parcel, i2);
                            break;
                        case 4:
                            iArrAl = ojl.al(parcel, i2);
                            break;
                        case 5:
                            strArrAn = ojl.an(parcel, i2);
                            break;
                        case 6:
                            iArrAl2 = ojl.al(parcel, i2);
                            break;
                        case 7:
                            bArrAo = ojl.ao(parcel, i2);
                            break;
                        case 8:
                            zAj3 = ojl.aj(parcel, i2);
                            break;
                        case 9:
                            onbVarArr = (onb[]) ojl.am(parcel, i2, onb.CREATOR);
                            break;
                        case 10:
                        default:
                            ojl.ai(parcel, i2);
                            break;
                        case 11:
                            odgVar = (odg) ojl.ab(parcel, i2, odg.CREATOR);
                            break;
                        case 12:
                            strArrAn2 = ojl.an(parcel, i2);
                            break;
                        case 13:
                            iV7 = ojl.V(parcel, i2);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            ocyVar = (ocy) ojl.ab(parcel, i2, ocy.CREATOR);
                            break;
                    }
                }
                ojl.ag(parcel, iX2);
                return new ocm(odhVar, bArrAk, iArrAl, strArrAn, iArrAl2, bArrAo, zAj3, onbVarArr, odgVar, strArrAn2, iV7, ocyVar);
            case 5:
                int iX3 = ojl.X(parcel);
                while (parcel.dataPosition() < iX3) {
                    int i3 = parcel.readInt();
                    if (ojl.T(i3) != 1) {
                        ojl.ai(parcel, i3);
                    } else {
                        arrayListAf = ojl.af(parcel, i3, odc.CREATOR);
                    }
                }
                ojl.ag(parcel, iX3);
                return new ocr(arrayListAf);
            case 6:
                int iX4 = ojl.X(parcel);
                int iV8 = 0;
                int iV9 = 0;
                while (parcel.dataPosition() < iX4) {
                    int i4 = parcel.readInt();
                    int iT = ojl.T(i4);
                    if (iT == 1) {
                        iV = ojl.V(parcel, i4);
                    } else if (iT == 2) {
                        iV8 = ojl.V(parcel, i4);
                    } else if (iT != 3) {
                        ojl.ai(parcel, i4);
                    } else {
                        iV9 = ojl.V(parcel, i4);
                    }
                }
                ojl.ag(parcel, iX4);
                return new ocy(iV, iV8, iV9);
            case 7:
                int iX5 = ojl.X(parcel);
                int iV10 = 0;
                while (parcel.dataPosition() < iX5) {
                    int i5 = parcel.readInt();
                    int iT2 = ojl.T(i5);
                    if (iT2 == 1) {
                        strAc4 = ojl.ac(parcel, i5);
                    } else if (iT2 == 2) {
                        iV6 = ojl.V(parcel, i5);
                    } else if (iT2 != 3) {
                        ojl.ai(parcel, i5);
                    } else {
                        iV10 = ojl.V(parcel, i5);
                    }
                }
                ojl.ag(parcel, iX5);
                return new odc(strAc4, iV6, iV10);
            case 8:
                int iX6 = ojl.X(parcel);
                while (parcel.dataPosition() < iX6) {
                    int i6 = parcel.readInt();
                    if (ojl.T(i6) != 1) {
                        ojl.ai(parcel, i6);
                    } else {
                        zAj2 = ojl.aj(parcel, i6);
                    }
                }
                ojl.ag(parcel, iX6);
                return new odg(zAj2);
            case 9:
                int iX7 = ojl.X(parcel);
                boolean zAj4 = true;
                int iV11 = 0;
                int iV12 = 0;
                boolean zAj5 = false;
                int iV13 = 0;
                boolean zAj6 = false;
                int iV14 = 0;
                String strAc13 = null;
                String strAc14 = null;
                String strAc15 = null;
                Integer numValueOf = null;
                while (parcel.dataPosition() < iX7) {
                    int i7 = parcel.readInt();
                    switch (ojl.T(i7)) {
                        case 2:
                            strAc13 = ojl.ac(parcel, i7);
                            break;
                        case 3:
                            iV11 = ojl.V(parcel, i7);
                            break;
                        case 4:
                            iV12 = ojl.V(parcel, i7);
                            break;
                        case 5:
                            strAc14 = ojl.ac(parcel, i7);
                            break;
                        case 6:
                        default:
                            ojl.ai(parcel, i7);
                            break;
                        case 7:
                            zAj4 = ojl.aj(parcel, i7);
                            break;
                        case 8:
                            strAc15 = ojl.ac(parcel, i7);
                            break;
                        case 9:
                            zAj5 = ojl.aj(parcel, i7);
                            break;
                        case 10:
                            iV13 = ojl.V(parcel, i7);
                            break;
                        case 11:
                            int iW = ojl.W(parcel, i7);
                            if (iW == 0) {
                                numValueOf = null;
                                break;
                            } else {
                                ojl.ap(parcel, iW, 4);
                                numValueOf = Integer.valueOf(parcel.readInt());
                                break;
                            }
                        case 12:
                            zAj6 = ojl.aj(parcel, i7);
                            break;
                        case 13:
                            iV14 = ojl.V(parcel, i7);
                            break;
                    }
                }
                ojl.ag(parcel, iX7);
                return new odh(strAc13, iV11, iV12, strAc14, zAj4, strAc15, zAj5, iV13, numValueOf, zAj6, iV14);
            case 10:
                int iX8 = ojl.X(parcel);
                boolean zAj7 = false;
                boolean zAj8 = false;
                boolean zAj9 = false;
                boolean zAj10 = false;
                boolean zAj11 = false;
                String strAc16 = null;
                IBinder iBinderAa = null;
                while (parcel.dataPosition() < iX8) {
                    int i8 = parcel.readInt();
                    switch (ojl.T(i8)) {
                        case 1:
                            strAc16 = ojl.ac(parcel, i8);
                            break;
                        case 2:
                            zAj7 = ojl.aj(parcel, i8);
                            break;
                        case 3:
                            zAj8 = ojl.aj(parcel, i8);
                            break;
                        case 4:
                            iBinderAa = ojl.aa(parcel, i8);
                            break;
                        case 5:
                            zAj9 = ojl.aj(parcel, i8);
                            break;
                        case 6:
                            zAj10 = ojl.aj(parcel, i8);
                            break;
                        case 7:
                        default:
                            ojl.ai(parcel, i8);
                            break;
                        case 8:
                            zAj11 = ojl.aj(parcel, i8);
                            break;
                    }
                }
                ojl.ag(parcel, iX8);
                return new odz(strAc16, zAj7, zAj8, iBinderAa, zAj9, zAj10, zAj11);
            case 11:
                int iX9 = ojl.X(parcel);
                long jY2 = -1;
                boolean zAj12 = false;
                int iV15 = 0;
                int iV16 = 0;
                String strAc17 = null;
                while (parcel.dataPosition() < iX9) {
                    int i9 = parcel.readInt();
                    int iT3 = ojl.T(i9);
                    if (iT3 == 1) {
                        zAj12 = ojl.aj(parcel, i9);
                    } else if (iT3 == 2) {
                        strAc17 = ojl.ac(parcel, i9);
                    } else if (iT3 == 3) {
                        iV15 = ojl.V(parcel, i9);
                    } else if (iT3 == 4) {
                        iV16 = ojl.V(parcel, i9);
                    } else if (iT3 != 5) {
                        ojl.ai(parcel, i9);
                    } else {
                        jY2 = ojl.Y(parcel, i9);
                    }
                }
                ojl.ag(parcel, iX9);
                return new oea(zAj12, strAc17, iV15, iV16, jY2);
            case 12:
                int iX10 = ojl.X(parcel);
                boolean zAj13 = false;
                IBinder iBinderAa2 = null;
                while (parcel.dataPosition() < iX10) {
                    int i10 = parcel.readInt();
                    int iT4 = ojl.T(i10);
                    if (iT4 == 1) {
                        strAc3 = ojl.ac(parcel, i10);
                    } else if (iT4 == 2) {
                        iBinderAa2 = ojl.aa(parcel, i10);
                    } else if (iT4 == 3) {
                        zAj = ojl.aj(parcel, i10);
                    } else if (iT4 != 4) {
                        ojl.ai(parcel, i10);
                    } else {
                        zAj13 = ojl.aj(parcel, i10);
                    }
                }
                ojl.ag(parcel, iX10);
                return new oeb(strAc3, iBinderAa2, zAj, zAj13);
            case 13:
                int iX11 = ojl.X(parcel);
                while (parcel.dataPosition() < iX11) {
                    int i11 = parcel.readInt();
                    int iT5 = ojl.T(i11);
                    if (iT5 == 1) {
                        iV5 = ojl.V(parcel, i11);
                    } else if (iT5 != 2) {
                        ojl.ai(parcel, i11);
                    } else {
                        strAc2 = ojl.ac(parcel, i11);
                    }
                }
                ojl.ag(parcel, iX11);
                return new Scope(iV5, strAc2);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int iX12 = ojl.X(parcel);
                int iV17 = 0;
                while (parcel.dataPosition() < iX12) {
                    int i12 = parcel.readInt();
                    int iT6 = ojl.T(i12);
                    if (iT6 == 1) {
                        iV4 = ojl.V(parcel, i12);
                    } else if (iT6 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) ojl.ab(parcel, i12, ParcelFileDescriptor.CREATOR);
                    } else if (iT6 != 3) {
                        ojl.ai(parcel, i12);
                    } else {
                        iV17 = ojl.V(parcel, i12);
                    }
                }
                ojl.ag(parcel, iX12);
                return new BitmapTeleporter(iV4, parcelFileDescriptor, iV17);
            case 15:
                int iX13 = ojl.X(parcel);
                int iV18 = 0;
                int iV19 = 0;
                String[] strArrAn3 = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleZ = null;
                while (parcel.dataPosition() < iX13) {
                    int i13 = parcel.readInt();
                    int iT7 = ojl.T(i13);
                    if (iT7 == 1) {
                        strArrAn3 = ojl.an(parcel, i13);
                    } else if (iT7 == 2) {
                        cursorWindowArr = (CursorWindow[]) ojl.am(parcel, i13, CursorWindow.CREATOR);
                    } else if (iT7 == 3) {
                        iV19 = ojl.V(parcel, i13);
                    } else if (iT7 == 4) {
                        bundleZ = ojl.Z(parcel, i13);
                    } else if (iT7 != 1000) {
                        ojl.ai(parcel, i13);
                    } else {
                        iV18 = ojl.V(parcel, i13);
                    }
                }
                ojl.ag(parcel, iX13);
                DataHolder dataHolder = new DataHolder(iV18, strArrAn3, cursorWindowArr, iV19, bundleZ);
                dataHolder.c = new Bundle();
                int i14 = 0;
                while (true) {
                    String[] strArr = dataHolder.b;
                    if (i14 >= strArr.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.d;
                        dataHolder.g = new int[cursorWindowArr2.length];
                        int numRows = 0;
                        for (int i15 = 0; i15 < cursorWindowArr2.length; i15++) {
                            dataHolder.g[i15] = numRows;
                            numRows += cursorWindowArr2[i15].getNumRows() - (numRows - cursorWindowArr2[i15].getStartPosition());
                        }
                        dataHolder.h = numRows;
                        return dataHolder;
                    }
                    dataHolder.c.putInt(strArr[i14], i14);
                    i14++;
                }
            case 16:
                int iX14 = ojl.X(parcel);
                while (parcel.dataPosition() < iX14) {
                    int i16 = parcel.readInt();
                    int iT8 = ojl.T(i16);
                    if (iT8 == 1) {
                        iV3 = ojl.V(parcel, i16);
                    } else if (iT8 != 2) {
                        ojl.ai(parcel, i16);
                    } else {
                        strAc = ojl.ac(parcel, i16);
                    }
                }
                ojl.ag(parcel, iX14);
                return new ohn(iV3, strAc);
            case 17:
                int iX15 = ojl.X(parcel);
                boolean zAj14 = false;
                boolean zAj15 = false;
                int iV20 = 0;
                oit oitVar = null;
                int[] iArrAl3 = null;
                int[] iArrAl4 = null;
                while (parcel.dataPosition() < iX15) {
                    int i17 = parcel.readInt();
                    switch (ojl.T(i17)) {
                        case 1:
                            oitVar = (oit) ojl.ab(parcel, i17, oit.CREATOR);
                            break;
                        case 2:
                            zAj14 = ojl.aj(parcel, i17);
                            break;
                        case 3:
                            zAj15 = ojl.aj(parcel, i17);
                            break;
                        case 4:
                            iArrAl3 = ojl.al(parcel, i17);
                            break;
                        case 5:
                            iV20 = ojl.V(parcel, i17);
                            break;
                        case 6:
                            iArrAl4 = ojl.al(parcel, i17);
                            break;
                        default:
                            ojl.ai(parcel, i17);
                            break;
                    }
                }
                ojl.ag(parcel, iX15);
                return new ohs(oitVar, zAj14, zAj15, iArrAl3, iV20, iArrAl4);
            case 18:
                int iX16 = ojl.X(parcel);
                int iV21 = -1;
                long jY3 = 0;
                long jY4 = 0;
                int iV22 = 0;
                int iV23 = 0;
                int iV24 = 0;
                int iV25 = 0;
                String strAc18 = null;
                String strAc19 = null;
                while (parcel.dataPosition() < iX16) {
                    int i18 = parcel.readInt();
                    switch (ojl.T(i18)) {
                        case 1:
                            iV22 = ojl.V(parcel, i18);
                            break;
                        case 2:
                            iV23 = ojl.V(parcel, i18);
                            break;
                        case 3:
                            iV24 = ojl.V(parcel, i18);
                            break;
                        case 4:
                            jY3 = ojl.Y(parcel, i18);
                            break;
                        case 5:
                            jY4 = ojl.Y(parcel, i18);
                            break;
                        case 6:
                            strAc18 = ojl.ac(parcel, i18);
                            break;
                        case 7:
                            strAc19 = ojl.ac(parcel, i18);
                            break;
                        case 8:
                            iV25 = ojl.V(parcel, i18);
                            break;
                        case 9:
                            iV21 = ojl.V(parcel, i18);
                            break;
                        default:
                            ojl.ai(parcel, i18);
                            break;
                    }
                }
                ojl.ag(parcel, iX16);
                return new oil(iV22, iV23, iV24, jY3, jY4, strAc18, strAc19, iV25, iV21);
            case 19:
                int iX17 = ojl.X(parcel);
                int iV26 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iX17) {
                    int i19 = parcel.readInt();
                    int iT9 = ojl.T(i19);
                    if (iT9 == 1) {
                        iV2 = ojl.V(parcel, i19);
                    } else if (iT9 == 2) {
                        account = (Account) ojl.ab(parcel, i19, Account.CREATOR);
                    } else if (iT9 == 3) {
                        iV26 = ojl.V(parcel, i19);
                    } else if (iT9 != 4) {
                        ojl.ai(parcel, i19);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) ojl.ab(parcel, i19, GoogleSignInAccount.CREATOR);
                    }
                }
                ojl.ag(parcel, iX17);
                return new oiq(iV2, account, iV26, googleSignInAccount);
            default:
                int iX18 = ojl.X(parcel);
                int iV27 = 0;
                boolean zAj16 = false;
                boolean zAj17 = false;
                IBinder iBinderAa3 = null;
                odj odjVar = null;
                while (parcel.dataPosition() < iX18) {
                    int i20 = parcel.readInt();
                    int iT10 = ojl.T(i20);
                    if (iT10 == 1) {
                        iV27 = ojl.V(parcel, i20);
                    } else if (iT10 == 2) {
                        iBinderAa3 = ojl.aa(parcel, i20);
                    } else if (iT10 == 3) {
                        odjVar = (odj) ojl.ab(parcel, i20, odj.CREATOR);
                    } else if (iT10 == 4) {
                        zAj16 = ojl.aj(parcel, i20);
                    } else if (iT10 != 5) {
                        ojl.ai(parcel, i20);
                    } else {
                        zAj17 = ojl.aj(parcel, i20);
                    }
                }
                ojl.ag(parcel, iX18);
                return new oir(iV27, iBinderAa3, odjVar, zAj16, zAj17);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new hbt[i];
            case 1:
                return new eol[i];
            case 2:
                return new ltc[i];
            case 3:
                return new GoogleSignInAccount[i];
            case 4:
                return new ocm[i];
            case 5:
                return new ocr[i];
            case 6:
                return new ocy[i];
            case 7:
                return new odc[i];
            case 8:
                return new odg[i];
            case 9:
                return new odh[i];
            case 10:
                return new odz[i];
            case 11:
                return new oea[i];
            case 12:
                return new oeb[i];
            case 13:
                return new Scope[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new BitmapTeleporter[i];
            case 15:
                return new DataHolder[i];
            case 16:
                return new ohn[i];
            case 17:
                return new ohs[i];
            case 18:
                return new oil[i];
            case 19:
                return new oiq[i];
            default:
                return new oir[i];
        }
    }
}
