package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;
import java.util.ArrayDeque;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ouh implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ouh(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        tyf tyfVar;
        tye tyeVar;
        switch (this.a) {
            case 0:
                return new Barcode.Email(parcel);
            case 1:
                return new Barcode.DriverLicense(parcel);
            case 2:
                return new Barcode.FlightSegment(parcel);
            case 3:
                return new Barcode.GeoPoint(parcel);
            case 4:
                return new Barcode.PersonName(parcel);
            case 5:
                return new Barcode.Phone(parcel);
            case 6:
                return new Barcode.Sms(parcel);
            case 7:
                return new Barcode.UrlBookmark(parcel);
            case 8:
                return new Barcode.WiFi(parcel);
            case 9:
                return new rbw(parcel);
            case 10:
                return new rjv(parcel);
            case 11:
                return new tya(parcel);
            case 12:
                return new tyb(parcel);
            case 13:
                return new tyc(parcel);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                synchronized (tyf.k) {
                    ArrayDeque arrayDeque = tyf.j;
                    tyfVar = arrayDeque.isEmpty() ? new tyf() : (tyf) arrayDeque.remove();
                }
                tyfVar.b(parcel);
                return tyfVar;
            case 15:
                synchronized (tye.b) {
                    ArrayDeque arrayDeque2 = tye.a;
                    tyeVar = arrayDeque2.isEmpty() ? new tye() : (tye) arrayDeque2.remove();
                }
                tyeVar.b(parcel);
                return tyeVar;
            case 16:
                return new tyg(parcel);
            case 17:
                return new tyh(parcel);
            case 18:
                return new tyi(parcel);
            case 19:
                return new tyj(parcel);
            default:
                return new tyk(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new Barcode.Email[i];
            case 1:
                return new Barcode.DriverLicense[i];
            case 2:
                return new Barcode.FlightSegment[i];
            case 3:
                return new Barcode.GeoPoint[i];
            case 4:
                return new Barcode.PersonName[i];
            case 5:
                return new Barcode.Phone[i];
            case 6:
                return new Barcode.Sms[i];
            case 7:
                return new Barcode.UrlBookmark[i];
            case 8:
                return new Barcode.WiFi[i];
            case 9:
                return new rbw[i];
            case 10:
                return new rjv[i];
            case 11:
                return new tya[i];
            case 12:
                return new tyb[i];
            case 13:
                return new tyc[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new tyf[i];
            case 15:
                return new tye[i];
            case 16:
                return new tyg[i];
            case 17:
                return new tyh[i];
            case 18:
                return new tyi[i];
            case 19:
                return new tyj[i];
            default:
                return new tyk[i];
        }
    }
}
