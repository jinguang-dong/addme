package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okm implements Parcelable.Creator {
    public static void a(okl oklVar, Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.J(parcel, 2, oklVar.a);
        ojl.C(parcel, 3, oklVar.b);
        ojl.J(parcel, 5, oklVar.c);
        ojl.I(parcel, 6, oklVar.d, i);
        ojl.J(parcel, 7, oklVar.e);
        ojl.I(parcel, 8, oklVar.f, i);
        ojl.J(parcel, 9, oklVar.g);
        ojl.N(parcel, 10, oklVar.h);
        ojl.x(parcel, 11, oklVar.i);
        ojl.I(parcel, 12, oklVar.j, i);
        ojl.I(parcel, 13, oklVar.k, i);
        ojl.x(parcel, 14, oklVar.l);
        ojl.I(parcel, 15, oklVar.m, i);
        ojl.J(parcel, 16, oklVar.n);
        ojl.x(parcel, 17, oklVar.o);
        ojl.B(parcel, 18, oklVar.p);
        ojl.x(parcel, 19, oklVar.q);
        ojl.J(parcel, 20, oklVar.r);
        ojl.I(parcel, 21, oklVar.s, i);
        ojl.w(parcel, iU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = ojl.X(parcel);
        String strAc = null;
        Bundle bundleZ = null;
        String strAc2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String strAc3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strAc4 = null;
        ArrayList arrayListAf = null;
        okt oktVar = null;
        oko okoVar = null;
        Bitmap bitmap = null;
        String strAc5 = null;
        String strAc6 = null;
        okf okfVar = null;
        boolean zAj = false;
        boolean zAj2 = false;
        boolean zAj3 = false;
        boolean zAj4 = false;
        long jY = 0;
        while (parcel.dataPosition() < iX) {
            int i = parcel.readInt();
            switch (ojl.T(i)) {
                case 2:
                    strAc = ojl.ac(parcel, i);
                    break;
                case 3:
                    bundleZ = ojl.Z(parcel, i);
                    break;
                case 4:
                default:
                    ojl.ai(parcel, i);
                    break;
                case 5:
                    strAc2 = ojl.ac(parcel, i);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) ojl.ab(parcel, i, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    strAc3 = ojl.ac(parcel, i);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) ojl.ab(parcel, i, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    strAc4 = ojl.ac(parcel, i);
                    break;
                case 10:
                    arrayListAf = ojl.af(parcel, i, okn.CREATOR);
                    break;
                case 11:
                    zAj = ojl.aj(parcel, i);
                    break;
                case 12:
                    oktVar = (okt) ojl.ab(parcel, i, okt.CREATOR);
                    break;
                case 13:
                    okoVar = (oko) ojl.ab(parcel, i, oko.CREATOR);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    zAj2 = ojl.aj(parcel, i);
                    break;
                case 15:
                    bitmap = (Bitmap) ojl.ab(parcel, i, Bitmap.CREATOR);
                    break;
                case 16:
                    strAc5 = ojl.ac(parcel, i);
                    break;
                case 17:
                    zAj3 = ojl.aj(parcel, i);
                    break;
                case 18:
                    jY = ojl.Y(parcel, i);
                    break;
                case 19:
                    zAj4 = ojl.aj(parcel, i);
                    break;
                case 20:
                    strAc6 = ojl.ac(parcel, i);
                    break;
                case 21:
                    okfVar = (okf) ojl.ab(parcel, i, okf.CREATOR);
                    break;
            }
        }
        ojl.ag(parcel, iX);
        return new okl(strAc, bundleZ, strAc2, applicationErrorReport, strAc3, bitmapTeleporter, strAc4, arrayListAf, zAj, oktVar, okoVar, zAj2, bitmap, strAc5, zAj3, jY, zAj4, strAc6, okfVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new okl[i];
    }
}
