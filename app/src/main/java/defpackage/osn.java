package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.ar.core.ImageFormat;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class osn extends fbi implements IInterface {
    public osn() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    public void b(ors orsVar) {
        throw new UnsupportedOperationException();
    }

    public void c(otj otjVar) {
        throw new UnsupportedOperationException();
    }

    public void d(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 4:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 5:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 6:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 7:
                otj otjVar = (otj) fbj.a(parcel, otj.CREATOR);
                fbj.b(parcel);
                c(otjVar);
                break;
            case 8:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 9:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 10:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 11:
                Status status = (Status) fbj.a(parcel, Status.CREATOR);
                fbj.b(parcel);
                d(status);
                break;
            case 12:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 13:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 15:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 16:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 17:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 18:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 19:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 20:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            case 44:
            case 45:
            default:
                return false;
            case ImageFormat.RGBA_FP16 /* 22 */:
                ors orsVar = (ors) fbj.a(parcel, ors.CREATOR);
                fbj.b(parcel);
                b(orsVar);
                break;
            case 23:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 26:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 27:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 28:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 29:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 30:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 34:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case ImageFormat.YUV_420_888 /* 35 */:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 36:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 37:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 38:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 39:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 40:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 41:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 42:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 43:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 46:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 47:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 48:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 49:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 50:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
        }
        parcel2.writeNoException();
        return true;
    }
}
